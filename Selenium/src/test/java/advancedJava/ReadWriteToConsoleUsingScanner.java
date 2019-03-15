package advancedJava;

import java.util.Scanner;

public class ReadWriteToConsoleUsingScanner {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Your name is: " + name + "  and your age is:  " + age);

	}

}
