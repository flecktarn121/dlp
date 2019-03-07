grammar Cmm;	
@header{
	import ast.*;
	import ast.definition.*;
	import ast.expression.*;
	import ast.expression.binary.*;
	import ast.expression.literal.*;
	import ast.statement.*;
	import ast.type.*;
	import java.util.*;
}
program: definition+
       ;
       
/* SYNTAX RULES */

definition returns [Definition ast]:
			type{Type type = $type.ast;} id1=ID{List<Expression> args = new ArrayList<VariableDefinition>(); args.add(new VariableDefinition());} (',' id2=ID {args.add($id2.text);})* ';'
			|('void'|type) ID '(' (type ID (',' type ID)*)? ')''{'(statement|definition)*'}'
			|'struct''{' (type ID ';')+ '}'ID ';'
			;

type returns [Type ast]:
		'int'{$ast = new BaseType("int");}
	  |'char'{$ast = new BaseType("char");}
	  |'double'{$ast = new BaseType("double");}
	  |type('['expr']')
	  ;
	
statement returns [Statement ast]:
			'while' '(' expr ')' block {$ast = new While($expr.ast, $block.ast);}
		   |'if' '(' expr ')' b1=block {List<Statement> elseBody = new ArrayList<Statement>();} ('else' b2=block {elseBody = $b2.ast;})? {$ast = new If($expr.ast, $b1.ast, elseBody);}
		   |e1=expr '=' e2=expr  {$ast = new Assigment($e1.ast, $e2.ast);}';'
		   |'write' e1=expr {List<Expression> args = new ArrayList<Expression>(); args.add($e1.ast);}(','e2=expr{args.add($e2.ast);})* ';'{$ast = new Write(args);}
		   |'read' e1=expr {List<Expression> args = new ArrayList<Expression>(); args.add($e1.ast);} (','e2=expr{args.add($e2.ast);})* ';'{$ast = new read(args);}
		   |'return' expr ';'{$ast = new Return($expr.ast);}
		   |ID {List<Expression> args = new ArrayList<Expression>();}'('(e1=expr{args.add($e1.ast);} (',' e2=expr{args.add($e2.ast);})*)? ')'';'{$ast = new Function($ID.text, args);}
		;
		
block returns [List<Statement> ast = new ArrayList<Statement>()]:
		statement {$ast.add($statement.ast);}
		| '{' (statement {$ast.add($statement.ast);})* '}'
		;
		
expr returns [Expression ast]:
			ID { $ast = new Variable($ID.text); }
			|REAL_CONSTANT { $ast = new RealLiteral(Double.parseDouble($REAL_CONSTANT.text)); }
			|CHAR_CONSTANT
			|INT_CONSTANT { $ast = new RealLiteral(Integer.parseInt($INT_CONSTANT.text)); }
			|e1=expr '[' e2=expr ']' //array access { $ast = new ArrayAccess($e2.ast); }
			|ID '('{ List<Expression> params = new ArrayList<Expression>(); }(e1=expr {params.add($e1.ast); } (',' e2=expr {params.add($e1.ast); })*)? ')' { $ast = new ArrayAccess($e2.ast); }//function acess
			|expr'.'ID { $ast = new FieldAccess($ID.text); }
			|'('type')' expr {$ast = new Cast($type.ast, $expr.ast); } //cast			
			| '(' expr ')' {$ast = $expr.ast;}
			|e1=expr { String operand = ""; }  ('*' { operand = "*"; } |'/' { operand = "/"; }|'%' { operand = "%"; }) e2=expr { $ast = new BinaryOperation(operand, $e1.ast, $e2.ast); }//arithmetic operation
			|e3=expr { String operand = ""; } ( '+' { operand = "+"; } | '-' { operand = "-"; } ) e4=expr { $ast = new BinaryOperation(operand, $e3.ast, $e4.ast); } //arithmetic operation
			|expr { String operand = ""; }  ('<'{ operand = "<"; }|'>'{ operand = ">"; }|'>='{ operand = ">="; }|'<='{ operand = "<="; }|'=='{ operand = "=="; }) { $ast = new BinaryOperation(operand, $e1.ast, $e2.ast);}expr //
			|expr { String operand = ""; }  ('&&' { operand = "&&"; }| '||'{ operand = "||"; } ) expr { $ast = new BinaryOperation(operand, $e1.ast, $e2.ast);}
			|'!' expr { $ast = new BooleanNegation($expr.ast);} //boolean negation
			|'-' expr { $ast = new UnaryMinus($expr.ast);}//unary minus
			|ID { $ast = new Variable($ID.text); }
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