package ast.statement;

import java.util.List;

import ast.AstNode;
import ast.Body;
import ast.expression.Expression;

public class If implements AstNode, Statement {

	private int line;
	private int column;
	private Expression condition;
	private List<Body> thenBody;
	private List<Body> elseBody;

	public If(Expression condition, List<Body> thenBody, List<Body> elseBody) {
		this.condition = condition;
		this.thenBody = thenBody;
		this.elseBody = elseBody;
	}

	public If(Expression condition, List<Body> thenBody, List<Body> elseBody, int line, int column) {
		this(condition, thenBody, elseBody);
		this.line = line;
		this.column = column;
	}

	public Expression getCondition() {
		return condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public List<Body> getThenBody() {
		return thenBody;
	}

	public void setThenBody(List<Body> thenBody) {
		this.thenBody = thenBody;
	}

	public List<Body> getElseBody() {
		return elseBody;
	}

	public void setElseBody(List<Body> elseBody) {
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

	@Override
	public String toString() {
		return "If [line=" + line + ", column=" + column + ", condition=" + condition + ", thenBody=" + thenBody
				+ ", elseBody=" + elseBody + "]";
	}
}
