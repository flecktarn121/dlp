package visitor.semantic;

import ast.expression.ArrayAccess;
import ast.expression.BooleanNegation;
import ast.expression.Cast;
import ast.expression.FieldAccess;
import ast.expression.FunctionCall;
import ast.expression.UnaryMinus;
import ast.expression.Variable;
import ast.expression.binary.BinaryOperation;
import ast.expression.literal.CharacterLiteral;
import ast.expression.literal.IntegerLiteral;
import ast.expression.literal.RealLiteral;
import ast.expression.literal.VoidLiteral;
import ast.statement.If;
import ast.statement.Return;
import ast.type.CharType;
import ast.type.ErrorType;
import ast.type.IntType;
import ast.type.RealType;
import ast.type.Type;
import ast.type.VoidType;
import parser.ErrorHandler;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void> {

	@Override
	public Void visit(CharacterLiteral e, Type param) {
		e.setType(new CharType());
		return null;
	}

	@Override
	public Void visit(RealLiteral e, Type param) {
		e.setType(new RealType());
		return null;
	}

	@Override
	public Void visit(IntegerLiteral e, Type param) {
		e.setType(new IntType());
		return null;
	}

	@Override
	public Void visit(VoidLiteral e, Type param) {
		e.setType(new VoidType());
		return null;
	}

	@Override
	public Void visit(ArrayAccess e, Type param) {
		// TODO Auto-generated method stub
		return super.visit(e, param);
	}

	@Override
	public Void visit(BooleanNegation e, Type param) {
		super.visit(e, param);
		if (e.getOperand().getType().isLogical()) {
			e.setType(new IntType());
		} else {
			ErrorType error = new ErrorType("Cannot negate a non logical expression", e.getLine(), e.getColumn());
			e.setType(error);
			ErrorHandler.getInstance().addError(error);
		}
		return null;
	}

	@Override
	public Void visit(Cast e, Void param) {
		super.visit(e, param);
		if (e.getType().isComplex()) {
			ErrorType error = new ErrorType("Cannot cast a complex type", e.getLine(), e.getColumn());
			e.setType(error);
			ErrorHandler.getInstance().addError(error);
		}
		return null;
	}

	@Override
	public Void visit(FieldAccess e, Void param) {

		return super.visit(e, param);
	}

	@Override
	public Void visit(FunctionCall e, Void param) {
		return super.visit(e, param);
	}

	@Override
	public Void visit(UnaryMinus e, Void param) {
		super.visit(e, param);
		if (e.getOperand().getType().isNumber()) {
			e.setType(e.getOperand().getType());
		} else {
			ErrorType error = new ErrorType("Cannot negate a non number expression.", e.getLine(), e.getColumn());
			e.setType(error);
			ErrorHandler.getInstance().addError(error);
		}
		return null;
	}

	@Override
	public Void visit(If e, Void param) {
		super.visit(e, param);
		if (!e.getCondition().getType().isLogical()) {
			ErrorHandler.getInstance()
					.addError(new ErrorType("The condition is not boolean", e.getLine(), e.getColumn()));
		}
		return null;
	}

	@Override
	public Void visit(BinaryOperation e, Void param) {
		super.visit(e, param);
		e.setType(e.getLeft().getType().arithmetic(e.getRight().getType()));
		if (e.getType().getName().equals(ErrorType.NAME)) {
			ErrorHandler.getInstance().addError((ErrorType) e.getType());
		}
		return null;
	}

	@Override
	public Void visit(Variable e, Void param) {
		e.setType(e.definition().getType());
		return null;
	}

	@Override
	public Void visit(Return e, Type param) {
		// we have passed here the type of the fucntion definition
		if (!e.getValue().getType().getName().equals(param.getName())) {
			ErrorType error = new ErrorType("The return type should be " + param.getName(), e.getValue().getLine(),
					e.getValue().getColumn());
			e.setType(error);
			ErrorHandler.getInstance().addError(error);
		}
		return super.visit(e, param);
	}

	// TODO: set the type of all the expressions
	// TODO: type check things in statement, although nothing needs to be checked
	// there
	// TODO: complex types cannot be casto or read/written, returned or being
	// declared as parameter
	// TODO: to th visit method of the return , you need to pass the function
	// definiion, in oder to

}
