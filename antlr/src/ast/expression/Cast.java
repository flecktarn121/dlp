package ast.expression;

import ast.AstNode;
import ast.type.Type;

public class Cast implements Expression, AstNode {
	private Type type;
	private Expression operand;
	private int line;
	private int column;

	public Cast(Type type, Expression expr) {
		this.type = type;
		this.operand = expr;
	}

	public Cast(Type type, Expression expr, int line, int column) {
		this(type, expr);
		this.line = line;
		this.column = column;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Expression getOperand() {
		return operand;
	}

	public void setOperand(Expression operand) {
		this.operand = operand;
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
		return "Cast [type=" + type + ", operand=" + operand + ", line=" + line + ", column=" + column + "]";
	}
}
