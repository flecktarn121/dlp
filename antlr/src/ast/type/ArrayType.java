package ast.type;

import ast.expression.Expression;
import ast.expression.literal.IntegerLiteral;
import visitor.Visitor;

public class ArrayType extends AbsractType {
	public static final String NAME = "array type";
	private Type typeOf;
	private Expression size;
	private int line;
	private int column;

	public ArrayType(Type typeOf, Expression size) {

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
		if (this.typeOf.isArray()) {
			// if what we are passed is the new dimension of an array, and we already are an
			// array of arrays, pass it to the next dimension
			((ArrayType) this.typeOf).setTypeOf(typeOf);
		} else {
			this.typeOf = typeOf;
		}
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

		return NAME;
	}

	@Override
	public boolean isArray() {
		return true;
	}

	@Override
	public int getSizeBytes() {
		return this.typeOf.getSizeBytes() * ((IntegerLiteral) this.size).getValue();
	}

	@Override
	public Type arrayAccess(Type type) {
		if (type.isError()) {
			// if it is an error, we do not care
			return type;
		}
		return this.typeOf;
	}
}
