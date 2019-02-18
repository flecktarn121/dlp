package parser;

public class LexerHelper {

	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String text) {

		return text.charAt(0);
	}

	public static double lexemeToReal(String text) {
		return Double.valueOf(text);
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods

}
