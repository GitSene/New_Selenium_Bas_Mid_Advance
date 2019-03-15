package MediumJava;

public class Student {
	public static void main(String[] args) {
		Registration r = new Registration();

		r.registor("Babek", "Chalabi", 32, "2029039205");
		Registration.printStudentInfo();

		Registration r2 = new Registration();

		r2.registor("Sara", "Schmit", 30, "2029039325");
		Registration.printStudentInfo();

		Registration r3 = new Registration();
		r3.registor("Aynaz", "Ale", 22, "2029038932");
		Registration.printStudentInfo();
	}

}
