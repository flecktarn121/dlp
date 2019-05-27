package visitor.codegen;

import java.util.HashMap;
import java.util.Map;

import ast.type.ArrayType;
import ast.type.CharType;
import ast.type.IntType;
import ast.type.RealType;

public class CodeGenUtils {

	private Map<String, String> suffixes = new HashMap<String, String>();
	private Map<String, String> operators = new HashMap<String, String>();

	public CodeGenUtils() {
		loadSuffixes();
		loadOperators();
	}

	private void loadOperators() {
		operators.put("+", "add");
		operators.put("-", "sub");
		operators.put("*", "mul");
		operators.put("/", "div");
		operators.put("%", "mod");
		operators.put("<", "lt");
		operators.put(">", "gt");
		operators.put("<=", "le");
		operators.put("=>", "ge");
		operators.put("==", "eq");
		operators.put("&&", "and");
		operators.put("||", "or");

	}

	private void loadSuffixes() {
		suffixes.put(ArrayType.NAME, "i");
		suffixes.put(CharType.NAME, "b");
		suffixes.put(RealType.NAME, "f");
		suffixes.put(IntType.NAME, "i");
	}

	/**
	 * Given a valid type name, returns its corresponding MAPL suffix.
	 * 
	 * @param typeName
	 * @return MAPL suffix
	 */
	public String toSuffix(String typeName) {
		if (!suffixes.containsKey(typeName)) {
			throw new IllegalArgumentException("The type " + typeName + " does not have a suffix");
		}
		return suffixes.get(typeName);
	}

	/**
	 * Given an operation in C--, returns its equivalent in MAPL
	 * 
	 * @param operation in C--
	 * @return the operation in MAPL
	 */
	public String getOperator(String operation) {
		if (!operators.containsKey(operation)) {
			throw new IllegalArgumentException("The operation " + operation + " is not present in MAPL");
		}
		return operators.get(operation);
	}
}
