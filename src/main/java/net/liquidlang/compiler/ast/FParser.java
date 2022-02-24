// Generated from C:/Users/gerar/OneDrive/Desktop/code/fluid-lang/compiler-core/src/main/resources\FParser.g4 by ANTLR 4.9.2
package net.liquidlang.compiler.ast;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
		IF=23, ELSE=24, WHILE=25, LOOP=26, FOR=27, IN=28, I8=29, I16=30, I32=31, 
		I64=32, I128=33, U8=34, U16=35, U32=36, U64=37, U128=38, F32=39, F64=40, 
		BOOL=41, STR=42, WS=43, COMMENT=44, LINE_COMMENT=45, IntegerLiteral=46, 
		FloatingPointLiteral=47, BooleanLiteral=48, CharacterLiteral=49, StringLiteral=50, 
		NullLiteral=51, LPAREN=52, RPAREN=53, LBRACE=54, RBRACE=55, LBRACK=56, 
		RBRACK=57, SEMI=58, COMMA=59, DOT=60, ASSIGN=61, GT=62, LT=63, BANG=64, 
		TILDE=65, QUESTION=66, COLON=67, EQUAL=68, LE=69, GE=70, NOTEQUAL=71, 
		AND=72, OR=73, INC=74, DEC=75, ADD=76, SUB=77, MUL=78, DIV=79, BITAND=80, 
		BITOR=81, CARET=82, MOD=83, ARROW=84, COLONCOLON=85, ADD_ASSIGN=86, SUB_ASSIGN=87, 
		MUL_ASSIGN=88, DIV_ASSIGN=89, AND_ASSIGN=90, OR_ASSIGN=91, XOR_ASSIGN=92, 
		MOD_ASSIGN=93, LSHIFT_ASSIGN=94, RSHIFT_ASSIGN=95, URSHIFT_ASSIGN=96, 
		IDENTIFIER=97;
	public static final int
		RULE_compilationUnit = 0, RULE_line = 1, RULE_func_modifiers = 2, RULE_variable_modifiers = 3, 
		RULE_importStatement = 4, RULE_function = 5, RULE_formalParameterList = 6, 
		RULE_formalParameter = 7, RULE_value = 8, RULE_passedParameterList = 9, 
		RULE_newStatement = 10, RULE_oldStatement = 11, RULE_block = 12, RULE_body = 13, 
		RULE_stmt = 14, RULE_expr = 15, RULE_valueExpr = 16, RULE_type = 17, RULE_methodCall = 18, 
		RULE_assignment = 19, RULE_reassignment = 20, RULE_ifStatement = 21, RULE_elseIfStatement = 22, 
		RULE_elseStatement = 23, RULE_whileStatement = 24, RULE_loopStatement = 25, 
		RULE_forStatement = 26, RULE_returnStatement = 27, RULE_dropletBlock = 28, 
		RULE_dropletVarModifiers = 29, RULE_dropletAssignment = 30, RULE_dropletBody = 31, 
		RULE_dropletDecl = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "line", "func_modifiers", "variable_modifiers", "importStatement", 
			"function", "formalParameterList", "formalParameter", "value", "passedParameterList", 
			"newStatement", "oldStatement", "block", "body", "stmt", "expr", "valueExpr", 
			"type", "methodCall", "assignment", "reassignment", "ifStatement", "elseIfStatement", 
			"elseStatement", "whileStatement", "loopStatement", "forStatement", "returnStatement", 
			"dropletBlock", "dropletVarModifiers", "dropletAssignment", "dropletBody", 
			"dropletDecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'ext'", "'unsafe'", "'mut'", "'let'", "'async'", "'pub'", 
			"'import'", "'old'", "'new'", "'operator'", "'cast'", "'to'", "'inline'", 
			"'override'", "'const'", "'static'", "'return'", "'droplet'", "'struct'", 
			"'intf'", "'enum'", "'if'", "'else'", "'while'", "'loop'", "'for'", "'in'", 
			"'i8'", "'i16'", "'i32'", "'i64'", "'i128'", "'u8'", "'u16'", "'u32'", 
			"'u64'", "'u128'", "'f32'", "'f64'", "'bool'", "'str'", null, null, null, 
			null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "EXTERNAL", "UNSAFE", "MUTABLE", "LET", "ASYNC", "PUBLIC", 
			"IMPORT", "OLD", "NEW", "OPERATOR", "CAST", "TO", "INLINE", "OVERRIDE", 
			"CONST", "STATIC", "RETURN", "DROPLET", "STRUCT", "INTF", "ENUM", "IF", 
			"ELSE", "WHILE", "LOOP", "FOR", "IN", "I8", "I16", "I32", "I64", "I128", 
			"U8", "U16", "U32", "U64", "U128", "F32", "F64", "BOOL", "STR", "WS", 
			"COMMENT", "LINE_COMMENT", "IntegerLiteral", "FloatingPointLiteral", 
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << EXTERNAL) | (1L << UNSAFE) | (1L << MUTABLE) | (1L << LET) | (1L << ASYNC) | (1L << PUBLIC) | (1L << IMPORT) | (1L << INLINE) | (1L << OVERRIDE) | (1L << STATIC) | (1L << DROPLET))) != 0)) {
				{
				{
				setState(66);
				line();
				}
				}
				setState(71);
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
			setState(76);
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
				setState(72);
				function();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				importStatement();
				}
				break;
			case DROPLET:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				dropletDecl();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
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
			setState(78);
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
			setState(80);
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
			setState(82);
			match(IMPORT);
			setState(83);
			match(IDENTIFIER);
			setState(84);
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
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(86);
					func_modifiers();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(92);
			match(FUNCTION);
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(LPAREN);
			setState(95);
			formalParameterList();
			setState(96);
			match(RPAREN);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(97);
				match(ARROW);
				setState(98);
				type();
				}
			}

			setState(101);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(103);
				formalParameter();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(104);
					match(COMMA);
					setState(105);
					formalParameter();
					}
					}
					setState(110);
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
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(COLON);
			setState(115);
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(BooleanLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(IntegerLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(StringLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(CharacterLiteral);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(IDENTIFIER);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
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
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || _la==IDENTIFIER) {
				{
				setState(126);
				value();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(127);
					match(COMMA);
					setState(128);
					value();
					}
					}
					setState(133);
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
			setState(136);
			match(NEW);
			setState(137);
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
			setState(139);
			match(OLD);
			setState(140);
			match(IDENTIFIER);
			setState(141);
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
			setState(143);
			match(LBRACE);
			setState(144);
			body();
			setState(145);
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
		enterRule(_localctx, 26, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					stmt();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << RETURN) | (1L << IF) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || _la==IDENTIFIER) {
				{
				setState(153);
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
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				expr();
				setState(158);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				importStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				oldStatement();
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
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				valueExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
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
		public TerminalNode IDENTIFIER() { return getToken(FParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				ifStatement();
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
			setState(178);
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
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(LPAREN);
			setState(182);
			passedParameterList();
			setState(183);
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
		enterRule(_localctx, 38, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LET);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUTABLE) | (1L << INLINE) | (1L << STATIC))) != 0)) {
				{
				{
				setState(186);
				variable_modifiers();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(IDENTIFIER);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(193);
				match(COLON);
				setState(194);
				type();
				}
			}

			setState(197);
			match(ASSIGN);
			setState(198);
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
		enterRule(_localctx, 40, RULE_reassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IDENTIFIER);
			setState(201);
			match(ASSIGN);
			setState(202);
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
		enterRule(_localctx, 42, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IF);
			setState(205);
			valueExpr();
			setState(206);
			block();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					elseIfStatement();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(213);
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
		enterRule(_localctx, 44, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ELSE);
			setState(217);
			match(IF);
			setState(218);
			valueExpr();
			setState(219);
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
		enterRule(_localctx, 46, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ELSE);
			setState(222);
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
		enterRule(_localctx, 48, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(WHILE);
			setState(225);
			valueExpr();
			setState(226);
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
		enterRule(_localctx, 50, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LOOP);
			setState(229);
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
		enterRule(_localctx, 52, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(FOR);
			setState(232);
			match(IDENTIFIER);
			setState(233);
			match(IN);
			setState(234);
			valueExpr();
			setState(235);
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
		enterRule(_localctx, 54, RULE_returnStatement);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(RETURN);
				setState(238);
				valueExpr();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(239);
					match(SEMI);
					}
				}

				}
				break;
			case NEW:
			case IF:
			case IntegerLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
		enterRule(_localctx, 56, RULE_dropletBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LBRACE);
			setState(246);
			dropletBody();
			setState(247);
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
		enterRule(_localctx, 58, RULE_dropletVarModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 60, RULE_dropletAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LET);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUTABLE || _la==STATIC) {
				{
				{
				setState(252);
				dropletVarModifiers();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(IDENTIFIER);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(259);
				match(COLON);
				setState(260);
				type();
				}
			}

			setState(263);
			match(ASSIGN);
			setState(264);
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
		enterRule(_localctx, 62, RULE_dropletBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << EXTERNAL) | (1L << UNSAFE) | (1L << MUTABLE) | (1L << LET) | (1L << ASYNC) | (1L << PUBLIC) | (1L << INLINE) | (1L << OVERRIDE) | (1L << STATIC))) != 0)) {
				{
				setState(268);
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
					setState(266);
					function();
					}
					break;
				case LET:
					{
					setState(267);
					dropletAssignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(272);
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
		enterRule(_localctx, 64, RULE_dropletDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(DROPLET);
			setState(274);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3c\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7f\n\7\3\7\3\7\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\5\b"+
		"r\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13"+
		"\3\13\7\13\u0084\n\13\f\13\16\13\u0087\13\13\5\13\u0089\n\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\7\17\u0097\n\17\f\17\16\17"+
		"\u009a\13\17\3\17\5\17\u009d\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00a8\n\20\3\21\3\21\3\21\5\21\u00ad\n\21\3\22\3\22\3\22"+
		"\3\22\5\22\u00b3\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25"+
		"\u00be\n\25\f\25\16\25\u00c1\13\25\3\25\3\25\3\25\5\25\u00c6\n\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00d3\n\27\f\27"+
		"\16\27\u00d6\13\27\3\27\5\27\u00d9\n\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\5\35\u00f3\n\35\3\35\5\35\u00f6\n\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \7 \u0100\n \f \16 \u0103\13 \3 \3 \3 \5 \u0108"+
		"\n \3 \3 \3 \3!\3!\7!\u010f\n!\f!\16!\u0112\13!\3\"\3\"\3\"\3\"\3[\2#"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\6"+
		"\6\2\4\6\b\t\20\21\23\23\5\2\6\6\20\20\23\23\4\2\37,cc\4\2\6\6\23\23\2"+
		"\u011c\2G\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f[\3\2\2"+
		"\2\16q\3\2\2\2\20s\3\2\2\2\22~\3\2\2\2\24\u0088\3\2\2\2\26\u008a\3\2\2"+
		"\2\30\u008d\3\2\2\2\32\u0091\3\2\2\2\34\u0098\3\2\2\2\36\u00a7\3\2\2\2"+
		" \u00ac\3\2\2\2\"\u00b2\3\2\2\2$\u00b4\3\2\2\2&\u00b6\3\2\2\2(\u00bb\3"+
		"\2\2\2*\u00ca\3\2\2\2,\u00ce\3\2\2\2.\u00da\3\2\2\2\60\u00df\3\2\2\2\62"+
		"\u00e2\3\2\2\2\64\u00e6\3\2\2\2\66\u00e9\3\2\2\28\u00f5\3\2\2\2:\u00f7"+
		"\3\2\2\2<\u00fb\3\2\2\2>\u00fd\3\2\2\2@\u0110\3\2\2\2B\u0113\3\2\2\2D"+
		"F\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2"+
		"JO\5\f\7\2KO\5\n\6\2LO\5B\"\2MO\5(\25\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2"+
		"NM\3\2\2\2O\5\3\2\2\2PQ\t\2\2\2Q\7\3\2\2\2RS\t\3\2\2S\t\3\2\2\2TU\7\n"+
		"\2\2UV\7c\2\2VW\7<\2\2W\13\3\2\2\2XZ\5\6\4\2YX\3\2\2\2Z]\3\2\2\2[\\\3"+
		"\2\2\2[Y\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\3\2\2_`\7c\2\2`a\7\66\2\2ab"+
		"\5\16\b\2be\7\67\2\2cd\7V\2\2df\5$\23\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2"+
		"gh\5\32\16\2h\r\3\2\2\2in\5\20\t\2jk\7=\2\2km\5\20\t\2lj\3\2\2\2mp\3\2"+
		"\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qi\3\2\2\2qr\3\2\2\2r\17\3"+
		"\2\2\2st\7c\2\2tu\7E\2\2uv\5$\23\2v\21\3\2\2\2w\177\7\65\2\2x\177\7\62"+
		"\2\2y\177\7\60\2\2z\177\7\64\2\2{\177\7\63\2\2|\177\7c\2\2}\177\5\26\f"+
		"\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2"+
		"\2\177\23\3\2\2\2\u0080\u0085\5\22\n\2\u0081\u0082\7=\2\2\u0082\u0084"+
		"\5\22\n\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0080"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\25\3\2\2\2\u008a\u008b\7\f\2\2\u008b"+
		"\u008c\7c\2\2\u008c\27\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7c\2\2"+
		"\u008f\u0090\7<\2\2\u0090\31\3\2\2\2\u0091\u0092\78\2\2\u0092\u0093\5"+
		"\34\17\2\u0093\u0094\79\2\2\u0094\33\3\2\2\2\u0095\u0097\5\36\20\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\58\35\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\35\3\2\2\2\u009e\u00a8\5,\27"+
		"\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7<\2\2\u00a1\u00a8\3\2\2\2\u00a2\u00a8"+
		"\5\62\32\2\u00a3\u00a8\5\64\33\2\u00a4\u00a8\5\66\34\2\u00a5\u00a8\5\n"+
		"\6\2\u00a6\u00a8\5\30\r\2\u00a7\u009e\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7"+
		"\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00ad\5(\25\2\u00aa\u00ad"+
		"\5\"\22\2\u00ab\u00ad\5*\26\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad!\3\2\2\2\u00ae\u00b3\5&\24\2\u00af\u00b3\7"+
		"c\2\2\u00b0\u00b3\5\22\n\2\u00b1\u00b3\5,\27\2\u00b2\u00ae\3\2\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3#\3\2\2\2"+
		"\u00b4\u00b5\t\4\2\2\u00b5%\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7\66"+
		"\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\7\67\2\2\u00ba\'\3\2\2\2\u00bb"+
		"\u00bf\7\7\2\2\u00bc\u00be\5\b\5\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c5\7c\2\2\u00c3\u00c4\7E\2\2\u00c4\u00c6\5$\23"+
		"\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\7?\2\2\u00c8\u00c9\5\"\22\2\u00c9)\3\2\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc"+
		"\7?\2\2\u00cc\u00cd\5\"\22\2\u00cd+\3\2\2\2\u00ce\u00cf\7\31\2\2\u00cf"+
		"\u00d0\5\"\22\2\u00d0\u00d4\5\32\16\2\u00d1\u00d3\5.\30\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\5\60\31\2\u00d8\u00d7\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9-\3\2\2\2\u00da\u00db\7\32\2\2\u00db\u00dc"+
		"\7\31\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\5\32\16\2\u00de/\3\2\2\2\u00df"+
		"\u00e0\7\32\2\2\u00e0\u00e1\5\32\16\2\u00e1\61\3\2\2\2\u00e2\u00e3\7\33"+
		"\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\5\32\16\2\u00e5\63\3\2\2\2\u00e6"+
		"\u00e7\7\34\2\2\u00e7\u00e8\5\32\16\2\u00e8\65\3\2\2\2\u00e9\u00ea\7\35"+
		"\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7\36\2\2\u00ec\u00ed\5\"\22\2\u00ed"+
		"\u00ee\5\32\16\2\u00ee\67\3\2\2\2\u00ef\u00f0\7\24\2\2\u00f0\u00f2\5\""+
		"\22\2\u00f1\u00f3\7<\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f6\5\"\22\2\u00f5\u00ef\3\2\2\2\u00f5\u00f4\3"+
		"\2\2\2\u00f69\3\2\2\2\u00f7\u00f8\78\2\2\u00f8\u00f9\5@!\2\u00f9\u00fa"+
		"\79\2\2\u00fa;\3\2\2\2\u00fb\u00fc\t\5\2\2\u00fc=\3\2\2\2\u00fd\u0101"+
		"\7\7\2\2\u00fe\u0100\5<\37\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0107\7c\2\2\u0105\u0106\7E\2\2\u0106\u0108\5$\23\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7?\2\2\u010a"+
		"\u010b\5\"\22\2\u010b?\3\2\2\2\u010c\u010f\5\f\7\2\u010d\u010f\5> \2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111A\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114"+
		"\7\25\2\2\u0114\u0115\5:\36\2\u0115C\3\2\2\2\32GN[enq~\u0085\u0088\u0098"+
		"\u009c\u00a7\u00ac\u00b2\u00bf\u00c5\u00d4\u00d8\u00f2\u00f5\u0101\u0107"+
		"\u010e\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}