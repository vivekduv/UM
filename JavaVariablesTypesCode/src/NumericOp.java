
public class NumericOp {
	public static void main(String[] args) {
		int x = 11, y = 3, result;

		System.out.println("\n***** Using int type *****");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		result = x * y;
		System.out.print("x * y: " + result);

		result = x / y;
		System.out.print(", x / y: " + result);

		result = x % y;
		System.out.print(", x % y: " + result);

		result = x - y;
		System.out.print(", x - y: " + result);

		
		System.out.println("\n\n***** Using double type *****");
		double a = 11.0, b = 3.0, resultDouble;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		resultDouble = a * b;
		System.out.print("a * b: " + resultDouble);

		resultDouble = a / b;
		System.out.print(", a / b: " + resultDouble);

		resultDouble = a % b;
		System.out.println(", a % b: " + resultDouble);

		resultDouble = a - b;
		System.out.print(", a - b: " + resultDouble);
		
		System.out.println("\n\n***** Integer division example *****");
		System.out.println("Three divided by four: " + 3 / 4);
	}
}
