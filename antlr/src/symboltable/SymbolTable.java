package symboltable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import ast.definition.Definition;

public class SymbolTable {

	private int scope = 0;
	private List<Map<String, Definition>> table;
	private static SymbolTable instance = new SymbolTable();

	private SymbolTable() {
		table = new ArrayList<Map<String, Definition>>();
		table.add(new HashMap<String, Definition>());
	}
	
	public static SymbolTable getInstance() {
		return instance;
	}

	public void set() {
		++scope;
		table.add(new HashMap<String, Definition>());
	}

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

	public Definition findInCurrentScope(String id) {
		return table.get(scope).get(id);
	}
}
