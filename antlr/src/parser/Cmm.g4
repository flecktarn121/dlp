grammar Cmm;	

program: definition+
       ;
       
/* SYNTAX RULES */

definition: type ID (',' ID)* ';'
			|('void'|type) ID '(' (type ID (',' type ID)*)? ')''{'(statement|definition)*'}'
			|'struct''{' (type ID ';')+ '}'ID ';'
			;

type: 'int'
	  |'char'
	  |'double'
	  |type('['expr']')+
	  ;
	
statement: 'while' '(' expr ')' block
		   |'if' '(' expr ')' block ('else' block)?
		   |ID'(' (expr)? ')'  ';'
		   |expr '=' expr  ';'
		   |'write' expr (','expr)* ';'
		   |'read' expr (','expr)* ';'
		   |'return' expr ';'
		   |ID '('(expr (',' expr)*)? ')'';'
		;
		
block: statement
		| '{' statement* '}'
		;
		
expr:		ID
			|REAL_CONSTANT
			|CHAR_CONSTANT
			|INT_CONSTANT
			|expr '[' expr ']' //array access
			|ID '('(expr (',' expr)*)? ')'
			|expr'.'ID
			|'('type')' expr //cast			
			| '(' expr ')'
			|expr ('*'|'/'|'%') expr //arithmetic operation
			|expr ( '+'| '-' ) expr //arithmetic operation
			|expr ('<'|'>'|'>='|'<='|'==') expr //
			|expr ('&&' | '||' ) expr //boolean operation
			|'!' expr //boolean negation
			|'-' expr //unary minus
			|ID
			;
			

			
/***** LEXICAL RULES ***/
       
fragment
LETTER: [a-zA-Z]
		;
	
fragment
DIGIT: [0-9]
	;
	
fragment
SPECIAL_CHARS: ('\\n'|'\\t')
				;
fragment
SYMBOLS: ('.'|'~'|'-')
		;
fragment
ASCII_RANGE: '\\'(DIGIT|[1-9]DIGIT|'1'[0-2]DIGIT)
			;

fragment
EXPONENT:	('e'|'E')(('+'|'-')?)([1-9]DIGIT*)
			;
			
fragment
INTEGER:	[1-9]DIGIT*|'0'
			;

WHITESPACES:	('\r'|'\n'|'\t'|' ')+ -> skip
				;

ID: (LETTER|'_')(LETTER|'_'|DIGIT)*
	;
  		 
INT_CONSTANT: INTEGER
            ;
            
CHAR_CONSTANT: '\''(.|ASCII_RANGE|SPECIAL_CHARS) '\''

				;
				
REAL_CONSTANT:	INTEGER*'.'DIGIT+
				|INTEGER+'.'DIGIT*
				|INTEGER+(('.'DIGIT+)?)(EXPONENT?)
				;				
				
SINGLE_COMMENT: '//'.*?'\r'?('\n'|EOF)
				-> skip
				;
				
MULTIPLE_COMMENT: '/*'.*?'*/'
				-> skip
				;