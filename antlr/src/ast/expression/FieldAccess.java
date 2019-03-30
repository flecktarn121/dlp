package ast.expression;

import ast.AstNode;
import ast.type.Type;
import visitor.Visitor;

public class FieldAccess implements Expression, AstNode {
    private int column;
    private int line;
    private String fieldName;
    private Type type;

    private String recordName;

    public FieldAccess(String fieldName, String recordName) {
		this.fieldName = fieldName;
		this.recordName = recordName;
	}

    public FieldAccess(String fieldName, String recordName, int line, int column) {
	this(fieldName, recordName);
	this.line = line;
	this.column = column;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
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

    @Override
    public String toString() {
	return "FieldAccess [column=" + column + ", line=" + line + ", fieldName=" + fieldName + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
	return v.visit(this, param);
    }

    @Override
    public boolean isLValue() {
	return true;
    }

    @Override
    public void setType(Type type) {
	this.type = type;

    }

    @Override
    public Type getType() {
	return type;
    }
}
