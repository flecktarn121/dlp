package ast.statement;

import ast.AstNode;
import ast.expression.Expression;
import visitor.Visitor;

public class Return implements AstNode, Statement {

	private int line;
	private int column;
	private Expression value;

	public Return(Expression value) {
		this.value = value;
	}

	public Return(Expression value, int line, int column) {
		this(value);
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
		return "Return [line=" + line + ", column=" + column + ", value=" + value + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

}
