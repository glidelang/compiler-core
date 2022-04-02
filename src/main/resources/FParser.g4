parser grammar FParser;

options { tokenVocab=FLexer; }

// init

compilationUnit: line*;
line: function | importStatement | dropletDecl | assignment;

// modifiers

func_modifiers: PUBLIC | UNSAFE | EXTERNAL | STATIC | INLINE | MUTABLE | ASYNC | OVERRIDE;
variable_modifiers: STATIC | INLINE | MUTABLE;

// real stuff

importStatement: IMPORT (IDENTIFIER | MODULE) COLONCOLON (IDENTIFIER | '*') (COLONCOLON (IDENTIFIER | '*'))* ';';

function: func_modifiers*? FUNCTION IDENTIFIER functionSignature block;
functionSignature: '(' formalParameterList ')' (ARROW type)?;

formalParameterList: (formalParameter (',' formalParameter)*)?;
formalParameter: IDENTIFIER COLON type;
value: NullLiteral
                | BooleanLiteral
                | IntegerLiteral
                | StringLiteral
                | CharacterLiteral
                | IDENTIFIER
                | functionValue
                | newStatement;
passedParameterList: (valueExpr (',' valueExpr)*)?;
newStatement: NEW IDENTIFIER;

block: LBRACE body RBRACE;
body: stmt*;
stmt: ifStatement | expr ';' | whileStatement | loopStatement | forStatement | importStatement | unsafeBlock | returnStatement;
expr: assignment | valueExpr | reassignment;
nullValueExprOperators: BANG | TILDE; // BANG will return a nullable value if not null, else it panics. TILDE returns the evaluation of a Boolean expression 'valueExpr != null'
valueExpr: (methodCall | value | castType | block | unsafeBlock) nullValueExprOperators*;
functionType: FUNCTION functionSignature;
functionValue: FUNCTION IDENTIFIER functionSignature;

type: (IDENTIFIER |
        I8 |
        I16 |
        I32 |
        I64 |
        I128 |
        U8 |
        U16 |
        U32 |
        U64 |
        U128 |
        F32 |
        F64 |
        STR |
        VOID |
        CHAR |
        functionType |
        BOOL)
        QUESTION?;

methodCall: IDENTIFIER (ARROW type)? '(' passedParameterList ')';

assignment: LET variable_modifiers* IDENTIFIER (COLON type)? ASSIGN valueExpr;
reassignment: IDENTIFIER ASSIGN valueExpr;

ifStatement: IF valueExpr block elseIfStatement* elseStatement?;
elseIfStatement: ELSE IF valueExpr block;
elseStatement: ELSE block;
whileStatement: WHILE valueExpr block;
loopStatement: LOOP block;
forStatement: FOR IDENTIFIER IN valueExpr block;
returnStatement: RETURN valueExpr? ';';

unsafeBlock: UNSAFE block;

dropletBlock: LBRACE dropletBody RBRACE;
dropletVarModifiers: STATIC | MUTABLE;
dropletAssignment: LET dropletVarModifiers* IDENTIFIER (COLON type)? ASSIGN valueExpr;
dropletBody: (function | dropletAssignment)*;
dropletDecl: DROPLET dropletBlock;

castType: type LPAREN valueExpr RPAREN;