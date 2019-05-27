package visitor;

import ast.Program;
import ast.definition.*;
import ast.expression.*;
import ast.expression.binary.BinaryOperation;
import ast.expression.literal.*;
import ast.statement.*;
import ast.type.*;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {

	@Override
	public TR visit(Assigment e, TP param) {
		e.getLeft().accept(this, param);
		e.getRight().accept(this, param);
		return null;
	}

	@Override
	public TR visit(FunctionDefinition e, TP param) {
		e.getType().accept(this, param);
		e.getBody().forEach((funDef) -> funDef.accept(this, param));
		return null;
	}

	@Override
	public TR visit(VariableDefinition e, TP param) {
		return null;
	}

	@Override
	public TR visit(BinaryOperation e, TP param) {
		e.getLeft().accept(this, param);
		e.getRight().accept(this, param);
		return null;
	}

	@Override
	public TR visit(CharacterLiteral e, TP param) {
		return null;
	}

	@Override
	public TR visit(RealLiteral e, TP param) {

		return null;
	}

	@Override
	public TR visit(IntegerLiteral e, TP param) {

		return null;
	}

	@Override
	public TR visit(VoidLiteral e, TP param) {

		return null;
	}

	@Override
	public TR visit(ArrayAccess e, TP param) {
		e.getArray().accept(this, param);
		e.getPosition().accept(this, param);
		return null;
	}

	@Override
	public TR visit(BooleanNegation e, TP param) {
		e.getOperand().accept(this, param);
		return null;
	}

	@Override
	public TR visit(Cast e, TP param) {
		e.getOperand().accept(this, param);
		e.getType().accept(this, param);
		return null;
	}

	@Override
	public TR visit(FieldAccess e, TP param) {
		e.getRecordName().accept(this, param);
		return null;
	}

	@Override
	public TR visit(FunctionCall e, TP param) {
		e.getParameters().forEach((p) -> p.accept(this, param));
		return null;
	}

	@Override
	public TR visit(UnaryMinus e, TP param) {
		e.getOperand().accept(this, param);
		return null;
	}

	@Override
	public TR visit(Variable e, TP param) {

		return null;
	}

	@Override
	public TR visit(Function e, TP param) {
		e.getParameters().forEach((p) -> p.accept(this, param));
		return null;
	}

	@Override
	public TR visit(If e, TP param) {
		e.getCondition().accept(this, param);
		e.getThenBody().forEach((expr) -> expr.accept(this, param));
		e.getElseBody().forEach((expr) -> expr.accept(this, param));
		return null;
	}

	@Override
	public TR visit(Read e, TP param) {
		e.getArguments().forEach((arg) -> arg.accept(this, param));
		return null;
	}

	@Override
	public TR visit(Return e, TP param) {
		e.getValue().accept(this, param);
		return null;
	}

	@Override
	public TR visit(While e, TP param) {
		e.getCondition().accept(this, param);
		e.getBody().forEach((mosley) -> mosley.accept(this, param));
		return null;
	}

	@Override
	public TR visit(Write e, TP param) {
		e.getArguments().forEach((vozhd) -> vozhd.accept(this, param));
		return null;
	}

	@Override
	public TR visit(ArrayType e, TP param) {
		e.getTypeOf().accept(this, param);
		return null;
	}

	@Override
	public TR visit(CharType e, TP param) {

		return null;
	}

	@Override
	public TR visit(ErrorType e, TP param) {

		return null;
	}

	@Override
	public TR visit(FunctionType e, TP param) {
		e.getReturnType().accept(this, param);
		e.getParamType().forEach((blessedKarl) -> blessedKarl.accept(this, param));
		return null;
	}

	@Override
	public TR visit(IntType e, TP param) {

		return null;
	}

	@Override
	public TR visit(RealType e, TP param) {

		return null;
	}

	@Override
	public TR visit(RecordType e, TP param) {

		return null;
	}

	@Override
	public TR visit(StructType e, TP param) {
		return null;
	}

	@Override
	public TR visit(VoidType e, TP param) {

		return null;
	}

	@Override
	public TR visit(Program e, TP param) {
		e.getDefinitions().forEach((hueueyLong) -> hueueyLong.accept(this, param));
		return null;
	}

}
