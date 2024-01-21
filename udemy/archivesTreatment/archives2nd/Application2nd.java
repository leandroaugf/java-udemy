package archives2nd;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Application2nd {
	public static void main(String[] args) {
		FileReader fr = null; // stream de leitura de char a partir de arquivo; 
		BufferedReader br = null;

		String path = "C:\\\\Users\\\\leand\\\\eclipse-workspace\\\\udemy-java\\\\archivesTreatment\\\\in.txt";

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine(); // caso EOF, retorna null
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch(IOException error) {
			System.out.println("Error: " + error.getMessage());
		} finally {
			try { // bloco try >> br!=null pode gerar IOException
				if (br != null) 
					br.close();
				if (fr != null)
					fr.close();
			} catch(IOException error) {
				error.printStackTrace(); // gera o rastreio do erro --
			}
		}
		
		
	}
}
