package advancedJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteToTextFile {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\advancedJava\\UserYeni";
		
		BufferedWriter br = new BufferedWriter(new FileWriter(filePath));
		String[] name = { "- Babek", "- Aysan", "- Elnaz", "- Sevda", "- Peeter", "- Trump" };
		
		br.write("Student Names: \n");

		for (int i = 0; i < name.length; i++) {
			br.write(name[i]);
			br.write("\n");

		}

		br.close();

	}

}
