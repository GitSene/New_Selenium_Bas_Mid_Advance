package advancedJava;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ReadingFromFileUsingScanner {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		// reading from file using Scanner java class
		// get file path

		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\advancedJava\\File1";
		File file = new File(filePath);
		sc = new Scanner(file);
		while (sc.hasNextLine()) {

			System.out.println(sc.nextLine());
		}

	}

}

 