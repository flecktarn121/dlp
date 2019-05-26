package visitor.semantic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.ArrayAccess;
import ast.expression.BooleanNegation;
import ast.expression.Cast;
import ast.expression.Expression;
import ast.expression.FieldAccess;
import ast.expression.FunctionCall;
import ast.expression.UnaryMinus;
import ast.expression.Variable;
import ast.expression.binary.BinaryOperation;
import ast.expression.literal.CharacterLiteral;
import ast.expression.literal.IntegerLiteral;
import ast.expression.literal.RealLiteral;
import ast.expression.literal.VoidLiteral;
import ast.statement.Assigment;
import ast.statement.Function;
import ast.statement.If;
import ast.statement.Read;
import ast.statement.Return;
import ast.statement.While;
import ast.statement.Write;
import ast.type.CharType;
import ast.type.ErrorType;
import ast.type.FunctionType;
import ast.type.IntType;
import ast.type.RealType;
import ast.type.RecordType;
import ast.type.StructType;
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
		
		return null;
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
	public Void visit(Cast e, Type param) {
		super.visit(e, param);
		if (e.getType().isComplex()) {
			ErrorType error = new ErrorType("Cannot cast a complex type", e.getLine(), e.getColumn());
			e.setType(error);
			ErrorHandler.getInstance().addError(error);
		}
		return null;
	}

	@Override
	public Void visit(FieldAccess e, Type param) {
		super.visit(e, param);
		// we get the original definition of the struct
		StructType type = (StructType) e.getStruct().getType();
		// We get the field names
		List<String> fields = type.getFields().stream().map((field) -> field.getFieldName())
				.collect(Collectors.toList());
		if (!fields.contains(e.getFieldName())) {
			ErrorType error = new ErrorType("Unknown field for struct " + e.getRecordName(), e.getLine(),
					e.getColumn());
			e.setType(error);
			ErrorHandler.getInstance().addError(error);
		} else {
			for (RecordType fieldType : type.getFields()) {
				if (fieldType.getFieldName().equals(e.getFieldName())) {
					e.setType(fieldType.getType());
					break;
				}
			}

		}
		return null;
	}

	@Override
	public Void visit(FunctionCall e, Type param) {
		super.visit(e, param);
		if (e.getName().getDefinition().getType().isError()) {
			e.setType(e.getName().getDefinition().getType());
		} else {
			if (e.getParameters().size() != ((FunctionType) e.getName().getDefinition().getType()).getParamType()
					.size()) {
				ErrorType error = new ErrorType("Wrong number of parameters in function " + e.getName().getName(),
						e.getLine(), e.getColumn());
				e.setType(error);
				ErrorHandler.getInstance().addError(error);
			} else {
				ErrorType error = null;
				// Check the type of each of the parameters
				for (int i = 0; i < e.getParameters().size(); i++) {
					Type requiredParamType = ((FunctionType) e.getName().getDefinition().getType()).getParamType()
							.get(i).getType();
					Type actualParamType = e.getParameters().get(i).getType();
					if (requiredParamType.getName().equals(actualParamType.getName())) {
						error = new ErrorType("Parameter in function  " + e.getName().getName() + " should be a "
								+ requiredParamType.getName(), e.getLine(), e.getColumn());
						e.setType(error);
						ErrorHandler.getInstance().addError(error);
						break;
					}
				}
				// if no error has ocurred, set the type of the call to the return type of the
				// definition
				if (error == null) {
					e.setType(((FunctionType) e.getName().getDefinition().getType()).getReturnType());
					param = e.getType();
				}
			}
		}
		return null;
	}

	@Override
	public Void visit(UnaryMinus e, Type param) {
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
	public Void visit(BinaryOperation e, Type param) {
		super.visit(e, param);
		e.setType(e.getLeft().getType().arithmetic(e.getRight().getType()));
		if (e.getType().getName().equals(ErrorType.NAME)) {
			ErrorHandler.getInstance().addError((ErrorType) e.getType());
		}
		return null;
	}

	@Override
	public Void visit(Variable e, Type param) {
		e.setType(e.getDefinition().getType());
		return null;
	}

	// ***********STATEMENTS***********

	@Override
	public Void visit(Return e, Type param) {
		// we have passed here the type of the fucntion definition
		super.visit(e, param);
		if (e.getValue().getType().isComplex()) {
			ErrorType error = new ErrorType("Complex types cannot be returned", e.getValue().getLine(),
					e.getValue().getColumn());
			ErrorHandler.getInstance().addError(error);
		} else if (e.getValue().getType() != null && !e.getValue().getType().getName().equals(param.getName())) {
			ErrorType error = new ErrorType("The return type should be " + param.getName(), e.getValue().getLine(),
					e.getValue().getColumn());
			ErrorHandler.getInstance().addError(error);
		}
		return null;
	}

	@Override
	public Void visit(Read e, Type param) {
		super.visit(e, param);
		ErrorType error = null;
		for (Expression arg : e.getArguments()) {
			if (arg.getType().isComplex()) {
				error = new ErrorType("Cannot read a complex type.", e.getLine(), e.getColumn());
				ErrorHandler.getInstance().addError(error);
				break;
			}
		}
		return null;
	}

	@Override
	public Void visit(Write e, Type param) {
		super.visit(e, param);
		ErrorType error = null;
		for (Expression arg : e.getArguments()) {
			if (arg.getType().isComplex()) {
				error = new ErrorType("Cannot write a complex type.", e.getLine(), e.getColumn());
				ErrorHandler.getInstance().addError(error);
				break;
			}
		}
		return null;
	}

	@Override
	public Void visit(Assigment e, Type param) {
		super.visit(e, param);
		if (!e.getRight().getType().getName().equals(e.getLeft().getType().getName())) {
			ErrorType error = new ErrorType(
					"Cannot assign a " + e.getRight().getType().getName() + " to a " + e.getLeft().getType().getName(),
					e.getLine(), e.getColumn());
			ErrorHandler.getInstance().addError(error);
		}
		return null;
	}

	@Override
	public Void visit(Function e, Type param) {
		super.visit(e, param);
		if (!e.getName().getDefinition().getType().isError()) {

			// Check that the number of parameters is correct
			if (e.getParameters().size() != ((FunctionType) e.getName().getDefinition().getType()).getParamType()
					.size()) {
				ErrorType error = new ErrorType("Wrong number of parameters in function " + e.getName().getName(),
						e.getLine(), e.getColumn());
				ErrorHandler.getInstance().addError(error);
			} else {
				ErrorType error = null;
				// Check the type of each of the parameters
				for (int i = 0; i < e.getParameters().size(); i++) {
					Type requiredParamType = ((FunctionType) e.getName().getDefinition().getType()).getParamType()
							.get(i).getType();
					Type actualParamType = e.getParameters().get(i).getType();
					if (!requiredParamType.getName().equals(actualParamType.getName())) {
						error = new ErrorType("Parameter in function  " + e.getName().getName() + " should be a "
								+ requiredParamType.getName(), e.getLine(), e.getColumn());
						ErrorHandler.getInstance().addError(error);
						break;
					}
				}
			}
		}
		return null;
	}

	@Override
	public Void visit(If e, Type param) {
		super.visit(e, param);
		if (!e.getCondition().getType().isLogical()) {
			ErrorHandler.getInstance()
					.addError(new ErrorType("The condition is not boolean", e.getLine(), e.getColumn()));
		}
		return null;
	}

	@Override
	public Void visit(While e, Type param) {
		super.visit(e, param);
		if (!e.getCondition().getType().isLogical()) {
			ErrorHandler.getInstance()
					.addError(new ErrorType("The condition is not boolean", e.getLine(), e.getColumn()));
		}
		return null;
	}

	@Override
	public Void visit(VariableDefinition e, Type param) {
		super.visit(e, param);
		if (e.getType().isRecord()) {
			List<String> fieldNames = new ArrayList<String>();
			for (RecordType field : ((StructType) e.getType()).getFields()) {
				if (fieldNames.contains(field.getFieldName())) {
					ErrorHandler.getInstance().addError(new ErrorType(
							"Already declared record field " + field.getFieldName(), e.getLine(), e.getColumn()));
					break;
				} else {
					fieldNames.add(field.getFieldName());
				}
			}
		}
		return null;
	}

	@Override
	public Void visit(FunctionDefinition e, Type param) {
		super.visit(e, ((FunctionType) e.getType()).getReturnType());
		ErrorType error = null;
		if (((FunctionType) e.getType()).getReturnType().isComplex()) {
			error = new ErrorType("The return value cannot be a complex type", e.getLine(), e.getColumn());
			e.setType(error);
			ErrorHandler.getInstance().addError(error);
		}
		// get the name of the parameters
		List<String> paramNames = ((FunctionType) e.getType()).getParamType().stream().map((p) -> p.getName())
				.collect(Collectors.toList());
		if (new HashSet<String>(paramNames).size() != paramNames.size()) {
			error = new ErrorType("Repeated values in function " + e.getName(), e.getLine(), e.getColumn());
			e.setType(error);
			ErrorHandler.getInstance().addError(error);
		}

		return null;
	}

	@Override
	public Void visit(Program e, Type param) {
		super.visit(e, param);
		if (!e.getDefinitions().stream().filter((def) -> def.getType().isFunction())
				.anyMatch((def) -> def.getName().equals("main"))) {
			ErrorHandler.getInstance().addError(new ErrorType("Missing main function in the program."));
		}

		return null;
	}

	// TODO: set the type of all the expressions
	// TODO: to th visit method of the return , you need to pass the function
	// definiion, in oder to

}
