package archives1st;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Application1st {
	public static void main(String[] args) {
		Scanner myScanner = null;
		File file = new File("C:\\Users\\leand\\eclipse-workspace\\udemy-java\\archivesTreatment\\in.txt");
		
		try {
			myScanner = new Scanner(file);
			while (myScanner.hasNextLine())
				System.out.println(myScanner.nextLine());
		} catch(IOException erro) {
			System.out.println("Error: " + erro.getMessage());
		} finally {
			if (myScanner != null) // caso o scanner não tenha sido instanciado --
				myScanner.close();	
			
		}
		
	}
}
