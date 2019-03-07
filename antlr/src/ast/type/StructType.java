package ast.type;

import java.util.List;

import ast.AstNode;
import ast.expression.RecordType;

public class StructType implements AstNode, Type {

	private int line;
	private int column;
	private List<RecordType> fields;
	private String name;

	public StructType(List<RecordType> fields, String name) {
		super();
		this.fields = fields;
		this.name = name;
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
