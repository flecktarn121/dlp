package ast.statement;

import ast.AstNode;
import ast.expression.Expression;

public class Return implements AstNode, Statement {

	private int line;
	private int column;
	private Expression value;

	public Return(Expression value) {
		this.value = value;
	}

	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

}
