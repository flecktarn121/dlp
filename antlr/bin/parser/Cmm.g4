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
	import parser.*;
}
program returns [Program ast]:
		{List<Definition> prog = new ArrayList<Definition>();}(definition{prog.addAll($definition.ast);})+{$ast = new Program(prog);} EOF
       ;
       
/* SYNTAX RULES */

definition returns [List<Definition> ast = new ArrayList<Definition>()]:
			type{Type type = $type.ast;} id1=ID{ VariableDefinition varDef = new VariableDefinition($id1.text, type); $ast.add(varDef);} (',' id2=ID {$ast.add(new VariableDefinition($id2.text, $type.ast));})* ';'
			|{Type type = null;}('void' {type = new VoidType();}|t1=type {type = $t1.ast;}) id1=ID '('{List<VariableDefinition> params = new ArrayList<VariableDefinition>();} (t2=type id2=ID {params.add(new VariableDefinition($id2.text, $t2.ast));} (',' t3=type id3=ID{params.add(new VariableDefinition($id3.text, $t3.ast));})*)? ')' {Type funType = new FunctionType(type, params);}'{'{List<Body> body = new ArrayList<Body>();} (statement {body.add($statement.ast);}|definition {body.addAll($definition.ast);} )*'}'{$ast.add( new FunctionDefinition($id1.text, funType, body)); }
			;

type returns [Type ast]:
		'int'{$ast = new IntType();}
	  |'char'{$ast = new CharType();}
	  |'double'{$ast = new RealType();}
	  |t1=type('['expr']')+{$ast=new ArrayType($t1.ast, $expr.ast);}
	  |'struct'{List<RecordType> fields = new ArrayList<RecordType>();}'{' (type id1=ID ';'{fields.add(new RecordType($id1.text, $type.ast));})+ '}'{$ast = new StructType( fields);}
	  ;
	
statement returns [Statement ast]:
			'while' '(' expr ')' block {$ast = new While($expr.ast, $block.ast, $expr.getLine());}
		   |'if' '(' expr ')' b1=block {List<Body> elseBody = new ArrayList<Body>();} ('else' b2=block {elseBody = $b2.ast;})? {$ast = new If($expr.ast, $b1.ast, elseBody);}
		   |e1=expr '=' e2=expr  {$ast = new Assigment($e1.ast, $e2.ast);}';'
		   |'write' e1=expr {List<Expression> args = new ArrayList<Expression>(); args.add($e1.ast);}(','e2=expr{args.add($e2.ast);})* ';'{$ast = new Write(args);}
		   |'read' e1=expr {List<Expression> args = new ArrayList<Expression>(); args.add($e1.ast);} (','e2=expr{args.add($e2.ast);})* ';'{$ast = new read(args);}
		   |'return' expr ';'{$ast = new Return($expr.ast);}
		   |ID {List<Expression> args = new ArrayList<Expression>();}'('(e1=expr{args.add($e1.ast);} (',' e2=expr{args.add($e2.ast);})*)? ')'';'{$ast = new Function($ID.text, args);}
		;
		
block returns [List<Body> ast = new ArrayList<Body>()]:
		(statement {$ast.add($statement.ast);} |definition {$ast.addAll($definition.ast);} ) 
		| '{' (statement {$ast.add($statement.ast);} | definition {$ast.addAll($definition.ast);} )* '}'
		;
		
expr returns [Expression ast]:
			ID { $ast = new Variable($ID.text, $ID.getLine(), $ID.getCharPositionInLine() +1); }
			|REAL_CONSTANT { $ast = new RealLiteral(Double.parseDouble($REAL_CONSTANT.text), $REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() +1); }
			|CHAR_CONSTANT {$ast = new CharacterLiteral(LexerHelper.lexemeToChar($CHAR_CONSTANT.text), $CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() +1);}
			|INT_CONSTANT { $ast = new IntegerLiteral(Integer.parseInt($INT_CONSTANT.text), $INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() +1); }
			|e1=expr '[' e2=expr ']' { $ast = new ArrayAccess($e2.ast, $e1.start.getLine(), $e1.start.getCharPositionInLine() +1); } //array access 
			|ID '('{ List<Expression> params = new ArrayList<Expression>(); }(e1=expr {params.add($e1.ast); } (',' e2=expr {params.add($e2.ast); })*)? ')' { $ast = new FunctionCall($ID.text,params); }//function acess
			|expr'.'ID { $ast = new FieldAccess($ID.text, $expr.start.getLine(), $expr.start.getCharPositionInLine() + 1); }
			|'('type')' expr {$ast = new Cast($type.ast, $expr.ast, $expr.start.getLine(), $expr.start.getCharPositionInLine() + 1); } //cast			
			| '(' expr ')' {$ast = $expr.ast;}
			|e1=expr { String operand = ""; }  ('*' { operand = "*"; } |'/' { operand = "/"; }|'%' { operand = "%"; }) e2=expr { $ast = new BinaryOperation(operand, $e1.ast, $e2.ast, $e1.start.getLine(), $e1.start.getCharPositionInLine() +1); }//arithmetic operation
			|e3=expr { String operand = ""; } ( '+' { operand = "+"; } | '-' { operand = "-"; } ) e4=expr { $ast = new BinaryOperation(operand, $e3.ast, $e4.ast, $e3.start.getLine(), $e3.start.getCharPositionInLine() +1); } //arithmetic operation
			|e1=expr { String operand = ""; }  ('<'{ operand = "<"; }|'>'{ operand = ">"; }|'>='{ operand = ">="; }|'<='{ operand = "<="; }|'=='{ operand = "=="; }) e2=expr{ $ast = new BinaryOperation(operand, $e1.ast, $e2.ast, $e1.start.getLine(), $e1.start.getCharPositionInLine() +1);} //
			|e1=expr { String operand = ""; }  ('&&' { operand = "&&"; }| '||'{ operand = "||"; } ) e2=expr { $ast = new BinaryOperation(operand, $e1.ast, $e2.ast, $e1.start.getLine(), $e1.start.getCharPositionInLine() +1);}
			|'!' expr { $ast = new BooleanNegation($expr.ast, $expr.start.getLine(), $expr.start.getCharPositionInLine() + 1 );} //boolean negation
			|'-' expr { $ast = new UnaryMinus($expr.ast, $expr.start.getLine(), $expr.start.getCharPositionInLine() + 1 );}//unary minus
			|ID { $ast = new Variable($ID.text, $ID.getLine(), $ID.getCharPositionInLine() +1); }
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