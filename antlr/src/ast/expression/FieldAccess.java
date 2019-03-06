package ast.expression;

import ast.AstNode;

public class FieldAccess implements Expression, AstNode {
	private int column;
	private int line;
	private String fieldName;
	
	public FieldAccess(String fieldName) {
		
	}
	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
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
