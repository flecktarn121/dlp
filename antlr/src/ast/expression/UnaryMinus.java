package ast.expression;

import ast.AstNode;
import ast.type.Type;
import visitor.Visitor;

public class UnaryMinus implements AstNode, Expression {

	private Expression operand;
	private int line;
	private int column;
	private Type type;
	private String code;

	public UnaryMinus(Expression operand) {
		this.operand = operand;
	}

	public UnaryMinus(Expression operand, int line, int column) {
		this(operand);
		this.line = line;
		this.column = column;
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
		return "UnaryMinus [operand=" + operand + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public boolean isLValue() {
		
		return false;
	}
	
	@Override
	public void setType(Type type) {
		this.type = type;
		
	}

	@Override
	public Type getType() {
		return type;
	}
	
	@Override
	public void setCode(String code) {
		this.code = code;
		
	}

	@Override
	public String getCode() {
		return code;
	}
	

}
