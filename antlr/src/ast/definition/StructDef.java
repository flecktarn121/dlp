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

}
