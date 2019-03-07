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
		public Type ast;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(74);
				match(T__8);
				((TypeContext)_localctx).ast =  new BaseType("int");
				}
				break;
			case T__9:
				{
				setState(76);
				match(T__9);
				((TypeContext)_localctx).ast =  new BaseType("char");
				}
				break;
			case T__10:
				{
				setState(78);
				match(T__10);
				((TypeContext)_localctx).ast =  new BaseType("double");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(83);
					match(T__11);
					setState(84);
					expr(0);
					setState(85);
					match(T__12);
					}
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public Statement ast;
		public ExprContext expr;
		public BlockContext block;
		public BlockContext b1;
		public BlockContext b2;
		public ExprContext e1;
		public ExprContext e2;
		public Token ID;
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__13);
				setState(93);
				match(T__3);
				setState(94);
				((StatementContext)_localctx).expr = expr(0);
				setState(95);
				match(T__4);
				setState(96);
				((StatementContext)_localctx).block = block();
				((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).expr.ast, ((StatementContext)_localctx).block.ast);
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
				((StatementContext)_localctx).expr = expr(0);
				setState(102);
				match(T__4);
				setState(103);
				((StatementContext)_localctx).b1 = block();
				List<Statement> elseBody = new ArrayList<Statement>();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(105);
					match(T__15);
					setState(106);
					((StatementContext)_localctx).b2 = block();
					elseBody = ((StatementContext)_localctx).b2.ast;
					}
					break;
				}
				((StatementContext)_localctx).ast =  new If(((StatementContext)_localctx).expr.ast, ((StatementContext)_localctx).b1.ast, elseBody);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				((StatementContext)_localctx).e1 = expr(0);
				setState(114);
				match(T__16);
				setState(115);
				((StatementContext)_localctx).e2 = expr(0);
				((StatementContext)_localctx).ast =  new Assigment(((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				setState(117);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(T__17);
				setState(120);
				((StatementContext)_localctx).e1 = expr(0);
				List<Expression> args = new ArrayList<Expression>(); args.add(((StatementContext)_localctx).e1.ast);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(122);
					match(T__0);
					setState(123);
					((StatementContext)_localctx).e2 = expr(0);
					args.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(T__1);
				((StatementContext)_localctx).ast =  new Write(args);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(T__18);
				setState(135);
				((StatementContext)_localctx).e1 = expr(0);
				List<Expression> args = new ArrayList<Expression>(); args.add(((StatementContext)_localctx).e1.ast);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(137);
					match(T__0);
					setState(138);
					((StatementContext)_localctx).e2 = expr(0);
					args.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__1);
				((StatementContext)_localctx).ast =  new read(args);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(T__19);
				setState(150);
				((StatementContext)_localctx).expr = expr(0);
				setState(151);
				match(T__1);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).expr.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				((StatementContext)_localctx).ID = match(ID);
				List<Expression> args = new ArrayList<Expression>();
				setState(156);
				match(T__3);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(157);
					((StatementContext)_localctx).e1 = expr(0);
					args.add(((StatementContext)_localctx).e1.ast);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(159);
						match(T__0);
						setState(160);
						((StatementContext)_localctx).e2 = expr(0);
						args.add(((StatementContext)_localctx).e2.ast);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170);
				match(T__4);
				setState(171);
				match(T__1);
				((StatementContext)_localctx).ast =  new Function((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), args);
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
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
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
			setState(188);
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
				setState(175);
				((BlockContext)_localctx).statement = statement();
				_localctx.ast.add(((BlockContext)_localctx).statement.ast);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T__5);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					{
					setState(179);
					((BlockContext)_localctx).statement = statement();
					_localctx.ast.add(((BlockContext)_localctx).statement.ast);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
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
		public Expression ast;
		public ExprContext e1;
		public ExprContext e3;
		public Token ID;
		public Token REAL_CONSTANT;
		public Token INT_CONSTANT;
		public ExprContext expr;
		public ExprContext e2;
		public TypeContext type;
		public ExprContext e4;
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(191);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).ast =  new Variable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			case 2:
				{
				setState(193);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExprContext)_localctx).ast =  new RealLiteral(Double.parseDouble((((ExprContext)_localctx).REAL_CONSTANT!=null?((ExprContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(195);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(196);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new RealLiteral(Integer.parseInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(198);
				((ExprContext)_localctx).ID = match(ID);
				setState(199);
				match(T__3);
				 List<Expression> params = new ArrayList<Expression>(); 
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(201);
					((ExprContext)_localctx).e1 = ((ExprContext)_localctx).expr = expr(0);
					params.add(((ExprContext)_localctx).e1.ast); 
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(203);
						match(T__0);
						setState(204);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						params.add(((ExprContext)_localctx).e1.ast); 
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(214);
				match(T__4);
				 ((ExprContext)_localctx).ast =  new ArrayAccess(((ExprContext)_localctx).e2.ast); 
				}
				break;
			case 6:
				{
				setState(216);
				match(T__3);
				setState(217);
				((ExprContext)_localctx).type = type(0);
				setState(218);
				match(T__4);
				setState(219);
				((ExprContext)_localctx).expr = expr(9);
				((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).type.ast, ((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 7:
				{
				setState(222);
				match(T__3);
				setState(223);
				((ExprContext)_localctx).expr = expr(0);
				setState(224);
				match(T__4);
				((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast;
				}
				break;
			case 8:
				{
				setState(227);
				match(T__33);
				setState(228);
				((ExprContext)_localctx).expr = expr(3);
				 ((ExprContext)_localctx).ast =  new BooleanNegation(((ExprContext)_localctx).expr.ast);
				}
				break;
			case 9:
				{
				setState(231);
				match(T__25);
				setState(232);
				((ExprContext)_localctx).expr = expr(2);
				 ((ExprContext)_localctx).ast =  new UnaryMinus(((ExprContext)_localctx).expr.ast);
				}
				break;
			case 10:
				{
				setState(235);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).ast =  new Variable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						 String operand = ""; 
						setState(247);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__21:
							{
							setState(241);
							match(T__21);
							 operand = "*"; 
							}
							break;
						case T__22:
							{
							setState(243);
							match(T__22);
							 operand = "/"; 
							}
							break;
						case T__23:
							{
							setState(245);
							match(T__23);
							 operand = "%"; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(249);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e3 = _prevctx;
						_localctx.e3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						 String operand = ""; 
						setState(258);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__24:
							{
							setState(254);
							match(T__24);
							 operand = "+"; 
							}
							break;
						case T__25:
							{
							setState(256);
							match(T__25);
							 operand = "-"; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(260);
						((ExprContext)_localctx).e4 = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e3.ast, ((ExprContext)_localctx).e4.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						 String operand = ""; 
						setState(275);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__26:
							{
							setState(265);
							match(T__26);
							 operand = "<"; 
							}
							break;
						case T__27:
							{
							setState(267);
							match(T__27);
							 operand = ">"; 
							}
							break;
						case T__28:
							{
							setState(269);
							match(T__28);
							 operand = ">="; 
							}
							break;
						case T__29:
							{
							setState(271);
							match(T__29);
							 operand = "<="; 
							}
							break;
						case T__30:
							{
							setState(273);
							match(T__30);
							 operand = "=="; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast);
						setState(278);
						((ExprContext)_localctx).expr = expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						 String operand = ""; 
						setState(285);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__31:
							{
							setState(281);
							match(T__31);
							 operand = "&&"; 
							}
							break;
						case T__32:
							{
							setState(283);
							match(T__32);
							 operand = "||"; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(287);
						((ExprContext)_localctx).expr = expr(5);
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(291);
						match(T__11);
						setState(292);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						setState(293);
						match(T__12);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(296);
						match(T__20);
						setState(297);
						((ExprContext)_localctx).ID = match(ID);
						 ((ExprContext)_localctx).ast =  new FieldAccess((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3"+
		"\3\3\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\5\3\60\n\3\3\3\3"+
		"\3\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3B"+
		"\n\3\r\3\16\3C\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4S\n\4\3\4\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0081\n\5\f\5\16"+
		"\5\u0084\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0090\n\5\f"+
		"\5\16\5\u0093\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u00a6\n\5\f\5\16\5\u00a9\13\5\5\5\u00ab\n\5\3\5\3"+
		"\5\3\5\5\5\u00b0\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b9\n\6\f\6\16"+
		"\6\u00bc\13\6\3\6\5\6\u00bf\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00d2\n\7\f\7\16\7\u00d5\13\7\5\7\u00d7"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f0\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00fa\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0105\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0116\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0120\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u012e\n\7\f\7\16\7\u0131\13\7\3\7\2\4\6\f"+
		"\b\2\4\6\b\n\f\2\2\2\u015f\2\17\3\2\2\2\4I\3\2\2\2\6R\3\2\2\2\b\u00af"+
		"\3\2\2\2\n\u00be\3\2\2\2\f\u00ef\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20"+
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
		"\2I \3\2\2\2I;\3\2\2\2J\5\3\2\2\2KL\b\4\1\2LM\7\13\2\2MS\b\4\1\2NO\7\f"+
		"\2\2OS\b\4\1\2PQ\7\r\2\2QS\b\4\1\2RK\3\2\2\2RN\3\2\2\2RP\3\2\2\2S[\3\2"+
		"\2\2TU\f\3\2\2UV\7\16\2\2VW\5\f\7\2WX\7\17\2\2XZ\3\2\2\2YT\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\7\3\2\2\2][\3\2\2\2^_\7\20\2\2_`\7\6\2\2"+
		"`a\5\f\7\2ab\7\7\2\2bc\5\n\6\2cd\b\5\1\2d\u00b0\3\2\2\2ef\7\21\2\2fg\7"+
		"\6\2\2gh\5\f\7\2hi\7\7\2\2ij\5\n\6\2jo\b\5\1\2kl\7\22\2\2lm\5\n\6\2mn"+
		"\b\5\1\2np\3\2\2\2ok\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\5\1\2r\u00b0\3\2"+
		"\2\2st\5\f\7\2tu\7\23\2\2uv\5\f\7\2vw\b\5\1\2wx\7\4\2\2x\u00b0\3\2\2\2"+
		"yz\7\24\2\2z{\5\f\7\2{\u0082\b\5\1\2|}\7\3\2\2}~\5\f\7\2~\177\b\5\1\2"+
		"\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7\4\2\2\u0086\u0087\b\5\1\2\u0087\u00b0\3\2\2\2\u0088\u0089\7\25"+
		"\2\2\u0089\u008a\5\f\7\2\u008a\u0091\b\5\1\2\u008b\u008c\7\3\2\2\u008c"+
		"\u008d\5\f\7\2\u008d\u008e\b\5\1\2\u008e\u0090\3\2\2\2\u008f\u008b\3\2"+
		"\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\4\2\2\u0095\u0096\b\5"+
		"\1\2\u0096\u00b0\3\2\2\2\u0097\u0098\7\26\2\2\u0098\u0099\5\f\7\2\u0099"+
		"\u009a\7\4\2\2\u009a\u009b\b\5\1\2\u009b\u00b0\3\2\2\2\u009c\u009d\7&"+
		"\2\2\u009d\u009e\b\5\1\2\u009e\u00aa\7\6\2\2\u009f\u00a0\5\f\7\2\u00a0"+
		"\u00a7\b\5\1\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\b\5"+
		"\1\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u009f\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\7\7\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00b0\b\5\1\2\u00af^\3\2\2\2"+
		"\u00afe\3\2\2\2\u00afs\3\2\2\2\u00afy\3\2\2\2\u00af\u0088\3\2\2\2\u00af"+
		"\u0097\3\2\2\2\u00af\u009c\3\2\2\2\u00b0\t\3\2\2\2\u00b1\u00b2\5\b\5\2"+
		"\u00b2\u00b3\b\6\1\2\u00b3\u00bf\3\2\2\2\u00b4\u00ba\7\b\2\2\u00b5\u00b6"+
		"\5\b\5\2\u00b6\u00b7\b\6\1\2\u00b7\u00b9\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\t\2\2\u00be\u00b1\3\2\2\2\u00be"+
		"\u00b4\3\2\2\2\u00bf\13\3\2\2\2\u00c0\u00c1\b\7\1\2\u00c1\u00c2\7&\2\2"+
		"\u00c2\u00f0\b\7\1\2\u00c3\u00c4\7)\2\2\u00c4\u00f0\b\7\1\2\u00c5\u00f0"+
		"\7(\2\2\u00c6\u00c7\7\'\2\2\u00c7\u00f0\b\7\1\2\u00c8\u00c9\7&\2\2\u00c9"+
		"\u00ca\7\6\2\2\u00ca\u00d6\b\7\1\2\u00cb\u00cc\5\f\7\2\u00cc\u00d3\b\7"+
		"\1\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5\f\7\2\u00cf\u00d0\b\7\1\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00cb\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\7"+
		"\2\2\u00d9\u00f0\b\7\1\2\u00da\u00db\7\6\2\2\u00db\u00dc\5\6\4\2\u00dc"+
		"\u00dd\7\7\2\2\u00dd\u00de\5\f\7\13\u00de\u00df\b\7\1\2\u00df\u00f0\3"+
		"\2\2\2\u00e0\u00e1\7\6\2\2\u00e1\u00e2\5\f\7\2\u00e2\u00e3\7\7\2\2\u00e3"+
		"\u00e4\b\7\1\2\u00e4\u00f0\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6\u00e7\5\f"+
		"\7\5\u00e7\u00e8\b\7\1\2\u00e8\u00f0\3\2\2\2\u00e9\u00ea\7\34\2\2\u00ea"+
		"\u00eb\5\f\7\4\u00eb\u00ec\b\7\1\2\u00ec\u00f0\3\2\2\2\u00ed\u00ee\7&"+
		"\2\2\u00ee\u00f0\b\7\1\2\u00ef\u00c0\3\2\2\2\u00ef\u00c3\3\2\2\2\u00ef"+
		"\u00c5\3\2\2\2\u00ef\u00c6\3\2\2\2\u00ef\u00c8\3\2\2\2\u00ef\u00da\3\2"+
		"\2\2\u00ef\u00e0\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u012f\3\2\2\2\u00f1\u00f2\f\t\2\2\u00f2\u00f9\b\7"+
		"\1\2\u00f3\u00f4\7\30\2\2\u00f4\u00fa\b\7\1\2\u00f5\u00f6\7\31\2\2\u00f6"+
		"\u00fa\b\7\1\2\u00f7\u00f8\7\32\2\2\u00f8\u00fa\b\7\1\2\u00f9\u00f3\3"+
		"\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\5\f\7\n\u00fc\u00fd\b\7\1\2\u00fd\u012e\3\2\2\2\u00fe\u00ff\f\b"+
		"\2\2\u00ff\u0104\b\7\1\2\u0100\u0101\7\33\2\2\u0101\u0105\b\7\1\2\u0102"+
		"\u0103\7\34\2\2\u0103\u0105\b\7\1\2\u0104\u0100\3\2\2\2\u0104\u0102\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5\f\7\t\u0107\u0108\b\7\1\2\u0108"+
		"\u012e\3\2\2\2\u0109\u010a\f\7\2\2\u010a\u0115\b\7\1\2\u010b\u010c\7\35"+
		"\2\2\u010c\u0116\b\7\1\2\u010d\u010e\7\36\2\2\u010e\u0116\b\7\1\2\u010f"+
		"\u0110\7\37\2\2\u0110\u0116\b\7\1\2\u0111\u0112\7 \2\2\u0112\u0116\b\7"+
		"\1\2\u0113\u0114\7!\2\2\u0114\u0116\b\7\1\2\u0115\u010b\3\2\2\2\u0115"+
		"\u010d\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\b\7\1\2\u0118\u012e\5\f\7\b\u0119"+
		"\u011a\f\6\2\2\u011a\u011f\b\7\1\2\u011b\u011c\7\"\2\2\u011c\u0120\b\7"+
		"\1\2\u011d\u011e\7#\2\2\u011e\u0120\b\7\1\2\u011f\u011b\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\5\f\7\7\u0122\u0123\b\7"+
		"\1\2\u0123\u012e\3\2\2\2\u0124\u0125\f\16\2\2\u0125\u0126\7\16\2\2\u0126"+
		"\u0127\5\f\7\2\u0127\u0128\7\17\2\2\u0128\u012e\3\2\2\2\u0129\u012a\f"+
		"\f\2\2\u012a\u012b\7\27\2\2\u012b\u012c\7&\2\2\u012c\u012e\b\7\1\2\u012d"+
		"\u00f1\3\2\2\2\u012d\u00fe\3\2\2\2\u012d\u0109\3\2\2\2\u012d\u0119\3\2"+
		"\2\2\u012d\u0124\3\2\2\2\u012d\u0129\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\r\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\36\21\31 ,/\65\67CIR[o\u0082\u0091\u00a7\u00aa\u00af\u00ba\u00be\u00d3"+
		"\u00d6\u00ef\u00f9\u0104\u0115\u011f\u012d\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}