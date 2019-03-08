package ast.definition;

import java.util.List;

import ast.AstNode;
import ast.type.RecordType;
import ast.type.Type;

public class StructDef implements AstNode, Definition {

	private int line;
	private int column;
	private List<RecordType> fields;
	private String name;

	public StructDef(List<RecordType> fields, String name) {
		super();
		this.fields = fields;
		this.name = name;
	}

	public StructDef(List<RecordType> fields, String name, int line, int column) {
		this(fields, name);
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
	public String getName() {

		return name;
	}

	@Override
	public Type getType() {

		return null;
	}

	@Override
	public String toString() {
		return "StructDef [line=" + line + ", column=" + column + ", fields=" + fields + ", name=" + name + "]";
	}

}
