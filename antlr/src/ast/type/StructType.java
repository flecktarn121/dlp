package ast.type;

import java.util.List;

import visitor.Visitor;

public class StructType extends AbsractType {

	private int line;
	private int column;
	private List<RecordType> fields;

	public StructType(List<RecordType> fields) {
		super();
		this.fields = fields;
	}

	public StructType(List<RecordType> fields, int line, int column) {
		this(fields);
		this.line = line;
		this.column = column;
	}

	@Override
	public boolean isRecord() {
		return true;
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
		return "StructDef [line=" + line + ", column=" + column + ", fields=" + fields.size() + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public String getName() {

		return "Struct";
	}

	public List<RecordType> getFields() {
		return fields;
	}

	public void setFields(List<RecordType> fields) {
		this.fields = fields;
	}

	@Override
	public int getSizeBytes() {
		return this.fields.stream().mapToInt(field -> field.getSizeBytes()).sum();
	}

	public int getOffsetForField(String fieldName) {
		int offset = 0;

		for (int i = 0; i < fields.size(); i++) {
			if (fields.get(i).getFieldName().equals(fieldName)) {
				return offset;
			}
			offset += fields.get(i).getSizeBytes();
		}

		throw new IllegalArgumentException("No field with name " + fieldName);
	}

	public RecordType getField(String fieldName) {
		for (int i = 0; i < fields.size(); i++) {
			if (fields.get(i).getFieldName().equals(fieldName)) {
				return fields.get(i);
			}
		}

		throw new IllegalArgumentException("No field with name " + fieldName);
	}

}
