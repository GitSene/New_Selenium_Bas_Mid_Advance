package BasicJava;

public class ifElsecondition {

	public static void main(String[] args) {
		// Using if else statement to give grade report
		// >= 90 score A- score 94+ is A+
		// 90 > x > 80, then score B
		// 80 > x > 70 , then score C
		// 70 > x > 60 , then score D
		// x < 60, then score F

		String grade = "N";
		String sName = "Babek";
		double result = 70;

		if (result > 100) {
			grade = " not valid";
		} else if (result >= 90) {
			if (result >= 94) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (result >= 80) {
			grade = "B";
		}

		else if (result >= 70) {
			grade = "C";
		}

		else if (result >= 60) {
			grade = "D";
		}

		else {
			grade = "F";
		}

		System.out.println("Hi " + sName + " your score is " + grade);

	}

}
