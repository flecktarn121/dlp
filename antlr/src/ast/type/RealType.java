package ast.type;

import ast.AstNode;
import visitor.Visitor;

public class RealType extends AbsractType {
	public static final String NAME = "Real";
	private int line;
	private int column;

	public RealType() {

	}

	public RealType(int line, int column) {
		this.line = line;
		this.column = column;
	}

	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public String toString() {
		return "RealType [line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public boolean isLogical() {
		return false;
	}

	@Override
	public String getName() {

		return NAME;
	}

	@Override
	public Type arithmetic(Type type) {
		if (type.getName().equals(this.getName())) {
			return new RealType();
		}
		return super.arithmetic(type);
	}

	@Override
	public boolean isComplex() {
		return false;
	}
	
	@Override
	public boolean isNumber() {
		return true;
	}
}
