import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class NegativeBalanceException extends BankAccount {
	
	private double overdraft;
	
	NegativeBalanceException(double balance) {
		super(balance);
		try {
			PrintWriter out = new PrintWriter("logfile.txt");
			out.println("Amount exceeds balance by $" + overdraft);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	
	public String toString() {
		return "NegativeBalanceException [overdraft=" + overdraft + "]";
	}
	
	


	

}
