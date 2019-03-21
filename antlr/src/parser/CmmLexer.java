// Generated from src/parser/Cmm.g4 by ANTLR 4.7
package parser;

	import ast.*;
	import ast.definition.*;
	import ast.expression.*;
	import ast.expression.binary.*;
	import ast.expression.literal.*;
	import ast.statement.*;
	import ast.type.*;
	import java.util.*;
	import parser.*;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, WHITESPACES=35, ID=36, INT_CONSTANT=37, 
		CHAR_CONSTANT=38, REAL_CONSTANT=39, SINGLE_COMMENT=40, MULTIPLE_COMMENT=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "LETTER", "DIGIT", "SPECIAL_CHARS", "SYMBOLS", "ASCII_RANGE", 
		"EXPONENT", "INTEGER", "WHITESPACES", "ID", "INT_CONSTANT", "CHAR_CONSTANT", 
		"REAL_CONSTANT", "SINGLE_COMMENT", "MULTIPLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'void'", "'('", "')'", "'{'", "'}'", "'int'", "'char'", 
		"'double'", "'['", "']'", "'struct'", "'while'", "'if'", "'else'", "'='", 
		"'write'", "'read'", "'return'", "'.'", "'*'", "'/'", "'%'", "'+'", "'-'", 
		"'<'", "'>'", "'>='", "'<='", "'=='", "'&&'", "'||'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "WHITESPACES", 
		"ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "SINGLE_COMMENT", 
		"MULTIPLE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0162\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3&\3&\5&\u00db\n&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u00e6\n(\3)"+
		"\3)\5)\u00ea\n)\3)\3)\7)\u00ee\n)\f)\16)\u00f1\13)\3*\3*\7*\u00f5\n*\f"+
		"*\16*\u00f8\13*\3*\5*\u00fb\n*\3+\6+\u00fe\n+\r+\16+\u00ff\3+\3+\3,\3"+
		",\5,\u0106\n,\3,\3,\3,\7,\u010b\n,\f,\16,\u010e\13,\3-\3-\3.\3.\3.\3."+
		"\5.\u0116\n.\3.\3.\3/\7/\u011b\n/\f/\16/\u011e\13/\3/\3/\6/\u0122\n/\r"+
		"/\16/\u0123\3/\6/\u0127\n/\r/\16/\u0128\3/\3/\7/\u012d\n/\f/\16/\u0130"+
		"\13/\3/\6/\u0133\n/\r/\16/\u0134\3/\3/\6/\u0139\n/\r/\16/\u013a\5/\u013d"+
		"\n/\3/\5/\u0140\n/\5/\u0142\n/\3\60\3\60\3\60\3\60\7\60\u0148\n\60\f\60"+
		"\16\60\u014b\13\60\3\60\5\60\u014e\n\60\3\60\5\60\u0151\n\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\7\61\u0159\n\61\f\61\16\61\u015c\13\61\3\61\3\61"+
		"\3\61\3\61\3\61\4\u0149\u015a\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2K\2M\2O\2Q\2S\2U"+
		"%W&Y\'[(])_*a+\3\2\13\4\2C\\c|\3\2\62;\4\2/\60\u0080\u0080\3\2\63;\3\2"+
		"\62\64\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\3\3\f\f\2\u0175\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2"+
		"\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e"+
		"\3\2\2\2\7g\3\2\2\2\tl\3\2\2\2\13n\3\2\2\2\rp\3\2\2\2\17r\3\2\2\2\21t"+
		"\3\2\2\2\23x\3\2\2\2\25}\3\2\2\2\27\u0084\3\2\2\2\31\u0086\3\2\2\2\33"+
		"\u0088\3\2\2\2\35\u008f\3\2\2\2\37\u0095\3\2\2\2!\u0098\3\2\2\2#\u009d"+
		"\3\2\2\2%\u009f\3\2\2\2\'\u00a5\3\2\2\2)\u00aa\3\2\2\2+\u00b1\3\2\2\2"+
		"-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb"+
		"\3\2\2\2\67\u00bd\3\2\2\29\u00bf\3\2\2\2;\u00c1\3\2\2\2=\u00c4\3\2\2\2"+
		"?\u00c7\3\2\2\2A\u00ca\3\2\2\2C\u00cd\3\2\2\2E\u00d0\3\2\2\2G\u00d2\3"+
		"\2\2\2I\u00d4\3\2\2\2K\u00da\3\2\2\2M\u00dc\3\2\2\2O\u00de\3\2\2\2Q\u00e7"+
		"\3\2\2\2S\u00fa\3\2\2\2U\u00fd\3\2\2\2W\u0105\3\2\2\2Y\u010f\3\2\2\2["+
		"\u0111\3\2\2\2]\u0141\3\2\2\2_\u0143\3\2\2\2a\u0154\3\2\2\2cd\7.\2\2d"+
		"\4\3\2\2\2ef\7=\2\2f\6\3\2\2\2gh\7x\2\2hi\7q\2\2ij\7k\2\2jk\7f\2\2k\b"+
		"\3\2\2\2lm\7*\2\2m\n\3\2\2\2no\7+\2\2o\f\3\2\2\2pq\7}\2\2q\16\3\2\2\2"+
		"rs\7\177\2\2s\20\3\2\2\2tu\7k\2\2uv\7p\2\2vw\7v\2\2w\22\3\2\2\2xy\7e\2"+
		"\2yz\7j\2\2z{\7c\2\2{|\7t\2\2|\24\3\2\2\2}~\7f\2\2~\177\7q\2\2\177\u0080"+
		"\7w\2\2\u0080\u0081\7d\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083"+
		"\26\3\2\2\2\u0084\u0085\7]\2\2\u0085\30\3\2\2\2\u0086\u0087\7_\2\2\u0087"+
		"\32\3\2\2\2\u0088\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u008d\7e\2\2\u008d\u008e\7v\2\2\u008e\34\3\2\2\2\u008f"+
		"\u0090\7y\2\2\u0090\u0091\7j\2\2\u0091\u0092\7k\2\2\u0092\u0093\7n\2\2"+
		"\u0093\u0094\7g\2\2\u0094\36\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7"+
		"h\2\2\u0097 \3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b"+
		"\7u\2\2\u009b\u009c\7g\2\2\u009c\"\3\2\2\2\u009d\u009e\7?\2\2\u009e$\3"+
		"\2\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\u00a4\7g\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7f\2\2\u00a9(\3\2\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2"+
		"\u00ae\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7\60"+
		"\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7\61"+
		"\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7\'\2\2\u00b8\62\3\2\2\2\u00b9\u00ba"+
		"\7-\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc\66\3\2\2\2\u00bd\u00be"+
		"\7>\2\2\u00be8\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7"+
		"@\2\2\u00c2\u00c3\7?\2\2\u00c3<\3\2\2\2\u00c4\u00c5\7>\2\2\u00c5\u00c6"+
		"\7?\2\2\u00c6>\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8\u00c9\7?\2\2\u00c9@\3"+
		"\2\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7(\2\2\u00ccB\3\2\2\2\u00cd\u00ce"+
		"\7~\2\2\u00ce\u00cf\7~\2\2\u00cfD\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1F\3"+
		"\2\2\2\u00d2\u00d3\t\2\2\2\u00d3H\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5J\3"+
		"\2\2\2\u00d6\u00d7\7^\2\2\u00d7\u00db\7p\2\2\u00d8\u00d9\7^\2\2\u00d9"+
		"\u00db\7v\2\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2\2\2\u00dbL\3\2\2\2\u00dc"+
		"\u00dd\t\4\2\2\u00ddN\3\2\2\2\u00de\u00e5\7^\2\2\u00df\u00e6\5I%\2\u00e0"+
		"\u00e1\t\5\2\2\u00e1\u00e6\5I%\2\u00e2\u00e3\7\63\2\2\u00e3\u00e4\t\6"+
		"\2\2\u00e4\u00e6\5I%\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e2"+
		"\3\2\2\2\u00e6P\3\2\2\2\u00e7\u00e9\t\7\2\2\u00e8\u00ea\t\b\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\t\5"+
		"\2\2\u00ec\u00ee\5I%\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0R\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f6\t\5\2\2\u00f3\u00f5\5I%\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2"+
		"\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\u00fb\7\62\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f9\3\2\2\2"+
		"\u00fbT\3\2\2\2\u00fc\u00fe\t\t\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\b+\2\2\u0102V\3\2\2\2\u0103\u0106\5G$\2\u0104\u0106\7a\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u010c\3\2\2\2\u0107\u010b\5G"+
		"$\2\u0108\u010b\7a\2\2\u0109\u010b\5I%\2\u010a\u0107\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010dX\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\5S*\2\u0110"+
		"Z\3\2\2\2\u0111\u0115\7)\2\2\u0112\u0116\13\2\2\2\u0113\u0116\5O(\2\u0114"+
		"\u0116\5K&\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117\u0118\7)\2\2\u0118\\\3\2\2\2\u0119\u011b"+
		"\5S*\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\7\60"+
		"\2\2\u0120\u0122\5I%\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0142\3\2\2\2\u0125\u0127\5S*\2\u0126"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012e\7\60\2\2\u012b\u012d\5I%\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0142\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\5S*\2\u0132\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u013c\3\2\2\2\u0136\u0138\7\60\2\2\u0137\u0139\5I%\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u0140\5Q)\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142"+
		"\3\2\2\2\u0141\u011c\3\2\2\2\u0141\u0126\3\2\2\2\u0141\u0132\3\2\2\2\u0142"+
		"^\3\2\2\2\u0143\u0144\7\61\2\2\u0144\u0145\7\61\2\2\u0145\u0149\3\2\2"+
		"\2\u0146\u0148\13\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u014e\7\17\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u0151\t\n\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\b\60\2\2\u0153`\3\2\2\2\u0154\u0155\7\61\2\2\u0155\u0156"+
		"\7,\2\2\u0156\u015a\3\2\2\2\u0157\u0159\13\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7,\2\2\u015e\u015f\7\61\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\b\61\2\2\u0161b\3\2\2\2\33\2\u00da\u00e5\u00e9"+
		"\u00ef\u00f6\u00fa\u00ff\u0105\u010a\u010c\u0115\u011c\u0123\u0128\u012e"+
		"\u0134\u013a\u013c\u013f\u0141\u0149\u014d\u0150\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}