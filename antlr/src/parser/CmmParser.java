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
		T__31=32, WHITESPACES=33, ID=34, INT_CONSTANT=35, CHAR_CONSTANT=36, REAL_CONSTANT=37, 
		SINGLE_COMMENT=38, MULTIPLE_COMMENT=39;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_type = 2, RULE_statement = 3, 
		RULE_block = 4, RULE_expr = 5;
	public static final String[] ruleNames = {
		"program", "definition", "type", "statement", "block", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'void'", "'('", "')'", "'{'", "'}'", "'int'", "'char'", 
		"'double'", "'while'", "'if'", "'else'", "'='", "'write'", "'read'", "'return'", 
		"'['", "']'", "'.'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", 
		"'>='", "'<='", "'&&'", "'||'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "WHITESPACES", "ID", 
		"INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "SINGLE_COMMENT", "MULTIPLE_COMMENT"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) );
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				type();
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
				case T__7:
				case T__8:
				case T__9:
					{
					setState(29);
					type();
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					setState(34);
					type();
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
						type();
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__24) | (1L << T__31) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(51);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__3:
					case T__10:
					case T__11:
					case T__14:
					case T__15:
					case T__16:
					case T__24:
					case T__31:
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__10);
				setState(62);
				match(T__3);
				setState(63);
				expr(0);
				setState(64);
				match(T__4);
				setState(65);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__11);
				setState(68);
				match(T__3);
				setState(69);
				expr(0);
				setState(70);
				match(T__4);
				setState(71);
				block();
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(72);
					match(T__12);
					setState(73);
					block();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(ID);
				setState(77);
				match(T__3);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__31) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(78);
					expr(0);
					}
				}

				setState(81);
				match(T__4);
				setState(82);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				expr(0);
				setState(84);
				match(T__13);
				setState(85);
				expr(0);
				setState(86);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(T__14);
				setState(89);
				expr(0);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(90);
					match(T__0);
					setState(91);
					expr(0);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(T__15);
				setState(100);
				expr(0);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(101);
					match(T__0);
					setState(102);
					expr(0);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				match(T__16);
				setState(111);
				expr(0);
				setState(112);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__10:
			case T__11:
			case T__14:
			case T__15:
			case T__16:
			case T__24:
			case T__31:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				statement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__5);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__24) | (1L << T__31) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					{
					setState(118);
					statement();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(128);
				match(ID);
				}
				break;
			case 2:
				{
				setState(129);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(130);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(131);
				match(INT_CONSTANT);
				}
				break;
			case 5:
				{
				setState(132);
				match(T__3);
				setState(133);
				type();
				setState(134);
				match(T__4);
				setState(135);
				expr(9);
				}
				break;
			case 6:
				{
				setState(137);
				match(T__3);
				setState(138);
				expr(0);
				setState(139);
				match(T__4);
				}
				break;
			case 7:
				{
				setState(141);
				match(T__31);
				setState(142);
				expr(3);
				}
				break;
			case 8:
				{
				setState(143);
				match(T__24);
				setState(144);
				expr(2);
				}
				break;
			case 9:
				{
				setState(145);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(149);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(152);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(153);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(155);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(158);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(161);
						match(T__17);
						setState(162);
						expr(0);
						setState(163);
						match(T__18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(166);
						match(T__19);
						setState(167);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3"+
		"\3\3\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\5\3\60\n\3\3\3\3"+
		"\3\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\5\3<\n\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3\5\5\5R\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5u\n\5\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\6\5\6\u0080\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0095\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7\3\7\2\3\f\b"+
		"\2\4\6\b\n\f\2\7\3\2\n\f\3\2\27\31\3\2\32\33\3\2\34\37\3\2 !\2\u00cb\2"+
		"\17\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\bt\3\2\2\2\n\177\3\2\2\2\f\u0094\3\2"+
		"\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2"+
		"\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24\31\7$\2\2\25\26\7\3\2\2\26\30\7$\2"+
		"\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2"+
		"\2\33\31\3\2\2\2\34\35\7\4\2\2\35<\3\2\2\2\36!\7\5\2\2\37!\5\6\4\2 \36"+
		"\3\2\2\2 \37\3\2\2\2!\"\3\2\2\2\"#\7$\2\2#/\7\6\2\2$%\5\6\4\2%,\7$\2\2"+
		"&\'\7\3\2\2\'(\5\6\4\2()\7$\2\2)+\3\2\2\2*&\3\2\2\2+.\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-\60\3\2\2\2.,\3\2\2\2/$\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2"+
		"\61\62\7\7\2\2\62\67\7\b\2\2\63\66\5\b\5\2\64\66\5\4\3\2\65\63\3\2\2\2"+
		"\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2"+
		"\2\2:<\7\t\2\2;\23\3\2\2\2; \3\2\2\2<\5\3\2\2\2=>\t\2\2\2>\7\3\2\2\2?"+
		"@\7\r\2\2@A\7\6\2\2AB\5\f\7\2BC\7\7\2\2CD\5\n\6\2Du\3\2\2\2EF\7\16\2\2"+
		"FG\7\6\2\2GH\5\f\7\2HI\7\7\2\2IL\5\n\6\2JK\7\17\2\2KM\5\n\6\2LJ\3\2\2"+
		"\2LM\3\2\2\2Mu\3\2\2\2NO\7$\2\2OQ\7\6\2\2PR\5\f\7\2QP\3\2\2\2QR\3\2\2"+
		"\2RS\3\2\2\2ST\7\7\2\2Tu\7\4\2\2UV\5\f\7\2VW\7\20\2\2WX\5\f\7\2XY\7\4"+
		"\2\2Yu\3\2\2\2Z[\7\21\2\2[`\5\f\7\2\\]\7\3\2\2]_\5\f\7\2^\\\3\2\2\2_b"+
		"\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\4\2\2du\3\2\2\2e"+
		"f\7\22\2\2fk\5\f\7\2gh\7\3\2\2hj\5\f\7\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\4\2\2ou\3\2\2\2pq\7\23\2\2qr\5\f\7"+
		"\2rs\7\4\2\2su\3\2\2\2t?\3\2\2\2tE\3\2\2\2tN\3\2\2\2tU\3\2\2\2tZ\3\2\2"+
		"\2te\3\2\2\2tp\3\2\2\2u\t\3\2\2\2v\u0080\5\b\5\2w{\7\b\2\2xz\5\b\5\2y"+
		"x\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0080\7\t"+
		"\2\2\177v\3\2\2\2\177w\3\2\2\2\u0080\13\3\2\2\2\u0081\u0082\b\7\1\2\u0082"+
		"\u0095\7$\2\2\u0083\u0095\7\'\2\2\u0084\u0095\7&\2\2\u0085\u0095\7%\2"+
		"\2\u0086\u0087\7\6\2\2\u0087\u0088\5\6\4\2\u0088\u0089\7\7\2\2\u0089\u008a"+
		"\5\f\7\13\u008a\u0095\3\2\2\2\u008b\u008c\7\6\2\2\u008c\u008d\5\f\7\2"+
		"\u008d\u008e\7\7\2\2\u008e\u0095\3\2\2\2\u008f\u0090\7\"\2\2\u0090\u0095"+
		"\5\f\7\5\u0091\u0092\7\33\2\2\u0092\u0095\5\f\7\4\u0093\u0095\7$\2\2\u0094"+
		"\u0081\3\2\2\2\u0094\u0083\3\2\2\2\u0094\u0084\3\2\2\2\u0094\u0085\3\2"+
		"\2\2\u0094\u0086\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008f\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u00ac\3\2\2\2\u0096\u0097\f\t"+
		"\2\2\u0097\u0098\t\3\2\2\u0098\u00ab\5\f\7\n\u0099\u009a\f\b\2\2\u009a"+
		"\u009b\t\4\2\2\u009b\u00ab\5\f\7\t\u009c\u009d\f\7\2\2\u009d\u009e\t\5"+
		"\2\2\u009e\u00ab\5\f\7\b\u009f\u00a0\f\6\2\2\u00a0\u00a1\t\6\2\2\u00a1"+
		"\u00ab\5\f\7\7\u00a2\u00a3\f\r\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\5"+
		"\f\7\2\u00a5\u00a6\7\25\2\2\u00a6\u00ab\3\2\2\2\u00a7\u00a8\f\f\2\2\u00a8"+
		"\u00a9\7\26\2\2\u00a9\u00ab\7$\2\2\u00aa\u0096\3\2\2\2\u00aa\u0099\3\2"+
		"\2\2\u00aa\u009c\3\2\2\2\u00aa\u009f\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\r\3\2\2\2\u00ae\u00ac\3\2\2\2\24\21\31 ,/\65\67;LQ`kt{\177"+
		"\u0094\u00aa\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}