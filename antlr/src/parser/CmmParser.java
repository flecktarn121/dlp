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
		public Definition ast;
		public TypeContext type;
		public Token id1;
		public Token id2;
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				((DefinitionContext)_localctx).type = type(0);
				Type type = ((DefinitionContext)_localctx).type.ast;
				setState(19);
				((DefinitionContext)_localctx).id1 = match(ID);
				List<Expression> args = new ArrayList<VariableDefinition>(); args.add(new VariableDefinition());
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(21);
					match(T__0);
					setState(22);
					((DefinitionContext)_localctx).id2 = match(ID);
					args.add((((DefinitionContext)_localctx).id2!=null?((DefinitionContext)_localctx).id2.getText():null));
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(29);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(31);
					match(T__2);
					}
					break;
				case T__8:
				case T__9:
				case T__10:
					{
					setState(32);
					type(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35);
				match(ID);
				setState(36);
				match(T__3);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					setState(37);
					type(0);
					setState(38);
					match(ID);
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(39);
						match(T__0);
						setState(40);
						type(0);
						setState(41);
						match(ID);
						}
						}
						setState(47);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(50);
				match(T__4);
				setState(51);
				match(T__5);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(54);
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
						setState(52);
						statement();
						}
						break;
					case T__2:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
						{
						setState(53);
						definition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__7);
				List<RecordType> fields = new ArrayList<RecordType>();
				setState(62);
				match(T__5);
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(63);
					((DefinitionContext)_localctx).type = type(0);
					setState(64);
					((DefinitionContext)_localctx).id1 = match(ID);
					setState(65);
					match(T__1);
					fields.add(new RecordType((((DefinitionContext)_localctx).id1!=null?((DefinitionContext)_localctx).id1.getText():null), ((DefinitionContext)_localctx).type.ast));
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
				setState(72);
				match(T__6);
				setState(73);
				((DefinitionContext)_localctx).id2 = match(ID);
				((DefinitionContext)_localctx).ast =  new StructType((((DefinitionContext)_localctx).id2!=null?((DefinitionContext)_localctx).id2.getText():null), params);
				setState(75);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(80);
				match(T__8);
				((TypeContext)_localctx).ast =  new BaseType("int");
				}
				break;
			case T__9:
				{
				setState(82);
				match(T__9);
				((TypeContext)_localctx).ast =  new BaseType("char");
				}
				break;
			case T__10:
				{
				setState(84);
				match(T__10);
				((TypeContext)_localctx).ast =  new BaseType("double");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
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
					setState(88);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(93); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(89);
							match(T__11);
							setState(90);
							expr(0);
							setState(91);
							match(T__12);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(95); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(101);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__13);
				setState(103);
				match(T__3);
				setState(104);
				((StatementContext)_localctx).expr = expr(0);
				setState(105);
				match(T__4);
				setState(106);
				((StatementContext)_localctx).block = block();
				((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).expr.ast, ((StatementContext)_localctx).block.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__14);
				setState(110);
				match(T__3);
				setState(111);
				((StatementContext)_localctx).expr = expr(0);
				setState(112);
				match(T__4);
				setState(113);
				((StatementContext)_localctx).b1 = block();
				List<Statement> elseBody = new ArrayList<Statement>();
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(115);
					match(T__15);
					setState(116);
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
				setState(123);
				((StatementContext)_localctx).e1 = expr(0);
				setState(124);
				match(T__16);
				setState(125);
				((StatementContext)_localctx).e2 = expr(0);
				((StatementContext)_localctx).ast =  new Assigment(((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				setState(127);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(T__17);
				setState(130);
				((StatementContext)_localctx).e1 = expr(0);
				List<Expression> args = new ArrayList<Expression>(); args.add(((StatementContext)_localctx).e1.ast);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(132);
					match(T__0);
					setState(133);
					((StatementContext)_localctx).e2 = expr(0);
					args.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__1);
				((StatementContext)_localctx).ast =  new Write(args);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(T__18);
				setState(145);
				((StatementContext)_localctx).e1 = expr(0);
				List<Expression> args = new ArrayList<Expression>(); args.add(((StatementContext)_localctx).e1.ast);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(147);
					match(T__0);
					setState(148);
					((StatementContext)_localctx).e2 = expr(0);
					args.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(T__1);
				((StatementContext)_localctx).ast =  new read(args);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(T__19);
				setState(160);
				((StatementContext)_localctx).expr = expr(0);
				setState(161);
				match(T__1);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).expr.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				((StatementContext)_localctx).ID = match(ID);
				List<Expression> args = new ArrayList<Expression>();
				setState(166);
				match(T__3);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(167);
					((StatementContext)_localctx).e1 = expr(0);
					args.add(((StatementContext)_localctx).e1.ast);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(169);
						match(T__0);
						setState(170);
						((StatementContext)_localctx).e2 = expr(0);
						args.add(((StatementContext)_localctx).e2.ast);
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(180);
				match(T__4);
				setState(181);
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
			setState(198);
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
				setState(185);
				((BlockContext)_localctx).statement = statement();
				_localctx.ast.add(((BlockContext)_localctx).statement.ast);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(T__5);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					{
					setState(189);
					((BlockContext)_localctx).statement = statement();
					_localctx.ast.add(((BlockContext)_localctx).statement.ast);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
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
		public Token CHAR_CONSTANT;
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(201);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).ast =  new Variable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			case 2:
				{
				setState(203);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExprContext)_localctx).ast =  new RealLiteral(Double.parseDouble((((ExprContext)_localctx).REAL_CONSTANT!=null?((ExprContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(205);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExprContext)_localctx).ast =  new CharacterLiteral(LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(207);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new RealLiteral(Integer.parseInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(209);
				((ExprContext)_localctx).ID = match(ID);
				setState(210);
				match(T__3);
				 List<Expression> params = new ArrayList<Expression>(); 
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(212);
					((ExprContext)_localctx).e1 = ((ExprContext)_localctx).expr = expr(0);
					params.add(((ExprContext)_localctx).e1.ast); 
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(214);
						match(T__0);
						setState(215);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						params.add(((ExprContext)_localctx).e2.ast); 
						}
						}
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(225);
				match(T__4);
				 ((ExprContext)_localctx).ast =  new ArrayAccess(((ExprContext)_localctx).e2.ast); 
				}
				break;
			case 6:
				{
				setState(227);
				match(T__3);
				setState(228);
				((ExprContext)_localctx).type = type(0);
				setState(229);
				match(T__4);
				setState(230);
				((ExprContext)_localctx).expr = expr(9);
				((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).type.ast, ((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 7:
				{
				setState(233);
				match(T__3);
				setState(234);
				((ExprContext)_localctx).expr = expr(0);
				setState(235);
				match(T__4);
				((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast;
				}
				break;
			case 8:
				{
				setState(238);
				match(T__33);
				setState(239);
				((ExprContext)_localctx).expr = expr(3);
				 ((ExprContext)_localctx).ast =  new BooleanNegation(((ExprContext)_localctx).expr.ast);
				}
				break;
			case 9:
				{
				setState(242);
				match(T__25);
				setState(243);
				((ExprContext)_localctx).expr = expr(2);
				 ((ExprContext)_localctx).ast =  new UnaryMinus(((ExprContext)_localctx).expr.ast);
				}
				break;
			case 10:
				{
				setState(246);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).ast =  new Variable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						 String operand = ""; 
						setState(258);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__21:
							{
							setState(252);
							match(T__21);
							 operand = "*"; 
							}
							break;
						case T__22:
							{
							setState(254);
							match(T__22);
							 operand = "/"; 
							}
							break;
						case T__23:
							{
							setState(256);
							match(T__23);
							 operand = "%"; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(260);
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
						setState(263);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						 String operand = ""; 
						setState(269);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__24:
							{
							setState(265);
							match(T__24);
							 operand = "+"; 
							}
							break;
						case T__25:
							{
							setState(267);
							match(T__25);
							 operand = "-"; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(271);
						((ExprContext)_localctx).e4 = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e3.ast, ((ExprContext)_localctx).e4.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						 String operand = ""; 
						setState(286);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__26:
							{
							setState(276);
							match(T__26);
							 operand = "<"; 
							}
							break;
						case T__27:
							{
							setState(278);
							match(T__27);
							 operand = ">"; 
							}
							break;
						case T__28:
							{
							setState(280);
							match(T__28);
							 operand = ">="; 
							}
							break;
						case T__29:
							{
							setState(282);
							match(T__29);
							 operand = "<="; 
							}
							break;
						case T__30:
							{
							setState(284);
							match(T__30);
							 operand = "=="; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast);
						setState(289);
						((ExprContext)_localctx).expr = expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						 String operand = ""; 
						setState(296);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__31:
							{
							setState(292);
							match(T__31);
							 operand = "&&"; 
							}
							break;
						case T__32:
							{
							setState(294);
							match(T__32);
							 operand = "||"; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(298);
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
						setState(301);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(302);
						match(T__11);
						setState(303);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						setState(304);
						match(T__12);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(307);
						match(T__20);
						setState(308);
						((ExprContext)_localctx).ID = match(ID);
						 ((ExprContext)_localctx).ast =  new FieldAccess((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\3\3\3\5"+
		"\3$\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\5\3"+
		"\63\n\3\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\6\3G\n\3\r\3\16\3H\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\3\4\6\4`\n\4\r\4\16\4a\7"+
		"\4d\n\4\f\4\16\4g\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5z\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009a\n\5\f\5\16\5\u009d\13\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b0\n\5"+
		"\f\5\16\5\u00b3\13\5\5\5\u00b5\n\5\3\5\3\5\3\5\5\5\u00ba\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00c3\n\6\f\6\16\6\u00c6\13\6\3\6\5\6\u00c9\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u00dd\n\7\f\7\16\7\u00e0\13\7\5\7\u00e2\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00fb\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0105\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0110\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0121\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u012b\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u0139\n\7\f\7\16\7\u013c\13\7\3\7\2\4\6\f\b\2\4\6\b\n\f\2\2\2\u016b"+
		"\2\17\3\2\2\2\4O\3\2\2\2\6X\3\2\2\2\b\u00b9\3\2\2\2\n\u00c8\3\2\2\2\f"+
		"\u00fa\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2"+
		"\21\22\3\2\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24\25\b\3\1\2\25\26\7&\2\2\26"+
		"\34\b\3\1\2\27\30\7\3\2\2\30\31\7&\2\2\31\33\b\3\1\2\32\27\3\2\2\2\33"+
		"\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37"+
		" \7\4\2\2 P\3\2\2\2!$\7\5\2\2\"$\5\6\4\2#!\3\2\2\2#\"\3\2\2\2$%\3\2\2"+
		"\2%&\7&\2\2&\62\7\6\2\2\'(\5\6\4\2(/\7&\2\2)*\7\3\2\2*+\5\6\4\2+,\7&\2"+
		"\2,.\3\2\2\2-)\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63\3\2\2\2"+
		"\61/\3\2\2\2\62\'\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\7\2\2\65"+
		":\7\b\2\2\669\5\b\5\2\679\5\4\3\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8"+
		"\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=P\7\t\2\2>?\7\n\2\2?@\b\3\1\2@"+
		"F\7\b\2\2AB\5\6\4\2BC\7&\2\2CD\7\4\2\2DE\b\3\1\2EG\3\2\2\2FA\3\2\2\2G"+
		"H\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\t\2\2KL\7&\2\2LM\b\3\1\2M"+
		"N\7\4\2\2NP\3\2\2\2O\23\3\2\2\2O#\3\2\2\2O>\3\2\2\2P\5\3\2\2\2QR\b\4\1"+
		"\2RS\7\13\2\2SY\b\4\1\2TU\7\f\2\2UY\b\4\1\2VW\7\r\2\2WY\b\4\1\2XQ\3\2"+
		"\2\2XT\3\2\2\2XV\3\2\2\2Ye\3\2\2\2Z_\f\3\2\2[\\\7\16\2\2\\]\5\f\7\2]^"+
		"\7\17\2\2^`\3\2\2\2_[\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2"+
		"cZ\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2ge\3\2\2\2hi\7\20\2"+
		"\2ij\7\6\2\2jk\5\f\7\2kl\7\7\2\2lm\5\n\6\2mn\b\5\1\2n\u00ba\3\2\2\2op"+
		"\7\21\2\2pq\7\6\2\2qr\5\f\7\2rs\7\7\2\2st\5\n\6\2ty\b\5\1\2uv\7\22\2\2"+
		"vw\5\n\6\2wx\b\5\1\2xz\3\2\2\2yu\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\5\1\2"+
		"|\u00ba\3\2\2\2}~\5\f\7\2~\177\7\23\2\2\177\u0080\5\f\7\2\u0080\u0081"+
		"\b\5\1\2\u0081\u0082\7\4\2\2\u0082\u00ba\3\2\2\2\u0083\u0084\7\24\2\2"+
		"\u0084\u0085\5\f\7\2\u0085\u008c\b\5\1\2\u0086\u0087\7\3\2\2\u0087\u0088"+
		"\5\f\7\2\u0088\u0089\b\5\1\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\4\2\2\u0090\u0091\b\5\1\2\u0091"+
		"\u00ba\3\2\2\2\u0092\u0093\7\25\2\2\u0093\u0094\5\f\7\2\u0094\u009b\b"+
		"\5\1\2\u0095\u0096\7\3\2\2\u0096\u0097\5\f\7\2\u0097\u0098\b\5\1\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0095\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7\4\2\2\u009f\u00a0\b\5\1\2\u00a0\u00ba\3\2\2\2\u00a1\u00a2\7\26"+
		"\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\b\5\1\2\u00a5"+
		"\u00ba\3\2\2\2\u00a6\u00a7\7&\2\2\u00a7\u00a8\b\5\1\2\u00a8\u00b4\7\6"+
		"\2\2\u00a9\u00aa\5\f\7\2\u00aa\u00b1\b\5\1\2\u00ab\u00ac\7\3\2\2\u00ac"+
		"\u00ad\5\f\7\2\u00ad\u00ae\b\5\1\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\7\4\2\2\u00b8"+
		"\u00ba\b\5\1\2\u00b9h\3\2\2\2\u00b9o\3\2\2\2\u00b9}\3\2\2\2\u00b9\u0083"+
		"\3\2\2\2\u00b9\u0092\3\2\2\2\u00b9\u00a1\3\2\2\2\u00b9\u00a6\3\2\2\2\u00ba"+
		"\t\3\2\2\2\u00bb\u00bc\5\b\5\2\u00bc\u00bd\b\6\1\2\u00bd\u00c9\3\2\2\2"+
		"\u00be\u00c4\7\b\2\2\u00bf\u00c0\5\b\5\2\u00c0\u00c1\b\6\1\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\7\t"+
		"\2\2\u00c8\u00bb\3\2\2\2\u00c8\u00be\3\2\2\2\u00c9\13\3\2\2\2\u00ca\u00cb"+
		"\b\7\1\2\u00cb\u00cc\7&\2\2\u00cc\u00fb\b\7\1\2\u00cd\u00ce\7)\2\2\u00ce"+
		"\u00fb\b\7\1\2\u00cf\u00d0\7(\2\2\u00d0\u00fb\b\7\1\2\u00d1\u00d2\7\'"+
		"\2\2\u00d2\u00fb\b\7\1\2\u00d3\u00d4\7&\2\2\u00d4\u00d5\7\6\2\2\u00d5"+
		"\u00e1\b\7\1\2\u00d6\u00d7\5\f\7\2\u00d7\u00de\b\7\1\2\u00d8\u00d9\7\3"+
		"\2\2\u00d9\u00da\5\f\7\2\u00da\u00db\b\7\1\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d8\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00fb\b\7"+
		"\1\2\u00e5\u00e6\7\6\2\2\u00e6\u00e7\5\6\4\2\u00e7\u00e8\7\7\2\2\u00e8"+
		"\u00e9\5\f\7\13\u00e9\u00ea\b\7\1\2\u00ea\u00fb\3\2\2\2\u00eb\u00ec\7"+
		"\6\2\2\u00ec\u00ed\5\f\7\2\u00ed\u00ee\7\7\2\2\u00ee\u00ef\b\7\1\2\u00ef"+
		"\u00fb\3\2\2\2\u00f0\u00f1\7$\2\2\u00f1\u00f2\5\f\7\5\u00f2\u00f3\b\7"+
		"\1\2\u00f3\u00fb\3\2\2\2\u00f4\u00f5\7\34\2\2\u00f5\u00f6\5\f\7\4\u00f6"+
		"\u00f7\b\7\1\2\u00f7\u00fb\3\2\2\2\u00f8\u00f9\7&\2\2\u00f9\u00fb\b\7"+
		"\1\2\u00fa\u00ca\3\2\2\2\u00fa\u00cd\3\2\2\2\u00fa\u00cf\3\2\2\2\u00fa"+
		"\u00d1\3\2\2\2\u00fa\u00d3\3\2\2\2\u00fa\u00e5\3\2\2\2\u00fa\u00eb\3\2"+
		"\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u013a\3\2\2\2\u00fc\u00fd\f\t\2\2\u00fd\u0104\b\7\1\2\u00fe\u00ff\7\30"+
		"\2\2\u00ff\u0105\b\7\1\2\u0100\u0101\7\31\2\2\u0101\u0105\b\7\1\2\u0102"+
		"\u0103\7\32\2\2\u0103\u0105\b\7\1\2\u0104\u00fe\3\2\2\2\u0104\u0100\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5\f\7\n\u0107"+
		"\u0108\b\7\1\2\u0108\u0139\3\2\2\2\u0109\u010a\f\b\2\2\u010a\u010f\b\7"+
		"\1\2\u010b\u010c\7\33\2\2\u010c\u0110\b\7\1\2\u010d\u010e\7\34\2\2\u010e"+
		"\u0110\b\7\1\2\u010f\u010b\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\5\f\7\t\u0112\u0113\b\7\1\2\u0113\u0139\3\2\2\2\u0114"+
		"\u0115\f\7\2\2\u0115\u0120\b\7\1\2\u0116\u0117\7\35\2\2\u0117\u0121\b"+
		"\7\1\2\u0118\u0119\7\36\2\2\u0119\u0121\b\7\1\2\u011a\u011b\7\37\2\2\u011b"+
		"\u0121\b\7\1\2\u011c\u011d\7 \2\2\u011d\u0121\b\7\1\2\u011e\u011f\7!\2"+
		"\2\u011f\u0121\b\7\1\2\u0120\u0116\3\2\2\2\u0120\u0118\3\2\2\2\u0120\u011a"+
		"\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\b\7\1\2\u0123\u0139\5\f\7\b\u0124\u0125\f\6\2\2\u0125\u012a\b\7"+
		"\1\2\u0126\u0127\7\"\2\2\u0127\u012b\b\7\1\2\u0128\u0129\7#\2\2\u0129"+
		"\u012b\b\7\1\2\u012a\u0126\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012d\5\f\7\7\u012d\u012e\b\7\1\2\u012e\u0139\3\2\2\2\u012f"+
		"\u0130\f\16\2\2\u0130\u0131\7\16\2\2\u0131\u0132\5\f\7\2\u0132\u0133\7"+
		"\17\2\2\u0133\u0139\3\2\2\2\u0134\u0135\f\f\2\2\u0135\u0136\7\27\2\2\u0136"+
		"\u0137\7&\2\2\u0137\u0139\b\7\1\2\u0138\u00fc\3\2\2\2\u0138\u0109\3\2"+
		"\2\2\u0138\u0114\3\2\2\2\u0138\u0124\3\2\2\2\u0138\u012f\3\2\2\2\u0138"+
		"\u0134\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\r\3\2\2\2\u013c\u013a\3\2\2\2\37\21\34#/\628:HOXaey\u008c\u009b"+
		"\u00b1\u00b4\u00b9\u00c4\u00c8\u00de\u00e1\u00fa\u0104\u010f\u0120\u012a"+
		"\u0138\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}