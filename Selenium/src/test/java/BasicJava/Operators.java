package BasicJava;

public class Operators {
	// java tehck therms aobut + two purpoes adding nubmers, concatenat
	// polimorphism 

	public static void main(String args[]) {
		// Using operators  
		//assignments Operator "="
		
		int a= 8;
		double b= 4.2;
		
		// Arithmetic Operators": +,-,*,/,%(Reminder), ++, --
		double sum = a + b;
		
		a= 10 + a; // adding number if both are numbers 
		a++;
		String firstname="Babek";
		String lastname="Chalabi";
		String fullName= firstname + "   " +   lastname ; // concatenate if both are not numbers 
		System.out.println(fullName);
		System.out.println("Sum of " + a + " and " + b +" = " + sum);
		
		sum = 430 + 249;
		System.out.println("Sum of 430 and 249 is: " + sum);
		
		double mul = (a * b);
		System.out.println("a" + " * "+ "b"+ " = "+ mul);
		
		a= 4;
		b=3;
		double div = a/b;
		System.out.println("a" + "/"+"b"+ " = " + div);
		double rem = a%b;
		System.out.println("a"+"%"+"b"+ " = "+ rem);
		
		a = 12;
		a++;   // will add one unit to a will print 12+1 = 13
		System.out.println(a);
		
		a--;  // will subtract one unit from a and will print 12-1 =11
		System.out.println(a);

	}

}
