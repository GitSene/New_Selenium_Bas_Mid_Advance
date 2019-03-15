package advancedJava;

import java.io.*;

public class DemoWritingTofile1 {

	public static void main(String[] args) throws IOException {
		// File class
		// fileWriter class
		// PrintWriter class

		File Babek = new File("C:\\Users\\Babek Chalabi\\Desktop\\Selenium\\src\\test\\java\\advancedJava\\Babek"); // creating a File object called Faile2
		FileWriter fw = new FileWriter(Babek, true); // Created a FileWriter object called fw
		PrintWriter pw = new PrintWriter(fw); // Created a PrinterWriter object called pw

		pw.println("Line A");
		pw.println("Line B");
		pw.println("Line C");
		pw.println("Line D");
		pw.close();

	}

}
