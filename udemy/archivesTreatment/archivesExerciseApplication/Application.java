package archivesExerciseApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import archivesExercise.Product;

public class Application {
	public static void main(String[] args) {
		String sourceFile = "C:\\Users\\leand\\eclipse-workspace\\udemy-java\\archivesTreatment\\archivesExerciseFile\\in.csv";
		String destinyPath = "C:\\Users\\leand\\eclipse-workspace\\udemy-java\\archivesTreatment\\archivesExerciseFile";
		
		List<Product> products = new ArrayList<>();
		Scanner scanner = new Scanner(sourceFile);
		
		String name;
		int quantity; 
		double price; 
		
		new File(destinyPath + "/out").mkdir();
		String destinyFile = destinyPath + "/out/summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) { // para leitura
		
			String line = br.readLine();
			while (line != null) {
				String[] productsStr = line.split(", "); // str redeclarada a cada loop -- to fix
				
				name = productsStr[0];
				price = Double.parseDouble(productsStr[1]);
				quantity = Integer.parseInt(productsStr[2]);
				
				products.add(new Product(name, quantity, price)); // non-necessary class -- 
				line = br.readLine();
			}				
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(destinyPath + "\\out\\summary.csv"))) {
				for (Product allProducts : products) {				
					bw.write(allProducts.getName() + ", " + allProducts.subtotal());
					bw.newLine();
				}
			} 
		} 
		catch(IOException error) {
			error.printStackTrace();
		} finally {
			if (scanner != null)
				scanner.close();	
		}
	}
}
