package ast.type;

import visitor.Visitor;

public class RecordType extends AbsractType {

	private int line;
	private int column;
	private String fieldName;
	private Type type;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public RecordType(String name, Type type) {
		super();
		this.setFieldName(name);
		this.type = type;
	}

	public RecordType(String name, Type type, int line, int column) {
		this(name, type);
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
		return "RecordType [line=" + line + ", column=" + column + ", name=" + fieldName + ", type=" + type + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}
	
	@Override
	public String getName() {
		
		return "Record";
	}

	public String getFieldName() {
	    return fieldName;
	}

	public void setFieldName(String fieldName) {
	    this.fieldName = fieldName;
	}
	
	@Override
	public int getSizeBytes() {
		return type.getSizeBytes();
	}

}
