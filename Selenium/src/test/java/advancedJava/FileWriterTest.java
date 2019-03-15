package advancedJava;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	private static Writer wr;
	
	public static void main(String[] args) throws IOException {
		//Using FileWriter to write to text file 

		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\advancedJava\\UserFile"; 
		wr = new FileWriter(filePath);
		
		String name [] = {"AAA", "BBB", "CCC", "DDD"};
		wr.write("Studen Names: \n");
		for(int i=0; i<name.length; i++) {
		wr.write(name[i]);
		wr.write("\n");
		
	}
		wr.flush();
}
}