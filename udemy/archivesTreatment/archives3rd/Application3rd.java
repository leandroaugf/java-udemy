package archives3rd; // better version for 2nd app

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Application3rd {
	public static void main(String[] args) {
		String path = "C:\\Users\\leand\\eclipse-workspace\\udemy-java\\archivesTreatment\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // fileReader não instanciado por estar no parâmetro			
			String line = br.readLine(); // caso EOF, retorna null
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch(IOException error) {
			System.out.println("Error: " + error.getMessage());
		} 
	}
}
