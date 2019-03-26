package ast.type;

import ast.AstNode;
import visitor.Visitor;

public class RecordType extends AbsractType {

	private int line;
	private int column;
	private String name;
	private Type type;

	public RecordType(String name, Type type) {
		super();
		this.name = name;
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
		return "RecordType [line=" + line + ", column=" + column + ", name=" + name + ", type=" + type + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}
	
	@Override
	public String getName() {
		
		return "Record";
	}

}
