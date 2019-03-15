package MediumJava;

public class Registration {

	 static String firstName;
	private static String lName;
	private static int age;
	private static String department ="computer Science";
	private static int year = 2018;
	private static String phoneNo;
	
	public void registor(String fName, String lName,int age, String phone ) {
		firstName = fName;
		Registration.lName = lName;
		Registration.age = age;
		phoneNo = phone;
		
	}
	
	public static void printStudentInfo() {
		
		System.out.println("Student full name is: " + firstName+ " " +lName);
		System.out.println("I am " + age + " years old");
		System.out.println("I would like to attend  " + department+" program in  " + year);
		System.out.println("Please call me: " +phoneNo);
	

	}

}
