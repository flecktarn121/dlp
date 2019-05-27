package ast.expression;

import ast.AstNode;
import ast.definition.Definition;
import ast.type.Type;
import visitor.Visitor;

public class FieldAccess implements Expression, AstNode {
    private int column;
    private int line;
    private String fieldName;
    private Type type;
    private Definition struct;
    private Variable recordName;
	private String code;

    public FieldAccess(Variable recordName, String fieldName) {
		this.fieldName = fieldName;
		this.recordName = recordName;
	}

    public FieldAccess(Variable recordName, String fieldName, int line, int column) {
	this(recordName, fieldName);
	this.line = line;
	this.column = column;
    }

    public Variable getRecordName() {
        return recordName;
    }

    public void setRecordName(Variable recordName) {
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

	public Definition getStruct() {
		return struct;
	}

	public void setStruct(Definition struct) {
		this.struct = struct;
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
