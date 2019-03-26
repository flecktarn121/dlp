package ast.type;

import visitor.Visitor;

public class CharType extends AbsractType {
	private int line;
	private int column;

	public CharType() {

	}

	public CharType(int line, int column) {
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
		return "CharType [line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public String getName() {
		
		return "character";
	}

	@Override
	public Type arithmetic(Type type) {
		//WE DO NOT SUPPORT IMPLICIT CONVERSION
		return new ErrorType("The character type does not support arithmetic operations.");
	}
	
	@Override
	public boolean isComplex() {
		return false;
	}
}
