package entities;

import model.exceptions.genericException;

public class Account {
	private String holder;
	private double balance;
	private int accountNumber;
	private double withdrawLimit;
	
	public Account(String holder, double balance, int accountNumber, double withdrawLimit) throws genericException {
		if (balance < 0) {
			throw new genericException("Erro: o saldo não pode ser negativo.\n");
		} else if (accountNumber < 0 || withdrawLimit < 0) {
			throw new genericException("Erro: algo deu errado.");
		}

		this.holder = holder;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.withdrawLimit = withdrawLimit;
	}
	public void withdraw(double value) throws genericException {
		if (value > this.balance) {
			throw new genericException("Erro: saldo insuficiente.\n");
		} else if (value > this.withdrawLimit) {
			throw new genericException("Erro: o valor de saque excede o limite.");
		}
		this.balance -= value;
	}
		
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	@Override
	public String toString() {
		return "teste";
	}
}
