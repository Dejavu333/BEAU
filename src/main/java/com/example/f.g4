grammar f;

@lexer::members {
	// Initializing `pendingDent` to true means any whitespace at the beginning
	// of the file will trigger an INDENT, which will probably be a syntax error,
	// as it is in Python.
	private boolean pendingDent = true;
	private int indentCount = 0;
	private java.util.LinkedList<Token> tokenQueue = new java.util.LinkedList<>();
	private java.util.Stack<Integer> indentStack = new java.util.Stack<>();
	private Token initialIndentToken = null;
	private int getSavedIndent() { return indentStack.isEmpty() ? 0 : indentStack.peek(); }

	private CommonToken createToken(int type, String text, Token next) {
		CommonToken token = new CommonToken(type, text);
		if (null != initialIndentToken) {
			token.setStartIndex(initialIndentToken.getStartIndex());
			token.setLine(initialIndentToken.getLine());
			token.setCharPositionInLine(initialIndentToken.getCharPositionInLine());
			token.setStopIndex(next.getStartIndex()-1);
		}
		return token;
	}

	@Override
	public Token nextToken() {
		// Return tokens from the queue if it is not empty.
		if (!tokenQueue.isEmpty()) { return tokenQueue.poll(); }

		// Grab the next token and if nothing special is needed, simply return it.
		// Initialize `initialIndentToken` if needed.
		Token next = super.nextToken();
		//NOTE: This could be an appropriate spot to count whitespace or deal with
		//NEWLINES, but it is already handled with custom actions down in the
		//lexer rules.
		if (pendingDent && null == initialIndentToken && NEWLINE != next.getType()) { initialIndentToken = next; }
		if (null == next || HIDDEN == next.getChannel() || NEWLINE == next.getType()) { return next; }

		// Handle EOF. In particular, handle an abrupt EOF that comes without an
		// immediately preceding NEWLINE.
		if (next.getType() == EOF) {
			indentCount = 0;
			// EOF outside of `pendingDent` state means input did not have a final
			// NEWLINE before end of file.
			if (!pendingDent) {
				initialIndentToken = next;
				tokenQueue.offer(createToken(NEWLINE, "NEWLINE", next));
			}
		}

		// Before exiting `pendingDent` state queue up proper INDENTS and DEDENTS.
		while (indentCount != getSavedIndent()) {
			if (indentCount > getSavedIndent()) {
				indentStack.push(indentCount);
				tokenQueue.offer(createToken(INDENT, "INDENT" + indentCount, next));
			} else {
				indentStack.pop();
				tokenQueue.offer(createToken(DEDENT, "DEDENT"+getSavedIndent(), next));
			}
		}
		pendingDent = false;
		tokenQueue.offer(next);
		return tokenQueue.poll();
	}

}

NEWLINE : ( '\r'? '\n' | '\r' ) {
	if (pendingDent) { setChannel(HIDDEN); }
	pendingDent = true;
	indentCount = 0;
	initialIndentToken = null;
} ;

WS : [ \t]+ {
	setChannel(HIDDEN);
	if (pendingDent) { indentCount += getText().length(); }
} ;

INDENT : 'INDENT' { setChannel(HIDDEN); };
DEDENT : 'DEDENT' { setChannel(HIDDEN); };

/**********************************************************************************************************/
//! START RULE
/**********************************************************************************************************/
program : ( NEWLINE | statement )* EOF ;


/**********************************************************************************************************/
//! STATEMENTS
/**********************************************************************************************************/
statement:	
	  simpleStatement
	| blockStatements
	;

simpleStatement : 
	  declarationstatement NEWLINE 
	| assignmentstatement NEWLINE
	| initializationstatement NEWLINE
    | expressionstatement NEWLINE
	;

block: NEWLINE INDENT statement+ DEDENT ;
blockStatements : 	
      definitionstatement 
    | controlflowstatement
	;


/**********************************************************************************************************/
//! COMMENTS
/**********************************************************************************************************/
BlockComment : '/*' ( BlockComment | . )*? '*/' -> channel(HIDDEN) ;   // allow nesting comments
LineComment : '//' ~[\r\n]* -> channel(HIDDEN) ;


/**********************************************************************************************************/
//* ASSIGNMENTSTATEMENT
/**********************************************************************************************************/
assignmentstatement: 
	variableassignment
	| flowvariableassignment
	;

variableassignment: IDENTIFIER ASSIGN expressionstatement;

flowvariableassignment: expressionstatement NEWLINE? FLOWASSIGN NEWLINE? IDENTIFIER;


/**********************************************************************************************************/
//* DECLARATIONSTATEMENT
/**********************************************************************************************************/
declarationstatement : 
	functiondeclaration
	|variabledeclaration
	|annotatedvariabledeclaration
	;

variabledeclaration :
    type IDENTIFIER;

functiondeclaration :
	(DEC|PRIVDEC) IDENTIFIER LPAREN (type IDENTIFIER (COMMA type IDENTIFIER)*)? RPAREN RETURNTYPESIGN type;

annotatedvariabledeclaration:
	variabledeclaration (ANNOTATE IDENTIFIER)+;


/**********************************************************************************************************/
//* INITIALIZATIONSTATEMENT
/**********************************************************************************************************/
initializationstatement:
	  variableinitialization
	| annotatedvariableinitialization
	| flowvariableinitialization
	| annotatedflowvariableinitialization
	;

	variableinitialization : 
		type IDENTIFIER ASSIGN expressionstatement;

	annotatedvariableinitialization:
		variableinitialization (ANNOTATE IDENTIFIER)+;

	flowvariableinitialization:
		expressionstatement NEWLINE? FLOWASSIGN NEWLINE? type IDENTIFIER;

	annotatedflowvariableinitialization:
		flowvariableinitialization (ANNOTATE IDENTIFIER)+;
	

