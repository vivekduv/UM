package programs;
import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in); //allows for keyboard input from the user 	
		
		System.out.print("Enter x: "); 
		int x = keyboardInput.nextInt(); // stores input for x value 
	
		
		System.out.print("Enter y: ");
		int y = keyboardInput.nextInt(); // stores input for y value 
		
		int remainder = x%y; // finds remainder of value x and y 
		
		System.out.println("Remainder: " + remainder); // prints out the remainder 
		
		if (remainder == 0) {
			System.out.print (x + " is divisible by " + y); // if the remainder is equal to zero x is divisible by y
		} else {
			System.out.print (x + " is NOT divisible by " + y); // if the remainder is not equal to zero x is not divisible by y
		}
		
		keyboardInput.close(); // closes scanner 
	}
}