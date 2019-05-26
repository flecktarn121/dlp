package ast.type;

import ast.expression.Expression;
import ast.expression.literal.IntegerLiteral;
import visitor.Visitor;

public class ArrayType extends AbsractType {
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

		return "array type";
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
		if (type.isArray()) {
			ArrayType arrayType = (ArrayType) type;
			// if it is an array, check that the type they contain is the same
			if (!this.typeOf.getName().equals(arrayType.typeOf.getName())) {
				return new ErrorType("Type mismatch on the array access", this.getLine(), this.getColumn());
			} else {
				// if it is the same, check whether we need to recursively check more arrays or
				// we are done
				if (this.typeOf.isArray()) {
					this.typeOf.arrayAccess(arrayType.typeOf);
				} else {
					return this.typeOf;
				}
			}
		}
		return new ErrorType("Cannot perform an array access over " + type.getName(), this.getLine(), this.getColumn());
	}
}
