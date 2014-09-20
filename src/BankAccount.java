
public class BankAccount {
	private double balance;
	
	BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if(balance < amount) {
			//throw new NegativeBalanceException("");
		}
	}
	
	public void handleTransaction() {
		try {
			withdraw(500); // amount that exceeds balance
		} catch (Exception e)
		{
			
		}
	}

	public static void main(String[] args) {
		BankAccount account  = new BankAccount(300);
		account.handleTransaction();

	}

}
