// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class fLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NEWLINE", "WS", "INDENT", "DEDENT", "BlockComment", 
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



	public fLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "f.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			INDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			DEDENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

				if (pendingDent) { setChannel(HIDDEN); }
				pendingDent = true;
				indentCount = 0;
				initialIndentToken = null;

			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

				setChannel(HIDDEN);
				if (pendingDent) { indentCount += getText().length(); }

			break;
		}
	}
	private void INDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 setChannel(HIDDEN); 
			break;
		}
	}
	private void DEDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 setChannel(HIDDEN); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000B\u01cb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0003\u0002\u0097\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u009b\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003\u00a0"+
		"\b\u0003\u000b\u0003\f\u0003\u00a1\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00bd\b\u0006"+
		"\n\u0006\f\u0006\u00c0\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00cb\b\u0007\n\u0007\f\u0007\u00ce\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00012\u00032\u016b\b2\u00012\u00042\u016e\b2\u000b2\f2\u016f"+
		"\u00013\u00033\u0173\b3\u00013\u00043\u0176\b3\u000b3\f3\u0177\u00013"+
		"\u00013\u00043\u017c\b3\u000b3\f3\u017d\u00014\u00014\u00054\u0182\b4"+
		"\n4\f4\u0185\t4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u0192\b5\u00016\u00016\u00056\u0196\b6\n"+
		"6\f6\u0199\t6\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018"+
		"\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0005A\u01c7\bA\nA\fA\u01ca"+
		"\tA\u0002\u00be\u0183\u0000B\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s"+
		":u;w<y={>}?\u007f@\u0081A\u0083B\u0001\u0000\u0006\u0002\u0000\t\t  \u0002"+
		"\u0000\n\n\r\r\u0001\u000009\u0001\u0000AZ\u0004\u000009AZ__az\u0003\u0000"+
		"AZ__az\u01d9\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
		"]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001"+
		"\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000"+
		"\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000"+
		"k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001"+
		"\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000"+
		"\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000"+
		"y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001"+
		"\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001"+
		"\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000\u0001\u0085\u0001"+
		"\u0000\u0000\u0000\u0003\u008b\u0001\u0000\u0000\u0000\u0005\u009a\u0001"+
		"\u0000\u0000\u0000\u0007\u009f\u0001\u0000\u0000\u0000\t\u00a5\u0001\u0000"+
		"\u0000\u0000\u000b\u00ae\u0001\u0000\u0000\u0000\r\u00b7\u0001\u0000\u0000"+
		"\u0000\u000f\u00c6\u0001\u0000\u0000\u0000\u0011\u00d1\u0001\u0000\u0000"+
		"\u0000\u0013\u00d7\u0001\u0000\u0000\u0000\u0015\u00da\u0001\u0000\u0000"+
		"\u0000\u0017\u00df\u0001\u0000\u0000\u0000\u0019\u00e4\u0001\u0000\u0000"+
		"\u0000\u001b\u00e8\u0001\u0000\u0000\u0000\u001d\u00ea\u0001\u0000\u0000"+
		"\u0000\u001f\u00ee\u0001\u0000\u0000\u0000!\u00f3\u0001\u0000\u0000\u0000"+
		"#\u00f7\u0001\u0000\u0000\u0000%\u00fc\u0001\u0000\u0000\u0000\'\u0104"+
		"\u0001\u0000\u0000\u0000)\u010d\u0001\u0000\u0000\u0000+\u0116\u0001\u0000"+
		"\u0000\u0000-\u0121\u0001\u0000\u0000\u0000/\u0125\u0001\u0000\u0000\u0000"+
		"1\u0128\u0001\u0000\u0000\u00003\u012c\u0001\u0000\u0000\u00005\u012e"+
		"\u0001\u0000\u0000\u00007\u0130\u0001\u0000\u0000\u00009\u0132\u0001\u0000"+
		"\u0000\u0000;\u0134\u0001\u0000\u0000\u0000=\u0136\u0001\u0000\u0000\u0000"+
		"?\u0138\u0001\u0000\u0000\u0000A\u013a\u0001\u0000\u0000\u0000C\u013c"+
		"\u0001\u0000\u0000\u0000E\u013e\u0001\u0000\u0000\u0000G\u0140\u0001\u0000"+
		"\u0000\u0000I\u0142\u0001\u0000\u0000\u0000K\u0144\u0001\u0000\u0000\u0000"+
		"M\u0146\u0001\u0000\u0000\u0000O\u0148\u0001\u0000\u0000\u0000Q\u014a"+
		"\u0001\u0000\u0000\u0000S\u014c\u0001\u0000\u0000\u0000U\u014e\u0001\u0000"+
		"\u0000\u0000W\u0151\u0001\u0000\u0000\u0000Y\u0154\u0001\u0000\u0000\u0000"+
		"[\u0157\u0001\u0000\u0000\u0000]\u015a\u0001\u0000\u0000\u0000_\u015d"+
		"\u0001\u0000\u0000\u0000a\u0161\u0001\u0000\u0000\u0000c\u0163\u0001\u0000"+
		"\u0000\u0000e\u016a\u0001\u0000\u0000\u0000g\u0172\u0001\u0000\u0000\u0000"+
		"i\u017f\u0001\u0000\u0000\u0000k\u0191\u0001\u0000\u0000\u0000m\u0193"+
		"\u0001\u0000\u0000\u0000o\u019a\u0001\u0000\u0000\u0000q\u019e\u0001\u0000"+
		"\u0000\u0000s\u01a2\u0001\u0000\u0000\u0000u\u01a6\u0001\u0000\u0000\u0000"+
		"w\u01ab\u0001\u0000\u0000\u0000y\u01b0\u0001\u0000\u0000\u0000{\u01b5"+
		"\u0001\u0000\u0000\u0000}\u01ba\u0001\u0000\u0000\u0000\u007f\u01be\u0001"+
		"\u0000\u0000\u0000\u0081\u01c2\u0001\u0000\u0000\u0000\u0083\u01c4\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005c\u0000\u0000\u0086\u0087\u0005l\u0000"+
		"\u0000\u0087\u0088\u0005a\u0000\u0000\u0088\u0089\u0005s\u0000\u0000\u0089"+
		"\u008a\u0005s\u0000\u0000\u008a\u0002\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005i\u0000\u0000\u008c\u008d\u0005n\u0000\u0000\u008d\u008e\u0005t"+
		"\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f\u0090\u0005r\u0000\u0000"+
		"\u0090\u0091\u0005f\u0000\u0000\u0091\u0092\u0005a\u0000\u0000\u0092\u0093"+
		"\u0005c\u0000\u0000\u0093\u0094\u0005e\u0000\u0000\u0094\u0004\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0005\r\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0005\n\u0000\u0000\u0099\u009b\u0005\r\u0000\u0000"+
		"\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0002\u0000\u0000"+
		"\u009d\u0006\u0001\u0000\u0000\u0000\u009e\u00a0\u0007\u0000\u0000\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\u0003\u0001\u0000"+
		"\u00a4\b\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005I\u0000\u0000\u00a6"+
		"\u00a7\u0005N\u0000\u0000\u00a7\u00a8\u0005D\u0000\u0000\u00a8\u00a9\u0005"+
		"E\u0000\u0000\u00a9\u00aa\u0005N\u0000\u0000\u00aa\u00ab\u0005T\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u0004\u0002"+
		"\u0000\u00ad\n\u0001\u0000\u0000\u0000\u00ae\u00af\u0005D\u0000\u0000"+
		"\u00af\u00b0\u0005E\u0000\u0000\u00b0\u00b1\u0005D\u0000\u0000\u00b1\u00b2"+
		"\u0005E\u0000\u0000\u00b2\u00b3\u0005N\u0000\u0000\u00b3\u00b4\u0005T"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0006\u0005"+
		"\u0003\u0000\u00b6\f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005/\u0000"+
		"\u0000\u00b8\u00b9\u0005*\u0000\u0000\u00b9\u00be\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bd\u0003\r\u0006\u0000\u00bb\u00bd\t\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005*\u0000\u0000\u00c2\u00c3"+
		"\u0005/\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0006"+
		"\u0006\u0004\u0000\u00c5\u000e\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005"+
		"/\u0000\u0000\u00c7\u00c8\u0005/\u0000\u0000\u00c8\u00cc\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\b\u0001\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0006\u0007\u0004\u0000"+
		"\u00d0\u0010\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005w\u0000\u0000\u00d2"+
		"\u00d3\u0005h\u0000\u0000\u00d3\u00d4\u0005i\u0000\u0000\u00d4\u00d5\u0005"+
		"l\u0000\u0000\u00d5\u00d6\u0005e\u0000\u0000\u00d6\u0012\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005i\u0000\u0000\u00d8\u00d9\u0005f\u0000\u0000\u00d9"+
		"\u0014\u0001\u0000\u0000\u0000\u00da\u00db\u0005e\u0000\u0000\u00db\u00dc"+
		"\u0005l\u0000\u0000\u00dc\u00dd\u0005s\u0000\u0000\u00dd\u00de\u0005e"+
		"\u0000\u0000\u00de\u0016\u0001\u0000\u0000\u0000\u00df\u00e0\u0005e\u0000"+
		"\u0000\u00e0\u00e1\u0005l\u0000\u0000\u00e1\u00e2\u0005i\u0000\u0000\u00e2"+
		"\u00e3\u0005f\u0000\u0000\u00e3\u0018\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005n\u0000\u0000\u00e5\u00e6\u0005e\u0000\u0000\u00e6\u00e7\u0005w"+
		"\u0000\u0000\u00e7\u001a\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005@\u0000"+
		"\u0000\u00e9\u001c\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005d\u0000\u0000"+
		"\u00eb\u00ec\u0005e\u0000\u0000\u00ec\u00ed\u0005f\u0000\u0000\u00ed\u001e"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005_\u0000\u0000\u00ef\u00f0\u0005"+
		"d\u0000\u0000\u00f0\u00f1\u0005e\u0000\u0000\u00f1\u00f2\u0005f\u0000"+
		"\u0000\u00f2 \u0001\u0000\u0000\u0000\u00f3\u00f4\u0005d\u0000\u0000\u00f4"+
		"\u00f5\u0005e\u0000\u0000\u00f5\u00f6\u0005c\u0000\u0000\u00f6\"\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005_\u0000\u0000\u00f8\u00f9\u0005d\u0000"+
		"\u0000\u00f9\u00fa\u0005e\u0000\u0000\u00fa\u00fb\u0005c\u0000\u0000\u00fb"+
		"$\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005o\u0000\u0000\u00fd\u00fe\u0005"+
		"v\u0000\u0000\u00fe\u00ff\u0005e\u0000\u0000\u00ff\u0100\u0005r\u0000"+
		"\u0000\u0100\u0101\u0005d\u0000\u0000\u0101\u0102\u0005e\u0000\u0000\u0102"+
		"\u0103\u0005f\u0000\u0000\u0103&\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"_\u0000\u0000\u0105\u0106\u0005o\u0000\u0000\u0106\u0107\u0005v\u0000"+
		"\u0000\u0107\u0108\u0005e\u0000\u0000\u0108\u0109\u0005r\u0000\u0000\u0109"+
		"\u010a\u0005d\u0000\u0000\u010a\u010b\u0005e\u0000\u0000\u010b\u010c\u0005"+
		"f\u0000\u0000\u010c(\u0001\u0000\u0000\u0000\u010d\u010e\u0005i\u0000"+
		"\u0000\u010e\u010f\u0005n\u0000\u0000\u010f\u0110\u0005h\u0000\u0000\u0110"+
		"\u0111\u0005e\u0000\u0000\u0111\u0112\u0005r\u0000\u0000\u0112\u0113\u0005"+
		"i\u0000\u0000\u0113\u0114\u0005t\u0000\u0000\u0114\u0115\u0005s\u0000"+
		"\u0000\u0115*\u0001\u0000\u0000\u0000\u0116\u0117\u0005i\u0000\u0000\u0117"+
		"\u0118\u0005m\u0000\u0000\u0118\u0119\u0005p\u0000\u0000\u0119\u011a\u0005"+
		"l\u0000\u0000\u011a\u011b\u0005e\u0000\u0000\u011b\u011c\u0005m\u0000"+
		"\u0000\u011c\u011d\u0005e\u0000\u0000\u011d\u011e\u0005n\u0000\u0000\u011e"+
		"\u011f\u0005t\u0000\u0000\u011f\u0120\u0005s\u0000\u0000\u0120,\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005a\u0000\u0000\u0122\u0123\u0005n\u0000"+
		"\u0000\u0123\u0124\u0005d\u0000\u0000\u0124.\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0005o\u0000\u0000\u0126\u0127\u0005r\u0000\u0000\u01270\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005n\u0000\u0000\u0129\u012a\u0005o\u0000"+
		"\u0000\u012a\u012b\u0005t\u0000\u0000\u012b2\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005=\u0000\u0000\u012d4\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		",\u0000\u0000\u012f6\u0001\u0000\u0000\u0000\u0130\u0131\u0005;\u0000"+
		"\u0000\u01318\u0001\u0000\u0000\u0000\u0132\u0133\u0005(\u0000\u0000\u0133"+
		":\u0001\u0000\u0000\u0000\u0134\u0135\u0005)\u0000\u0000\u0135<\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005{\u0000\u0000\u0137>\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005}\u0000\u0000\u0139@\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005[\u0000\u0000\u013bB\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"]\u0000\u0000\u013dD\u0001\u0000\u0000\u0000\u013e\u013f\u0005.\u0000"+
		"\u0000\u013fF\u0001\u0000\u0000\u0000\u0140\u0141\u0005+\u0000\u0000\u0141"+
		"H\u0001\u0000\u0000\u0000\u0142\u0143\u0005-\u0000\u0000\u0143J\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0005*\u0000\u0000\u0145L\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0005/\u0000\u0000\u0147N\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0005%\u0000\u0000\u0149P\u0001\u0000\u0000\u0000\u014a\u014b\u0005"+
		">\u0000\u0000\u014bR\u0001\u0000\u0000\u0000\u014c\u014d\u0005<\u0000"+
		"\u0000\u014dT\u0001\u0000\u0000\u0000\u014e\u014f\u0005>\u0000\u0000\u014f"+
		"\u0150\u0005=\u0000\u0000\u0150V\u0001\u0000\u0000\u0000\u0151\u0152\u0005"+
		"<\u0000\u0000\u0152\u0153\u0005=\u0000\u0000\u0153X\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0005!\u0000\u0000\u0155\u0156\u0005=\u0000\u0000\u0156"+
		"Z\u0001\u0000\u0000\u0000\u0157\u0158\u0005=\u0000\u0000\u0158\u0159\u0005"+
		"=\u0000\u0000\u0159\\\u0001\u0000\u0000\u0000\u015a\u015b\u0005|\u0000"+
		"\u0000\u015b\u015c\u0005>\u0000\u0000\u015c^\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0005|\u0000\u0000\u015e\u015f\u0005>\u0000\u0000\u015f\u0160\u0005"+
		">\u0000\u0000\u0160`\u0001\u0000\u0000\u0000\u0161\u0162\u0005?\u0000"+
		"\u0000\u0162b\u0001\u0000\u0000\u0000\u0163\u0164\u0005\'\u0000\u0000"+
		"\u0164\u0165\u0005 \u0000\u0000\u0165\u0166\u0005.\u0000\u0000\u0166\u0167"+
		"\u0005 \u0000\u0000\u0167\u0168\u0005\'\u0000\u0000\u0168d\u0001\u0000"+
		"\u0000\u0000\u0169\u016b\u0005-\u0000\u0000\u016a\u0169\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000"+
		"\u0000\u016c\u016e\u0007\u0002\u0000\u0000\u016d\u016c\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170f\u0001\u0000\u0000\u0000"+
		"\u0171\u0173\u0005-\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174"+
		"\u0176\u0007\u0002\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179"+
		"\u017b\u0005.\u0000\u0000\u017a\u017c\u0007\u0002\u0000\u0000\u017b\u017a"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017b"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017eh\u0001"+
		"\u0000\u0000\u0000\u017f\u0183\u0005\"\u0000\u0000\u0180\u0182\t\u0000"+
		"\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000"+
		"\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0005\"\u0000\u0000\u0187j\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0005t\u0000\u0000\u0189\u018a\u0005r\u0000\u0000\u018a"+
		"\u018b\u0005u\u0000\u0000\u018b\u0192\u0005e\u0000\u0000\u018c\u018d\u0005"+
		"f\u0000\u0000\u018d\u018e\u0005a\u0000\u0000\u018e\u018f\u0005l\u0000"+
		"\u0000\u018f\u0190\u0005s\u0000\u0000\u0190\u0192\u0005e\u0000\u0000\u0191"+
		"\u0188\u0001\u0000\u0000\u0000\u0191\u018c\u0001\u0000\u0000\u0000\u0192"+
		"l\u0001\u0000\u0000\u0000\u0193\u0197\u0007\u0003\u0000\u0000\u0194\u0196"+
		"\u0007\u0004\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199"+
		"\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198n\u0001\u0000\u0000\u0000\u0199\u0197\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0005n\u0000\u0000\u019b\u019c\u0005u\u0000"+
		"\u0000\u019c\u019d\u0005m\u0000\u0000\u019dp\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0005s\u0000\u0000\u019f\u01a0\u0005t\u0000\u0000\u01a0\u01a1\u0005"+
		"r\u0000\u0000\u01a1r\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005a\u0000"+
		"\u0000\u01a3\u01a4\u0005n\u0000\u0000\u01a4\u01a5\u0005y\u0000\u0000\u01a5"+
		"t\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005b\u0000\u0000\u01a7\u01a8\u0005"+
		"o\u0000\u0000\u01a8\u01a9\u0005o\u0000\u0000\u01a9\u01aa\u0005l\u0000"+
		"\u0000\u01aav\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005v\u0000\u0000\u01ac"+
		"\u01ad\u0005o\u0000\u0000\u01ad\u01ae\u0005i\u0000\u0000\u01ae\u01af\u0005"+
		"d\u0000\u0000\u01afx\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005n\u0000"+
		"\u0000\u01b1\u01b2\u0005u\u0000\u0000\u01b2\u01b3\u0005l\u0000\u0000\u01b3"+
		"\u01b4\u0005l\u0000\u0000\u01b4z\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005"+
		"c\u0000\u0000\u01b6\u01b7\u0005h\u0000\u0000\u01b7\u01b8\u0005a\u0000"+
		"\u0000\u01b8\u01b9\u0005r\u0000\u0000\u01b9|\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0005A\u0000\u0000\u01bb\u01bc\u0005r\u0000\u0000\u01bc\u01bd\u0005"+
		"r\u0000\u0000\u01bd~\u0001\u0000\u0000\u0000\u01be\u01bf\u0005M\u0000"+
		"\u0000\u01bf\u01c0\u0005a\u0000\u0000\u01c0\u01c1\u0005p\u0000\u0000\u01c1"+
		"\u0080\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005:\u0000\u0000\u01c3\u0082"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c8\u0007\u0005\u0000\u0000\u01c5\u01c7"+
		"\u0007\u0004\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7\u01ca"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c9\u0084\u0001\u0000\u0000\u0000\u01ca\u01c8"+
		"\u0001\u0000\u0000\u0000\u0010\u0000\u0096\u009a\u00a1\u00bc\u00be\u00cc"+
		"\u016a\u016f\u0172\u0177\u017d\u0183\u0191\u0197\u01c8\u0005\u0001\u0002"+
		"\u0000\u0001\u0003\u0001\u0001\u0004\u0002\u0001\u0005\u0003\u0000\u0001"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}