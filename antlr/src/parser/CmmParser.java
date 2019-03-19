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
		public Program ast;
		public DefinitionContext definition;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
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
			List<Definition> prog = new ArrayList<Definition>();
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				((ProgramContext)_localctx).definition = definition();
				prog.addAll(((ProgramContext)_localctx).definition.ast);
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12))) != 0) );
			((ProgramContext)_localctx).ast =  new Program(prog);
			setState(21);
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

	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public TypeContext type;
		public Token id1;
		public Token id2;
		public TypeContext t1;
		public TypeContext t2;
		public TypeContext t3;
		public Token id3;
		public StatementContext statement;
		public DefinitionContext definition;
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				((DefinitionContext)_localctx).type = type(0);
				Type type = ((DefinitionContext)_localctx).type.ast;
				setState(25);
				((DefinitionContext)_localctx).id1 = match(ID);
				 VariableDefinition varDef = new VariableDefinition((((DefinitionContext)_localctx).id1!=null?((DefinitionContext)_localctx).id1.getText():null), type); _localctx.ast.add(varDef);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(27);
					match(T__0);
					setState(28);
					((DefinitionContext)_localctx).id2 = match(ID);
					_localctx.ast.add(new VariableDefinition((((DefinitionContext)_localctx).id2!=null?((DefinitionContext)_localctx).id2.getText():null), ((DefinitionContext)_localctx).type.ast));
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				Type type = null;
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(38);
					match(T__2);
					type = new VoidType();
					}
					break;
				case T__7:
				case T__8:
				case T__9:
				case T__12:
					{
					setState(40);
					((DefinitionContext)_localctx).t1 = type(0);
					type = ((DefinitionContext)_localctx).t1.ast;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45);
				((DefinitionContext)_localctx).id1 = match(ID);
				setState(46);
				match(T__3);
				List<VariableDefinition> params = new ArrayList<VariableDefinition>();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12))) != 0)) {
					{
					setState(48);
					((DefinitionContext)_localctx).t2 = type(0);
					setState(49);
					((DefinitionContext)_localctx).id2 = match(ID);
					params.add(new VariableDefinition((((DefinitionContext)_localctx).id2!=null?((DefinitionContext)_localctx).id2.getText():null), ((DefinitionContext)_localctx).t2.ast));
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(51);
						match(T__0);
						setState(52);
						((DefinitionContext)_localctx).t3 = type(0);
						setState(53);
						((DefinitionContext)_localctx).id3 = match(ID);
						params.add(new VariableDefinition((((DefinitionContext)_localctx).id3!=null?((DefinitionContext)_localctx).id3.getText():null), ((DefinitionContext)_localctx).t3.ast));
						}
						}
						setState(60);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(63);
				match(T__4);
				Type funType = new FunctionType(type, params);
				setState(65);
				match(T__5);
				List<Body> body = new ArrayList<Body>();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(73);
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
						setState(67);
						((DefinitionContext)_localctx).statement = statement();
						body.add(((DefinitionContext)_localctx).statement.ast);
						}
						break;
					case T__2:
					case T__7:
					case T__8:
					case T__9:
					case T__12:
						{
						setState(70);
						((DefinitionContext)_localctx).definition = definition();
						body.addAll(((DefinitionContext)_localctx).definition.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(T__6);
				_localctx.ast.add( new FunctionDefinition((((DefinitionContext)_localctx).id1!=null?((DefinitionContext)_localctx).id1.getText():null), funType, body)); 
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
		public TypeContext t1;
		public TypeContext type;
		public Token id1;
		public ExprContext expr;
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(83);
				match(T__7);
				((TypeContext)_localctx).ast =  new IntType();
				}
				break;
			case T__8:
				{
				setState(85);
				match(T__8);
				((TypeContext)_localctx).ast =  new CharType();
				}
				break;
			case T__9:
				{
				setState(87);
				match(T__9);
				((TypeContext)_localctx).ast =  new RealType();
				}
				break;
			case T__12:
				{
				setState(89);
				match(T__12);
				List<RecordType> fields = new ArrayList<RecordType>();
				setState(91);
				match(T__5);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					((TypeContext)_localctx).type = type(0);
					setState(93);
					((TypeContext)_localctx).id1 = match(ID);
					setState(94);
					match(T__1);
					fields.add(new RecordType((((TypeContext)_localctx).id1!=null?((TypeContext)_localctx).id1.getText():null), ((TypeContext)_localctx).type.ast));
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12))) != 0) );
				setState(101);
				match(T__6);
				((TypeContext)_localctx).ast =  new StructType( fields);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(106);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(111); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(107);
							match(T__10);
							setState(108);
							((TypeContext)_localctx).expr = expr(0);
							setState(109);
							match(T__11);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(113); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					((TypeContext)_localctx).ast = new ArrayType(((TypeContext)_localctx).t1.ast, ((TypeContext)_localctx).expr.ast);
					}
					} 
				}
				setState(121);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__13);
				setState(123);
				match(T__3);
				setState(124);
				((StatementContext)_localctx).expr = expr(0);
				setState(125);
				match(T__4);
				setState(126);
				((StatementContext)_localctx).block = block();
				((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).expr.ast, ((StatementContext)_localctx).block.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__14);
				setState(130);
				match(T__3);
				setState(131);
				((StatementContext)_localctx).expr = expr(0);
				setState(132);
				match(T__4);
				setState(133);
				((StatementContext)_localctx).b1 = block();
				List<Body> elseBody = new ArrayList<Body>();
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(135);
					match(T__15);
					setState(136);
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
				setState(143);
				((StatementContext)_localctx).e1 = expr(0);
				setState(144);
				match(T__16);
				setState(145);
				((StatementContext)_localctx).e2 = expr(0);
				((StatementContext)_localctx).ast =  new Assigment(((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				setState(147);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(T__17);
				setState(150);
				((StatementContext)_localctx).e1 = expr(0);
				List<Expression> args = new ArrayList<Expression>(); args.add(((StatementContext)_localctx).e1.ast);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(152);
					match(T__0);
					setState(153);
					((StatementContext)_localctx).e2 = expr(0);
					args.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__1);
				((StatementContext)_localctx).ast =  new Write(args);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(T__18);
				setState(165);
				((StatementContext)_localctx).e1 = expr(0);
				List<Expression> args = new ArrayList<Expression>(); args.add(((StatementContext)_localctx).e1.ast);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(167);
					match(T__0);
					setState(168);
					((StatementContext)_localctx).e2 = expr(0);
					args.add(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__1);
				((StatementContext)_localctx).ast =  new Read(args);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(T__19);
				setState(180);
				((StatementContext)_localctx).expr = expr(0);
				setState(181);
				match(T__1);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).expr.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				((StatementContext)_localctx).ID = match(ID);
				List<Expression> args = new ArrayList<Expression>();
				setState(186);
				match(T__3);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(187);
					((StatementContext)_localctx).e1 = expr(0);
					args.add(((StatementContext)_localctx).e1.ast);
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(189);
						match(T__0);
						setState(190);
						((StatementContext)_localctx).e2 = expr(0);
						args.add(((StatementContext)_localctx).e2.ast);
						}
						}
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(200);
				match(T__4);
				setState(201);
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
		public List<Body> ast = new ArrayList<Body>();
		public StatementContext statement;
		public DefinitionContext definition;
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
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__7:
			case T__8:
			case T__9:
			case T__12:
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
				setState(211);
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
					setState(205);
					((BlockContext)_localctx).statement = statement();
					_localctx.ast.add(((BlockContext)_localctx).statement.ast);
					}
					break;
				case T__2:
				case T__7:
				case T__8:
				case T__9:
				case T__12:
					{
					setState(208);
					((BlockContext)_localctx).definition = definition();
					_localctx.ast.addAll(((BlockContext)_localctx).definition.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__5);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(220);
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
						setState(214);
						((BlockContext)_localctx).statement = statement();
						_localctx.ast.add(((BlockContext)_localctx).statement.ast);
						}
						break;
					case T__2:
					case T__7:
					case T__8:
					case T__9:
					case T__12:
						{
						setState(217);
						((BlockContext)_localctx).definition = definition();
						_localctx.ast.addAll(((BlockContext)_localctx).definition.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
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
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(229);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).ast =  new Variable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).ID.getLine(), ((ExprContext)_localctx).ID.getCharPositionInLine() +1); 
				}
				break;
			case 2:
				{
				setState(231);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExprContext)_localctx).ast =  new RealLiteral(Double.parseDouble((((ExprContext)_localctx).REAL_CONSTANT!=null?((ExprContext)_localctx).REAL_CONSTANT.getText():null)), ((ExprContext)_localctx).REAL_CONSTANT.getLine(), ((ExprContext)_localctx).REAL_CONSTANT.getCharPositionInLine() +1); 
				}
				break;
			case 3:
				{
				setState(233);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExprContext)_localctx).ast =  new CharacterLiteral(LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null)), ((ExprContext)_localctx).CHAR_CONSTANT.getLine(), ((ExprContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() +1);
				}
				break;
			case 4:
				{
				setState(235);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new IntegerLiteral(Integer.parseInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null)), ((ExprContext)_localctx).INT_CONSTANT.getLine(), ((ExprContext)_localctx).INT_CONSTANT.getCharPositionInLine() +1); 
				}
				break;
			case 5:
				{
				setState(237);
				((ExprContext)_localctx).ID = match(ID);
				setState(238);
				match(T__3);
				 List<Expression> params = new ArrayList<Expression>(); 
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(240);
					((ExprContext)_localctx).e1 = ((ExprContext)_localctx).expr = expr(0);
					params.add(((ExprContext)_localctx).e1.ast); 
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(242);
						match(T__0);
						setState(243);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						params.add(((ExprContext)_localctx).e2.ast); 
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(253);
				match(T__4);
				 ((ExprContext)_localctx).ast =  new FunctionCall((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null),params); 
				}
				break;
			case 6:
				{
				setState(255);
				match(T__3);
				setState(256);
				((ExprContext)_localctx).type = type(0);
				setState(257);
				match(T__4);
				setState(258);
				((ExprContext)_localctx).expr = expr(9);
				((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).type.ast, ((ExprContext)_localctx).expr.ast, (((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null).getLine(), (((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null).getCharPositionInLine() + 1); 
				}
				break;
			case 7:
				{
				setState(261);
				match(T__3);
				setState(262);
				((ExprContext)_localctx).expr = expr(0);
				setState(263);
				match(T__4);
				((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast;
				}
				break;
			case 8:
				{
				setState(266);
				match(T__33);
				setState(267);
				((ExprContext)_localctx).expr = expr(3);
				 ((ExprContext)_localctx).ast =  new BooleanNegation(((ExprContext)_localctx).expr.ast, (((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null).getLine(), (((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null).getCharPositionInLine() + 1 );
				}
				break;
			case 9:
				{
				setState(270);
				match(T__25);
				setState(271);
				((ExprContext)_localctx).expr = expr(2);
				 ((ExprContext)_localctx).ast =  new UnaryMinus(((ExprContext)_localctx).expr.ast, (((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null).getLine(), (((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null).getCharPositionInLine() + 1 );
				}
				break;
			case 10:
				{
				setState(274);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).ast =  new Variable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).ID.getLine(), ((ExprContext)_localctx).ID.getCharPositionInLine() +1); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						 String operand = ""; 
						setState(286);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__21:
							{
							setState(280);
							match(T__21);
							 operand = "*"; 
							}
							break;
						case T__22:
							{
							setState(282);
							match(T__22);
							 operand = "/"; 
							}
							break;
						case T__23:
							{
							setState(284);
							match(T__23);
							 operand = "%"; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(288);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast, (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine() +1); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e3 = _prevctx;
						_localctx.e3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						 String operand = ""; 
						setState(297);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__24:
							{
							setState(293);
							match(T__24);
							 operand = "+"; 
							}
							break;
						case T__25:
							{
							setState(295);
							match(T__25);
							 operand = "-"; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(299);
						((ExprContext)_localctx).e4 = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e3.ast, ((ExprContext)_localctx).e4.ast, (((ExprContext)_localctx).e3!=null?(((ExprContext)_localctx).e3.start):null).getLine(), (((ExprContext)_localctx).e3!=null?(((ExprContext)_localctx).e3.start):null).getCharPositionInLine() +1); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						 String operand = ""; 
						setState(314);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__26:
							{
							setState(304);
							match(T__26);
							 operand = "<"; 
							}
							break;
						case T__27:
							{
							setState(306);
							match(T__27);
							 operand = ">"; 
							}
							break;
						case T__28:
							{
							setState(308);
							match(T__28);
							 operand = ">="; 
							}
							break;
						case T__29:
							{
							setState(310);
							match(T__29);
							 operand = "<="; 
							}
							break;
						case T__30:
							{
							setState(312);
							match(T__30);
							 operand = "=="; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(316);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast, (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine() +1);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						 String operand = ""; 
						setState(325);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__31:
							{
							setState(321);
							match(T__31);
							 operand = "&&"; 
							}
							break;
						case T__32:
							{
							setState(323);
							match(T__32);
							 operand = "||"; 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(327);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(5);
						 ((ExprContext)_localctx).ast =  new BinaryOperation(operand, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast, (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine() +1);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(331);
						match(T__10);
						setState(332);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						setState(333);
						match(T__11);
						 ((ExprContext)_localctx).ast =  new ArrayAccess(((ExprContext)_localctx).e2.ast, (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine() +1); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(336);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(337);
						match(T__20);
						setState(338);
						((ExprContext)_localctx).ID = match(ID);
						 ((ExprContext)_localctx).ast =  new FieldAccess((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), (((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null).getLine(), (((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null).getCharPositionInLine() + 1); 
						}
						break;
					}
					} 
				}
				setState(344);
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
			return precpred(_ctx, 2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u015c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\6\2\23\n\2\r\2"+
		"\16\2\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\5\3@\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3\3\3\5\3S\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4d\n\4\r\4\16"+
		"\4e\3\4\3\4\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\3\4\6\4r\n\4\r\4\16\4s\3\4\3"+
		"\4\7\4x\n\4\f\4\16\4{\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009f\n\5\f\5\16\5\u00a2\13\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00ae\n\5\f\5\16\5\u00b1\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00c4"+
		"\n\5\f\5\16\5\u00c7\13\5\5\5\u00c9\n\5\3\5\3\5\3\5\5\5\u00ce\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u00d6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00df"+
		"\n\6\f\6\16\6\u00e2\13\6\3\6\5\6\u00e5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00f9\n\7\f\7\16\7\u00fc"+
		"\13\7\5\7\u00fe\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0117\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0121\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u012c\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u013d\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0148\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0157\n\7\f\7\16"+
		"\7\u015a\13\7\3\7\2\4\6\f\b\2\4\6\b\n\f\2\2\2\u018b\2\16\3\2\2\2\4R\3"+
		"\2\2\2\6j\3\2\2\2\b\u00cd\3\2\2\2\n\u00e4\3\2\2\2\f\u0116\3\2\2\2\16\22"+
		"\b\2\1\2\17\20\5\4\3\2\20\21\b\2\1\2\21\23\3\2\2\2\22\17\3\2\2\2\23\24"+
		"\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\b\2\1\2\27\30"+
		"\7\2\2\3\30\3\3\2\2\2\31\32\5\6\4\2\32\33\b\3\1\2\33\34\7&\2\2\34\"\b"+
		"\3\1\2\35\36\7\3\2\2\36\37\7&\2\2\37!\b\3\1\2 \35\3\2\2\2!$\3\2\2\2\""+
		" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\4\2\2&S\3\2\2\2\'-\b\3\1"+
		"\2()\7\5\2\2).\b\3\1\2*+\5\6\4\2+,\b\3\1\2,.\3\2\2\2-(\3\2\2\2-*\3\2\2"+
		"\2./\3\2\2\2/\60\7&\2\2\60\61\7\6\2\2\61?\b\3\1\2\62\63\5\6\4\2\63\64"+
		"\7&\2\2\64<\b\3\1\2\65\66\7\3\2\2\66\67\5\6\4\2\678\7&\2\289\b\3\1\29"+
		";\3\2\2\2:\65\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2?\62\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\7\2\2BC\b\3\1\2CD\7\b\2\2DM\b\3"+
		"\1\2EF\5\b\5\2FG\b\3\1\2GL\3\2\2\2HI\5\4\3\2IJ\b\3\1\2JL\3\2\2\2KE\3\2"+
		"\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\t"+
		"\2\2QS\b\3\1\2R\31\3\2\2\2R\'\3\2\2\2S\5\3\2\2\2TU\b\4\1\2UV\7\n\2\2V"+
		"k\b\4\1\2WX\7\13\2\2Xk\b\4\1\2YZ\7\f\2\2Zk\b\4\1\2[\\\7\17\2\2\\]\b\4"+
		"\1\2]c\7\b\2\2^_\5\6\4\2_`\7&\2\2`a\7\4\2\2ab\b\4\1\2bd\3\2\2\2c^\3\2"+
		"\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\t\2\2hi\b\4\1\2ik\3\2"+
		"\2\2jT\3\2\2\2jW\3\2\2\2jY\3\2\2\2j[\3\2\2\2ky\3\2\2\2lq\f\4\2\2mn\7\r"+
		"\2\2no\5\f\7\2op\7\16\2\2pr\3\2\2\2qm\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3"+
		"\2\2\2tu\3\2\2\2uv\b\4\1\2vx\3\2\2\2wl\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3"+
		"\2\2\2z\7\3\2\2\2{y\3\2\2\2|}\7\20\2\2}~\7\6\2\2~\177\5\f\7\2\177\u0080"+
		"\7\7\2\2\u0080\u0081\5\n\6\2\u0081\u0082\b\5\1\2\u0082\u00ce\3\2\2\2\u0083"+
		"\u0084\7\21\2\2\u0084\u0085\7\6\2\2\u0085\u0086\5\f\7\2\u0086\u0087\7"+
		"\7\2\2\u0087\u0088\5\n\6\2\u0088\u008d\b\5\1\2\u0089\u008a\7\22\2\2\u008a"+
		"\u008b\5\n\6\2\u008b\u008c\b\5\1\2\u008c\u008e\3\2\2\2\u008d\u0089\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\5\1\2\u0090"+
		"\u00ce\3\2\2\2\u0091\u0092\5\f\7\2\u0092\u0093\7\23\2\2\u0093\u0094\5"+
		"\f\7\2\u0094\u0095\b\5\1\2\u0095\u0096\7\4\2\2\u0096\u00ce\3\2\2\2\u0097"+
		"\u0098\7\24\2\2\u0098\u0099\5\f\7\2\u0099\u00a0\b\5\1\2\u009a\u009b\7"+
		"\3\2\2\u009b\u009c\5\f\7\2\u009c\u009d\b\5\1\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\4\2\2\u00a4"+
		"\u00a5\b\5\1\2\u00a5\u00ce\3\2\2\2\u00a6\u00a7\7\25\2\2\u00a7\u00a8\5"+
		"\f\7\2\u00a8\u00af\b\5\1\2\u00a9\u00aa\7\3\2\2\u00aa\u00ab\5\f\7\2\u00ab"+
		"\u00ac\b\5\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\b\5\1\2\u00b4\u00ce\3\2"+
		"\2\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\7\4\2\2\u00b8"+
		"\u00b9\b\5\1\2\u00b9\u00ce\3\2\2\2\u00ba\u00bb\7&\2\2\u00bb\u00bc\b\5"+
		"\1\2\u00bc\u00c8\7\6\2\2\u00bd\u00be\5\f\7\2\u00be\u00c5\b\5\1\2\u00bf"+
		"\u00c0\7\3\2\2\u00c0\u00c1\5\f\7\2\u00c1\u00c2\b\5\1\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00bd\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\7\2\2\u00cb"+
		"\u00cc\7\4\2\2\u00cc\u00ce\b\5\1\2\u00cd|\3\2\2\2\u00cd\u0083\3\2\2\2"+
		"\u00cd\u0091\3\2\2\2\u00cd\u0097\3\2\2\2\u00cd\u00a6\3\2\2\2\u00cd\u00b5"+
		"\3\2\2\2\u00cd\u00ba\3\2\2\2\u00ce\t\3\2\2\2\u00cf\u00d0\5\b\5\2\u00d0"+
		"\u00d1\b\6\1\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4\b\6"+
		"\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6"+
		"\u00e5\3\2\2\2\u00d7\u00e0\7\b\2\2\u00d8\u00d9\5\b\5\2\u00d9\u00da\b\6"+
		"\1\2\u00da\u00df\3\2\2\2\u00db\u00dc\5\4\3\2\u00dc\u00dd\b\6\1\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e5\7\t\2\2\u00e4\u00d5\3\2\2\2\u00e4\u00d7\3\2"+
		"\2\2\u00e5\13\3\2\2\2\u00e6\u00e7\b\7\1\2\u00e7\u00e8\7&\2\2\u00e8\u0117"+
		"\b\7\1\2\u00e9\u00ea\7)\2\2\u00ea\u0117\b\7\1\2\u00eb\u00ec\7(\2\2\u00ec"+
		"\u0117\b\7\1\2\u00ed\u00ee\7\'\2\2\u00ee\u0117\b\7\1\2\u00ef\u00f0\7&"+
		"\2\2\u00f0\u00f1\7\6\2\2\u00f1\u00fd\b\7\1\2\u00f2\u00f3\5\f\7\2\u00f3"+
		"\u00fa\b\7\1\2\u00f4\u00f5\7\3\2\2\u00f5\u00f6\5\f\7\2\u00f6\u00f7\b\7"+
		"\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\7\7\2\2\u0100\u0117\b\7\1\2\u0101\u0102\7\6\2\2\u0102\u0103\5\6"+
		"\4\2\u0103\u0104\7\7\2\2\u0104\u0105\5\f\7\13\u0105\u0106\b\7\1\2\u0106"+
		"\u0117\3\2\2\2\u0107\u0108\7\6\2\2\u0108\u0109\5\f\7\2\u0109\u010a\7\7"+
		"\2\2\u010a\u010b\b\7\1\2\u010b\u0117\3\2\2\2\u010c\u010d\7$\2\2\u010d"+
		"\u010e\5\f\7\5\u010e\u010f\b\7\1\2\u010f\u0117\3\2\2\2\u0110\u0111\7\34"+
		"\2\2\u0111\u0112\5\f\7\4\u0112\u0113\b\7\1\2\u0113\u0117\3\2\2\2\u0114"+
		"\u0115\7&\2\2\u0115\u0117\b\7\1\2\u0116\u00e6\3\2\2\2\u0116\u00e9\3\2"+
		"\2\2\u0116\u00eb\3\2\2\2\u0116\u00ed\3\2\2\2\u0116\u00ef\3\2\2\2\u0116"+
		"\u0101\3\2\2\2\u0116\u0107\3\2\2\2\u0116\u010c\3\2\2\2\u0116\u0110\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u0158\3\2\2\2\u0118\u0119\f\t\2\2\u0119"+
		"\u0120\b\7\1\2\u011a\u011b\7\30\2\2\u011b\u0121\b\7\1\2\u011c\u011d\7"+
		"\31\2\2\u011d\u0121\b\7\1\2\u011e\u011f\7\32\2\2\u011f\u0121\b\7\1\2\u0120"+
		"\u011a\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\5\f\7\n\u0123\u0124\b\7\1\2\u0124\u0157\3\2\2\2\u0125"+
		"\u0126\f\b\2\2\u0126\u012b\b\7\1\2\u0127\u0128\7\33\2\2\u0128\u012c\b"+
		"\7\1\2\u0129\u012a\7\34\2\2\u012a\u012c\b\7\1\2\u012b\u0127\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\5\f\7\t\u012e\u012f\b\7"+
		"\1\2\u012f\u0157\3\2\2\2\u0130\u0131\f\7\2\2\u0131\u013c\b\7\1\2\u0132"+
		"\u0133\7\35\2\2\u0133\u013d\b\7\1\2\u0134\u0135\7\36\2\2\u0135\u013d\b"+
		"\7\1\2\u0136\u0137\7\37\2\2\u0137\u013d\b\7\1\2\u0138\u0139\7 \2\2\u0139"+
		"\u013d\b\7\1\2\u013a\u013b\7!\2\2\u013b\u013d\b\7\1\2\u013c\u0132\3\2"+
		"\2\2\u013c\u0134\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u0138\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\5\f\7\b\u013f\u0140\b\7"+
		"\1\2\u0140\u0157\3\2\2\2\u0141\u0142\f\6\2\2\u0142\u0147\b\7\1\2\u0143"+
		"\u0144\7\"\2\2\u0144\u0148\b\7\1\2\u0145\u0146\7#\2\2\u0146\u0148\b\7"+
		"\1\2\u0147\u0143\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\5\f\7\7\u014a\u014b\b\7\1\2\u014b\u0157\3\2\2\2\u014c\u014d\f\16"+
		"\2\2\u014d\u014e\7\r\2\2\u014e\u014f\5\f\7\2\u014f\u0150\7\16\2\2\u0150"+
		"\u0151\b\7\1\2\u0151\u0157\3\2\2\2\u0152\u0153\f\f\2\2\u0153\u0154\7\27"+
		"\2\2\u0154\u0155\7&\2\2\u0155\u0157\b\7\1\2\u0156\u0118\3\2\2\2\u0156"+
		"\u0125\3\2\2\2\u0156\u0130\3\2\2\2\u0156\u0141\3\2\2\2\u0156\u014c\3\2"+
		"\2\2\u0156\u0152\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\r\3\2\2\2\u015a\u0158\3\2\2\2!\24\"-<?KMRejsy\u008d"+
		"\u00a0\u00af\u00c5\u00c8\u00cd\u00d5\u00de\u00e0\u00e4\u00fa\u00fd\u0116"+
		"\u0120\u012b\u013c\u0147\u0156\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}