package ast.expression.literal;

import ast.AstNode;
import ast.expression.Expression;

public class VoidLiteral implements Expression, AstNode {
	private int line;
	private int column;

	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}
}
