/**
 * @author Charles Fee
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class fileWriter{
	//Counter
	private static int counter = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("charles"));
		for(int i = 0; i < 1500; i++) {
			writer.write(Integer.toString(i));
			writer.newLine();
			
		}
			
		writer.close();
	}
}