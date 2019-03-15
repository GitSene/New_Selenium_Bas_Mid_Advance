package BasicJava;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical Operator, is combination of two relational operators
		// &&, [true/false] &&[true/false]
		// ||,[true/false] || [true/false]
		// is (a>b and b.>c), we need for such type logical operators
		 // && for and operator, and || or Operator
		// is(a>b || a<c)
		
		int a = 2;
		int b = 4;
		int c = 10;
		boolean t1 = (a==b); //false 
	
		boolean t2 = (a < c); // true
		boolean t3 = t1 && t2; // is a==b? and a<c?
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		 t3 = t1 || t2;
		System.out.println(t3);
		

	}

}
