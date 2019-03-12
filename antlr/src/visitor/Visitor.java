package visitor;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.ArrayAccess;
import ast.expression.BooleanNegation;
import ast.expression.Cast;
import ast.expression.FieldAccess;
import ast.expression.FunctionCall;
import ast.expression.UnaryMinus;
import ast.expression.Variable;
import ast.expression.binary.BinaryOperation;
import ast.expression.literal.CharacterLiteral;
import ast.expression.literal.IntegerLiteral;
import ast.expression.literal.RealLiteral;
import ast.expression.literal.VoidLiteral;
import ast.statement.Assigment;
import ast.statement.Function;
import ast.statement.If;
import ast.statement.Return;
import ast.statement.While;
import ast.statement.Write;
import ast.statement.read;
import ast.type.ArrayType;
import ast.type.CharType;
import ast.type.ErrorType;
import ast.type.FunctionType;
import ast.type.IntType;
import ast.type.RealType;
import ast.type.RecordType;
import ast.type.StructType;
import ast.type.VoidType;

public interface Visitor<TP, TR> {
	TR visit(Assigment e, TP param);

	TR visit(FunctionDefinition e, TP param);

	TR visit(VariableDefinition e, TP param);

	TR visit(BinaryOperation e, TP param);

	TR visit(CharacterLiteral e, TP param);

	TR visit(RealLiteral e, TP param);

	TR visit(IntegerLiteral e, TP param);

	TR visit(VoidLiteral e, TP param);

	TR visit(ArrayAccess e, TP param);

	TR visit(BooleanNegation e, TP param);

	TR visit(Cast e, TP param);

	TR visit(FieldAccess e, TP param);

	TR visit(FunctionCall e, TP param);

	TR visit(UnaryMinus e, TP param);

	TR visit(Variable e, TP param);

	TR visit(Function e, TP param);

	TR visit(If e, TP param);

	TR visit(read e, TP param);

	TR visit(Return e, TP param);

	TR visit(While e, TP param);

	TR visit(Write e, TP param);

	TR visit(ArrayType e, TP param);

	TR visit(CharType e, TP param);

	TR visit(ErrorType e, TP param);

	TR visit(FunctionType e, TP param);

	TR visit(IntType e, TP param);

	TR visit(RealType e, TP param);

	TR visit(RecordType e, TP param);

	TR visit(StructType e, TP param);

	TR visit(VoidType e, TP param);
	
	TR visit(Program e, TP param);
}
