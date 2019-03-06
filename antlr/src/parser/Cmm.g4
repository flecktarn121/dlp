grammar Cmm;	
@header{
	import ast.*
	import java.util.*;
}
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
		
expr returns [Expression ast]:
			ID { $ast = new Variable($ID.text); }
			|REAL_CONSTANT { $ast = new RealLiteral(Double.parseDouble($REAL_CONSTANT.text)); }
			|CHAR_CONSTANT
			|INT_CONSTANT { $ast = new RealLiteral(Integer.parseInt($INT_CONSTANT.text)); }
			|e1=expr '[' e2=expr ']' //array access { $ast = new ArrayAccess($e2.ast)); }
			|ID '('{ List<Expression> params = new ArrayList<Expression>(); }(e1=expr {$params.add($e1.ast); } (',' e2=expr {$params.add($e1.ast); })*)? ')' 
				{ $ast = new ArrayAccess($e2)); }//function acess
			|expr'.'ID { $ast = new FieldAccess($ID.text); }
			|'('type')' expr {$ast = new Cast($type.ast, $expr.ast); } //cast			
			| '(' expr ')' {$ast = expr.ast;}
			|{ String operand = ""; } e1=expr ('*' { $operand = "*"; } |'/' { $operand = "/"; }|'%' { $operand = "%"; }) e2=expr 
				{ $ast = new BinaryOperation($operation, $e1.ast, $e2.ast); }//arithmetic operation
			|{ String operand = ""; }expr ( '+' { $operand = "+"; } | '-' { $operand = "-"; } ) expr 
				{ $ast = new BinaryOperation($operation, $e1.ast, $e2.ast); } //arithmetic operation
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