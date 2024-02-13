package programs;

import java.util.Scanner;

public class Access {

	/* public static void main(String[] args) {
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
*/
import java.util.Scanner;

	public class PasswordAccess {

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			final String correctPassword = "terps";
			final int correctNumber = 1847;
			final int maxAttempts = 3;

			String enteredPassword = "";
			int enteredNumber;
			int attempts = 0;
			boolean accessGranted = false;

			while (attempts < maxAttempts && !enteredPassword.equalsIgnoreCase(correctPassword)) {

				System.out.println("Enter password:");
				enteredPassword = scanner.nextLine();

				if (!"quit".equalsIgnoreCase(enteredPassword)) {
					System.out.println("Enter number:");
					enteredNumber = scanner.nextInt();
					scanner.nextLine();  // consume the new line character that is skipped by nextInt

					if (correctPassword.equalsIgnoreCase(enteredPassword) && enteredNumber == correctNumber) {
						System.out.println("Access Granted");
						accessGranted = true;
						attempts = maxAttempts;
					} else {
						System.out.println("Wrong credentials");
						attempts++;
					}
				} else {
					attempts = maxAttempts;  // to stop the loop
				}
			}

			if (!accessGranted) {
				System.out.println("Access Denied");
			}
		}
	}
	import java.util.Scanner;

	public class Access {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			String passwordInput = "";
			int numInput = 0;
			int attempts = 0;
			final int maxAttempts = 3;


			while (attempts < maxAttempts) {

				System.out.print("Enter password: ");
				passwordInput = scanner.next();

				if (!passwordInput.equals("quit")) {

					System.out.print("Enter number: ");
					numInput = scanner.nextInt();


					if (passwordInput.equals("terps") && numInput == 1847) {
						System.out.println("Access Granted");
						attempts = maxAttempts;

					} else {
						System.out.println("Wrong credentials");
						attempts++;
					}

				} else {
					attempts = maxAttempts;
				}
			}
			if (!passwordInput.equals ("terps") || numInput != 1847) {
				System.out.println("Access Denied");

			}
			scanner.close();
		}

	}
