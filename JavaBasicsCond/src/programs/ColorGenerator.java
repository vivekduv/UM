package programs;

import java.util.Scanner;

public class ColorGenerator {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in); // allows for user input 
		
		System.out.print("Do you want red? (Yes/Yeah/No): "); 
		String red = keyboardInput.next(); // Stores input for whether or not the user wants the color red
		
		System.out.print("Do you want green and blue? (Yes/Yeah/No): ");
		String greenAndBlue = keyboardInput.next(); // Stores input for whether or not the user wants the colors green and blue
		
		String finalColor = ""; // empty String 
		
		if (red.equals("Yes") || red.equals("Yeah")) { // if Yes or Yeah is input then #FF will be printed if No is input #00 will be printed 
			finalColor = "#FF";
		} else {
			finalColor = "#00";
		}
		
		if (greenAndBlue.equals("Yes")|| greenAndBlue.equals("Yeah")) {
			finalColor = finalColor + "FFFF"; //updates final color to add FFFF is user inputs Yes or Yeah
		} else {
			finalColor = finalColor + "0000"; //updates final color to add 0000 is user inputs No 
		}
		
		System.out.println("Final Color: " + finalColor); //prints out updated final color 
		
		keyboardInput.close(); // closes scanner 
	}
}