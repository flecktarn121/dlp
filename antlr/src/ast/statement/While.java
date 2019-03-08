package ast.statement;

import java.util.List;

import ast.AstNode;
import ast.Body;
import ast.expression.Expression;

public class While implements AstNode, Statement {

	private int line;
	private int column;
	private Expression condition;
	private List<Body> body;

	public While(Expression condition, List<Body> body) {
		this.condition = condition;
		this.body = body;
	}

	public While(Expression condition, List<Body> body, int line, int column) {
		this(condition, body);
		this.line = line;
		this.column = column;
	}

	public Expression getCondition() {
		return condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public List<Body> getBody() {
		return body;
	}

	public void setBody(List<Body> body) {
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

	@Override
	public String toString() {
		return "While [line=" + line + ", column=" + column + ", condition=" + condition + ", body=" + body + "]";
	}
}
