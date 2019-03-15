package advancedJava;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterToWriteToTextFile {

	private static Writer wr;

	public static void main(String[] args) throws IOException {
		// Using FileWriter to write to text file
		// FilePath
		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\advancedJava\\File1";
		wr = new FileWriter(filePath);
		String[] name = { "Babek", "Jackson", "Sara", "Naz", "Barak" };
		wr.write("Student Names: \n");
		for (int i = 0; i < name.length; i++) {
			wr.write(name[i]);
			wr.write("\n");

		}
		wr.flush();
	}

}
