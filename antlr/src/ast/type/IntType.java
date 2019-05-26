package ast.type;

import visitor.Visitor;

public class IntType extends AbsractType{

	private static final int SIZE = 2;
	public static final String NAME = "integer";
	private int line;
	private int column;

	public IntType() {

	}

	public IntType(int line, int column) {
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
		return "IntType [line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	
	@Override
	public boolean isLogical() {
		return true;
	}

	@Override
	public String getName() {
	
		return NAME;
	}
	
	@Override
	public Type arithmetic(Type type) {
		if(type.getName().equals(this.getName())) {
			return new IntType();
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
	
	@Override
	public int getSizeBytes() {
		return SIZE;
	}
}
