// Generated from src/parser/Cmm.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_type = 2, RULE_statement = 3, 
		RULE_block = 4, RULE_expr = 5;
	public static final String[] ruleNames = {
		"program", "definition", "type", "statement", "block", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'void'", "'('", "')'", "'{'", "'}'", "'struct'", 
		"'int'", "'char'", "'double'", "'['", "']'", "'while'", "'if'", "'else'", 
		"'='", "'write'", "'read'", "'return'", "'.'", "'*'", "'/'", "'%'", "'+'", 
		"'-'", "'<'", "'>'", "'>='", "'<='", "'=='", "'&&'", "'||'", "'!'"
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

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				definition();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
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

	public static class DefinitionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				type(0);
				setState(18);
				match(ID);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(19);
					match(T__0);
					setState(20);
					match(ID);
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(26);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(28);
					match(T__2);
					}
					break;
				case T__8:
				case T__9:
				case T__10:
					{
					setState(29);
					type(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(32);
				match(ID);
				setState(33);
				match(T__3);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(34);
					type(0);
					setState(35);
					match(ID);
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(36);
						match(T__0);
						setState(37);
						type(0);
						setState(38);
						match(ID);
						}
						}
						setState(44);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(47);
				match(T__4);
				setState(48);
				match(T__5);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(51);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__3:
					case T__13:
					case T__14:
					case T__17:
					case T__18:
					case T__19:
					case T__25:
					case T__33:
					case ID:
					case INT_CONSTANT:
					case CHAR_CONSTANT:
					case REAL_CONSTANT:
						{
						setState(49);
						statement();
						}
						break;
					case T__2:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
						{
						setState(50);
						definition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(T__7);
				setState(58);
				match(T__5);
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					type(0);
					setState(60);
					match(ID);
					setState(61);
					match(T__1);
					}
					}
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
				setState(67);
				match(T__6);
				setState(68);
				match(ID);
				setState(69);
				match(T__1);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(74);
				match(T__8);
				}
				break;
			case T__9:
				{
				setState(75);
				match(T__9);
				}
				break;
			case T__10:
				{
				setState(76);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(79);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(84); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(80);
							match(T__11);
							setState(81);
							expr(0);
							setState(82);
							match(T__12);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(86); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__13);
				setState(94);
				match(T__3);
				setState(95);
				expr(0);
				setState(96);
				match(T__4);
				setState(97);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__14);
				setState(100);
				match(T__3);
				setState(101);
				expr(0);
				setState(102);
				match(T__4);
				setState(103);
				block();
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(104);
					match(T__15);
					setState(105);
					block();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(ID);
				setState(109);
				match(T__3);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(110);
					expr(0);
					}
				}

				setState(113);
				match(T__4);
				setState(114);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				expr(0);
				setState(116);
				match(T__16);
				setState(117);
				expr(0);
				setState(118);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(T__17);
				setState(121);
				expr(0);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(122);
					match(T__0);
					setState(123);
					expr(0);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				match(T__18);
				setState(132);
				expr(0);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(133);
					match(T__0);
					setState(134);
					expr(0);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				match(T__19);
				setState(143);
				expr(0);
				setState(144);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				match(ID);
				setState(147);
				match(T__3);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(148);
					expr(0);
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(149);
						match(T__0);
						setState(150);
						expr(0);
						}
						}
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(158);
				match(T__4);
				setState(159);
				match(T__1);
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

	public static class BlockContext extends ParserRuleContext {
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__13:
			case T__14:
			case T__17:
			case T__18:
			case T__19:
			case T__25:
			case T__33:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				statement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__5);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					{
					setState(164);
					statement();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(T__6);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(174);
				match(ID);
				}
				break;
			case 2:
				{
				setState(175);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(176);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(177);
				match(INT_CONSTANT);
				}
				break;
			case 5:
				{
				setState(178);
				match(ID);
				setState(179);
				match(T__3);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(180);
					expr(0);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(181);
						match(T__0);
						setState(182);
						expr(0);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(190);
				match(T__4);
				}
				break;
			case 6:
				{
				setState(191);
				match(T__3);
				setState(192);
				type(0);
				setState(193);
				match(T__4);
				setState(194);
				expr(9);
				}
				break;
			case 7:
				{
				setState(196);
				match(T__3);
				setState(197);
				expr(0);
				setState(198);
				match(T__4);
				}
				break;
			case 8:
				{
				setState(200);
				match(T__33);
				setState(201);
				expr(3);
				}
				break;
			case 9:
				{
				setState(202);
				match(T__25);
				setState(203);
				expr(2);
				}
				break;
			case 10:
				{
				setState(204);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(208);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(211);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(214);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(217);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(220);
						match(T__11);
						setState(221);
						expr(0);
						setState(222);
						match(T__12);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(225);
						match(T__20);
						setState(226);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3"+
		"\3\3\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\5\3\60\n\3\3\3\3"+
		"\3\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3B"+
		"\n\3\r\3\16\3C\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\5\4P\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\6\4W\n\4\r\4\16\4X\7\4[\n\4\f\4\16\4^\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\5\3\5\3\5\5\5r\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d\13\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009a\n\5\f\5\16\5\u009d\13"+
		"\5\5\5\u009f\n\5\3\5\3\5\5\5\u00a3\n\5\3\6\3\6\3\6\7\6\u00a8\n\6\f\6\16"+
		"\6\u00ab\13\6\3\6\5\6\u00ae\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\5\7\u00bf\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d0\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e6"+
		"\n\7\f\7\16\7\u00e9\13\7\3\7\2\4\6\f\b\2\4\6\b\n\f\2\6\3\2\30\32\3\2\33"+
		"\34\3\2\35!\3\2\"#\2\u0112\2\17\3\2\2\2\4I\3\2\2\2\6O\3\2\2\2\b\u00a2"+
		"\3\2\2\2\n\u00ad\3\2\2\2\f\u00cf\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20"+
		"\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24"+
		"\31\7&\2\2\25\26\7\3\2\2\26\30\7&\2\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\4\2\2\35J\3"+
		"\2\2\2\36!\7\5\2\2\37!\5\6\4\2 \36\3\2\2\2 \37\3\2\2\2!\"\3\2\2\2\"#\7"+
		"&\2\2#/\7\6\2\2$%\5\6\4\2%,\7&\2\2&\'\7\3\2\2\'(\5\6\4\2()\7&\2\2)+\3"+
		"\2\2\2*&\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\60\3\2\2\2.,\3\2\2\2/"+
		"$\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\7\2\2\62\67\7\b\2\2\63\66"+
		"\5\b\5\2\64\66\5\4\3\2\65\63\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:J\7\t\2\2;<\7\n\2\2<A\7\b\2\2"+
		"=>\5\6\4\2>?\7&\2\2?@\7\4\2\2@B\3\2\2\2A=\3\2\2\2BC\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2DE\3\2\2\2EF\7\t\2\2FG\7&\2\2GH\7\4\2\2HJ\3\2\2\2I\23\3\2\2"+
		"\2I \3\2\2\2I;\3\2\2\2J\5\3\2\2\2KL\b\4\1\2LP\7\13\2\2MP\7\f\2\2NP\7\r"+
		"\2\2OK\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\\\3\2\2\2QV\f\3\2\2RS\7\16\2\2ST\5"+
		"\f\7\2TU\7\17\2\2UW\3\2\2\2VR\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y["+
		"\3\2\2\2ZQ\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\7\3\2\2\2^\\\3\2\2"+
		"\2_`\7\20\2\2`a\7\6\2\2ab\5\f\7\2bc\7\7\2\2cd\5\n\6\2d\u00a3\3\2\2\2e"+
		"f\7\21\2\2fg\7\6\2\2gh\5\f\7\2hi\7\7\2\2il\5\n\6\2jk\7\22\2\2km\5\n\6"+
		"\2lj\3\2\2\2lm\3\2\2\2m\u00a3\3\2\2\2no\7&\2\2oq\7\6\2\2pr\5\f\7\2qp\3"+
		"\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\7\2\2t\u00a3\7\4\2\2uv\5\f\7\2vw\7\23\2"+
		"\2wx\5\f\7\2xy\7\4\2\2y\u00a3\3\2\2\2z{\7\24\2\2{\u0080\5\f\7\2|}\7\3"+
		"\2\2}\177\5\f\7\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\4\2\2\u0084"+
		"\u00a3\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u008b\5\f\7\2\u0087\u0088\7"+
		"\3\2\2\u0088\u008a\5\f\7\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\7\4\2\2\u008f\u00a3\3\2\2\2\u0090\u0091\7\26\2\2\u0091"+
		"\u0092\5\f\7\2\u0092\u0093\7\4\2\2\u0093\u00a3\3\2\2\2\u0094\u0095\7&"+
		"\2\2\u0095\u009e\7\6\2\2\u0096\u009b\5\f\7\2\u0097\u0098\7\3\2\2\u0098"+
		"\u009a\5\f\7\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u0096\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\7"+
		"\2\2\u00a1\u00a3\7\4\2\2\u00a2_\3\2\2\2\u00a2e\3\2\2\2\u00a2n\3\2\2\2"+
		"\u00a2u\3\2\2\2\u00a2z\3\2\2\2\u00a2\u0085\3\2\2\2\u00a2\u0090\3\2\2\2"+
		"\u00a2\u0094\3\2\2\2\u00a3\t\3\2\2\2\u00a4\u00ae\5\b\5\2\u00a5\u00a9\7"+
		"\b\2\2\u00a6\u00a8\5\b\5\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ae\7\t\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ae"+
		"\13\3\2\2\2\u00af\u00b0\b\7\1\2\u00b0\u00d0\7&\2\2\u00b1\u00d0\7)\2\2"+
		"\u00b2\u00d0\7(\2\2\u00b3\u00d0\7\'\2\2\u00b4\u00b5\7&\2\2\u00b5\u00be"+
		"\7\6\2\2\u00b6\u00bb\5\f\7\2\u00b7\u00b8\7\3\2\2\u00b8\u00ba\5\f\7\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00d0\7\7\2\2\u00c1\u00c2\7\6"+
		"\2\2\u00c2\u00c3\5\6\4\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\5\f\7\13\u00c5"+
		"\u00d0\3\2\2\2\u00c6\u00c7\7\6\2\2\u00c7\u00c8\5\f\7\2\u00c8\u00c9\7\7"+
		"\2\2\u00c9\u00d0\3\2\2\2\u00ca\u00cb\7$\2\2\u00cb\u00d0\5\f\7\5\u00cc"+
		"\u00cd\7\34\2\2\u00cd\u00d0\5\f\7\4\u00ce\u00d0\7&\2\2\u00cf\u00af\3\2"+
		"\2\2\u00cf\u00b1\3\2\2\2\u00cf\u00b2\3\2\2\2\u00cf\u00b3\3\2\2\2\u00cf"+
		"\u00b4\3\2\2\2\u00cf\u00c1\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00ca\3\2"+
		"\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00e7\3\2\2\2\u00d1"+
		"\u00d2\f\t\2\2\u00d2\u00d3\t\2\2\2\u00d3\u00e6\5\f\7\n\u00d4\u00d5\f\b"+
		"\2\2\u00d5\u00d6\t\3\2\2\u00d6\u00e6\5\f\7\t\u00d7\u00d8\f\7\2\2\u00d8"+
		"\u00d9\t\4\2\2\u00d9\u00e6\5\f\7\b\u00da\u00db\f\6\2\2\u00db\u00dc\t\5"+
		"\2\2\u00dc\u00e6\5\f\7\7\u00dd\u00de\f\16\2\2\u00de\u00df\7\16\2\2\u00df"+
		"\u00e0\5\f\7\2\u00e0\u00e1\7\17\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e3\f"+
		"\f\2\2\u00e3\u00e4\7\27\2\2\u00e4\u00e6\7&\2\2\u00e5\u00d1\3\2\2\2\u00e5"+
		"\u00d4\3\2\2\2\u00e5\u00d7\3\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00dd\3\2"+
		"\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\r\3\2\2\2\u00e9\u00e7\3\2\2\2\34\21\31 ,/\65\67C"+
		"IOX\\lq\u0080\u008b\u009b\u009e\u00a2\u00a9\u00ad\u00bb\u00be\u00cf\u00e5"+
		"\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}