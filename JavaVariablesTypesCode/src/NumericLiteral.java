
public class NumericLiteral {

	public static void main(String[] args) {
		int age = 34; // 34 is numeric literal;
		
		System.out.println("Age: " + age);
		
		byte size = 127; // 128 will not compile
		System.out.println("size: " + size);
		size = -128; // -129 will not compile
		System.out.println("size: " + size);
		
		/* In the next example we need the L as the value is 
		 * too large for int.  We could have used lowercase L
		 * but avoid it (lowercase L gets confused with number 
		 * one
		 */
		System.out.println("The large value is " + 10000000000L);
		
		// 17.75 It is a double numeric literal by default (occupies 8 bytes)
		double cost = 17.75;
		System.out.println("Cost:" + cost);

		// Without F or f will not work as you cannot assign float to double
		float costTwo = 17.75F;
		System.out.println("CostTwo: " + costTwo);
		
		/* In the next example we may not add an F (or f) after .50 as the 
		 * value is  too large for a float (we need a double). 
		 */
		System.out.println("The large value is " + 999999999999999999999999999999999999999.50);
	}
}