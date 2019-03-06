package ast.statement;

import java.util.List;

import ast.AstNode;
import ast.expression.Expression;

public class While implements AstNode, Statement {

	private int line;
	private int column;
	private Expression condition;
	private List<Statement> body;

	public Expression getCondition() {
		return condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public List<Statement> getBody() {
		return body;
	}

	public void setBody(List<Statement> body) {
		this.body = body;
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
