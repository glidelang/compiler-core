// Generated from C:/Users/gerar/OneDrive/Desktop/code/fluid-lang/compiler-core/src/main/resources\FParser.g4 by ANTLR 4.9.2
package net.fluidlang.compiler.ast;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, EXTERNAL=2, UNSAFE=3, MUTABLE=4, LET=5, ASYNC=6, PUBLIC=7, 
		IMPORT=8, OLD=9, NEW=10, OPERATOR=11, CAST=12, TO=13, INLINE=14, OVERRIDE=15, 
		CONST=16, STATIC=17, IF=18, ELSE=19, WHILE=20, LOOP=21, FOR=22, IN=23, 
		I8=24, I16=25, I32=26, I64=27, I128=28, U8=29, U16=30, U32=31, U64=32, 
		U128=33, F32=34, F64=35, BOOL=36, STR=37, WS=38, COMMENT=39, LINE_COMMENT=40, 
		IntegerLiteral=41, FloatingPointLiteral=42, BooleanLiteral=43, CharacterLiteral=44, 
		StringLiteral=45, NullLiteral=46, LPAREN=47, RPAREN=48, LBRACE=49, RBRACE=50, 
		LBRACK=51, RBRACK=52, SEMI=53, COMMA=54, DOT=55, ASSIGN=56, GT=57, LT=58, 
		BANG=59, TILDE=60, QUESTION=61, COLON=62, EQUAL=63, LE=64, GE=65, NOTEQUAL=66, 
		AND=67, OR=68, INC=69, DEC=70, ADD=71, SUB=72, MUL=73, DIV=74, BITAND=75, 
		BITOR=76, CARET=77, MOD=78, ARROW=79, COLONCOLON=80, ADD_ASSIGN=81, SUB_ASSIGN=82, 
		MUL_ASSIGN=83, DIV_ASSIGN=84, AND_ASSIGN=85, OR_ASSIGN=86, XOR_ASSIGN=87, 
		MOD_ASSIGN=88, LSHIFT_ASSIGN=89, RSHIFT_ASSIGN=90, URSHIFT_ASSIGN=91, 
		IDENTIFIER=92;
	public static final int
		RULE_compilationUnit = 0, RULE_line = 1, RULE_func_modifiers = 2, RULE_variable_modifiers = 3, 
		RULE_importStatement = 4, RULE_function = 5, RULE_formalParameterList = 6, 
		RULE_formalParameter = 7, RULE_value = 8, RULE_passedParameterList = 9, 
		RULE_newStatement = 10, RULE_oldStatement = 11, RULE_block = 12, RULE_body = 13, 
		RULE_stmt = 14, RULE_expr = 15, RULE_valueExpr = 16, RULE_type = 17, RULE_methodCall = 18, 
		RULE_assignment = 19, RULE_ifStatement = 20, RULE_whileStatement = 21, 
		RULE_loopStatement = 22, RULE_forStatement = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "line", "func_modifiers", "variable_modifiers", "importStatement", 
			"function", "formalParameterList", "formalParameter", "value", "passedParameterList", 
			"newStatement", "oldStatement", "block", "body", "stmt", "expr", "valueExpr", 
			"type", "methodCall", "assignment", "ifStatement", "whileStatement", 
			"loopStatement", "forStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'ext'", "'unsafe'", "'mut'", "'let'", "'async'", "'pub'", 
			"'import'", "'old'", "'new'", "'operator'", "'cast'", "'to'", "'inline'", 
			"'override'", "'const'", "'static'", "'if'", "'else'", "'while'", "'loop'", 
			"'for'", "'in'", "'i8'", "'i16'", "'i32'", "'i64'", "'i128'", "'u8'", 
			"'u16'", "'u32'", "'u64'", "'u128'", "'f32'", "'f64'", "'bool'", "'str'", 
			null, null, null, null, null, null, null, null, "'null'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
			"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='", "'<<='", "'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "EXTERNAL", "UNSAFE", "MUTABLE", "LET", "ASYNC", "PUBLIC", 
			"IMPORT", "OLD", "NEW", "OPERATOR", "CAST", "TO", "INLINE", "OVERRIDE", 
			"CONST", "STATIC", "IF", "ELSE", "WHILE", "LOOP", "FOR", "IN", "I8", 
			"I16", "I32", "I64", "I128", "U8", "U16", "U32", "U64", "U128", "F32", 
			"F64", "BOOL", "STR", "WS", "COMMENT", "LINE_COMMENT", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "IDENTIFIER"
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
	public String getGrammarFileName() { return "FParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << EXTERNAL) | (1L << UNSAFE) | (1L << MUTABLE) | (1L << ASYNC) | (1L << PUBLIC) | (1L << IMPORT) | (1L << INLINE) | (1L << OVERRIDE) | (1L << STATIC))) != 0)) {
				{
				{
				setState(48);
				line();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LineContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case EXTERNAL:
			case UNSAFE:
			case MUTABLE:
			case ASYNC:
			case PUBLIC:
			case INLINE:
			case OVERRIDE:
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				function();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				importStatement();
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

	public static class Func_modifiersContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(FParser.PUBLIC, 0); }
		public TerminalNode UNSAFE() { return getToken(FParser.UNSAFE, 0); }
		public TerminalNode EXTERNAL() { return getToken(FParser.EXTERNAL, 0); }
		public TerminalNode STATIC() { return getToken(FParser.STATIC, 0); }
		public TerminalNode INLINE() { return getToken(FParser.INLINE, 0); }
		public TerminalNode MUTABLE() { return getToken(FParser.MUTABLE, 0); }
		public TerminalNode ASYNC() { return getToken(FParser.ASYNC, 0); }
		public TerminalNode OVERRIDE() { return getToken(FParser.OVERRIDE, 0); }
		public Func_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterFunc_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitFunc_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitFunc_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_modifiersContext func_modifiers() throws RecognitionException {
		Func_modifiersContext _localctx = new Func_modifiersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXTERNAL) | (1L << UNSAFE) | (1L << MUTABLE) | (1L << ASYNC) | (1L << PUBLIC) | (1L << INLINE) | (1L << OVERRIDE) | (1L << STATIC))) != 0)) ) {
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

	public static class Variable_modifiersContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(FParser.STATIC, 0); }
		public TerminalNode INLINE() { return getToken(FParser.INLINE, 0); }
		public TerminalNode MUTABLE() { return getToken(FParser.MUTABLE, 0); }
		public Variable_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterVariable_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitVariable_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitVariable_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_modifiersContext variable_modifiers() throws RecognitionException {
		Variable_modifiersContext _localctx = new Variable_modifiersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUTABLE) | (1L << INLINE) | (1L << STATIC))) != 0)) ) {
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(FParser.IMPORT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(FParser.SEMI, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IMPORT);
			setState(63);
			match(IDENTIFIER);
			setState(64);
			match(SEMI);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FParser.LPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Func_modifiersContext> func_modifiers() {
			return getRuleContexts(Func_modifiersContext.class);
		}
		public Func_modifiersContext func_modifiers(int i) {
			return getRuleContext(Func_modifiersContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(FParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(66);
					func_modifiers();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(72);
			match(FUNCTION);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(LPAREN);
			setState(75);
			formalParameterList();
			setState(76);
			match(RPAREN);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(77);
				match(ARROW);
				setState(78);
				type();
				}
			}

			setState(81);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(83);
				formalParameter();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84);
					match(COMMA);
					setState(85);
					formalParameter();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(FParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(COLON);
			setState(95);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(FParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(FParser.BooleanLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(FParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(FParser.StringLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(FParser.CharacterLiteral, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public NewStatementContext newStatement() {
			return getRuleContext(NewStatementContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(BooleanLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(IntegerLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(StringLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(CharacterLiteral);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				match(IDENTIFIER);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				newStatement();
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

	public static class PassedParameterListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FParser.COMMA, i);
		}
		public PassedParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passedParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterPassedParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitPassedParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitPassedParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassedParameterListContext passedParameterList() throws RecognitionException {
		PassedParameterListContext _localctx = new PassedParameterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_passedParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || _la==IDENTIFIER) {
				{
				setState(106);
				value();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(107);
					match(COMMA);
					setState(108);
					value();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class NewStatementContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(FParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public NewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterNewStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitNewStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitNewStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewStatementContext newStatement() throws RecognitionException {
		NewStatementContext _localctx = new NewStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_newStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(NEW);
			setState(117);
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

	public static class OldStatementContext extends ParserRuleContext {
		public TerminalNode OLD() { return getToken(FParser.OLD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(FParser.SEMI, 0); }
		public OldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oldStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterOldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitOldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitOldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OldStatementContext oldStatement() throws RecognitionException {
		OldStatementContext _localctx = new OldStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_oldStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(OLD);
			setState(120);
			match(IDENTIFIER);
			setState(121);
			match(SEMI);
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
		public TerminalNode LBRACE() { return getToken(FParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LBRACE);
			setState(124);
			body();
			setState(125);
			match(RBRACE);
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

	public static class BodyContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					stmt();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUTABLE) | (1L << LET) | (1L << NEW) | (1L << INLINE) | (1L << STATIC) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || _la==IDENTIFIER) {
				{
				setState(133);
				expr();
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

	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FParser.SEMI, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public OldStatementContext oldStatement() {
			return getRuleContext(OldStatementContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUTABLE:
			case LET:
			case NEW:
			case INLINE:
			case STATIC:
			case IntegerLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				expr();
				setState(137);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				whileStatement();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				loopStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				forStatement();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				importStatement();
				}
				break;
			case OLD:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				oldStatement();
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				valueExpr();
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

	public static class ValueExprContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExprContext valueExpr() throws RecognitionException {
		ValueExprContext _localctx = new ValueExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valueExpr);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				value();
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
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode I8() { return getToken(FParser.I8, 0); }
		public TerminalNode I16() { return getToken(FParser.I16, 0); }
		public TerminalNode I32() { return getToken(FParser.I32, 0); }
		public TerminalNode I64() { return getToken(FParser.I64, 0); }
		public TerminalNode I128() { return getToken(FParser.I128, 0); }
		public TerminalNode U8() { return getToken(FParser.U8, 0); }
		public TerminalNode U16() { return getToken(FParser.U16, 0); }
		public TerminalNode U32() { return getToken(FParser.U32, 0); }
		public TerminalNode U64() { return getToken(FParser.U64, 0); }
		public TerminalNode U128() { return getToken(FParser.U128, 0); }
		public TerminalNode F32() { return getToken(FParser.F32, 0); }
		public TerminalNode F64() { return getToken(FParser.F64, 0); }
		public TerminalNode STR() { return getToken(FParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(FParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << I8) | (1L << I16) | (1L << I32) | (1L << I64) | (1L << I128) | (1L << U8) | (1L << U16) | (1L << U32) | (1L << U64) | (1L << U128) | (1L << F32) | (1L << F64) | (1L << BOOL) | (1L << STR))) != 0) || _la==IDENTIFIER) ) {
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FParser.LPAREN, 0); }
		public PassedParameterListContext passedParameterList() {
			return getRuleContext(PassedParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FParser.RPAREN, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IDENTIFIER);
			setState(159);
			match(LPAREN);
			setState(160);
			passedParameterList();
			setState(161);
			match(RPAREN);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(FParser.ASSIGN, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public TerminalNode LET() { return getToken(FParser.LET, 0); }
		public List<Variable_modifiersContext> variable_modifiers() {
			return getRuleContexts(Variable_modifiersContext.class);
		}
		public Variable_modifiersContext variable_modifiers(int i) {
			return getRuleContext(Variable_modifiersContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(163);
				match(LET);
				}
			}

			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUTABLE) | (1L << INLINE) | (1L << STATIC))) != 0)) {
				{
				{
				setState(166);
				variable_modifiers();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(IDENTIFIER);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(173);
				match(COLON);
				setState(174);
				type();
				}
			}

			setState(177);
			match(ASSIGN);
			setState(178);
			valueExpr();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IF);
			setState(181);
			expr();
			setState(182);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(WHILE);
			setState(185);
			expr();
			setState(186);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FParser.LOOP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LOOP);
			setState(189);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(FParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(FOR);
			setState(192);
			match(IDENTIFIER);
			setState(193);
			match(IN);
			setState(194);
			expr();
			setState(195);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u00c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\5\3;\n\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\7\7F\n\7\f\7\16\7I\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7R\n\7\3\7\3\7\3\b\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\5\b^\n\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\3\13\7\13p\n\13"+
		"\f\13\16\13s\13\13\5\13u\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\7\17\u0083\n\17\f\17\16\17\u0086\13\17\3\17\5\17\u0089\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0094\n\20\3\21"+
		"\3\21\5\21\u0098\n\21\3\22\3\22\3\22\5\22\u009d\n\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\5\25\u00a7\n\25\3\25\7\25\u00aa\n\25\f\25\16\25"+
		"\u00ad\13\25\3\25\3\25\3\25\5\25\u00b2\n\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3G\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\5\6\2\4\6\b\t\20\21\23\23\5\2\6\6\20\20\23\23\4\2\32\'^^\2\u00cb\2\65"+
		"\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fG\3\2\2\2\16]\3"+
		"\2\2\2\20_\3\2\2\2\22j\3\2\2\2\24t\3\2\2\2\26v\3\2\2\2\30y\3\2\2\2\32"+
		"}\3\2\2\2\34\u0084\3\2\2\2\36\u0093\3\2\2\2 \u0097\3\2\2\2\"\u009c\3\2"+
		"\2\2$\u009e\3\2\2\2&\u00a0\3\2\2\2(\u00a6\3\2\2\2*\u00b6\3\2\2\2,\u00ba"+
		"\3\2\2\2.\u00be\3\2\2\2\60\u00c1\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67\65\3\2\2\28;\5"+
		"\f\7\29;\5\n\6\2:8\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<=\t\2\2\2=\7\3\2\2\2>"+
		"?\t\3\2\2?\t\3\2\2\2@A\7\n\2\2AB\7^\2\2BC\7\67\2\2C\13\3\2\2\2DF\5\6\4"+
		"\2ED\3\2\2\2FI\3\2\2\2GH\3\2\2\2GE\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\3\2"+
		"\2KL\7^\2\2LM\7\61\2\2MN\5\16\b\2NQ\7\62\2\2OP\7Q\2\2PR\5$\23\2QO\3\2"+
		"\2\2QR\3\2\2\2RS\3\2\2\2ST\5\32\16\2T\r\3\2\2\2UZ\5\20\t\2VW\78\2\2WY"+
		"\5\20\t\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2]U\3\2\2\2]^\3\2\2\2^\17\3\2\2\2_`\7^\2\2`a\7@\2\2ab\5$\23\2b\21\3\2"+
		"\2\2ck\7\60\2\2dk\7-\2\2ek\7+\2\2fk\7/\2\2gk\7.\2\2hk\7^\2\2ik\5\26\f"+
		"\2jc\3\2\2\2jd\3\2\2\2je\3\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2"+
		"\2k\23\3\2\2\2lq\5\22\n\2mn\78\2\2np\5\22\n\2om\3\2\2\2ps\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2tu\3\2\2\2u\25\3\2\2\2v"+
		"w\7\f\2\2wx\7^\2\2x\27\3\2\2\2yz\7\13\2\2z{\7^\2\2{|\7\67\2\2|\31\3\2"+
		"\2\2}~\7\63\2\2~\177\5\34\17\2\177\u0080\7\64\2\2\u0080\33\3\2\2\2\u0081"+
		"\u0083\5\36\20\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0089\5 \21\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\35\3\2\2"+
		"\2\u008a\u008b\5 \21\2\u008b\u008c\7\67\2\2\u008c\u0094\3\2\2\2\u008d"+
		"\u0094\5*\26\2\u008e\u0094\5,\27\2\u008f\u0094\5.\30\2\u0090\u0094\5\60"+
		"\31\2\u0091\u0094\5\n\6\2\u0092\u0094\5\30\r\2\u0093\u008a\3\2\2\2\u0093"+
		"\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\37\3\2\2\2\u0095\u0098"+
		"\5(\25\2\u0096\u0098\5\"\22\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2"+
		"\u0098!\3\2\2\2\u0099\u009d\5&\24\2\u009a\u009d\7^\2\2\u009b\u009d\5\22"+
		"\n\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"#\3\2\2\2\u009e\u009f\t\4\2\2\u009f%\3\2\2\2\u00a0\u00a1\7^\2\2\u00a1"+
		"\u00a2\7\61\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\7\62\2\2\u00a4\'\3\2"+
		"\2\2\u00a5\u00a7\7\7\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00ab\3\2\2\2\u00a8\u00aa\5\b\5\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b1\7^\2\2\u00af\u00b0\7@\2\2\u00b0\u00b2\5$\23"+
		"\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4"+
		"\7:\2\2\u00b4\u00b5\5\"\22\2\u00b5)\3\2\2\2\u00b6\u00b7\7\24\2\2\u00b7"+
		"\u00b8\5 \21\2\u00b8\u00b9\5\32\16\2\u00b9+\3\2\2\2\u00ba\u00bb\7\26\2"+
		"\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\5\32\16\2\u00bd-\3\2\2\2\u00be\u00bf"+
		"\7\27\2\2\u00bf\u00c0\5\32\16\2\u00c0/\3\2\2\2\u00c1\u00c2\7\30\2\2\u00c2"+
		"\u00c3\7^\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c5\5 \21\2\u00c5\u00c6\5\32"+
		"\16\2\u00c6\61\3\2\2\2\23\65:GQZ]jqt\u0084\u0088\u0093\u0097\u009c\u00a6"+
		"\u00ab\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}