package ast.definition;

import ast.AstNode;
import ast.type.Type;
import visitor.Visitor;

public class VariableDefinition implements Definition, AstNode {

	private String name;
	private Type type;

	public VariableDefinition(String name, Type type) {
		super();
		this.name = name;
		this.type = type;
	}

	public VariableDefinition(String name, Type type, int line, int column) {
		this(name, type);
		this.line = line;
		this.column = column;
	}

	private int line;
	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
	    result = prime * result + scope;
	    return result;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
		return true;
	    if (obj == null)
		return false;
	    if (getClass() != obj.getClass())
		return false;
	    VariableDefinition other = (VariableDefinition) obj;
	    if (name == null) {
		if (other.name != null)
		    return false;
	    } else if (!name.equals(other.name))
		return false;
	    if (scope != other.scope)
		return false;
	    return true;
	}

	private int column;
	private int scope;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Type getType() {
		return type;
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
		return "VariableDefinition [name=" + name + ", type=" + type + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}
	
	@Override
	public int getScope() {
		return scope;
	}

	@Override
	public void setScope(int scope) {
		this.scope = scope;
		
	}
}
