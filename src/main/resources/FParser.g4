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
passedParameterList: (value (',' value)*)?;
newStatement: NEW IDENTIFIER;
oldStatement: OLD IDENTIFIER ';';

block: LBRACE body RBRACE;
body: stmt* returnStatement?;
stmt: ifStatement | expr ';' | whileStatement | loopStatement | forStatement | importStatement | oldStatement;
expr: assignment | valueExpr | reassignment;
valueExpr: methodCall | value | castType;
functionType: FUNCTION functionSignature;
functionValue: FUNCTION IDENTIFIER functionSignature;

type: IDENTIFIER |
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
        BOOL;

methodCall: IDENTIFIER (ARROW type)? '(' passedParameterList ')';

assignment: LET variable_modifiers* IDENTIFIER (COLON type)? ASSIGN valueExpr;
reassignment: IDENTIFIER ASSIGN valueExpr;

ifStatement: IF valueExpr block elseIfStatement* elseStatement?;
elseIfStatement: ELSE IF valueExpr block;
elseStatement: ELSE block;
whileStatement: WHILE valueExpr block;
loopStatement: LOOP block;
forStatement: FOR IDENTIFIER IN valueExpr block;
returnStatement: RETURN valueExpr ';'? | valueExpr;

dropletBlock: LBRACE dropletBody RBRACE;
dropletVarModifiers: STATIC | MUTABLE;
dropletAssignment: LET dropletVarModifiers* IDENTIFIER (COLON type)? ASSIGN valueExpr;
dropletBody: (function | dropletAssignment)*;
dropletDecl: DROPLET dropletBlock;

castType: type LBRACE valueExpr RBRACE;