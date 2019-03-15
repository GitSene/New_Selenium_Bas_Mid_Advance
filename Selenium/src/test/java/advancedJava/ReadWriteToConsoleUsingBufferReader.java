package advancedJava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadWriteToConsoleUsingBufferReader {

	public static void main(String[] args)  throws IOException {
		// reading from console
		// system in is standard input (keyboard)
		// streamReader is a pipe that used to pass data from input to your destination 
		// buffer is a collector
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome");
		System.out.print("Enter your name: ");
		String name = br.readLine();
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Your name is: " +name+ "  and your age is:  "+age);
		

	}

}
