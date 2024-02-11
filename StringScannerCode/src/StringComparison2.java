
public class StringComparison2 {
	public static void main(String[] args) {
		String name1 = "Joe";
		String name2 = "Joe";

		/* Another approach to create a string */
		String name3 = new String("Joe");

		/* WRONG WAY TO COMPARE STRINGS, use equals (name1.equals(name2)) */
		System.out.println(name1 == name2);

		/* WRONG WAY TO COMPARE STRINGS, use equals */
		System.out.println(name1 == name3);
	}
}