/**********************************************************************************************************/
//* EXPRESSIONSTATEMENT
/**********************************************************************************************************/
expressionstatement: 
      IDENTIFIER # valuetypevariableexpression
	| ALLOC type LPAREN (param (',' param)*)? RPAREN # referencetypevariableexpression
    | STRING # stringexpression
    | INTEGER # integerexpression
	| DECIMAL # decimalexpression
	| BOOLEAN # boolexpression
    | NOT expressionstatement # notexpression
    | expressionstatement AND expressionstatement # andexpression
    | expressionstatement OR expressionstatement # orexpression
    | expressionstatement PLUS expressionstatement # plusexpression
    | expressionstatement MINUS expressionstatement # minusexpression
    | expressionstatement MUL expressionstatement # mulexpression
    | expressionstatement DIV expressionstatement # divexpression
    | expressionstatement MOD expressionstatement # modexpression
    | expressionstatement GT expressionstatement # gtexpression
    | expressionstatement LT expressionstatement # ltexpression
    | expressionstatement GTE expressionstatement # gteexpression
    | expressionstatement LTE expressionstatement # lteexpression
    | expressionstatement NEQ expressionstatement # neqexpression
    | expressionstatement EQ expressionstatement # eqexpression
    | IDENTIFIER LPAREN (param (',' param)*)? RPAREN # classicfunctioninvocationexpression
    | expressionstatement NEWLINE? PIPE NEWLINE? IDENTIFIER LPAREN ((param) (',' (param))*)? RPAREN # pipefunctioninvocationexpression
	| IDENTIFIER '.' IDENTIFIER LPAREN (param (',' param)*)? RPAREN # memberfunctioninvocationexpression
	// // | '[' (expressionstatement (COMMA expressionstatement)*) ']' # arrayliteralexpression
	// // | '{' expressionstatement ':' expressionstatement (COMMA expressionstatement ':' expressionstatement)* '}' # mapliteralexpression
	// // | expressionstatement '[' expressionstatement ']' # arrayaccessexpression
	// // | expressionstatement '{' expressionstatement '}' # mapaccessexpression
	| expressionstatement '.' IDENTIFIER # memberaccessexpression
    | (LCURLY expressionstatement RCURLY) # expressioninparentheses
	// // | '[]' # emptyarrayexpression
	// // | '{}' # emptymapexpression   

    ;
	keyvaluepair : IDENTIFIER RETURNTYPESIGN expressionstatement;
	param : expressionstatement | keyvaluepair | QUESTIONMARK;

/**********************************************************************************************************/
//* DEFINITIONSTATEMENT
/**********************************************************************************************************/
definitionstatement: 
    functiondefinition
    | classdefinition
    | interfacedefinition
    ;

functiondefinition : (DEF|PRIVDEF|PRIVOVERRIDENDEF|OVERRIDENDEF) IDENTIFIER LPAREN (type IDENTIFIER (COMMA type IDENTIFIER)*)? RPAREN RETURNTYPESIGN type block;

classdefinition: 'class' IDENTIFIER (INHERITS|IMPLEMENTS IDENTIFIER)? block;

interfacedefinition: 'interface' IDENTIFIER (INHERITS IDENTIFIER)? block;


/**********************************************************************************************************/
//* CONTROLFLOWSTATEMENTS
/**********************************************************************************************************/
controlflowstatement:
    ifstatement
    | whilestatement
	// | trycatchstatement
    ;


ifstatement: IF expressionstatement block  elifstatement* elsestatement?;

elifstatement: ELSEIF expressionstatement block;

elsestatement: ELSE block;

whilestatement: WHILE expressionstatement block;

// forstatement: 'for' LPAREN (assignmentstatement)? SEMI (expressionstatement)? SEMI (assignmentstatement)? RPAREN block;

// returnstatement: 'return' expressionstatement;

// gotostatement: 'goto' IDENTIFIER;


type: STRINGTYPE
	| NUMTYPE
	| CHARTYPE
	| BOOLTYPE
	| ANYTYPE
	| VOIDTYPE
	| CUSTOMTYPE
	| ARRAYTYPE
	| MAPTYPE
	;
	

WHILE : 'while' ;
IF : 'if' ;
ELSE : 'else' ;
ELSEIF : 'elif' ;

ALLOC : 'new' ;
ANNOTATE : '@' ;
DEF : 'def' ; 
PRIVDEF: '_def';
DEC : 'dec'; 
PRIVDEC: '_dec';
OVERRIDENDEF: 'overdef' ; 
PRIVOVERRIDENDEF: '_overdef';


INHERITS: 'inherits';
IMPLEMENTS: 'implements';


AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;


ASSIGN : '=' ;
COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
DOT : '.' ;


PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';


GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
NEQ: '!=';
EQ: '==';
PIPE: '|>';
FLOWASSIGN: '|>>';
QUESTIONMARK: '?';


CHAR : '\' . \'';
INTEGER : '-'?[0-9]+ ;
DECIMAL : '-'?[0-9]+ '.' [0-9]+ ;
STRING : '"' .*? '"' ;
BOOLEAN : 'true' | 'false' ;


CUSTOMTYPE: [A-Z][a-zA-Z_0-9]* ; //uppercase only
NUMTYPE: 'num';
STRINGTYPE: 'str';
ANYTYPE: 'any';
BOOLTYPE: 'bool';
VOIDTYPE: 'void';
NULLTYPE: 'null';
CHARTYPE: 'char';
ARRAYTYPE: 'Arr';
MAPTYPE: 'Map';


RETURNTYPESIGN : ':' ;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ; //both uppercase and lowercase and underscore
