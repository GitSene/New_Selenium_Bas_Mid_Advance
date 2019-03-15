package advancedJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileUsingBufferedReader {

	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		// reading from file using buffered reader java class
		// get file path

		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\advancedJava\\File1";
		// open the file
		// store into buffer

		br = new BufferedReader(new FileReader(filePath));
		String line;
		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}

	}

}
