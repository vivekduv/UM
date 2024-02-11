import java.util.Scanner;

public class QuizPractice {

	/* public static void main (String[]args) {
		Scanner s =new Scanner (System.in);
		
		System.out.print("Enter Password: ");
		String password = s.next();
		
		if (password.equals("terps")) {
			System.out.println("Access Granted");
		} else {
			System.out.println("Access Denied");
		}
		
		s.close();
	}
} */

		/* public static void main (String[]args) {
			Scanner s = new Scanner (System.in);
			
			System.out.print("Enter first value: ");
			int firstValue = s.nextInt();
			
			System.out.print("Enter second value: ");
			int secondValue = s.nextInt();
			
			int divisible = firstValue % secondValue; 
			
			if (divisible == 0) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
			s.close();
		}

} */
	
	/* public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter integer value: ");
		int value = s.nextInt();
		int square = value * value;
		
		if (value > 0) {
			System.out.println(square);
		} else {
			System.out.println("\"Invalid Value\"");
		}
		s.close();
	}

} */

	/* public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter cost per credit: ");
		double costPerCred = s.nextDouble();
		
		System.out.print("Enter number of credits: ");
		double numOfCreds = s.nextDouble();
		
		double total = costPerCred * numOfCreds;
		
		double totalHalf = (costPerCred * numOfCreds)/2;
		
		if (numOfCreds >= 18) {
			System.out.println("Please pay: " + totalHalf);
		} else {
			System.out.println("Please pay: " + total);
		}
		s.close();
	} */
	
	
	
	/* public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a: ");
		int a = scanner.nextInt();
		
		int equation = ((a*a)/4)+7;
		int odd = a%2;
		
		if (a==0 || odd!=0) {
			System.out.println("WD");
		} else {
			System.out.println("Ans:" + equation);
		}
		scanner.close();
	} */

	
	
	/* public static void main (String[]args) {
	Scanner s = new Scanner (System.in);
	
	System.out.print("Enter your name: ");
	String name = s.next();
	
	System.out.println("Your name has " + name.length() + " letters in it.");
	
	System.out.print("How many books did you read for fun? ");
	int books = s.nextInt();
	
	if (books < 2) {
		System.out.println("Read More!");
	} else if (2 <= books && books < 5) {
		System.out.println("Good!");  
	} else { 
		System.out.println("Wow!");
		}
	s.close();
		} */
	
	
	
	/* public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		String name = s.nextLine();
		
		if (name.length() < 5) {
			System.out.println(name + "*");	
		} else if (name.length() < 8) {
			System.out.println(name + " " + name);
		} else {
			System.out.println(name.toUpperCase());	
		}
		s.close();
	}
} */ 
	
	/* public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter value of a: ");
		int a = scanner.nextInt();
		
		System.out.print("Enter value of b: ");
		int b = scanner.nextInt();
		
		int expression = (a*a)/b;
		
		if (a==0 || b==0) {
			System.out.println("Invalid value(s)");
		} else {
			System.out.println("Answer: " + expression);
		}
		scanner.close();
	}
} */
	public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		
		String word = ""; 
		System.out.print("Enter the secret word: ");
		word = s.nextLine();
		
		if (word.equals("Terps")) {
			System.out.println("Correct");
		} else if (word.length() < 5) {
			System.out.println("Less");
		} else if (word.length() > 5) {
			System.out.println("More");
		} else {
			System.out.println("Same");
		}
		s.close();
		}
	}

	

