import java.util.Scanner;

/* Try with inputs: */
/* hello and goodbye */
public class NextVsNextLine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    boolean usingNextLine = false; /* Try setting to true */
	    String n1, n2;

	    int x;
	    x = scanner.nextInt();
	    
	    if (usingNextLine) {
	    	n1 = scanner.nextLine(); 
		    n2 = scanner.nextLine();
	    } else {
	    	n1 = scanner.nextLine();
	    	n2 = scanner.nextLine();
	    }
	    System.out.println("x: " + "\"" + x + "\"");
	    System.out.println("First: " + "\"" + n1 + "\"");
		System.out.println("Second: " +"\"" + n2 + "\"");
		
		scanner.close();
		
	}
}
