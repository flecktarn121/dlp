package ast.type;

import ast.expression.Expression;
import visitor.Visitor;

public class ArrayType extends AbsractType{
	private Type typeOf;
	private Expression size;
	private int line;
	private int column;

	public ArrayType(Type typeOf, Expression size) {
		if (typeOf instanceof ArrayType) {
			Expression oldSize = this.size;
			Type oldType = this.typeOf;
			((ArrayType) typeOf).setSize(oldSize);
			((ArrayType) typeOf).setTypeOf(oldType);
		}
		this.typeOf = typeOf;
		this.size = size;
	}

	public ArrayType(Type typeOf, Expression size, int line, int column) {
		this(typeOf, size);
		this.line = line;
		this.column = column;
	}

	public Type getTypeOf() {
		return typeOf;
	}

	public void setTypeOf(Type typeOf) {
		this.typeOf = typeOf;
	}

	public Expression getSize() {
		return size;
	}

	public void setSize(Expression size) {
		this.size = size;
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
		return "ArrayType [typeOf=" + typeOf + ", size=" + size + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}


	@Override
	public String getName() {
		
		return "array type";
	}
}
