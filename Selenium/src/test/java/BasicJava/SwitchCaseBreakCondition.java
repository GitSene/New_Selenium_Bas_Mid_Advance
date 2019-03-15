package BasicJava;

public class SwitchCaseBreakCondition {

	public static void main(String[] args) {
		// how to use switch case to print week day
		// 1 -> Sunday ----7 Saturday 
		// you can compare string and it compare only byte, short, int or char
		// == operation works
		
		int iDay = 8;
		switch(iDay)
		
		{case 1:
			System.out.println("Today is Sunday");
			break;
		case 2:
			System.out.println("Today is Monday");
			break;
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
			System.out.println("Today is Wednesday");
			break;
		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
		case 7:
			System.out.println("Today is Saturday");
			default:
				// This will run
				System.out.println("No matching day");
			
		}

	}

}
