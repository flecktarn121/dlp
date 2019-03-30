package ast.type;

import ast.AstNode;
import visitor.Visitor;

public abstract class AbsractType implements Type, AstNode {

	@Override
	public boolean isRecord() {
		return false;
	}

	@Override
	public int getLine() {

		return 0;
	}

	@Override
	public int getColumn() {

		return 0;
	}

	@Override
	public abstract <TP, TR> TR accept(Visitor<TP, TR> v, TP param);

	@Override
	public boolean isLogical() {
		return false;
	}

	@Override
	public abstract String getName();

	@Override
	public Type arithmetic(Type type) {

		return new ErrorType("The type " + getName() + " does not support arithmetic operation with " + type.getName(),
				getLine(), getColumn());
	}

	@Override
	public boolean isComplex() {
		return true;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

}
