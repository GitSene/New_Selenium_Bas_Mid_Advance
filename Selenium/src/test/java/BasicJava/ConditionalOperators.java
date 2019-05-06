package BasicJava;

public class ConditionalOperators {

	public static void main(String[] args) {
		// Applying conditional operator
		// Syntax is
		// (expression) ? value if expression is true: value if expression is false;

		int a = 4;
		double b = 5.4;
		int c = 10;
		boolean t1 = (a > b); // false
		boolean t2 = (a < c); // true
		boolean t3 = (a < b); // true

		System.out.println(t3);
		System.out.println(t2);
		System.out.println(t1 ? "This is true expression" : "This expression is false");
		System.out.println((a - 5 < (c * 9 / 2)) ? "That is true" : "That is false");

	}

}
