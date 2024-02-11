import java.util.Scanner;

public class Scanner1 {
	/**
	 * Shows basic use of the scanner
	 */
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		int first, second;

		// Using print instead of println
		System.out.print("Enter an integer value: " );
		first = keyboardInput.nextInt();
		
		System.out.print("Enter another integer value: " );
		second = keyboardInput.nextInt();

		System.out.println("The first number you typed was: " + first);
		System.out.println("The second number you typed was: " + second);

		int sum = first + second;
		int product = first * second;
		System.out.println("Their sum is: " + sum);
		System.out.println("Their product is: " + product);

		keyboardInput.close();
	}
}