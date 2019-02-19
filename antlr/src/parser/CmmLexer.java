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
		SINGLE_COMMENT=6, MULTIPLE_COMMENT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LETTER", "DIGIT", "SPECIAL_CHARS", "SYMBOLS", "ASCII_RANGE", "EXPONENT", 
		"INTEGER", "WHITESPACES", "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", 
		"SINGLE_COMMENT", "MULTIPLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACES", "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", 
		"SINGLE_COMMENT", "MULTIPLE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u00b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\5\4(\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\3\7\5"+
		"\7\67\n\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\3\b\7\bB\n\b\f\b\16\bE\13"+
		"\b\3\b\5\bH\n\b\3\t\6\tK\n\t\r\t\16\tL\3\t\3\t\3\n\3\n\5\nS\n\n\3\n\3"+
		"\n\3\n\6\nX\n\n\r\n\16\nY\5\n\\\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\6\f"+
		"e\n\f\r\f\16\ff\3\f\3\f\3\r\7\rl\n\r\f\r\16\ro\13\r\3\r\3\r\6\rs\n\r\r"+
		"\r\16\rt\3\r\6\rx\n\r\r\r\16\ry\3\r\3\r\7\r~\n\r\f\r\16\r\u0081\13\r\3"+
		"\r\6\r\u0084\n\r\r\r\16\r\u0085\3\r\3\r\6\r\u008a\n\r\r\r\16\r\u008b\5"+
		"\r\u008e\n\r\3\r\5\r\u0091\n\r\5\r\u0093\n\r\3\16\3\16\3\16\3\16\7\16"+
		"\u0099\n\16\f\16\16\16\u009c\13\16\3\16\5\16\u009f\n\16\3\16\5\16\u00a2"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00aa\n\17\f\17\16\17\u00ad\13"+
		"\17\3\17\3\17\3\17\3\17\3\17\4\u009a\u00ab\2\20\3\2\5\2\7\2\t\2\13\2\r"+
		"\2\17\2\21\3\23\4\25\5\27\6\31\7\33\b\35\t\3\2\13\4\2C\\c|\3\2\62;\4\2"+
		"/\60\u0080\u0080\3\2\63;\3\2\62\64\4\2GGgg\4\2--//\5\2\13\f\17\17\"\""+
		"\3\3\f\f\2\u00c9\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7\'\3\2"+
		"\2\2\t)\3\2\2\2\13+\3\2\2\2\r\64\3\2\2\2\17G\3\2\2\2\21J\3\2\2\2\23[\3"+
		"\2\2\2\25]\3\2\2\2\27_\3\2\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2\2\35\u00a5"+
		"\3\2\2\2\37 \t\2\2\2 \4\3\2\2\2!\"\t\3\2\2\"\6\3\2\2\2#$\7^\2\2$(\7p\2"+
		"\2%&\7^\2\2&(\7v\2\2\'#\3\2\2\2\'%\3\2\2\2(\b\3\2\2\2)*\t\4\2\2*\n\3\2"+
		"\2\2+\62\7^\2\2,\63\5\5\3\2-.\t\5\2\2.\63\5\5\3\2/\60\7\63\2\2\60\61\t"+
		"\6\2\2\61\63\5\5\3\2\62,\3\2\2\2\62-\3\2\2\2\62/\3\2\2\2\63\f\3\2\2\2"+
		"\64\66\t\7\2\2\65\67\t\b\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28"+
		"<\t\5\2\29;\5\5\3\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\16\3\2\2"+
		"\2><\3\2\2\2?C\t\5\2\2@B\5\5\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2"+
		"\2DH\3\2\2\2EC\3\2\2\2FH\7\62\2\2G?\3\2\2\2GF\3\2\2\2H\20\3\2\2\2IK\t"+
		"\t\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\t\2\2O\22"+
		"\3\2\2\2PS\5\3\2\2QS\7a\2\2RP\3\2\2\2RQ\3\2\2\2S\\\3\2\2\2TX\5\3\2\2U"+
		"X\7a\2\2VX\5\5\3\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2Y"+
		"Z\3\2\2\2Z\\\3\2\2\2[R\3\2\2\2[W\3\2\2\2\\\24\3\2\2\2]^\5\17\b\2^\26\3"+
		"\2\2\2_d\7)\2\2`e\5\3\2\2ae\5\t\5\2be\5\13\6\2ce\5\7\4\2d`\3\2\2\2da\3"+
		"\2\2\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7"+
		")\2\2i\30\3\2\2\2jl\5\17\b\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n"+
		"p\3\2\2\2om\3\2\2\2pr\7\60\2\2qs\5\5\3\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2"+
		"tu\3\2\2\2u\u0093\3\2\2\2vx\5\17\b\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3"+
		"\2\2\2z{\3\2\2\2{\177\7\60\2\2|~\5\5\3\2}|\3\2\2\2~\u0081\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0093\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0084\5\17\b\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u008d\3\2\2\2\u0087\u0089\7\60\2\2\u0088"+
		"\u008a\5\5\3\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0087\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091\5\r\7\2\u0090\u008f\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092m\3\2\2\2\u0092w\3\2"+
		"\2\2\u0092\u0083\3\2\2\2\u0093\32\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096"+
		"\7\61\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13\2\2\2\u0098\u0097\3\2\2\2"+
		"\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\7\17\2\2\u009e\u009d\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\t\n\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\16\2\2\u00a4\34\3\2\2\2\u00a5"+
		"\u00a6\7\61\2\2\u00a6\u00a7\7,\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\13"+
		"\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7,"+
		"\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\17\2\2\u00b2"+
		"\36\3\2\2\2\35\2\'\62\66<CGLRWY[dfmty\177\u0085\u008b\u008d\u0090\u0092"+
		"\u009a\u009e\u00a1\u00ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}