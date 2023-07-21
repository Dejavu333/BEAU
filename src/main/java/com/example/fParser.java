// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class fParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NEWLINE=3, WS=4, INDENT=5, DEDENT=6, BlockComment=7, LineComment=8, 
		WHILE=9, IF=10, ELSE=11, ELSEIF=12, ALLOC=13, ANNOTATE=14, DEF=15, PRIVDEF=16, 
		DEC=17, PRIVDEC=18, OVERRIDENDEF=19, PRIVOVERRIDENDEF=20, INHERITS=21, 
		IMPLEMENTS=22, AND=23, OR=24, NOT=25, ASSIGN=26, COMMA=27, SEMI=28, LPAREN=29, 
		RPAREN=30, LCURLY=31, RCURLY=32, LBRACKET=33, RBRACKET=34, DOT=35, PLUS=36, 
		MINUS=37, MUL=38, DIV=39, MOD=40, GT=41, LT=42, GTE=43, LTE=44, NEQ=45, 
		EQ=46, PIPE=47, FLOWASSIGN=48, QUESTIONMARK=49, CHAR=50, INTEGER=51, DECIMAL=52, 
		STRING=53, BOOLEAN=54, CUSTOMTYPE=55, NUMTYPE=56, STRINGTYPE=57, ANYTYPE=58, 
		BOOLTYPE=59, VOIDTYPE=60, NULLTYPE=61, CHARTYPE=62, ARRAYTYPE=63, MAPTYPE=64, 
		RETURNTYPESIGN=65, IDENTIFIER=66;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simpleStatement = 2, RULE_block = 3, 
		RULE_blockStatements = 4, RULE_assignmentstatement = 5, RULE_variableassignment = 6, 
		RULE_flowvariableassignment = 7, RULE_declarationstatement = 8, RULE_variabledeclaration = 9, 
		RULE_functiondeclaration = 10, RULE_annotatedvariabledeclaration = 11, 
		RULE_initializationstatement = 12, RULE_variableinitialization = 13, RULE_annotatedvariableinitialization = 14, 
		RULE_flowvariableinitialization = 15, RULE_annotatedflowvariableinitialization = 16, 
		RULE_expressionstatement = 17, RULE_keyvaluepair = 18, RULE_param = 19, 
		RULE_definitionstatement = 20, RULE_functiondefinition = 21, RULE_classdefinition = 22, 
		RULE_interfacedefinition = 23, RULE_controlflowstatement = 24, RULE_ifstatement = 25, 
		RULE_elifstatement = 26, RULE_elsestatement = 27, RULE_whilestatement = 28, 
		RULE_type = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simpleStatement", "block", "blockStatements", 
			"assignmentstatement", "variableassignment", "flowvariableassignment", 
			"declarationstatement", "variabledeclaration", "functiondeclaration", 
			"annotatedvariabledeclaration", "initializationstatement", "variableinitialization", 
			"annotatedvariableinitialization", "flowvariableinitialization", "annotatedflowvariableinitialization", 
			"expressionstatement", "keyvaluepair", "param", "definitionstatement", 
			"functiondefinition", "classdefinition", "interfacedefinition", "controlflowstatement", 
			"ifstatement", "elifstatement", "elsestatement", "whilestatement", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'interface'", null, null, "'INDENT'", "'DEDENT'", null, 
			null, "'while'", "'if'", "'else'", "'elif'", "'new'", "'@'", "'def'", 
			"'_def'", "'dec'", "'_dec'", "'overdef'", "'_overdef'", "'inherits'", 
			"'implements'", "'and'", "'or'", "'not'", "'='", "','", "';'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'.'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'>'", "'<'", "'>='", "'<='", "'!='", "'=='", "'|>'", "'|>>'", 
			"'?'", "'' . ''", null, null, null, null, null, "'num'", "'str'", "'any'", 
			"'bool'", "'void'", "'null'", "'char'", "'Arr'", "'Map'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NEWLINE", "WS", "INDENT", "DEDENT", "BlockComment", 
			"LineComment", "WHILE", "IF", "ELSE", "ELSEIF", "ALLOC", "ANNOTATE", 
			"DEF", "PRIVDEF", "DEC", "PRIVDEC", "OVERRIDENDEF", "PRIVOVERRIDENDEF", 
			"INHERITS", "IMPLEMENTS", "AND", "OR", "NOT", "ASSIGN", "COMMA", "SEMI", 
			"LPAREN", "RPAREN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "DOT", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "GT", "LT", "GTE", "LTE", "NEQ", 
			"EQ", "PIPE", "FLOWASSIGN", "QUESTIONMARK", "CHAR", "INTEGER", "DECIMAL", 
			"STRING", "BOOLEAN", "CUSTOMTYPE", "NUMTYPE", "STRINGTYPE", "ANYTYPE", 
			"BOOLTYPE", "VOIDTYPE", "NULLTYPE", "CHARTYPE", "ARRAYTYPE", "MAPTYPE", 
			"RETURNTYPESIGN", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(fParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(fParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(fParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -2308094806844266994L) != 0 || _la==MAPTYPE || _la==IDENTIFIER) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(60);
					match(NEWLINE);
					}
					break;
				case T__0:
				case T__1:
				case WHILE:
				case IF:
				case ALLOC:
				case DEF:
				case PRIVDEF:
				case DEC:
				case PRIVDEC:
				case OVERRIDENDEF:
				case PRIVOVERRIDENDEF:
				case NOT:
				case LCURLY:
				case INTEGER:
				case DECIMAL:
				case STRING:
				case BOOLEAN:
				case CUSTOMTYPE:
				case NUMTYPE:
				case STRINGTYPE:
				case ANYTYPE:
				case BOOLTYPE:
				case VOIDTYPE:
				case CHARTYPE:
				case ARRAYTYPE:
				case MAPTYPE:
				case IDENTIFIER:
					{
					setState(61);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLOC:
			case DEC:
			case PRIVDEC:
			case NOT:
			case LCURLY:
			case INTEGER:
			case DECIMAL:
			case STRING:
			case BOOLEAN:
			case CUSTOMTYPE:
			case NUMTYPE:
			case STRINGTYPE:
			case ANYTYPE:
			case BOOLTYPE:
			case VOIDTYPE:
			case CHARTYPE:
			case ARRAYTYPE:
			case MAPTYPE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				simpleStatement();
				}
				break;
			case T__0:
			case T__1:
			case WHILE:
			case IF:
			case DEF:
			case PRIVDEF:
			case OVERRIDENDEF:
			case PRIVOVERRIDENDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				blockStatements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(fParser.NEWLINE, 0); }
		public AssignmentstatementContext assignmentstatement() {
			return getRuleContext(AssignmentstatementContext.class,0);
		}
		public InitializationstatementContext initializationstatement() {
			return getRuleContext(InitializationstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleStatement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				declarationstatement();
				setState(74);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				assignmentstatement();
				setState(77);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				initializationstatement();
				setState(80);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				expressionstatement(0);
				setState(83);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(fParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(fParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(fParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(NEWLINE);
			setState(88);
			match(INDENT);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & -2308094806844267002L) != 0 || _la==MAPTYPE || _la==IDENTIFIER );
			setState(94);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementsContext extends ParserRuleContext {
		public DefinitionstatementContext definitionstatement() {
			return getRuleContext(DefinitionstatementContext.class,0);
		}
		public ControlflowstatementContext controlflowstatement() {
			return getRuleContext(ControlflowstatementContext.class,0);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockStatements);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case DEF:
			case PRIVDEF:
			case OVERRIDENDEF:
			case PRIVOVERRIDENDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				definitionstatement();
				}
				break;
			case WHILE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				controlflowstatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentstatementContext extends ParserRuleContext {
		public VariableassignmentContext variableassignment() {
			return getRuleContext(VariableassignmentContext.class,0);
		}
		public FlowvariableassignmentContext flowvariableassignment() {
			return getRuleContext(FlowvariableassignmentContext.class,0);
		}
		public AssignmentstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterAssignmentstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitAssignmentstatement(this);
		}
	}

	public final AssignmentstatementContext assignmentstatement() throws RecognitionException {
		AssignmentstatementContext _localctx = new AssignmentstatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentstatement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				variableassignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				flowvariableassignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableassignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(fParser.ASSIGN, 0); }
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public VariableassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterVariableassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitVariableassignment(this);
		}
	}

	public final VariableassignmentContext variableassignment() throws RecognitionException {
		VariableassignmentContext _localctx = new VariableassignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFIER);
			setState(105);
			match(ASSIGN);
			setState(106);
			expressionstatement(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlowvariableassignmentContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public TerminalNode FLOWASSIGN() { return getToken(fParser.FLOWASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(fParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(fParser.NEWLINE, i);
		}
		public FlowvariableassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowvariableassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterFlowvariableassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitFlowvariableassignment(this);
		}
	}

	public final FlowvariableassignmentContext flowvariableassignment() throws RecognitionException {
		FlowvariableassignmentContext _localctx = new FlowvariableassignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_flowvariableassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			expressionstatement(0);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(109);
				match(NEWLINE);
				}
			}

			setState(112);
			match(FLOWASSIGN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(113);
				match(NEWLINE);
				}
			}

			setState(116);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationstatementContext extends ParserRuleContext {
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
		}
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public AnnotatedvariabledeclarationContext annotatedvariabledeclaration() {
			return getRuleContext(AnnotatedvariabledeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterDeclarationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitDeclarationstatement(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarationstatement);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				functiondeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				variabledeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				annotatedvariabledeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariabledeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterVariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitVariabledeclaration(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			type();
			setState(124);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctiondeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(fParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(fParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(fParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fParser.RPAREN, 0); }
		public TerminalNode RETURNTYPESIGN() { return getToken(fParser.RETURNTYPESIGN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DEC() { return getToken(fParser.DEC, 0); }
		public TerminalNode PRIVDEC() { return getToken(fParser.PRIVDEC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fParser.COMMA, i);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterFunctiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitFunctiondeclaration(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==DEC || _la==PRIVDEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			match(IDENTIFIER);
			setState(128);
			match(LPAREN);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 959L) != 0) {
				{
				setState(129);
				type();
				setState(130);
				match(IDENTIFIER);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					type();
					setState(133);
					match(IDENTIFIER);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(142);
			match(RPAREN);
			setState(143);
			match(RETURNTYPESIGN);
			setState(144);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedvariabledeclarationContext extends ParserRuleContext {
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public List<TerminalNode> ANNOTATE() { return getTokens(fParser.ANNOTATE); }
		public TerminalNode ANNOTATE(int i) {
			return getToken(fParser.ANNOTATE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(fParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(fParser.IDENTIFIER, i);
		}
		public AnnotatedvariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedvariabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterAnnotatedvariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitAnnotatedvariabledeclaration(this);
		}
	}

	public final AnnotatedvariabledeclarationContext annotatedvariabledeclaration() throws RecognitionException {
		AnnotatedvariabledeclarationContext _localctx = new AnnotatedvariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotatedvariabledeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			variabledeclaration();
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				match(ANNOTATE);
				setState(148);
				match(IDENTIFIER);
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANNOTATE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationstatementContext extends ParserRuleContext {
		public VariableinitializationContext variableinitialization() {
			return getRuleContext(VariableinitializationContext.class,0);
		}
		public AnnotatedvariableinitializationContext annotatedvariableinitialization() {
			return getRuleContext(AnnotatedvariableinitializationContext.class,0);
		}
		public FlowvariableinitializationContext flowvariableinitialization() {
			return getRuleContext(FlowvariableinitializationContext.class,0);
		}
		public AnnotatedflowvariableinitializationContext annotatedflowvariableinitialization() {
			return getRuleContext(AnnotatedflowvariableinitializationContext.class,0);
		}
		public InitializationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterInitializationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitInitializationstatement(this);
		}
	}

	public final InitializationstatementContext initializationstatement() throws RecognitionException {
		InitializationstatementContext _localctx = new InitializationstatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initializationstatement);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				variableinitialization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				annotatedvariableinitialization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				flowvariableinitialization();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				annotatedflowvariableinitialization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableinitializationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(fParser.ASSIGN, 0); }
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public VariableinitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableinitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterVariableinitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitVariableinitialization(this);
		}
	}

	public final VariableinitializationContext variableinitialization() throws RecognitionException {
		VariableinitializationContext _localctx = new VariableinitializationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableinitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			type();
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(ASSIGN);
			setState(162);
			expressionstatement(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedvariableinitializationContext extends ParserRuleContext {
		public VariableinitializationContext variableinitialization() {
			return getRuleContext(VariableinitializationContext.class,0);
		}
		public List<TerminalNode> ANNOTATE() { return getTokens(fParser.ANNOTATE); }
		public TerminalNode ANNOTATE(int i) {
			return getToken(fParser.ANNOTATE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(fParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(fParser.IDENTIFIER, i);
		}
		public AnnotatedvariableinitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedvariableinitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterAnnotatedvariableinitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitAnnotatedvariableinitialization(this);
		}
	}

	public final AnnotatedvariableinitializationContext annotatedvariableinitialization() throws RecognitionException {
		AnnotatedvariableinitializationContext _localctx = new AnnotatedvariableinitializationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_annotatedvariableinitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			variableinitialization();
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				match(ANNOTATE);
				setState(166);
				match(IDENTIFIER);
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANNOTATE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlowvariableinitializationContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public TerminalNode FLOWASSIGN() { return getToken(fParser.FLOWASSIGN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(fParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(fParser.NEWLINE, i);
		}
		public FlowvariableinitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowvariableinitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterFlowvariableinitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitFlowvariableinitialization(this);
		}
	}

	public final FlowvariableinitializationContext flowvariableinitialization() throws RecognitionException {
		FlowvariableinitializationContext _localctx = new FlowvariableinitializationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_flowvariableinitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			expressionstatement(0);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(172);
				match(NEWLINE);
				}
			}

			setState(175);
			match(FLOWASSIGN);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(176);
				match(NEWLINE);
				}
			}

			setState(179);
			type();
			setState(180);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedflowvariableinitializationContext extends ParserRuleContext {
		public FlowvariableinitializationContext flowvariableinitialization() {
			return getRuleContext(FlowvariableinitializationContext.class,0);
		}
		public List<TerminalNode> ANNOTATE() { return getTokens(fParser.ANNOTATE); }
		public TerminalNode ANNOTATE(int i) {
			return getToken(fParser.ANNOTATE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(fParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(fParser.IDENTIFIER, i);
		}
		public AnnotatedflowvariableinitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedflowvariableinitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterAnnotatedflowvariableinitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitAnnotatedflowvariableinitialization(this);
		}
	}

	public final AnnotatedflowvariableinitializationContext annotatedflowvariableinitialization() throws RecognitionException {
		AnnotatedflowvariableinitializationContext _localctx = new AnnotatedflowvariableinitializationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_annotatedflowvariableinitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			flowvariableinitialization();
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				match(ANNOTATE);
				setState(184);
				match(IDENTIFIER);
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANNOTATE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionstatementContext extends ParserRuleContext {
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
	 
		public ExpressionstatementContext() { }
		public void copyFrom(ExpressionstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode EQ() { return getToken(fParser.EQ, 0); }
		public EqexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterEqexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitEqexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(fParser.PLUS, 0); }
		public PlusexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterPlusexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitPlusexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValuetypevariableexpressionContext extends ExpressionstatementContext {
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public ValuetypevariableexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterValuetypevariableexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitValuetypevariableexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LteexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode LTE() { return getToken(fParser.LTE, 0); }
		public LteexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterLteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitLteexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(fParser.MINUS, 0); }
		public MinusexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterMinusexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitMinusexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode GT() { return getToken(fParser.GT, 0); }
		public GtexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterGtexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitGtexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode DIV() { return getToken(fParser.DIV, 0); }
		public DivexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterDivexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitDivexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotexpressionContext extends ExpressionstatementContext {
		public TerminalNode NOT() { return getToken(fParser.NOT, 0); }
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public NotexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterNotexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitNotexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GteexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode GTE() { return getToken(fParser.GTE, 0); }
		public GteexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterGteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitGteexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalexpressionContext extends ExpressionstatementContext {
		public TerminalNode DECIMAL() { return getToken(fParser.DECIMAL, 0); }
		public DecimalexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterDecimalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitDecimalexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringexpressionContext extends ExpressionstatementContext {
		public TerminalNode STRING() { return getToken(fParser.STRING, 0); }
		public StringexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterStringexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitStringexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressioninparenthesesContext extends ExpressionstatementContext {
		public TerminalNode LCURLY() { return getToken(fParser.LCURLY, 0); }
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(fParser.RCURLY, 0); }
		public ExpressioninparenthesesContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterExpressioninparentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitExpressioninparentheses(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode OR() { return getToken(fParser.OR, 0); }
		public OrexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterOrexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitOrexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeqexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(fParser.NEQ, 0); }
		public NeqexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterNeqexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitNeqexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode AND() { return getToken(fParser.AND, 0); }
		public AndexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitAndexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberfunctioninvocationexpressionContext extends ExpressionstatementContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(fParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(fParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(fParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(fParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fParser.RPAREN, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fParser.COMMA, i);
		}
		public MemberfunctioninvocationexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterMemberfunctioninvocationexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitMemberfunctioninvocationexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode MUL() { return getToken(fParser.MUL, 0); }
		public MulexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterMulexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitMulexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode LT() { return getToken(fParser.LT, 0); }
		public LtexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterLtexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitLtexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberaccessexpressionContext extends ExpressionstatementContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public TerminalNode DOT() { return getToken(fParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public MemberaccessexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterMemberaccessexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitMemberaccessexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerexpressionContext extends ExpressionstatementContext {
		public TerminalNode INTEGER() { return getToken(fParser.INTEGER, 0); }
		public IntegerexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterIntegerexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitIntegerexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassicfunctioninvocationexpressionContext extends ExpressionstatementContext {
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(fParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fParser.RPAREN, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fParser.COMMA, i);
		}
		public ClassicfunctioninvocationexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterClassicfunctioninvocationexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitClassicfunctioninvocationexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferencetypevariableexpressionContext extends ExpressionstatementContext {
		public TerminalNode ALLOC() { return getToken(fParser.ALLOC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(fParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fParser.RPAREN, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fParser.COMMA, i);
		}
		public ReferencetypevariableexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterReferencetypevariableexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitReferencetypevariableexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolexpressionContext extends ExpressionstatementContext {
		public TerminalNode BOOLEAN() { return getToken(fParser.BOOLEAN, 0); }
		public BoolexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterBoolexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitBoolexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipefunctioninvocationexpressionContext extends ExpressionstatementContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(fParser.PIPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(fParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fParser.RPAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(fParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(fParser.NEWLINE, i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fParser.COMMA, i);
		}
		public PipefunctioninvocationexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterPipefunctioninvocationexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitPipefunctioninvocationexpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModexpressionContext extends ExpressionstatementContext {
		public List<ExpressionstatementContext> expressionstatement() {
			return getRuleContexts(ExpressionstatementContext.class);
		}
		public ExpressionstatementContext expressionstatement(int i) {
			return getRuleContext(ExpressionstatementContext.class,i);
		}
		public TerminalNode MOD() { return getToken(fParser.MOD, 0); }
		public ModexpressionContext(ExpressionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterModexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitModexpression(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		return expressionstatement(0);
	}

	private ExpressionstatementContext expressionstatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, _parentState);
		ExpressionstatementContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressionstatement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ValuetypevariableexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new ReferencetypevariableexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(ALLOC);
				setState(192);
				type();
				setState(193);
				match(LPAREN);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 9011391143088129L) != 0) {
					{
					setState(194);
					param();
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(195);
						match(COMMA);
						setState(196);
						param();
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(204);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new StringexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new IntegerexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(INTEGER);
				}
				break;
			case 5:
				{
				_localctx = new DecimalexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(DECIMAL);
				}
				break;
			case 6:
				{
				_localctx = new BoolexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				_localctx = new NotexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(NOT);
				setState(211);
				expressionstatement(19);
				}
				break;
			case 8:
				{
				_localctx = new ClassicfunctioninvocationexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(IDENTIFIER);
				setState(213);
				match(LPAREN);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 9011391143088129L) != 0) {
					{
					setState(214);
					param();
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(215);
						match(COMMA);
						setState(216);
						param();
						}
						}
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(224);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new MemberfunctioninvocationexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(IDENTIFIER);
				setState(226);
				match(DOT);
				setState(227);
				match(IDENTIFIER);
				setState(228);
				match(LPAREN);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 9011391143088129L) != 0) {
					{
					setState(229);
					param();
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(230);
						match(COMMA);
						setState(231);
						param();
						}
						}
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(239);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ExpressioninparenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(240);
				match(LCURLY);
				setState(241);
				expressionstatement(0);
				setState(242);
				match(RCURLY);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new AndexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(246);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(247);
						match(AND);
						setState(248);
						expressionstatement(19);
						}
						break;
					case 2:
						{
						_localctx = new OrexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(249);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(250);
						match(OR);
						setState(251);
						expressionstatement(18);
						}
						break;
					case 3:
						{
						_localctx = new PlusexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(252);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(253);
						match(PLUS);
						setState(254);
						expressionstatement(17);
						}
						break;
					case 4:
						{
						_localctx = new MinusexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(255);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(256);
						match(MINUS);
						setState(257);
						expressionstatement(16);
						}
						break;
					case 5:
						{
						_localctx = new MulexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(258);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(259);
						match(MUL);
						setState(260);
						expressionstatement(15);
						}
						break;
					case 6:
						{
						_localctx = new DivexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(261);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(262);
						match(DIV);
						setState(263);
						expressionstatement(14);
						}
						break;
					case 7:
						{
						_localctx = new ModexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(264);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(265);
						match(MOD);
						setState(266);
						expressionstatement(13);
						}
						break;
					case 8:
						{
						_localctx = new GtexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(267);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(268);
						match(GT);
						setState(269);
						expressionstatement(12);
						}
						break;
					case 9:
						{
						_localctx = new LtexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(270);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(271);
						match(LT);
						setState(272);
						expressionstatement(11);
						}
						break;
					case 10:
						{
						_localctx = new GteexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(273);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(274);
						match(GTE);
						setState(275);
						expressionstatement(10);
						}
						break;
					case 11:
						{
						_localctx = new LteexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(276);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(277);
						match(LTE);
						setState(278);
						expressionstatement(9);
						}
						break;
					case 12:
						{
						_localctx = new NeqexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(279);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(280);
						match(NEQ);
						setState(281);
						expressionstatement(8);
						}
						break;
					case 13:
						{
						_localctx = new EqexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(282);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(283);
						match(EQ);
						setState(284);
						expressionstatement(7);
						}
						break;
					case 14:
						{
						_localctx = new PipefunctioninvocationexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(285);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(287);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(286);
							match(NEWLINE);
							}
						}

						setState(289);
						match(PIPE);
						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(290);
							match(NEWLINE);
							}
						}

						setState(293);
						match(IDENTIFIER);
						setState(294);
						match(LPAREN);
						setState(303);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 9011391143088129L) != 0) {
							{
							{
							setState(295);
							param();
							}
							setState(300);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(296);
								match(COMMA);
								{
								setState(297);
								param();
								}
								}
								}
								setState(302);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(305);
						match(RPAREN);
						}
						break;
					case 15:
						{
						_localctx = new MemberaccessexpressionContext(new ExpressionstatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionstatement);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307);
						match(DOT);
						setState(308);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyvaluepairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(fParser.IDENTIFIER, 0); }
		public TerminalNode RETURNTYPESIGN() { return getToken(fParser.RETURNTYPESIGN, 0); }
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public KeyvaluepairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvaluepair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterKeyvaluepair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitKeyvaluepair(this);
		}
	}

	public final KeyvaluepairContext keyvaluepair() throws RecognitionException {
		KeyvaluepairContext _localctx = new KeyvaluepairContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_keyvaluepair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(IDENTIFIER);
			setState(315);
			match(RETURNTYPESIGN);
			setState(316);
			expressionstatement(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public KeyvaluepairContext keyvaluepair() {
			return getRuleContext(KeyvaluepairContext.class,0);
		}
		public TerminalNode QUESTIONMARK() { return getToken(fParser.QUESTIONMARK, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				expressionstatement(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				keyvaluepair();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(QUESTIONMARK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionstatementContext extends ParserRuleContext {
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public ClassdefinitionContext classdefinition() {
			return getRuleContext(ClassdefinitionContext.class,0);
		}
		public InterfacedefinitionContext interfacedefinition() {
			return getRuleContext(InterfacedefinitionContext.class,0);
		}
		public DefinitionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterDefinitionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitDefinitionstatement(this);
		}
	}

	public final DefinitionstatementContext definitionstatement() throws RecognitionException {
		DefinitionstatementContext _localctx = new DefinitionstatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_definitionstatement);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case PRIVDEF:
			case OVERRIDENDEF:
			case PRIVOVERRIDENDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				functiondefinition();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				classdefinition();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				interfacedefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctiondefinitionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(fParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(fParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(fParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fParser.RPAREN, 0); }
		public TerminalNode RETURNTYPESIGN() { return getToken(fParser.RETURNTYPESIGN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DEF() { return getToken(fParser.DEF, 0); }
		public TerminalNode PRIVDEF() { return getToken(fParser.PRIVDEF, 0); }
		public TerminalNode PRIVOVERRIDENDEF() { return getToken(fParser.PRIVOVERRIDENDEF, 0); }
		public TerminalNode OVERRIDENDEF() { return getToken(fParser.OVERRIDENDEF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fParser.COMMA, i);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitFunctiondefinition(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1671168L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(329);
			match(IDENTIFIER);
			setState(330);
			match(LPAREN);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 959L) != 0) {
				{
				setState(331);
				type();
				setState(332);
				match(IDENTIFIER);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					type();
					setState(335);
					match(IDENTIFIER);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(344);
			match(RPAREN);
			setState(345);
			match(RETURNTYPESIGN);
			setState(346);
			type();
			setState(347);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassdefinitionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(fParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(fParser.IDENTIFIER, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode INHERITS() { return getToken(fParser.INHERITS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(fParser.IMPLEMENTS, 0); }
		public ClassdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterClassdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitClassdefinition(this);
		}
	}

	public final ClassdefinitionContext classdefinition() throws RecognitionException {
		ClassdefinitionContext _localctx = new ClassdefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__0);
			setState(350);
			match(IDENTIFIER);
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INHERITS:
				{
				setState(351);
				match(INHERITS);
				}
				break;
			case IMPLEMENTS:
				{
				setState(352);
				match(IMPLEMENTS);
				setState(353);
				match(IDENTIFIER);
				}
				break;
			case NEWLINE:
				break;
			default:
				break;
			}
			setState(356);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacedefinitionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(fParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(fParser.IDENTIFIER, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode INHERITS() { return getToken(fParser.INHERITS, 0); }
		public InterfacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterInterfacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitInterfacedefinition(this);
		}
	}

	public final InterfacedefinitionContext interfacedefinition() throws RecognitionException {
		InterfacedefinitionContext _localctx = new InterfacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interfacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__1);
			setState(359);
			match(IDENTIFIER);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(360);
				match(INHERITS);
				setState(361);
				match(IDENTIFIER);
				}
			}

			setState(364);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ControlflowstatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public ControlflowstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlflowstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterControlflowstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitControlflowstatement(this);
		}
	}

	public final ControlflowstatementContext controlflowstatement() throws RecognitionException {
		ControlflowstatementContext _localctx = new ControlflowstatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_controlflowstatement);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				ifstatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				whilestatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(fParser.IF, 0); }
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElifstatementContext> elifstatement() {
			return getRuleContexts(ElifstatementContext.class);
		}
		public ElifstatementContext elifstatement(int i) {
			return getRuleContext(ElifstatementContext.class,i);
		}
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(IF);
			setState(371);
			expressionstatement(0);
			setState(372);
			block();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(373);
				elifstatement();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(379);
				elsestatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElifstatementContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(fParser.ELSEIF, 0); }
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterElifstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitElifstatement(this);
		}
	}

	public final ElifstatementContext elifstatement() throws RecognitionException {
		ElifstatementContext _localctx = new ElifstatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(ELSEIF);
			setState(383);
			expressionstatement(0);
			setState(384);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElsestatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(fParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterElsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitElsestatement(this);
		}
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(ELSE);
			setState(387);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhilestatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(fParser.WHILE, 0); }
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitWhilestatement(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(WHILE);
			setState(390);
			expressionstatement(0);
			setState(391);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRINGTYPE() { return getToken(fParser.STRINGTYPE, 0); }
		public TerminalNode NUMTYPE() { return getToken(fParser.NUMTYPE, 0); }
		public TerminalNode CHARTYPE() { return getToken(fParser.CHARTYPE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(fParser.BOOLTYPE, 0); }
		public TerminalNode ANYTYPE() { return getToken(fParser.ANYTYPE, 0); }
		public TerminalNode VOIDTYPE() { return getToken(fParser.VOIDTYPE, 0); }
		public TerminalNode CUSTOMTYPE() { return getToken(fParser.CUSTOMTYPE, 0); }
		public TerminalNode ARRAYTYPE() { return getToken(fParser.ARRAYTYPE, 0); }
		public TerminalNode MAPTYPE() { return getToken(fParser.MAPTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fListener ) ((fListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 959L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expressionstatement_sempred((ExpressionstatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionstatement_sempred(ExpressionstatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u018c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003[\b\u0003\u000b\u0003"+
		"\f\u0003\\\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"c\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007o\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007s\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0003\bz\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u0088\b\n\n\n\f\n\u008b\t\n\u0003\n\u008d\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0096\b\u000b"+
		"\u000b\u000b\f\u000b\u0097\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009e"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u00a8\b\u000e\u000b\u000e\f\u000e\u00a9\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00ae\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00b2\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u00ba\b\u0010\u000b\u0010\f\u0010\u00bb\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00c6\b\u0011\n\u0011\f\u0011\u00c9\t\u0011"+
		"\u0003\u0011\u00cb\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00da\b\u0011\n\u0011"+
		"\f\u0011\u00dd\t\u0011\u0003\u0011\u00df\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00e9\b\u0011\n\u0011\f\u0011\u00ec\t\u0011\u0003\u0011\u00ee"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00f5\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0120\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0124"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u012b\b\u0011\n\u0011\f\u0011\u012e\t\u0011\u0003\u0011\u0130\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0136"+
		"\b\u0011\n\u0011\f\u0011\u0139\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0142\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0147\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0152\b\u0015\n\u0015\f\u0015\u0155"+
		"\t\u0015\u0003\u0015\u0157\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0163\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u016b\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0171\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0177\b\u0019\n\u0019"+
		"\f\u0019\u017a\t\u0019\u0001\u0019\u0003\u0019\u017d\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0000\u0001\"\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0003"+
		"\u0001\u0000\u0011\u0012\u0002\u0000\u000f\u0010\u0013\u0014\u0002\u0000"+
		"7<>@\u01b2\u0000@\u0001\u0000\u0000\u0000\u0002G\u0001\u0000\u0000\u0000"+
		"\u0004U\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000\bb\u0001"+
		"\u0000\u0000\u0000\nf\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000"+
		"\u000el\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012{"+
		"\u0001\u0000\u0000\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u0092\u0001"+
		"\u0000\u0000\u0000\u0018\u009d\u0001\u0000\u0000\u0000\u001a\u009f\u0001"+
		"\u0000\u0000\u0000\u001c\u00a4\u0001\u0000\u0000\u0000\u001e\u00ab\u0001"+
		"\u0000\u0000\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00f4\u0001\u0000"+
		"\u0000\u0000$\u013a\u0001\u0000\u0000\u0000&\u0141\u0001\u0000\u0000\u0000"+
		"(\u0146\u0001\u0000\u0000\u0000*\u0148\u0001\u0000\u0000\u0000,\u015d"+
		"\u0001\u0000\u0000\u0000.\u0166\u0001\u0000\u0000\u00000\u0170\u0001\u0000"+
		"\u0000\u00002\u0172\u0001\u0000\u0000\u00004\u017e\u0001\u0000\u0000\u0000"+
		"6\u0182\u0001\u0000\u0000\u00008\u0185\u0001\u0000\u0000\u0000:\u0189"+
		"\u0001\u0000\u0000\u0000<?\u0005\u0003\u0000\u0000=?\u0003\u0002\u0001"+
		"\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u0000\u0000\u0001"+
		"D\u0001\u0001\u0000\u0000\u0000EH\u0003\u0004\u0002\u0000FH\u0003\b\u0004"+
		"\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0003\u0001"+
		"\u0000\u0000\u0000IJ\u0003\u0010\b\u0000JK\u0005\u0003\u0000\u0000KV\u0001"+
		"\u0000\u0000\u0000LM\u0003\n\u0005\u0000MN\u0005\u0003\u0000\u0000NV\u0001"+
		"\u0000\u0000\u0000OP\u0003\u0018\f\u0000PQ\u0005\u0003\u0000\u0000QV\u0001"+
		"\u0000\u0000\u0000RS\u0003\"\u0011\u0000ST\u0005\u0003\u0000\u0000TV\u0001"+
		"\u0000\u0000\u0000UI\u0001\u0000\u0000\u0000UL\u0001\u0000\u0000\u0000"+
		"UO\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000V\u0005\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0003\u0000\u0000XZ\u0005\u0005\u0000\u0000Y[\u0003"+
		"\u0002\u0001\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0006\u0000\u0000_\u0007\u0001\u0000\u0000\u0000`c\u0003"+
		"(\u0014\u0000ac\u00030\u0018\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000"+
		"\u0000\u0000c\t\u0001\u0000\u0000\u0000dg\u0003\f\u0006\u0000eg\u0003"+
		"\u000e\u0007\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000"+
		"g\u000b\u0001\u0000\u0000\u0000hi\u0005B\u0000\u0000ij\u0005\u001a\u0000"+
		"\u0000jk\u0003\"\u0011\u0000k\r\u0001\u0000\u0000\u0000ln\u0003\"\u0011"+
		"\u0000mo\u0005\u0003\u0000\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pr\u00050\u0000\u0000qs\u0005\u0003"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0005B\u0000\u0000u\u000f\u0001\u0000\u0000\u0000"+
		"vz\u0003\u0014\n\u0000wz\u0003\u0012\t\u0000xz\u0003\u0016\u000b\u0000"+
		"yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z\u0011\u0001\u0000\u0000\u0000{|\u0003:\u001d\u0000|}\u0005B\u0000"+
		"\u0000}\u0013\u0001\u0000\u0000\u0000~\u007f\u0007\u0000\u0000\u0000\u007f"+
		"\u0080\u0005B\u0000\u0000\u0080\u008c\u0005\u001d\u0000\u0000\u0081\u0082"+
		"\u0003:\u001d\u0000\u0082\u0089\u0005B\u0000\u0000\u0083\u0084\u0005\u001b"+
		"\u0000\u0000\u0084\u0085\u0003:\u001d\u0000\u0085\u0086\u0005B\u0000\u0000"+
		"\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0081\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005\u001e\u0000\u0000\u008f\u0090\u0005A\u0000\u0000\u0090"+
		"\u0091\u0003:\u001d\u0000\u0091\u0015\u0001\u0000\u0000\u0000\u0092\u0095"+
		"\u0003\u0012\t\u0000\u0093\u0094\u0005\u000e\u0000\u0000\u0094\u0096\u0005"+
		"B\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009e\u0003\u001a"+
		"\r\u0000\u009a\u009e\u0003\u001c\u000e\u0000\u009b\u009e\u0003\u001e\u000f"+
		"\u0000\u009c\u009e\u0003 \u0010\u0000\u009d\u0099\u0001\u0000\u0000\u0000"+
		"\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u0019\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0003:\u001d\u0000\u00a0\u00a1\u0005B\u0000\u0000\u00a1\u00a2"+
		"\u0005\u001a\u0000\u0000\u00a2\u00a3\u0003\"\u0011\u0000\u00a3\u001b\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0003\u001a\r\u0000\u00a5\u00a6\u0005\u000e"+
		"\u0000\u0000\u00a6\u00a8\u0005B\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u001d\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ad\u0003\"\u0011\u0000\u00ac\u00ae\u0005\u0003\u0000\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u00050\u0000\u0000\u00b0"+
		"\u00b2\u0005\u0003\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0003:\u001d\u0000\u00b4\u00b5\u0005B\u0000\u0000\u00b5\u001f\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b9\u0003\u001e\u000f\u0000\u00b7\u00b8\u0005"+
		"\u000e\u0000\u0000\u00b8\u00ba\u0005B\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc!\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0006\u0011\uffff\uffff\u0000\u00be\u00f5\u0005B\u0000"+
		"\u0000\u00bf\u00c0\u0005\r\u0000\u0000\u00c0\u00c1\u0003:\u001d\u0000"+
		"\u00c1\u00ca\u0005\u001d\u0000\u0000\u00c2\u00c7\u0003&\u0013\u0000\u00c3"+
		"\u00c4\u0005\u001b\u0000\u0000\u00c4\u00c6\u0003&\u0013\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00c2"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u001e\u0000\u0000\u00cd\u00f5"+
		"\u0001\u0000\u0000\u0000\u00ce\u00f5\u00055\u0000\u0000\u00cf\u00f5\u0005"+
		"3\u0000\u0000\u00d0\u00f5\u00054\u0000\u0000\u00d1\u00f5\u00056\u0000"+
		"\u0000\u00d2\u00d3\u0005\u0019\u0000\u0000\u00d3\u00f5\u0003\"\u0011\u0013"+
		"\u00d4\u00d5\u0005B\u0000\u0000\u00d5\u00de\u0005\u001d\u0000\u0000\u00d6"+
		"\u00db\u0003&\u0013\u0000\u00d7\u00d8\u0005\u001b\u0000\u0000\u00d8\u00da"+
		"\u0003&\u0013\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00de\u00d6\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00f5\u0005"+
		"\u001e\u0000\u0000\u00e1\u00e2\u0005B\u0000\u0000\u00e2\u00e3\u0005#\u0000"+
		"\u0000\u00e3\u00e4\u0005B\u0000\u0000\u00e4\u00ed\u0005\u001d\u0000\u0000"+
		"\u00e5\u00ea\u0003&\u0013\u0000\u00e6\u00e7\u0005\u001b\u0000\u0000\u00e7"+
		"\u00e9\u0003&\u0013\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e5\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f5"+
		"\u0005\u001e\u0000\u0000\u00f0\u00f1\u0005\u001f\u0000\u0000\u00f1\u00f2"+
		"\u0003\"\u0011\u0000\u00f2\u00f3\u0005 \u0000\u0000\u00f3\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f4\u00bd\u0001\u0000\u0000\u0000\u00f4\u00bf\u0001"+
		"\u0000\u0000\u0000\u00f4\u00ce\u0001\u0000\u0000\u0000\u00f4\u00cf\u0001"+
		"\u0000\u0000\u0000\u00f4\u00d0\u0001\u0000\u0000\u0000\u00f4\u00d1\u0001"+
		"\u0000\u0000\u0000\u00f4\u00d2\u0001\u0000\u0000\u0000\u00f4\u00d4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00e1\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f5\u0137\u0001\u0000\u0000\u0000\u00f6\u00f7\n\u0012"+
		"\u0000\u0000\u00f7\u00f8\u0005\u0017\u0000\u0000\u00f8\u0136\u0003\"\u0011"+
		"\u0013\u00f9\u00fa\n\u0011\u0000\u0000\u00fa\u00fb\u0005\u0018\u0000\u0000"+
		"\u00fb\u0136\u0003\"\u0011\u0012\u00fc\u00fd\n\u0010\u0000\u0000\u00fd"+
		"\u00fe\u0005$\u0000\u0000\u00fe\u0136\u0003\"\u0011\u0011\u00ff\u0100"+
		"\n\u000f\u0000\u0000\u0100\u0101\u0005%\u0000\u0000\u0101\u0136\u0003"+
		"\"\u0011\u0010\u0102\u0103\n\u000e\u0000\u0000\u0103\u0104\u0005&\u0000"+
		"\u0000\u0104\u0136\u0003\"\u0011\u000f\u0105\u0106\n\r\u0000\u0000\u0106"+
		"\u0107\u0005\'\u0000\u0000\u0107\u0136\u0003\"\u0011\u000e\u0108\u0109"+
		"\n\f\u0000\u0000\u0109\u010a\u0005(\u0000\u0000\u010a\u0136\u0003\"\u0011"+
		"\r\u010b\u010c\n\u000b\u0000\u0000\u010c\u010d\u0005)\u0000\u0000\u010d"+
		"\u0136\u0003\"\u0011\f\u010e\u010f\n\n\u0000\u0000\u010f\u0110\u0005*"+
		"\u0000\u0000\u0110\u0136\u0003\"\u0011\u000b\u0111\u0112\n\t\u0000\u0000"+
		"\u0112\u0113\u0005+\u0000\u0000\u0113\u0136\u0003\"\u0011\n\u0114\u0115"+
		"\n\b\u0000\u0000\u0115\u0116\u0005,\u0000\u0000\u0116\u0136\u0003\"\u0011"+
		"\t\u0117\u0118\n\u0007\u0000\u0000\u0118\u0119\u0005-\u0000\u0000\u0119"+
		"\u0136\u0003\"\u0011\b\u011a\u011b\n\u0006\u0000\u0000\u011b\u011c\u0005"+
		".\u0000\u0000\u011c\u0136\u0003\"\u0011\u0007\u011d\u011f\n\u0004\u0000"+
		"\u0000\u011e\u0120\u0005\u0003\u0000\u0000\u011f\u011e\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0123\u0005/\u0000\u0000\u0122\u0124\u0005\u0003\u0000\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005B\u0000\u0000\u0126"+
		"\u012f\u0005\u001d\u0000\u0000\u0127\u012c\u0003&\u0013\u0000\u0128\u0129"+
		"\u0005\u001b\u0000\u0000\u0129\u012b\u0003&\u0013\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0130\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0127\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u0136\u0005\u001e\u0000\u0000\u0132\u0133\n\u0002"+
		"\u0000\u0000\u0133\u0134\u0005#\u0000\u0000\u0134\u0136\u0005B\u0000\u0000"+
		"\u0135\u00f6\u0001\u0000\u0000\u0000\u0135\u00f9\u0001\u0000\u0000\u0000"+
		"\u0135\u00fc\u0001\u0000\u0000\u0000\u0135\u00ff\u0001\u0000\u0000\u0000"+
		"\u0135\u0102\u0001\u0000\u0000\u0000\u0135\u0105\u0001\u0000\u0000\u0000"+
		"\u0135\u0108\u0001\u0000\u0000\u0000\u0135\u010b\u0001\u0000\u0000\u0000"+
		"\u0135\u010e\u0001\u0000\u0000\u0000\u0135\u0111\u0001\u0000\u0000\u0000"+
		"\u0135\u0114\u0001\u0000\u0000\u0000\u0135\u0117\u0001\u0000\u0000\u0000"+
		"\u0135\u011a\u0001\u0000\u0000\u0000\u0135\u011d\u0001\u0000\u0000\u0000"+
		"\u0135\u0132\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138#\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005B\u0000\u0000\u013b\u013c\u0005A\u0000\u0000\u013c\u013d\u0003"+
		"\"\u0011\u0000\u013d%\u0001\u0000\u0000\u0000\u013e\u0142\u0003\"\u0011"+
		"\u0000\u013f\u0142\u0003$\u0012\u0000\u0140\u0142\u00051\u0000\u0000\u0141"+
		"\u013e\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\'\u0001\u0000\u0000\u0000\u0143\u0147"+
		"\u0003*\u0015\u0000\u0144\u0147\u0003,\u0016\u0000\u0145\u0147\u0003."+
		"\u0017\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147)\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0007\u0001\u0000\u0000\u0149\u014a\u0005B\u0000\u0000"+
		"\u014a\u0156\u0005\u001d\u0000\u0000\u014b\u014c\u0003:\u001d\u0000\u014c"+
		"\u0153\u0005B\u0000\u0000\u014d\u014e\u0005\u001b\u0000\u0000\u014e\u014f"+
		"\u0003:\u001d\u0000\u014f\u0150\u0005B\u0000\u0000\u0150\u0152\u0001\u0000"+
		"\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0156\u014b\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0005\u001e"+
		"\u0000\u0000\u0159\u015a\u0005A\u0000\u0000\u015a\u015b\u0003:\u001d\u0000"+
		"\u015b\u015c\u0003\u0006\u0003\u0000\u015c+\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0005\u0001\u0000\u0000\u015e\u0162\u0005B\u0000\u0000\u015f\u0163"+
		"\u0005\u0015\u0000\u0000\u0160\u0161\u0005\u0016\u0000\u0000\u0161\u0163"+
		"\u0005B\u0000\u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0003\u0006\u0003\u0000\u0165-\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0005\u0002\u0000\u0000\u0167\u016a\u0005B\u0000"+
		"\u0000\u0168\u0169\u0005\u0015\u0000\u0000\u0169\u016b\u0005B\u0000\u0000"+
		"\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0003\u0006\u0003\u0000"+
		"\u016d/\u0001\u0000\u0000\u0000\u016e\u0171\u00032\u0019\u0000\u016f\u0171"+
		"\u00038\u001c\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u016f\u0001"+
		"\u0000\u0000\u0000\u01711\u0001\u0000\u0000\u0000\u0172\u0173\u0005\n"+
		"\u0000\u0000\u0173\u0174\u0003\"\u0011\u0000\u0174\u0178\u0003\u0006\u0003"+
		"\u0000\u0175\u0177\u00034\u001a\u0000\u0176\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017d\u00036\u001b\u0000\u017c"+
		"\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"3\u0001\u0000\u0000\u0000\u017e\u017f\u0005\f\u0000\u0000\u017f\u0180"+
		"\u0003\"\u0011\u0000\u0180\u0181\u0003\u0006\u0003\u0000\u01815\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0005\u000b\u0000\u0000\u0183\u0184\u0003"+
		"\u0006\u0003\u0000\u01847\u0001\u0000\u0000\u0000\u0185\u0186\u0005\t"+
		"\u0000\u0000\u0186\u0187\u0003\"\u0011\u0000\u0187\u0188\u0003\u0006\u0003"+
		"\u0000\u01889\u0001\u0000\u0000\u0000\u0189\u018a\u0007\u0002\u0000\u0000"+
		"\u018a;\u0001\u0000\u0000\u0000(>@GU\\bfnry\u0089\u008c\u0097\u009d\u00a9"+
		"\u00ad\u00b1\u00bb\u00c7\u00ca\u00db\u00de\u00ea\u00ed\u00f4\u011f\u0123"+
		"\u012c\u012f\u0135\u0137\u0141\u0146\u0153\u0156\u0162\u016a\u0170\u0178"+
		"\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}