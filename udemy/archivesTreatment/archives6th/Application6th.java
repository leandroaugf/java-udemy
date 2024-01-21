package archives6th;

import java.io.File;
import java.util.Scanner;

public class Application6th {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type a file path: ");
		String path = scanner.nextLine();
		
		File file = new File(path);
		
		System.out.println();
		System.out.println("FILE INFOS: ");
		System.out.println("file name: " + file.getName());
		System.out.println("file parent: " + file.getParent());
		System.out.println("file path: " + file.getPath());
		
		scanner.close();
	}
}
