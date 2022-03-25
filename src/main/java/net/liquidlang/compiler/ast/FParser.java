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
		RULE_formalParameterList = 7, RULE_formalParameter = 8, RULE_value = 9, 
		RULE_passedParameterList = 10, RULE_newStatement = 11, RULE_oldStatement = 12, 
		RULE_block = 13, RULE_body = 14, RULE_stmt = 15, RULE_expr = 16, RULE_valueExpr = 17, 
		RULE_functionType = 18, RULE_functionValue = 19, RULE_type = 20, RULE_methodCall = 21, 
		RULE_assignment = 22, RULE_reassignment = 23, RULE_ifStatement = 24, RULE_elseIfStatement = 25, 
		RULE_elseStatement = 26, RULE_whileStatement = 27, RULE_loopStatement = 28, 
		RULE_forStatement = 29, RULE_returnStatement = 30, RULE_dropletBlock = 31, 
		RULE_dropletVarModifiers = 32, RULE_dropletAssignment = 33, RULE_dropletBody = 34, 
		RULE_dropletDecl = 35, RULE_castType = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "line", "func_modifiers", "variable_modifiers", "importStatement", 
			"function", "functionSignature", "formalParameterList", "formalParameter", 
			"value", "passedParameterList", "newStatement", "oldStatement", "block", 
			"body", "stmt", "expr", "valueExpr", "functionType", "functionValue", 
			"type", "methodCall", "assignment", "reassignment", "ifStatement", "elseIfStatement", 
			"elseStatement", "whileStatement", "loopStatement", "forStatement", "returnStatement", 
			"dropletBlock", "dropletVarModifiers", "dropletAssignment", "dropletBody", 
			"dropletDecl", "castType"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << EXTERNAL) | (1L << UNSAFE) | (1L << MUTABLE) | (1L << LET) | (1L << ASYNC) | (1L << PUBLIC) | (1L << IMPORT) | (1L << INLINE) | (1L << OVERRIDE) | (1L << STATIC) | (1L << DROPLET))) != 0)) {
				{
				{
				setState(74);
				line();
				}
				}
				setState(79);
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
			setState(84);
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
				setState(80);
				function();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				importStatement();
				}
				break;
			case DROPLET:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				dropletDecl();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
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
			setState(86);
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
			setState(88);
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
			setState(90);
			match(IMPORT);
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==MODULE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			match(COLONCOLON);
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLONCOLON) {
				{
				{
				setState(94);
				match(COLONCOLON);
				setState(95);
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
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(103);
					func_modifiers();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(109);
			match(FUNCTION);
			setState(110);
			match(IDENTIFIER);
			setState(111);
			functionSignature();
			setState(112);
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
			setState(114);
			match(LPAREN);
			setState(115);
			formalParameterList();
			setState(116);
			match(RPAREN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(117);
				match(ARROW);
				setState(118);
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
		enterRule(_localctx, 14, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(121);
				formalParameter();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(123);
					formalParameter();
					}
					}
					setState(128);
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
		enterRule(_localctx, 16, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(COLON);
			setState(133);
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
		public FunctionValueContext functionValue() {
			return getRuleContext(FunctionValueContext.class,0);
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
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(BooleanLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(IntegerLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(StringLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(CharacterLiteral);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				match(IDENTIFIER);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				functionValue();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
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
		enterRule(_localctx, 20, RULE_passedParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << NEW) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || _la==IDENTIFIER) {
				{
				setState(145);
				value();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(146);
					match(COMMA);
					setState(147);
					value();
					}
					}
					setState(152);
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
		enterRule(_localctx, 22, RULE_newStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(NEW);
			setState(156);
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
		enterRule(_localctx, 24, RULE_oldStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(OLD);
			setState(159);
			match(IDENTIFIER);
			setState(160);
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
		enterRule(_localctx, 26, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LBRACE);
			setState(163);
			body();
			setState(164);
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
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		enterRule(_localctx, 28, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					stmt();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << NEW) | (1L << RETURN) | (1L << I8) | (1L << I16) | (1L << I32) | (1L << I64) | (1L << I128) | (1L << U8) | (1L << U16) | (1L << U32) | (1L << U64) | (1L << U128) | (1L << F32) | (1L << F64) | (1L << BOOL) | (1L << STR) | (1L << VOID) | (1L << CHAR) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || _la==IDENTIFIER) {
				{
				setState(172);
				returnStatement();
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
		enterRule(_localctx, 30, RULE_stmt);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				ifStatement();
				}
				break;
			case FUNCTION:
			case LET:
			case NEW:
			case I8:
			case I16:
			case I32:
			case I64:
			case I128:
			case U8:
			case U16:
			case U32:
			case U64:
			case U128:
			case F32:
			case F64:
			case BOOL:
			case STR:
			case VOID:
			case CHAR:
			case IntegerLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				expr();
				setState(177);
				match(SEMI);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				whileStatement();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				loopStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				forStatement();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				importStatement();
				}
				break;
			case OLD:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
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
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				valueExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
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
		enterRule(_localctx, 34, RULE_valueExpr);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				castType();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FParser.FUNCTION, 0); }
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
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
		enterRule(_localctx, 36, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(FUNCTION);
			setState(197);
			functionSignature();
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
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
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
		enterRule(_localctx, 38, RULE_functionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(FUNCTION);
			setState(200);
			match(IDENTIFIER);
			setState(201);
			functionSignature();
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
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(IDENTIFIER);
				}
				break;
			case I8:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(I8);
				}
				break;
			case I16:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(I16);
				}
				break;
			case I32:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(I32);
				}
				break;
			case I64:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				match(I64);
				}
				break;
			case I128:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				match(I128);
				}
				break;
			case U8:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(U8);
				}
				break;
			case U16:
				enterOuterAlt(_localctx, 8);
				{
				setState(210);
				match(U16);
				}
				break;
			case U32:
				enterOuterAlt(_localctx, 9);
				{
				setState(211);
				match(U32);
				}
				break;
			case U64:
				enterOuterAlt(_localctx, 10);
				{
				setState(212);
				match(U64);
				}
				break;
			case U128:
				enterOuterAlt(_localctx, 11);
				{
				setState(213);
				match(U128);
				}
				break;
			case F32:
				enterOuterAlt(_localctx, 12);
				{
				setState(214);
				match(F32);
				}
				break;
			case F64:
				enterOuterAlt(_localctx, 13);
				{
				setState(215);
				match(F64);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 14);
				{
				setState(216);
				match(STR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 15);
				{
				setState(217);
				match(VOID);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(218);
				match(CHAR);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 17);
				{
				setState(219);
				functionType();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 18);
				{
				setState(220);
				match(BOOL);
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
		enterRule(_localctx, 42, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IDENTIFIER);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(224);
				match(ARROW);
				setState(225);
				type();
				}
			}

			setState(228);
			match(LPAREN);
			setState(229);
			passedParameterList();
			setState(230);
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
		enterRule(_localctx, 44, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LET);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUTABLE) | (1L << INLINE) | (1L << STATIC))) != 0)) {
				{
				{
				setState(233);
				variable_modifiers();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(IDENTIFIER);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(240);
				match(COLON);
				setState(241);
				type();
				}
			}

			setState(244);
			match(ASSIGN);
			setState(245);
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
		enterRule(_localctx, 46, RULE_reassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IDENTIFIER);
			setState(248);
			match(ASSIGN);
			setState(249);
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
		enterRule(_localctx, 48, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IF);
			setState(252);
			valueExpr();
			setState(253);
			block();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					elseIfStatement();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(260);
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
		enterRule(_localctx, 50, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ELSE);
			setState(264);
			match(IF);
			setState(265);
			valueExpr();
			setState(266);
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
		enterRule(_localctx, 52, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ELSE);
			setState(269);
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
		enterRule(_localctx, 54, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(WHILE);
			setState(272);
			valueExpr();
			setState(273);
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
		enterRule(_localctx, 56, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LOOP);
			setState(276);
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
		enterRule(_localctx, 58, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(FOR);
			setState(279);
			match(IDENTIFIER);
			setState(280);
			match(IN);
			setState(281);
			valueExpr();
			setState(282);
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
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FParser.SEMI, 0); }
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
		enterRule(_localctx, 60, RULE_returnStatement);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(RETURN);
				setState(285);
				valueExpr();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(286);
					match(SEMI);
					}
				}

				}
				break;
			case FUNCTION:
			case NEW:
			case I8:
			case I16:
			case I32:
			case I64:
			case I128:
			case U8:
			case U16:
			case U32:
			case U64:
			case U128:
			case F32:
			case F64:
			case BOOL:
			case STR:
			case VOID:
			case CHAR:
			case IntegerLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				valueExpr();
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
		enterRule(_localctx, 62, RULE_dropletBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LBRACE);
			setState(293);
			dropletBody();
			setState(294);
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
		enterRule(_localctx, 64, RULE_dropletVarModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		enterRule(_localctx, 66, RULE_dropletAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(LET);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUTABLE || _la==STATIC) {
				{
				{
				setState(299);
				dropletVarModifiers();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(IDENTIFIER);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(306);
				match(COLON);
				setState(307);
				type();
				}
			}

			setState(310);
			match(ASSIGN);
			setState(311);
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
		enterRule(_localctx, 68, RULE_dropletBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << EXTERNAL) | (1L << UNSAFE) | (1L << MUTABLE) | (1L << LET) | (1L << ASYNC) | (1L << PUBLIC) | (1L << INLINE) | (1L << OVERRIDE) | (1L << STATIC))) != 0)) {
				{
				setState(315);
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
					setState(313);
					function();
					}
					break;
				case LET:
					{
					setState(314);
					dropletAssignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(319);
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
		enterRule(_localctx, 70, RULE_dropletDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(DROPLET);
			setState(321);
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
		public TerminalNode LBRACE() { return getToken(FParser.LBRACE, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FParser.RBRACE, 0); }
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
		enterRule(_localctx, 72, RULE_castType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			type();
			setState(324);
			match(LBRACE);
			setState(325);
			valueExpr();
			setState(326);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3f\u014b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3"+
		"\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6c\n\6\f"+
		"\6\16\6f\13\6\3\6\3\6\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13"+
		"\t\5\t\u0084\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0092\n\13\3\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13\f\5\f"+
		"\u009c\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\7"+
		"\20\u00aa\n\20\f\20\16\20\u00ad\13\20\3\20\5\20\u00b0\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bb\n\21\3\22\3\22\3\22\5\22"+
		"\u00c0\n\22\3\23\3\23\3\23\5\23\u00c5\n\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e0\n\26\3\27\3\27\3\27\5\27\u00e5"+
		"\n\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u00ed\n\30\f\30\16\30\u00f0\13"+
		"\30\3\30\3\30\3\30\5\30\u00f5\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\7\32\u0102\n\32\f\32\16\32\u0105\13\32\3\32\5\32"+
		"\u0108\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u0122\n \3 "+
		"\5 \u0125\n \3!\3!\3!\3!\3\"\3\"\3#\3#\7#\u012f\n#\f#\16#\u0132\13#\3"+
		"#\3#\3#\5#\u0137\n#\3#\3#\3#\3$\3$\7$\u013e\n$\f$\16$\u0141\13$\3%\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\3l\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJ\2\7\6\2\4\6\b\t\20\21\23\23\5\2\6\6\20\20"+
		"\23\23\4\2\31\31ff\4\2SSff\4\2\6\6\23\23\2\u015f\2O\3\2\2\2\4V\3\2\2\2"+
		"\6X\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2\fl\3\2\2\2\16t\3\2\2\2\20\u0083\3\2"+
		"\2\2\22\u0085\3\2\2\2\24\u0091\3\2\2\2\26\u009b\3\2\2\2\30\u009d\3\2\2"+
		"\2\32\u00a0\3\2\2\2\34\u00a4\3\2\2\2\36\u00ab\3\2\2\2 \u00ba\3\2\2\2\""+
		"\u00bf\3\2\2\2$\u00c4\3\2\2\2&\u00c6\3\2\2\2(\u00c9\3\2\2\2*\u00df\3\2"+
		"\2\2,\u00e1\3\2\2\2.\u00ea\3\2\2\2\60\u00f9\3\2\2\2\62\u00fd\3\2\2\2\64"+
		"\u0109\3\2\2\2\66\u010e\3\2\2\28\u0111\3\2\2\2:\u0115\3\2\2\2<\u0118\3"+
		"\2\2\2>\u0124\3\2\2\2@\u0126\3\2\2\2B\u012a\3\2\2\2D\u012c\3\2\2\2F\u013f"+
		"\3\2\2\2H\u0142\3\2\2\2J\u0145\3\2\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2O"+
		"M\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QO\3\2\2\2RW\5\f\7\2SW\5\n\6\2TW\5H%\2U"+
		"W\5.\30\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\5\3\2\2\2XY\t\2\2\2"+
		"Y\7\3\2\2\2Z[\t\3\2\2[\t\3\2\2\2\\]\7\n\2\2]^\t\4\2\2^_\7Z\2\2_d\t\5\2"+
		"\2`a\7Z\2\2ac\t\5\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2"+
		"\2fd\3\2\2\2gh\7?\2\2h\13\3\2\2\2ik\5\6\4\2ji\3\2\2\2kn\3\2\2\2lm\3\2"+
		"\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\3\2\2pq\7f\2\2qr\5\16\b\2rs\5\34"+
		"\17\2s\r\3\2\2\2tu\79\2\2uv\5\20\t\2vy\7:\2\2wx\7Y\2\2xz\5*\26\2yw\3\2"+
		"\2\2yz\3\2\2\2z\17\3\2\2\2{\u0080\5\22\n\2|}\7@\2\2}\177\5\22\n\2~|\3"+
		"\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083{\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\21\3\2\2\2\u0085\u0086\7f\2\2\u0086\u0087\7H\2\2\u0087\u0088\5*\26\2"+
		"\u0088\23\3\2\2\2\u0089\u0092\78\2\2\u008a\u0092\7\65\2\2\u008b\u0092"+
		"\7\63\2\2\u008c\u0092\7\67\2\2\u008d\u0092\7\66\2\2\u008e\u0092\7f\2\2"+
		"\u008f\u0092\5(\25\2\u0090\u0092\5\30\r\2\u0091\u0089\3\2\2\2\u0091\u008a"+
		"\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\25\3\2\2"+
		"\2\u0093\u0098\5\24\13\2\u0094\u0095\7@\2\2\u0095\u0097\5\24\13\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u0093\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d\u009e\7\f\2\2\u009e\u009f\7f\2\2"+
		"\u009f\31\3\2\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3"+
		"\7?\2\2\u00a3\33\3\2\2\2\u00a4\u00a5\7;\2\2\u00a5\u00a6\5\36\20\2\u00a6"+
		"\u00a7\7<\2\2\u00a7\35\3\2\2\2\u00a8\u00aa\5 \21\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\5> \2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\37\3\2\2\2\u00b1\u00bb\5\62\32\2\u00b2\u00b3\5\""+
		"\22\2\u00b3\u00b4\7?\2\2\u00b4\u00bb\3\2\2\2\u00b5\u00bb\58\35\2\u00b6"+
		"\u00bb\5:\36\2\u00b7\u00bb\5<\37\2\u00b8\u00bb\5\n\6\2\u00b9\u00bb\5\32"+
		"\16\2\u00ba\u00b1\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba"+
		"\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb!\3\2\2\2\u00bc\u00c0\5.\30\2\u00bd\u00c0\5$\23\2\u00be\u00c0"+
		"\5\60\31\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0#\3\2\2\2\u00c1\u00c5\5,\27\2\u00c2\u00c5\5\24\13\2\u00c3\u00c5"+
		"\5J&\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"%\3\2\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8\5\16\b\2\u00c8\'\3\2\2\2\u00c9"+
		"\u00ca\7\3\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\5\16\b\2\u00cc)\3\2\2\2"+
		"\u00cd\u00e0\7f\2\2\u00ce\u00e0\7 \2\2\u00cf\u00e0\7!\2\2\u00d0\u00e0"+
		"\7\"\2\2\u00d1\u00e0\7#\2\2\u00d2\u00e0\7$\2\2\u00d3\u00e0\7%\2\2\u00d4"+
		"\u00e0\7&\2\2\u00d5\u00e0\7\'\2\2\u00d6\u00e0\7(\2\2\u00d7\u00e0\7)\2"+
		"\2\u00d8\u00e0\7*\2\2\u00d9\u00e0\7+\2\2\u00da\u00e0\7-\2\2\u00db\u00e0"+
		"\7.\2\2\u00dc\u00e0\7/\2\2\u00dd\u00e0\5&\24\2\u00de\u00e0\7,\2\2\u00df"+
		"\u00cd\3\2\2\2\u00df\u00ce\3\2\2\2\u00df\u00cf\3\2\2\2\u00df\u00d0\3\2"+
		"\2\2\u00df\u00d1\3\2\2\2\u00df\u00d2\3\2\2\2\u00df\u00d3\3\2\2\2\u00df"+
		"\u00d4\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d7\3\2"+
		"\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00da\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2"+
		"\2\2\u00e0+\3\2\2\2\u00e1\u00e4\7f\2\2\u00e2\u00e3\7Y\2\2\u00e3\u00e5"+
		"\5*\26\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\79\2\2\u00e7\u00e8\5\26\f\2\u00e8\u00e9\7:\2\2\u00e9-\3\2\2\2\u00ea"+
		"\u00ee\7\7\2\2\u00eb\u00ed\5\b\5\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f4\7f\2\2\u00f2\u00f3\7H\2\2\u00f3\u00f5\5*\26"+
		"\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\7B\2\2\u00f7\u00f8\5$\23\2\u00f8/\3\2\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb"+
		"\7B\2\2\u00fb\u00fc\5$\23\2\u00fc\61\3\2\2\2\u00fd\u00fe\7\32\2\2\u00fe"+
		"\u00ff\5$\23\2\u00ff\u0103\5\34\17\2\u0100\u0102\5\64\33\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\5\66\34\2\u0107\u0106\3"+
		"\2\2\2\u0107\u0108\3\2\2\2\u0108\63\3\2\2\2\u0109\u010a\7\33\2\2\u010a"+
		"\u010b\7\32\2\2\u010b\u010c\5$\23\2\u010c\u010d\5\34\17\2\u010d\65\3\2"+
		"\2\2\u010e\u010f\7\33\2\2\u010f\u0110\5\34\17\2\u0110\67\3\2\2\2\u0111"+
		"\u0112\7\34\2\2\u0112\u0113\5$\23\2\u0113\u0114\5\34\17\2\u01149\3\2\2"+
		"\2\u0115\u0116\7\35\2\2\u0116\u0117\5\34\17\2\u0117;\3\2\2\2\u0118\u0119"+
		"\7\36\2\2\u0119\u011a\7f\2\2\u011a\u011b\7\37\2\2\u011b\u011c\5$\23\2"+
		"\u011c\u011d\5\34\17\2\u011d=\3\2\2\2\u011e\u011f\7\24\2\2\u011f\u0121"+
		"\5$\23\2\u0120\u0122\7?\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0125\5$\23\2\u0124\u011e\3\2\2\2\u0124\u0123\3\2"+
		"\2\2\u0125?\3\2\2\2\u0126\u0127\7;\2\2\u0127\u0128\5F$\2\u0128\u0129\7"+
		"<\2\2\u0129A\3\2\2\2\u012a\u012b\t\6\2\2\u012bC\3\2\2\2\u012c\u0130\7"+
		"\7\2\2\u012d\u012f\5B\"\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0136\7f\2\2\u0134\u0135\7H\2\2\u0135\u0137\5*\26\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7B\2\2\u0139"+
		"\u013a\5$\23\2\u013aE\3\2\2\2\u013b\u013e\5\f\7\2\u013c\u013e\5D#\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140G\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143"+
		"\7\25\2\2\u0143\u0144\5@!\2\u0144I\3\2\2\2\u0145\u0146\5*\26\2\u0146\u0147"+
		"\7;\2\2\u0147\u0148\5$\23\2\u0148\u0149\7<\2\2\u0149K\3\2\2\2\35OVdly"+
		"\u0080\u0083\u0091\u0098\u009b\u00ab\u00af\u00ba\u00bf\u00c4\u00df\u00e4"+
		"\u00ee\u00f4\u0103\u0107\u0121\u0124\u0130\u0136\u013d\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}