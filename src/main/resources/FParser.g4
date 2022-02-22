parser grammar FParser;

options { tokenVocab=FLexer; }

// init

compilationUnit: line*;
line: function | importStatement;

// modifiers

func_modifiers: PUBLIC | UNSAFE | EXTERNAL | STATIC | INLINE | MUTABLE | ASYNC | OVERRIDE;
variable_modifiers: STATIC | INLINE | MUTABLE;

// real stuff

importStatement: IMPORT IDENTIFIER ';';

function: func_modifiers*? FUNCTION IDENTIFIER '(' formalParameterList ')' ('->' type)? block;

formalParameterList: (formalParameter (',' formalParameter)*)?;
formalParameter: IDENTIFIER COLON type;
value: NullLiteral
                | BooleanLiteral
                | IntegerLiteral
                | StringLiteral
                | CharacterLiteral
                | IDENTIFIER
                | newStatement;
passedParameterList: (value (',' value)*)?;
newStatement: NEW IDENTIFIER;
oldStatement: OLD IDENTIFIER ';';

block: LBRACE body RBRACE;
body: stmt* expr?;
stmt: expr ';' | ifStatement | whileStatement | loopStatement | forStatement | importStatement | oldStatement;
expr: assignment | valueExpr;
valueExpr: methodCall | IDENTIFIER | value;

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
        BOOL;

methodCall: IDENTIFIER '(' passedParameterList ')';

assignment: LET? variable_modifiers* IDENTIFIER (COLON type)? ASSIGN valueExpr;

ifStatement: IF expr block;
whileStatement: WHILE expr block;
loopStatement: LOOP block;
forStatement: FOR IDENTIFIER IN expr block;