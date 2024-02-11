package programs;

import java.util.Scanner;

public class Access {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String passwordInput = "";
		int numInput;
		int counter = 1;
		boolean loopAgain = true;
		boolean quit = false;

		while (!quit && loopAgain && counter++ <= 3) {

			System.out.print("Enter password: ");
			passwordInput = scanner.next();

			if (!passwordInput.equals("quit")) {

				System.out.print("Enter number: ");
				numInput = scanner.nextInt();

				if (passwordInput.equals("terps") && numInput == 1847) {
					System.out.println("Access Granted");
					loopAgain = false;

				} else {
					System.out.println("Wrong credentials");
					loopAgain = true;

				}

			} else {
				quit = true;
			}
		}
		if (loopAgain && quit) {
			System.out.println("Access Denied");

		}
		scanner.close();
	}

}
