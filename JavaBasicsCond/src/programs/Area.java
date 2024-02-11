package programs;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in); // allows user input from keyboard

		System.out.print("Enter base: ");
		double base = keyboardInput.nextDouble(); // user enters intended base value

		System.out.print("Enter height: ");
		double height = keyboardInput.nextDouble(); // user enters intended height value

		double area = (base * height) / 2; // area formula

		System.out.print("Area is: " + area);
		// prints out the following "Area is:" and then outputs area based on the base
		// and height input

		keyboardInput.close(); // closes scanner
	}
}