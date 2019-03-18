package ast.expression.literal;

import ast.AstNode;
import ast.expression.Expression;
import visitor.Visitor;

public class VoidLiteral implements Expression, AstNode {
	private int line;
	private int column;

	public VoidLiteral(int line, int column) {
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
		return "VoidLiteral [line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public boolean isLValue() {
		
		return false;
	}
}
