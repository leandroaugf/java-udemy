package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.genericException;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.printf("Number: ");
		int accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.printf("Holder: ");
		String accountHolder = scanner.nextLine();
		System.out.printf("Initial Balance: ");
		double initialBalance = scanner.nextDouble();
		System.out.printf("Withdraw limit: ");
		double withdrawLimit = scanner.nextDouble();
	
		
		try {
			Account account = new Account(accountHolder, initialBalance, accountNumber, withdrawLimit);
			System.out.println();
			System.out.printf("Enter amount for withdraw: ");
			double amount = scanner.nextDouble();
			account.withdraw(amount);
			System.out.printf("New balance: %.2f", account.getBalance());
			
		} catch (genericException erro) {
			System.out.print(erro.getMessage());
		} finally {
			scanner.close();
		}
		
	}
}