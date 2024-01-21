package archives4rth;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application4rth {
	public static void main(String[] args) {
		
	String[] readLines = {"test 1", "test 2", "test 3"};
	String path = "C:\\Users\\leand\\eclipse-workspace\\udemy-java\\archivesTreatment\\out.txt";
		
		// o parâmetro 'TRUE' faz com que o arquivo não seja sobrescrito, funciona como 'append'
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String lineNickname : readLines) {
				bw.write(lineNickname);
				bw.newLine();
			}
		} catch(IOException error) {
			error.printStackTrace();
		}	
	}
}
