
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import parser.CmmLexer;
import parser.CmmParser;
import parser.ErrorHandler;
import visitor.Visitor;
import visitor.semantic.IdentificationVisitor;
import visitor.semantic.LValueVisitor;
import visitor.semantic.TypeCheckingVisitor;

public class Main {

    public static void main(String... args) throws Exception {
//		   if (args.length<1) {
//		        System.err.println("Please, pass me the input file.");
//		        return;
//		    }

	// create a lexer that feeds off of input CharStream

	CharStream input = CharStreams.fromFileName("input/input(OLD).txt");
	CmmLexer lexer = new CmmLexer(input);

	// create a parser that feeds off the tokens buffer
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	CmmParser parser = new CmmParser(tokens);
	Program ast = parser.program().ast;

	// * The AST is shown
	IntrospectorModel model = new IntrospectorModel("Program", ast);
	new IntrospectorTree("Introspector", model);

	// We visit the ast
	Visitor<Void, Void> visitor = new LValueVisitor();
	ast.accept(visitor, null);
	System.out.println("============ LValue check ============");
	if (!ErrorHandler.getInstance().anyError()) {
	    System.out.println("The program has no LValue errors.");
	} else if (ErrorHandler.getInstance().anyError()) {
	    ErrorHandler.getInstance().showErrors(System.err);
	    ErrorHandler.getInstance().clearErrors();
	}

	visitor = new IdentificationVisitor();
	ast.accept(visitor, null);
	System.out.println("============ Identification check ============");
	if (!ErrorHandler.getInstance().anyError()) {
	    System.out.println("The program has no identification errors.");
	} else if (ErrorHandler.getInstance().anyError()) {
	    ErrorHandler.getInstance().showErrors(System.err);
	    ErrorHandler.getInstance().clearErrors();
	}

	ast.accept(new TypeCheckingVisitor(), null);
	System.out.println("============ Type check ============");
	if (!ErrorHandler.getInstance().anyError()) {
	    System.out.println("The program has no type errors.");
	} else if (ErrorHandler.getInstance().anyError()) {
	    ErrorHandler.getInstance().showErrors(System.err);
	    ErrorHandler.getInstance().clearErrors();
	}
    }
}
