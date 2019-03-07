package ast.statement;

import java.util.List;

import ast.AstNode;
import ast.expression.Expression;

public class If implements AstNode, Statement {

	private int line;
	private int column;
	private Expression condition;
	private List<Statement> thenBody;
	private List<Statement> elseBody;

	public If(Expression condition, List<Statement> thenBody, List<Statement> elseBody) {
		this.condition = condition;
		this.thenBody = thenBody;
		this.elseBody = elseBody;
	}

	public Expression getCondition() {
		return condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public List<Statement> getThenBody() {
		return thenBody;
	}

	public void setThenBody(List<Statement> thenBody) {
		this.thenBody = thenBody;
	}

	public List<Statement> getElseBody() {
		return elseBody;
	}

	public void setElseBody(List<Statement> elseBody) {
		this.elseBody = elseBody;
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
