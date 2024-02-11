
public class BooleanAndRelationalOp {
	public static void main(String[] args) {
		int x = 10, y = 3;
		boolean result;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		result = true;
		System.out.println("Value for boolean variable: " + result);
		
		result = false;
		System.out.println("Value for boolean variable: " + result);
		
		result = x == y;
		System.out.println("x == y: " + result);

		result = x != y;
		System.out.println("x != y: " + result);

		result = x < y;
		System.out.println("x < y: " + result);

		result = x > y;
		System.out.println("x > y: " + result);
		
		result = x <= y;
		System.out.println("x <= y: " + result);
		
		result = x >= y;
		System.out.println("x >= y: " + result);
	}
}
