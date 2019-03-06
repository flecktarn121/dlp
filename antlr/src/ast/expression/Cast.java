package ast.expression;

import ast.AstNode;
import ast.type.Type;

public class Cast implements Expression, AstNode{
	private Type type;
	private Expression operand;
	private int line;
	private int column;

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
}
