package MediumJava;

public class Calculator {

	public static void main(String[] args) {
		// adding two number
		int sum1= add(3,4);
		int sum2= add(3,9);
		int sum3= add(2,8);
		int sum4= add(6,1);
		int total= add(sum1, sum2) + add(sum3, sum4);
		System.out.println("total is: " + total);
		// Multiplication method 
		int mult = mul(20,5);
		System.out.println("Mult resualt is: " + mult);
		
		// Subtract method
		double subt = sub(50,18);
		System.out.println("Subtract of two number is: " + subt);
	}
	
   public static int add(int a, int b) {
	int sum = a + b ;
	System.out.println(sum);
	return sum;
		
}
   public static int mul(int a, int b) {
	
	int mult= a * b ;
	return mult;
  }
   
   private static int sub(int i, int j) {
		
		int subt= i-j ;
		return subt;
   }
   

   
   }
   
