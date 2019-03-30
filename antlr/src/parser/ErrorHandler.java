package parser;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import ast.type.ErrorType;

public class ErrorHandler {
	private static ErrorHandler instance = new ErrorHandler();
	private List<ErrorType> errors = new ArrayList<ErrorType>();

	private ErrorHandler() {

	}

	public static ErrorHandler getInstance() {
		return instance;
	}

	public boolean anyError() {
		return !errors.isEmpty();
	}

	public void addError(ErrorType error) {
		errors.add(error);
	}

	public void showErrors(PrintStream out) {
		errors.forEach((error) -> out.println(error.toString()));
	}
	
	public void clearErrors() {
	    errors.clear();
	}
}
