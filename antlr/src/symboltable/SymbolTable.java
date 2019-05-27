package symboltable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ast.definition.Definition;

/**
 * Class to represent the symbol table of the compiler, that is, the data
 * structure used to store the identifiers of definitions
 * 
 * @author Ángel García Menéndez
 *
 */
public class SymbolTable {

	public static final int GLOBAL_SCOPE = 0;
	private int scope = GLOBAL_SCOPE;
	private List<Map<String, Definition>> table;
	private static SymbolTable instance = new SymbolTable();

	private SymbolTable() {
		table = new ArrayList<Map<String, Definition>>();
		table.add(new HashMap<String, Definition>());
	}

	/**
	 * The instance of the current symbol table
	 * 
	 * @return
	 */
	public static SymbolTable getInstance() {
		return instance;
	}

	/**
	 * Increment the scope one level. This should be called every time we enter a
	 * function.
	 */
	public void set() {
		++scope;
		table.add(new HashMap<String, Definition>());
	}

	/**
	 * Return to the previous scope. SHould be called when leaving fucntions
	 */
	public void reset() {
		table.remove(scope);
		--scope;
	}

	/**
	 * Inserts a new definition. If it is already stored, returns false
	 * 
	 * @param definition
	 * @return true if it has been inserted, false otherwise
	 */
	public boolean insert(Definition definition) {
		if (this.findInCurrentScope(definition.getName()) != null) {
			return false;
		} else {
			definition.setScope(scope);
			table.get(scope).put(definition.getName(), definition);
			return true;
		}
	}

	/**
	 * Returns the definition for the given id if it is present on the table, null
	 * otherwise
	 * 
	 * @param id
	 * @return the definition for the id, or null if it is no
	 */
	public Definition find(String id) {
		int scope = this.scope;
		Definition definition = null;
		while (scope >= 0 && definition == null) {
			definition = table.get(scope).get(id);
			--scope;
		}
		return definition;
	}

	/**
	 * Search for a definition only in the current scope
	 * @param id
	 * @return
	 */
	public Definition findInCurrentScope(String id) {
		return table.get(scope).get(id);
	}
}
