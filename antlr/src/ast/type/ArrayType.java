package ast.type;

public class ArrayType implements Type {
	private Type typeOf;
	private int size;

	public Type getTypeOf() {
		return typeOf;
	}

	public void setTypeOf(Type typeOf) {
		this.typeOf = typeOf;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
