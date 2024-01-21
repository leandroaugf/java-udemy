package archives5th; // folders manipulation w/ java 

import java.io.File;
import java.util.Scanner;

public class Application5th {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type a folder path: ");
		String path = scanner.nextLine();
		
		File folderPath = new File(path);
		File[] folders = folderPath.listFiles(File::isDirectory); // f. lambda -> filtra os diretórios
		
		System.out.println("DIRECTORIES:");
		for (File foldersNickname : folders) {
			System.out.println(foldersNickname);			
		}
		
		File[] aFolder = folderPath.listFiles(File::isFile); // filtra os arquivos
		
		System.out.println();
		System.out.println("ARCHIVES:");
		for (File archivesNickname : aFolder) {
			System.out.println(archivesNickname);
		}
		
		// cria uma subpasta 'subdir' a partir do caminho especificado;
		boolean success = new File(path + "\\subdir").mkdir();
		
		System.out.println();
		System.out.println("Directory was created: " + success);
		
		scanner.close();
	}
}
