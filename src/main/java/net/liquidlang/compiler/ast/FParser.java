// Generated from C:/Users/gerar/OneDrive/Desktop/code/fluid-lang/compiler-core/src/main/resources\FParser.g4 by ANTLR 4.9.2
package net.liquidlang.compiler.ast;
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
		CONST=16, STATIC=17, RETURN=18, DROPLET=19, STRUCT=20, INTF=21, ENUM=22, 
		MODULE=23, IF=24, ELSE=25, WHILE=26, LOOP=27, FOR=28, IN=29, I8=30, I16=31, 
		I32=32, I64=33, I128=34, U8=35, U16=36, U32=37, U64=38, U128=39, F32=40, 
		F64=41, BOOL=42, STR=43, VOID=44, CHAR=45, WS=46, COMMENT=47, LINE_COMMENT=48, 
		IntegerLiteral=49, FloatingPointLiteral=50, BooleanLiteral=51, CharacterLiteral=52, 
		StringLiteral=53, NullLiteral=54, LPAREN=55, RPAREN=56, LBRACE=57, RBRACE=58, 
		LBRACK=59, RBRACK=60, SEMI=61, COMMA=62, DOT=63, ASSIGN=64, GT=65, LT=66, 
		BANG=67, TILDE=68, QUESTION=69, COLON=70, EQUAL=71, LE=72, GE=73, NOTEQUAL=74, 
		AND=75, OR=76, INC=77, DEC=78, ADD=79, SUB=80, MUL=81, DIV=82, BITAND=83, 
		BITOR=84, CARET=85, MOD=86, ARROW=87, COLONCOLON=88, ADD_ASSIGN=89, SUB_ASSIGN=90, 
		MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, XOR_ASSIGN=95, 
		MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		IDENTIFIER=100;
	public static final int
		RULE_compilationUnit = 0, RULE_line = 1, RULE_func_modifiers = 2, RULE_variable_modifiers = 3, 
		RULE_importStatement = 4, RULE_function = 5, RULE_functionSignature = 6, 
		RULE_parameterlessFunctionSignature = 7, RULE_formalParameterList = 8, 
		RULE_formalParameter = 9, RULE_typeList = 10, RULE_value = 11, RULE_passedParameterList = 12, 
		RULE_newStatement = 13, RULE_block = 14, RULE_body = 15, RULE_stmt = 16, 
		RULE_expr = 17, RULE_nullValueExprOperators = 18, RULE_valueExpr = 19, 
		RULE_functionType = 20, RULE_functionValue = 21, RULE_closure = 22, RULE_type = 23, 
		RULE_methodCall = 24, RULE_valuedMethodCall = 25, RULE_assignment = 26, 
		RULE_reassignment = 27, RULE_ifStatement = 28, RULE_elseIfStatement = 29, 
		RULE_elseStatement = 30, RULE_whileStatement = 31, RULE_loopStatement = 32, 
		RULE_forStatement = 33, RULE_returnStatement = 34, RULE_unsafeBlock = 35, 
		RULE_dropletBlock = 36, RULE_dropletVarModifiers = 37, RULE_dropletAssignment = 38, 
		RULE_dropletBody = 39, RULE_dropletDecl = 40, RULE_castType = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "line", "func_modifiers", "variable_modifiers", "importStatement", 
			"function", "functionSignature", "parameterlessFunctionSignature", "formalParameterList", 
			"formalParameter", "typeList", "value", "passedParameterList", "newStatement", 
			"block", "body", "stmt", "expr", "nullValueExprOperators", "valueExpr", 
			"functionType", "functionValue", "closure", "type", "methodCall", "valuedMethodCall", 
			"assignment", "reassignment", "ifStatement", "elseIfStatement", "elseStatement", 
			"whileStatement", "loopStatement", "forStatement", "returnStatement", 
			"unsafeBlock", "dropletBlock", "dropletVarModifiers", "dropletAssignment", 
			"dropletBody", "dropletDecl", "castType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'ext'", "'unsafe'", "'mut'", "'let'", "'async'", "'pub'", 
			"'import'", "'old'", "'new'", "'operator'", "'cast'", "'to'", "'inline'", 
			"'override'", "'const'", "'static'", "'return'", "'droplet'", "'struct'", 
			"'intf'", "'enum'", "'mod'", "'if'", "'else'", "'while'", "'loop'", "'for'", 
			"'in'", "'i8'", "'i16'", "'i32'", "'i64'", "'i128'", "'u8'", "'u16'", 
			"'u32'", "'u64'", "'u128'", "'f32'", "'f64'", "'bool'", "'str'", "'void'", 
			"'char'", null, null, null, null, null, null, null, null, "'null'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'%='", "'<<='", "'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "EXTERNAL", "UNSAFE", "MUTABLE", "LET", "ASYNC", "PUBLIC", 
			"IMPORT", "OLD", "NEW", "OPERATOR", "CAST", "TO", "INLINE", "OVERRIDE", 
			"CONST", "STATIC", "RETURN", "DROPLET", "STRUCT", "INTF", "ENUM", "MODULE", 
			"IF", "ELSE", "WHILE", "LOOP", "FOR", "IN", "I8", "I16", "I32", "I64", 
			"I128", "U8", "U16", "U32", "U64", "U128", "F32", "F64", "BOOL", "STR", 
			"VOID", "CHAR", "WS", "COMMENT", "LINE_COMMENT", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"IDENTIFIER"
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << EXTERNAL) | (1L << UNSAFE) | (1L << MUTABLE) | (1L << LET) | (1L << ASYNC) | (1L << PUBLIC) | (1L << IMPORT) | (1L << INLINE) | (1L << OVERRIDE) | (1L << STATIC) | (1L << DROPLET))) != 0)) {
				{
				{
				setState(84);
				line();
				}
				}
				setState(89);
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
		public DropletDeclContext dropletDecl() {
			return getRuleContext(DropletDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
			setState(94);
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
				setState(90);
				function();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				importStatement();
				}
				break;
			case DROPLET:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				dropletDecl();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				assignment();
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
			setState(96);
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
			setState(98);
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
		public List<TerminalNode> COLONCOLON() { return getTokens(FParser.COLONCOLON); }
		public TerminalNode COLONCOLON(int i) {
			return getToken(FParser.COLONCOLON, i);
		}
		public TerminalNode SEMI() { return getToken(FParser.SEMI, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FParser.IDENTIFIER, i);
		}
		public TerminalNode MODULE() { return getToken(FParser.MODULE, 0); }
		public List<TerminalNode> MUL() { return getTokens(FParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(FParser.MUL, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IMPORT);
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==MODULE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			match(COLONCOLON);
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLONCOLON) {
				{
				{
				setState(104);
				match(COLONCOLON);
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Func_modifiersContext> func_modifiers() {
			return getRuleContexts(Func_modifiersContext.class);
		}
		public Func_modifiersContext func_modifiers(int i) {
			return getRuleContext(Func_modifiersContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(113);
					func_modifiers();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(119);
			match(FUNCTION);
			setState(120);
			match(IDENTIFIER);
			setState(121);
			functionSignature();
			setState(122);
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

	public static class FunctionSignatureContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FParser.LPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(FParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LPAREN);
			setState(125);
			formalParameterList();
			setState(126);
			match(RPAREN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(127);
				match(ARROW);
				setState(128);
				type();
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

	public static class ParameterlessFunctionSignatureContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FParser.LPAREN, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(FParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterlessFunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlessFunctionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterParameterlessFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitParameterlessFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitParameterlessFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterlessFunctionSignatureContext parameterlessFunctionSignature() throws RecognitionException {
		ParameterlessFunctionSignatureContext _localctx = new ParameterlessFunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterlessFunctionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(LPAREN);
			setState(132);
			typeList();
			setState(133);
			match(RPAREN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(134);
				match(ARROW);
				setState(135);
				type();
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
		enterRule(_localctx, 16, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(138);
				formalParameter();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(139);
					match(COMMA);
					setState(140);
					formalParameter();
					}
					}
					setState(145);
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
		enterRule(_localctx, 18, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(COLON);
			setState(150);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			type();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				type();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(FParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(FParser.BooleanLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(FParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(FParser.StringLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(FParser.CharacterLiteral, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public FunctionValueContext functionValue() {
			return getRuleContext(FunctionValueContext.class,0);
		}
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(NullLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(BooleanLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(IntegerLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(CharacterLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				functionValue();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				closure();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				newStatement();
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

	public static class PassedParameterListContext extends ParserRuleContext {
		public List<ValueExprContext> valueExpr() {
			return getRuleContexts(ValueExprContext.class);
		}
		public ValueExprContext valueExpr(int i) {
			return getRuleContext(ValueExprContext.class,i);
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
		enterRule(_localctx, 24, RULE_passedParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << UNSAFE) | (1L << NEW) | (1L << I8) | (1L << I16) | (1L << I32) | (1L << I64) | (1L << I128) | (1L << U8) | (1L << U16) | (1L << U32) | (1L << U64) | (1L << U128) | (1L << F32) | (1L << F64) | (1L << BOOL) | (1L << STR) | (1L << VOID) | (1L << CHAR) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				setState(171);
				valueExpr();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(172);
					match(COMMA);
					setState(173);
					valueExpr();
					}
					}
					setState(178);
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
		enterRule(_localctx, 26, RULE_newStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(NEW);
			setState(182);
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
		enterRule(_localctx, 28, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(LBRACE);
			setState(185);
			body();
			setState(186);
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
		enterRule(_localctx, 30, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << UNSAFE) | (1L << LET) | (1L << IMPORT) | (1L << NEW) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << LOOP) | (1L << FOR) | (1L << I8) | (1L << I16) | (1L << I32) | (1L << I64) | (1L << I128) | (1L << U8) | (1L << U16) | (1L << U32) | (1L << U64) | (1L << U128) | (1L << F32) | (1L << F64) | (1L << BOOL) | (1L << STR) | (1L << VOID) | (1L << CHAR) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(188);
				stmt();
				}
				}
				setState(193);
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

	public static class StmtContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FParser.SEMI, 0); }
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
		public UnsafeBlockContext unsafeBlock() {
			return getRuleContext(UnsafeBlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		enterRule(_localctx, 32, RULE_stmt);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				expr();
				setState(196);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				importStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				unsafeBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				returnStatement();
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

	public static class ExprContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public ReassignmentContext reassignment() {
			return getRuleContext(ReassignmentContext.class,0);
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
		enterRule(_localctx, 34, RULE_expr);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				valueExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				reassignment();
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

	public static class NullValueExprOperatorsContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(FParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(FParser.TILDE, 0); }
		public NullValueExprOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueExprOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterNullValueExprOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitNullValueExprOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitNullValueExprOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueExprOperatorsContext nullValueExprOperators() throws RecognitionException {
		NullValueExprOperatorsContext _localctx = new NullValueExprOperatorsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nullValueExprOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==BANG || _la==TILDE) ) {
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

	public static class ValueExprContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CastTypeContext castType() {
			return getRuleContext(CastTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnsafeBlockContext unsafeBlock() {
			return getRuleContext(UnsafeBlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FParser.LPAREN, 0); }
		public List<NullValueExprOperatorsContext> nullValueExprOperators() {
			return getRuleContexts(NullValueExprOperatorsContext.class);
		}
		public NullValueExprOperatorsContext nullValueExprOperators(int i) {
			return getRuleContext(NullValueExprOperatorsContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(FParser.RPAREN, 0); }
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
		enterRule(_localctx, 38, RULE_valueExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(213);
				match(LPAREN);
				}
				break;
			}
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(216);
				methodCall();
				}
				break;
			case 2:
				{
				setState(217);
				value();
				}
				break;
			case 3:
				{
				setState(218);
				castType();
				}
				break;
			case 4:
				{
				setState(219);
				block();
				}
				break;
			case 5:
				{
				setState(220);
				unsafeBlock();
				}
				break;
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BANG || _la==TILDE) {
				{
				{
				setState(223);
				nullValueExprOperators();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(229);
				match(RPAREN);
				}
				break;
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FParser.FUNCTION, 0); }
		public ParameterlessFunctionSignatureContext parameterlessFunctionSignature() {
			return getRuleContext(ParameterlessFunctionSignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(FUNCTION);
			setState(233);
			parameterlessFunctionSignature();
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

	public static class FunctionValueContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public ParameterlessFunctionSignatureContext parameterlessFunctionSignature() {
			return getRuleContext(ParameterlessFunctionSignatureContext.class,0);
		}
		public FunctionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitFunctionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitFunctionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionValueContext functionValue() throws RecognitionException {
		FunctionValueContext _localctx = new FunctionValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(FUNCTION);
			setState(236);
			match(IDENTIFIER);
			setState(237);
			parameterlessFunctionSignature();
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

	public static class ClosureContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FParser.FUNCTION, 0); }
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitClosure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitClosure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureContext closure() throws RecognitionException {
		ClosureContext _localctx = new ClosureContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(FUNCTION);
			setState(240);
			functionSignature();
			setState(241);
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
		public TerminalNode VOID() { return getToken(FParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(FParser.CHAR, 0); }
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(FParser.BOOL, 0); }
		public TerminalNode QUESTION() { return getToken(FParser.QUESTION, 0); }
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
		enterRule(_localctx, 46, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(243);
				match(IDENTIFIER);
				}
				break;
			case I8:
				{
				setState(244);
				match(I8);
				}
				break;
			case I16:
				{
				setState(245);
				match(I16);
				}
				break;
			case I32:
				{
				setState(246);
				match(I32);
				}
				break;
			case I64:
				{
				setState(247);
				match(I64);
				}
				break;
			case I128:
				{
				setState(248);
				match(I128);
				}
				break;
			case U8:
				{
				setState(249);
				match(U8);
				}
				break;
			case U16:
				{
				setState(250);
				match(U16);
				}
				break;
			case U32:
				{
				setState(251);
				match(U32);
				}
				break;
			case U64:
				{
				setState(252);
				match(U64);
				}
				break;
			case U128:
				{
				setState(253);
				match(U128);
				}
				break;
			case F32:
				{
				setState(254);
				match(F32);
				}
				break;
			case F64:
				{
				setState(255);
				match(F64);
				}
				break;
			case STR:
				{
				setState(256);
				match(STR);
				}
				break;
			case VOID:
				{
				setState(257);
				match(VOID);
				}
				break;
			case CHAR:
				{
				setState(258);
				match(CHAR);
				}
				break;
			case FUNCTION:
				{
				setState(259);
				functionType();
				}
				break;
			case BOOL:
				{
				setState(260);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(263);
				match(QUESTION);
				}
				break;
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
		public TerminalNode ARROW() { return getToken(FParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValuedMethodCallContext valuedMethodCall() {
			return getRuleContext(ValuedMethodCallContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_methodCall);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(IDENTIFIER);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARROW) {
					{
					setState(267);
					match(ARROW);
					setState(268);
					type();
					}
				}

				setState(271);
				match(LPAREN);
				setState(272);
				passedParameterList();
				setState(273);
				match(RPAREN);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				valuedMethodCall();
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

	public static class ValuedMethodCallContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(FParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(FParser.LPAREN, i);
		}
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(FParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(FParser.RPAREN, i);
		}
		public PassedParameterListContext passedParameterList() {
			return getRuleContext(PassedParameterListContext.class,0);
		}
		public ValuedMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuedMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterValuedMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitValuedMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitValuedMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuedMethodCallContext valuedMethodCall() throws RecognitionException {
		ValuedMethodCallContext _localctx = new ValuedMethodCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_valuedMethodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LPAREN);
			setState(279);
			valueExpr();
			setState(280);
			match(RPAREN);
			setState(281);
			match(LPAREN);
			setState(282);
			passedParameterList();
			setState(283);
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
		public TerminalNode LET() { return getToken(FParser.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(FParser.ASSIGN, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LET);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUTABLE) | (1L << INLINE) | (1L << STATIC))) != 0)) {
				{
				{
				setState(286);
				variable_modifiers();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(IDENTIFIER);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(293);
				match(COLON);
				setState(294);
				type();
				}
			}

			setState(297);
			match(ASSIGN);
			setState(298);
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

	public static class ReassignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(FParser.ASSIGN, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public ReassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitReassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitReassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReassignmentContext reassignment() throws RecognitionException {
		ReassignmentContext _localctx = new ReassignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(IDENTIFIER);
			setState(301);
			match(ASSIGN);
			setState(302);
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
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
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
		enterRule(_localctx, 56, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IF);
			setState(305);
			valueExpr();
			setState(306);
			block();
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					elseIfStatement();
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(313);
				elseStatement();
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(FParser.IF, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(ELSE);
			setState(317);
			match(IF);
			setState(318);
			valueExpr();
			setState(319);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ELSE);
			setState(322);
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
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
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
		enterRule(_localctx, 62, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(WHILE);
			setState(325);
			valueExpr();
			setState(326);
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
		enterRule(_localctx, 64, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(LOOP);
			setState(329);
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
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
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
		enterRule(_localctx, 66, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(FOR);
			setState(332);
			match(IDENTIFIER);
			setState(333);
			match(IN);
			setState(334);
			valueExpr();
			setState(335);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(FParser.SEMI, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(RETURN);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << UNSAFE) | (1L << NEW) | (1L << I8) | (1L << I16) | (1L << I32) | (1L << I64) | (1L << I128) | (1L << U8) | (1L << U16) | (1L << U32) | (1L << U64) | (1L << U128) | (1L << F32) | (1L << F64) | (1L << BOOL) | (1L << STR) | (1L << VOID) | (1L << CHAR) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				setState(338);
				valueExpr();
				}
			}

			setState(341);
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

	public static class UnsafeBlockContext extends ParserRuleContext {
		public TerminalNode UNSAFE() { return getToken(FParser.UNSAFE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnsafeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsafeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterUnsafeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitUnsafeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitUnsafeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsafeBlockContext unsafeBlock() throws RecognitionException {
		UnsafeBlockContext _localctx = new UnsafeBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unsafeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(UNSAFE);
			setState(344);
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

	public static class DropletBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FParser.LBRACE, 0); }
		public DropletBodyContext dropletBody() {
			return getRuleContext(DropletBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FParser.RBRACE, 0); }
		public DropletBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropletBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterDropletBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitDropletBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitDropletBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropletBlockContext dropletBlock() throws RecognitionException {
		DropletBlockContext _localctx = new DropletBlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dropletBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(LBRACE);
			setState(347);
			dropletBody();
			setState(348);
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

	public static class DropletVarModifiersContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(FParser.STATIC, 0); }
		public TerminalNode MUTABLE() { return getToken(FParser.MUTABLE, 0); }
		public DropletVarModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropletVarModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterDropletVarModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitDropletVarModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitDropletVarModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropletVarModifiersContext dropletVarModifiers() throws RecognitionException {
		DropletVarModifiersContext _localctx = new DropletVarModifiersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dropletVarModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==MUTABLE || _la==STATIC) ) {
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

	public static class DropletAssignmentContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(FParser.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(FParser.ASSIGN, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public List<DropletVarModifiersContext> dropletVarModifiers() {
			return getRuleContexts(DropletVarModifiersContext.class);
		}
		public DropletVarModifiersContext dropletVarModifiers(int i) {
			return getRuleContext(DropletVarModifiersContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DropletAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropletAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterDropletAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitDropletAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitDropletAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropletAssignmentContext dropletAssignment() throws RecognitionException {
		DropletAssignmentContext _localctx = new DropletAssignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dropletAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(LET);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUTABLE || _la==STATIC) {
				{
				{
				setState(353);
				dropletVarModifiers();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(IDENTIFIER);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(360);
				match(COLON);
				setState(361);
				type();
				}
			}

			setState(364);
			match(ASSIGN);
			setState(365);
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

	public static class DropletBodyContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<DropletAssignmentContext> dropletAssignment() {
			return getRuleContexts(DropletAssignmentContext.class);
		}
		public DropletAssignmentContext dropletAssignment(int i) {
			return getRuleContext(DropletAssignmentContext.class,i);
		}
		public DropletBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropletBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterDropletBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitDropletBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitDropletBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropletBodyContext dropletBody() throws RecognitionException {
		DropletBodyContext _localctx = new DropletBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dropletBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << EXTERNAL) | (1L << UNSAFE) | (1L << MUTABLE) | (1L << LET) | (1L << ASYNC) | (1L << PUBLIC) | (1L << INLINE) | (1L << OVERRIDE) | (1L << STATIC))) != 0)) {
				{
				setState(369);
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
					{
					setState(367);
					function();
					}
					break;
				case LET:
					{
					setState(368);
					dropletAssignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(373);
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

	public static class DropletDeclContext extends ParserRuleContext {
		public TerminalNode DROPLET() { return getToken(FParser.DROPLET, 0); }
		public DropletBlockContext dropletBlock() {
			return getRuleContext(DropletBlockContext.class,0);
		}
		public DropletDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropletDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterDropletDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitDropletDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitDropletDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropletDeclContext dropletDecl() throws RecognitionException {
		DropletDeclContext _localctx = new DropletDeclContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dropletDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(DROPLET);
			setState(375);
			dropletBlock();
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

	public static class CastTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FParser.LPAREN, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FParser.RPAREN, 0); }
		public CastTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).enterCastType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FParserListener ) ((FParserListener)listener).exitCastType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FParserVisitor ) return ((FParserVisitor<? extends T>)visitor).visitCastType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTypeContext castType() throws RecognitionException {
		CastTypeContext _localctx = new CastTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_castType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			type();
			setState(378);
			match(LPAREN);
			setState(379);
			valueExpr();
			setState(380);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3f\u0181\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\7\2X\n\2\f\2\16\2[\13\2\3\3\3\3\3\3\3\3\5\3a\n\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3\7\7\7u\n\7\f"+
		"\7\16\7x\13\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0084\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16\n\u0093"+
		"\13\n\5\n\u0095\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u009e\n\f\f\f"+
		"\16\f\u00a1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\16"+
		"\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4\13\16\5\16\u00b6\n\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\7\21\u00c0\n\21\f\21\16\21\u00c3\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cf\n\22"+
		"\3\23\3\23\3\23\5\23\u00d4\n\23\3\24\3\24\3\25\5\25\u00d9\n\25\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u00e0\n\25\3\25\7\25\u00e3\n\25\f\25\16\25\u00e6"+
		"\13\25\3\25\5\25\u00e9\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0108\n\31\3\31\5\31\u010b\n\31"+
		"\3\32\3\32\3\32\5\32\u0110\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u0117\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u0122\n\34\f\34"+
		"\16\34\u0125\13\34\3\34\3\34\3\34\5\34\u012a\n\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0137\n\36\f\36\16\36\u013a\13"+
		"\36\3\36\5\36\u013d\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\5$\u0156\n$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3&\3\'\3\'\3(\3(\7(\u0165\n(\f(\16(\u0168\13(\3(\3(\3(\5(\u016d\n"+
		"(\3(\3(\3(\3)\3)\7)\u0174\n)\f)\16)\u0177\13)\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3v\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRT\2\b\6\2\4\6\b\t\20\21\23\23\5\2\6\6\20\20\23\23\4\2\31"+
		"\31ff\4\2SSff\3\2EF\4\2\6\6\23\23\2\u0199\2Y\3\2\2\2\4`\3\2\2\2\6b\3\2"+
		"\2\2\bd\3\2\2\2\nf\3\2\2\2\fv\3\2\2\2\16~\3\2\2\2\20\u0085\3\2\2\2\22"+
		"\u0094\3\2\2\2\24\u0096\3\2\2\2\26\u009a\3\2\2\2\30\u00ab\3\2\2\2\32\u00b5"+
		"\3\2\2\2\34\u00b7\3\2\2\2\36\u00ba\3\2\2\2 \u00c1\3\2\2\2\"\u00ce\3\2"+
		"\2\2$\u00d3\3\2\2\2&\u00d5\3\2\2\2(\u00d8\3\2\2\2*\u00ea\3\2\2\2,\u00ed"+
		"\3\2\2\2.\u00f1\3\2\2\2\60\u0107\3\2\2\2\62\u0116\3\2\2\2\64\u0118\3\2"+
		"\2\2\66\u011f\3\2\2\28\u012e\3\2\2\2:\u0132\3\2\2\2<\u013e\3\2\2\2>\u0143"+
		"\3\2\2\2@\u0146\3\2\2\2B\u014a\3\2\2\2D\u014d\3\2\2\2F\u0153\3\2\2\2H"+
		"\u0159\3\2\2\2J\u015c\3\2\2\2L\u0160\3\2\2\2N\u0162\3\2\2\2P\u0175\3\2"+
		"\2\2R\u0178\3\2\2\2T\u017b\3\2\2\2VX\5\4\3\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\3\3\2\2\2[Y\3\2\2\2\\a\5\f\7\2]a\5\n\6\2^a\5R*\2_a\5\66"+
		"\34\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\5\3\2\2\2bc\t\2\2\2c\7"+
		"\3\2\2\2de\t\3\2\2e\t\3\2\2\2fg\7\n\2\2gh\t\4\2\2hi\7Z\2\2in\t\5\2\2j"+
		"k\7Z\2\2km\t\5\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2p"+
		"n\3\2\2\2qr\7?\2\2r\13\3\2\2\2su\5\6\4\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2"+
		"vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\3\2\2z{\7f\2\2{|\5\16\b\2|}\5\36\20"+
		"\2}\r\3\2\2\2~\177\79\2\2\177\u0080\5\22\n\2\u0080\u0083\7:\2\2\u0081"+
		"\u0082\7Y\2\2\u0082\u0084\5\60\31\2\u0083\u0081\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\17\3\2\2\2\u0085\u0086\79\2\2\u0086\u0087\5\26\f\2\u0087"+
		"\u008a\7:\2\2\u0088\u0089\7Y\2\2\u0089\u008b\5\60\31\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\21\3\2\2\2\u008c\u0091\5\24\13\2\u008d"+
		"\u008e\7@\2\2\u008e\u0090\5\24\13\2\u008f\u008d\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u0095\3\2\2\2\u0095\23\3\2\2"+
		"\2\u0096\u0097\7f\2\2\u0097\u0098\7H\2\2\u0098\u0099\5\60\31\2\u0099\25"+
		"\3\2\2\2\u009a\u009f\5\60\31\2\u009b\u009c\7@\2\2\u009c\u009e\5\60\31"+
		"\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00ac\78\2\2\u00a3"+
		"\u00ac\7\65\2\2\u00a4\u00ac\7\63\2\2\u00a5\u00ac\7\67\2\2\u00a6\u00ac"+
		"\7\66\2\2\u00a7\u00ac\7f\2\2\u00a8\u00ac\5,\27\2\u00a9\u00ac\5.\30\2\u00aa"+
		"\u00ac\5\34\17\2\u00ab\u00a2\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a4\3"+
		"\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\31\3\2\2"+
		"\2\u00ad\u00b2\5(\25\2\u00ae\u00af\7@\2\2\u00af\u00b1\5(\25\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9\7f\2\2\u00b9\35"+
		"\3\2\2\2\u00ba\u00bb\7;\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\7<\2\2\u00bd"+
		"\37\3\2\2\2\u00be\u00c0\5\"\22\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2"+
		"\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2!\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00cf\5:\36\2\u00c5\u00c6\5$\23\2\u00c6\u00c7\7?\2\2\u00c7"+
		"\u00cf\3\2\2\2\u00c8\u00cf\5@!\2\u00c9\u00cf\5B\"\2\u00ca\u00cf\5D#\2"+
		"\u00cb\u00cf\5\n\6\2\u00cc\u00cf\5H%\2\u00cd\u00cf\5F$\2\u00ce\u00c4\3"+
		"\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce"+
		"\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2"+
		"\2\2\u00cf#\3\2\2\2\u00d0\u00d4\5\66\34\2\u00d1\u00d4\5(\25\2\u00d2\u00d4"+
		"\58\35\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"%\3\2\2\2\u00d5\u00d6\t\6\2\2\u00d6\'\3\2\2\2\u00d7\u00d9\79\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00df\3\2\2\2\u00da\u00e0\5\62"+
		"\32\2\u00db\u00e0\5\30\r\2\u00dc\u00e0\5T+\2\u00dd\u00e0\5\36\20\2\u00de"+
		"\u00e0\5H%\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3"+
		"\5&\24\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\7:"+
		"\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9)\3\2\2\2\u00ea\u00eb"+
		"\7\3\2\2\u00eb\u00ec\5\20\t\2\u00ec+\3\2\2\2\u00ed\u00ee\7\3\2\2\u00ee"+
		"\u00ef\7f\2\2\u00ef\u00f0\5\20\t\2\u00f0-\3\2\2\2\u00f1\u00f2\7\3\2\2"+
		"\u00f2\u00f3\5\16\b\2\u00f3\u00f4\5\36\20\2\u00f4/\3\2\2\2\u00f5\u0108"+
		"\7f\2\2\u00f6\u0108\7 \2\2\u00f7\u0108\7!\2\2\u00f8\u0108\7\"\2\2\u00f9"+
		"\u0108\7#\2\2\u00fa\u0108\7$\2\2\u00fb\u0108\7%\2\2\u00fc\u0108\7&\2\2"+
		"\u00fd\u0108\7\'\2\2\u00fe\u0108\7(\2\2\u00ff\u0108\7)\2\2\u0100\u0108"+
		"\7*\2\2\u0101\u0108\7+\2\2\u0102\u0108\7-\2\2\u0103\u0108\7.\2\2\u0104"+
		"\u0108\7/\2\2\u0105\u0108\5*\26\2\u0106\u0108\7,\2\2\u0107\u00f5\3\2\2"+
		"\2\u0107\u00f6\3\2\2\2\u0107\u00f7\3\2\2\2\u0107\u00f8\3\2\2\2\u0107\u00f9"+
		"\3\2\2\2\u0107\u00fa\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u00fc\3\2\2\2\u0107"+
		"\u00fd\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2"+
		"\2\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107"+
		"\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u010b\7G\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\61\3\2\2\2\u010c\u010f\7f\2\2\u010d\u010e\7Y\2\2\u010e\u0110\5\60\31"+
		"\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\79\2\2\u0112\u0113\5\32\16\2\u0113\u0114\7:\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0117\5\64\33\2\u0116\u010c\3\2\2\2\u0116\u0115\3\2\2\2\u0117\63\3\2"+
		"\2\2\u0118\u0119\79\2\2\u0119\u011a\5(\25\2\u011a\u011b\7:\2\2\u011b\u011c"+
		"\79\2\2\u011c\u011d\5\32\16\2\u011d\u011e\7:\2\2\u011e\65\3\2\2\2\u011f"+
		"\u0123\7\7\2\2\u0120\u0122\5\b\5\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0129\7f\2\2\u0127\u0128\7H\2\2\u0128\u012a\5\60"+
		"\31\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\7B\2\2\u012c\u012d\5(\25\2\u012d\67\3\2\2\2\u012e\u012f\7f\2\2"+
		"\u012f\u0130\7B\2\2\u0130\u0131\5(\25\2\u01319\3\2\2\2\u0132\u0133\7\32"+
		"\2\2\u0133\u0134\5(\25\2\u0134\u0138\5\36\20\2\u0135\u0137\5<\37\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\5> \2\u013c\u013b"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d;\3\2\2\2\u013e\u013f\7\33\2\2\u013f"+
		"\u0140\7\32\2\2\u0140\u0141\5(\25\2\u0141\u0142\5\36\20\2\u0142=\3\2\2"+
		"\2\u0143\u0144\7\33\2\2\u0144\u0145\5\36\20\2\u0145?\3\2\2\2\u0146\u0147"+
		"\7\34\2\2\u0147\u0148\5(\25\2\u0148\u0149\5\36\20\2\u0149A\3\2\2\2\u014a"+
		"\u014b\7\35\2\2\u014b\u014c\5\36\20\2\u014cC\3\2\2\2\u014d\u014e\7\36"+
		"\2\2\u014e\u014f\7f\2\2\u014f\u0150\7\37\2\2\u0150\u0151\5(\25\2\u0151"+
		"\u0152\5\36\20\2\u0152E\3\2\2\2\u0153\u0155\7\24\2\2\u0154\u0156\5(\25"+
		"\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158"+
		"\7?\2\2\u0158G\3\2\2\2\u0159\u015a\7\5\2\2\u015a\u015b\5\36\20\2\u015b"+
		"I\3\2\2\2\u015c\u015d\7;\2\2\u015d\u015e\5P)\2\u015e\u015f\7<\2\2\u015f"+
		"K\3\2\2\2\u0160\u0161\t\7\2\2\u0161M\3\2\2\2\u0162\u0166\7\7\2\2\u0163"+
		"\u0165\5L\'\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016c\7f\2\2\u016a\u016b\7H\2\2\u016b\u016d\5\60\31\2\u016c\u016a\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7B\2\2\u016f"+
		"\u0170\5(\25\2\u0170O\3\2\2\2\u0171\u0174\5\f\7\2\u0172\u0174\5N(\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176Q\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179"+
		"\7\25\2\2\u0179\u017a\5J&\2\u017aS\3\2\2\2\u017b\u017c\5\60\31\2\u017c"+
		"\u017d\79\2\2\u017d\u017e\5(\25\2\u017e\u017f\7:\2\2\u017fU\3\2\2\2\""+
		"Y`nv\u0083\u008a\u0091\u0094\u009f\u00ab\u00b2\u00b5\u00c1\u00ce\u00d3"+
		"\u00d8\u00df\u00e4\u00e8\u0107\u010a\u010f\u0116\u0123\u0129\u0138\u013c"+
		"\u0155\u0166\u016c\u0173\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}