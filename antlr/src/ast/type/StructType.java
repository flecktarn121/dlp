package ast.type;

import java.util.List;

import ast.AstNode;

public class StructType implements AstNode, Type {

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
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public String toString() {
		return "StructDef [line=" + line + ", column=" + column + ", fields=" + fields.size() +"]";
	}

}
