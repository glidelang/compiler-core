parser grammar FParser;

options { tokenVocab=FLexer; }

// init

compilationUnit: function*;

// modifiers

func_modifiers: PUBLIC | UNSAFE | EXTERNAL | STATIC | INLINE | MUTABLE | ASYNC | OVERRIDE;
class_modifiers: PUBLIC | STATIC | OVERRIDE;

// real stuff

function: func_modifiers*? FUNCTION IDENTIFIER '(' formalParameterList ')' ('->' type)? block;

formalParameterList: (formalParameter (',' formalParameter)*)?;

formalParameter: IDENTIFIER COLON type;

block: LBRACE body RBRACE;

body: stmt* expr?;

stmt: expr ';';

expr: LPAREN '!' RPAREN;

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
        BOOL;