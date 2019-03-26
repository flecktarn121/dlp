package ast.type;

import ast.AstNode;
import visitor.Visitor;

public class VoidType extends AbsractType {
	private int line;
	private int column;

	public VoidType() {

	}

	public VoidType(int line, int column) {
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
		return "VoidType [line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public String getName() {
		
		return "Void";
	}
	
	@Override
	public boolean isComplex() {
		return false;
	}

}
