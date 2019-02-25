// Generated from src/parser/Cmm.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACES=1, ID=2, INT_CONSTANT=3, CHAR_CONSTANT=4, REAL_CONSTANT=5, 
		SINGLE_COMMENT=6, MULTIPLE_COMMENT=7, EXPRESSION=8, BASIC_EXPRESSION=9, 
		TYPE=10, STATEMENT=11, BLOCK=12, DEFINITION=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LETTER", "DIGIT", "SPECIAL_CHARS", "SYMBOLS", "ASCII_RANGE", "EXPONENT", 
		"INTEGER", "WHITESPACES", "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", 
		"SINGLE_COMMENT", "MULTIPLE_COMMENT", "EXPRESSION", "BASIC_EXPRESSION", 
		"TYPE", "STATEMENT", "BLOCK", "DEFINITION"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACES", "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", 
		"SINGLE_COMMENT", "MULTIPLE_COMMENT", "EXPRESSION", "BASIC_EXPRESSION", 
		"TYPE", "STATEMENT", "BLOCK", "DEFINITION"
	};
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0164\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5"+
		"\4\64\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\5\7C\n"+
		"\7\3\7\3\7\7\7G\n\7\f\7\16\7J\13\7\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\b"+
		"\5\bT\n\b\3\t\6\tW\n\t\r\t\16\tX\3\t\3\t\3\n\3\n\5\n_\n\n\3\n\3\n\3\n"+
		"\6\nd\n\n\r\n\16\ne\5\nh\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\6\fq\n\f\r"+
		"\f\16\fr\3\f\3\f\3\r\7\rx\n\r\f\r\16\r{\13\r\3\r\3\r\6\r\177\n\r\r\r\16"+
		"\r\u0080\3\r\6\r\u0084\n\r\r\r\16\r\u0085\3\r\3\r\7\r\u008a\n\r\f\r\16"+
		"\r\u008d\13\r\3\r\6\r\u0090\n\r\r\r\16\r\u0091\3\r\3\r\6\r\u0096\n\r\r"+
		"\r\16\r\u0097\5\r\u009a\n\r\3\r\5\r\u009d\n\r\5\r\u009f\n\r\3\16\3\16"+
		"\3\16\3\16\7\16\u00a5\n\16\f\16\16\16\u00a8\13\16\3\16\5\16\u00ab\n\16"+
		"\3\16\5\16\u00ae\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00b6\n\17\f"+
		"\17\16\17\u00b9\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cd\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00df\n\20\3\21\3\21\3\21\5\21\u00e4\n\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f3\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0111\n\23"+
		"\3\23\3\23\3\23\5\23\u0116\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0128\n\23\f\23\16\23\u012b"+
		"\13\23\5\23\u012d\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u0134\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0143"+
		"\n\25\3\25\3\25\3\25\7\25\u0148\n\25\f\25\16\25\u014b\13\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0156\n\25\3\25\3\25\3\25\3\25"+
		"\7\25\u015c\n\25\f\25\16\25\u015f\13\25\3\25\3\25\5\25\u0163\n\25\4\u00a6"+
		"\u00b7\2\26\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\3\23\4\25\5\27\6\31\7\33"+
		"\b\35\t\37\n!\13#\f%\r\'\16)\17\3\2\f\4\2C\\c|\3\2\62;\4\2/\60\u0080\u0080"+
		"\3\2\63;\3\2\62\64\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\3\3\f\f\4\2,,\61"+
		"\61\2\u0196\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7\63\3\2\2\2\t"+
		"\65\3\2\2\2\13\67\3\2\2\2\r@\3\2\2\2\17S\3\2\2\2\21V\3\2\2\2\23g\3\2\2"+
		"\2\25i\3\2\2\2\27k\3\2\2\2\31\u009e\3\2\2\2\33\u00a0\3\2\2\2\35\u00b1"+
		"\3\2\2\2\37\u00de\3\2\2\2!\u00e3\3\2\2\2#\u00f2\3\2\2\2%\u012c\3\2\2\2"+
		"\'\u0133\3\2\2\2)\u0162\3\2\2\2+,\t\2\2\2,\4\3\2\2\2-.\t\3\2\2.\6\3\2"+
		"\2\2/\60\7^\2\2\60\64\7p\2\2\61\62\7^\2\2\62\64\7v\2\2\63/\3\2\2\2\63"+
		"\61\3\2\2\2\64\b\3\2\2\2\65\66\t\4\2\2\66\n\3\2\2\2\67>\7^\2\28?\5\5\3"+
		"\29:\t\5\2\2:?\5\5\3\2;<\7\63\2\2<=\t\6\2\2=?\5\5\3\2>8\3\2\2\2>9\3\2"+
		"\2\2>;\3\2\2\2?\f\3\2\2\2@B\t\7\2\2AC\t\b\2\2BA\3\2\2\2BC\3\2\2\2CD\3"+
		"\2\2\2DH\t\5\2\2EG\5\5\3\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\16"+
		"\3\2\2\2JH\3\2\2\2KO\t\5\2\2LN\5\5\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2O"+
		"P\3\2\2\2PT\3\2\2\2QO\3\2\2\2RT\7\62\2\2SK\3\2\2\2SR\3\2\2\2T\20\3\2\2"+
		"\2UW\t\t\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\t\2"+
		"\2[\22\3\2\2\2\\_\5\3\2\2]_\7a\2\2^\\\3\2\2\2^]\3\2\2\2_h\3\2\2\2`d\5"+
		"\3\2\2ad\7a\2\2bd\5\5\3\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2de\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2fh\3\2\2\2g^\3\2\2\2gc\3\2\2\2h\24\3\2\2\2ij\5\17\b\2"+
		"j\26\3\2\2\2kp\7)\2\2lq\5\3\2\2mq\5\t\5\2nq\5\13\6\2oq\5\7\4\2pl\3\2\2"+
		"\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2"+
		"\2tu\7)\2\2u\30\3\2\2\2vx\5\17\b\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2"+
		"\2\2z|\3\2\2\2{y\3\2\2\2|~\7\60\2\2}\177\5\5\3\2~}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u009f\3\2\2\2\u0082\u0084"+
		"\5\17\b\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\7\60\2\2\u0088\u008a"+
		"\5\5\3\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u009f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\5\17"+
		"\b\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0099\3\2\2\2\u0093\u0095\7\60\2\2\u0094\u0096\5"+
		"\5\3\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5\r\7\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009ey\3\2\2\2\u009e\u0083\3\2\2\2"+
		"\u009e\u008f\3\2\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2"+
		"\7\61\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13\2\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\7\17\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00ae\t\n\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\16\2\2\u00b0\34\3\2\2\2\u00b1"+
		"\u00b2\7\61\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6\13"+
		"\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7,"+
		"\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\17\2\2\u00be"+
		"\36\3\2\2\2\u00bf\u00c0\5!\21\2\u00c0\u00c1\t\13\2\2\u00c1\u00c2\5\37"+
		"\20\2\u00c2\u00df\3\2\2\2\u00c3\u00c4\5!\21\2\u00c4\u00c5\t\b\2\2\u00c5"+
		"\u00c6\5\37\20\2\u00c6\u00df\3\2\2\2\u00c7\u00cc\5!\21\2\u00c8\u00c9\7"+
		"(\2\2\u00c9\u00cd\7(\2\2\u00ca\u00cb\7~\2\2\u00cb\u00cd\7~\2\2\u00cc\u00c8"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5\37\20\2"+
		"\u00cf\u00df\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00df\5\37\20\2\u00d2\u00d3"+
		"\7/\2\2\u00d3\u00df\5\37\20\2\u00d4\u00d5\5!\21\2\u00d5\u00d6\7]\2\2\u00d6"+
		"\u00d7\5\37\20\2\u00d7\u00d8\7_\2\2\u00d8\u00df\3\2\2\2\u00d9\u00da\5"+
		"#\22\2\u00da\u00db\5\37\20\2\u00db\u00df\3\2\2\2\u00dc\u00df\5\23\n\2"+
		"\u00dd\u00df\5!\21\2\u00de\u00bf\3\2\2\2\u00de\u00c3\3\2\2\2\u00de\u00c7"+
		"\3\2\2\2\u00de\u00d0\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00d4\3\2\2\2\u00de"+
		"\u00d9\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df \3\2\2\2"+
		"\u00e0\u00e4\5\31\r\2\u00e1\u00e4\5\27\f\2\u00e2\u00e4\5\25\13\2\u00e3"+
		"\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\"\3\2\2\2"+
		"\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00f3\7v\2\2\u00e8\u00e9"+
		"\7e\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7c\2\2\u00eb\u00f3\7t\2\2\u00ec"+
		"\u00ed\7f\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7d\2\2"+
		"\u00f0\u00f1\7n\2\2\u00f1\u00f3\7g\2\2\u00f2\u00e5\3\2\2\2\u00f2\u00e8"+
		"\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f3$\3\2\2\2\u00f4\u00f5\5\37\20\2\u00f5"+
		"\u00f6\7?\2\2\u00f6\u00f7\5\37\20\2\u00f7\u012d\3\2\2\2\u00f8\u00f9\7"+
		"y\2\2\u00f9\u00fa\7j\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd"+
		"\7g\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7*\2\2\u00ff\u0100\5\37\20\2\u0100"+
		"\u0101\7+\2\2\u0101\u0102\5\'\24\2\u0102\u012d\3\2\2\2\u0103\u0104\7k"+
		"\2\2\u0104\u0105\7h\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7*\2\2\u0107\u0108"+
		"\5\37\20\2\u0108\u0109\7+\2\2\u0109\u0110\5\'\24\2\u010a\u010b\7g\2\2"+
		"\u010b\u010c\7n\2\2\u010c\u010d\7u\2\2\u010d\u010e\7g\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0111\5\'\24\2\u0110\u010a\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0111\u012d\3\2\2\2\u0112\u0113\5\23\n\2\u0113\u0115\7*\2\2\u0114\u0116"+
		"\5\37\20\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0118\7+\2\2\u0118\u012d\3\2\2\2\u0119\u011a\5\37\20\2\u011a\u011b"+
		"\7?\2\2\u011b\u011c\5\37\20\2\u011c\u011d\7=\2\2\u011d\u012d\3\2\2\2\u011e"+
		"\u011f\7y\2\2\u011f\u0120\7t\2\2\u0120\u0121\7k\2\2\u0121\u0122\7v\2\2"+
		"\u0122\u0123\7g\2\2\u0123\u0124\3\2\2\2\u0124\u0129\5\37\20\2\u0125\u0126"+
		"\7.\2\2\u0126\u0128\5\37\20\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u00f4\3\2\2\2\u012c\u00f8\3\2\2\2\u012c\u0103\3\2\2\2\u012c"+
		"\u0112\3\2\2\2\u012c\u0119\3\2\2\2\u012c\u011e\3\2\2\2\u012d&\3\2\2\2"+
		"\u012e\u0134\5%\23\2\u012f\u0130\7}\2\2\u0130\u0131\5%\23\2\u0131\u0132"+
		"\7\177\2\2\u0132\u0134\3\2\2\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2\2\2"+
		"\u0134(\3\2\2\2\u0135\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137\u0143\7v\2"+
		"\2\u0138\u0139\7e\2\2\u0139\u013a\7j\2\2\u013a\u013b\7c\2\2\u013b\u0143"+
		"\7t\2\2\u013c\u013d\7f\2\2\u013d\u013e\7q\2\2\u013e\u013f\7w\2\2\u013f"+
		"\u0140\7d\2\2\u0140\u0141\7n\2\2\u0141\u0143\7g\2\2\u0142\u0135\3\2\2"+
		"\2\u0142\u0138\3\2\2\2\u0142\u013c\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149"+
		"\5\23\n\2\u0145\u0146\7.\2\2\u0146\u0148\5\23\n\2\u0147\u0145\3\2\2\2"+
		"\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7=\2\2\u014d\u0163\3\2\2\2\u014e"+
		"\u014f\5#\22\2\u014f\u0150\5\23\n\2\u0150\u0155\7*\2\2\u0151\u0152\5)"+
		"\25\2\u0152\u0153\7.\2\2\u0153\u0154\5)\25\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0151\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7+"+
		"\2\2\u0158\u0159\7}\2\2\u0159\u015d\3\2\2\2\u015a\u015c\5%\23\2\u015b"+
		"\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\177\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0142\3\2\2\2\u0162\u014e\3\2\2\2\u0163*\3\2\2\2"+
		"+\2\63>BHOSX^cegpry\u0080\u0085\u008b\u0091\u0097\u0099\u009c\u009e\u00a6"+
		"\u00aa\u00ad\u00b7\u00cc\u00de\u00e3\u00f2\u0110\u0115\u0129\u012c\u0133"+
		"\u0142\u0149\u0155\u015d\u0162\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}