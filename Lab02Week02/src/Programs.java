import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {

		// Uncomment to run! :)
		// increasing();
		// maximum();
		// grade();
	}

	public static void increasing() {
		// Write a program that reads 3 integer values and
		// checks if they are increasing
		Scanner s = new Scanner(System.in);

		int a, b, c;

		System.out.println("Enter in three integer values");

		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		if (a < b) {
			if (b < c) {
				System.out.println("Increasing");
			} else {
				System.out.println("Not increasing");
			}
		} else {
			System.out.println("Not increasing");
		}

		s.close();
	}

	public static void maximum() {
		Scanner s = new Scanner(System.in);

		double a, b, c;

		System.out.println("Enter 3 double values");

		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();

		double d = Math.max(Math.max(a, b), c);

		System.out.println("Max: " + d);
		
		s.close();
	}

	public static void grade() {
		Scanner s = new Scanner(System.in);

		double a, b;

		System.out.println("Input two double values");

		a = s.nextDouble();
		b = s.nextDouble();

		double avg = (a + b) / 2;

		if (avg <= 100 && avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		
		s.close();
	}

}
