import java.io.IOException;


/*
 * 		FILE: BankAccount.java
 * 		AUTHOR: Alex Patel
 * 		FOR: CSCI 306, 9/20/2014
 */


public class BankAccount {
	private double balance;
	private double overdraft;
	
	BankAccount (double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws NegativeBalanceException {
		if( amount > balance ) {
			overdraft = Math.abs(amount - balance); // exceeds balance by this amount
			throw new NegativeBalanceException(overdraft);
		}
	}
	
	public void handleTransaction()  {
		try {
			withdraw(700); // exceeds the bank account balance
		}
		catch (NegativeBalanceException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(400);
		bankAccount.handleTransaction();
		
	}
}