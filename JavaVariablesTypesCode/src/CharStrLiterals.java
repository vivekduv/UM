
public class CharStrLiterals {

	public static void main(String[] args) {
		char letterGrade;

		System.out.println("***** Character literals *****");
		letterGrade = 'F'; // Single quotes allow only a single character
						   // Character literal
		System.out.println("Bad letter grade: " + letterGrade);

		char position;
		position = '2'; // It is just a digit
		System.out.println("Position: " + position);

		char doubleQuote = '"';
		System.out.println("double quote: " + doubleQuote);
		String emptyString = "";
		System.out.println("Empty string: " + emptyString); // OK to have nothing ""

		char singleQuote = '\''; // You cannot have '' (empty)
		System.out.println("single quote: " + singleQuote);

		char blankChar = ' ';
		System.out.println("BLANK" + blankChar + "BLANK");

		
		
		System.out.println("\n***** String literals *****");
		String name, bff, wff;
		name = "Robert Smith";
		System.out.println("Name: " + name);

		bff = "Mark \"Mike\" Smith"; // Escape sequence \"
		System.out.println("bff:" + bff);

		wff = "Karen 'Kar\' "; // No problem using single quote
		System.out.println("wff: " + wff);

		String path = "C:\\weekday\\Saturday";
		System.out.println("path:" + path);

		String pathTwo = "C:\\weekday\\friday"; /* weekday\friday will use \f (form feed) */
		// weekday\friday will use \f (form feed)
		// \f (form feed) indicates to a printer to start a new page
		System.out.println("pathTwo:" + pathTwo);

		String menu = "Menu:\n1.Donuts\n2.Coffee\n3.Tea\n";
		System.out.println(menu);

		System.out.print("Sarah");
		System.out.println("Connor");

		// The following two statements are equivalent
		System.out.println("To Be or Not To Be");
		System.out.print("To Be or Not To Be\n");

		// Multiple empty lines
		System.out.print("\n\n");
		System.out.println("Done");
		
		String friend = ""; // We need to initialize it
		
		friend += "Mary"; // Concatenating (equivalent to friend = friend + "Mary"
		friend += "John";  
	    System.out.println(friend);
		
		// The following can be confusing
		int x = 10, y = 20;
		System.out.println("The values are " + (x + y));
	}
}
