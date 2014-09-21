import java.io.IOException;
import java.io.PrintWriter;

/*
 * 		FILE: NegativeBalanceException.java
 * 		AUTHOR: Alex Patel
 * 		FOR: CSCI 306, 9/20/2014
 */

public class NegativeBalanceException extends Exception {
	private double overdraft;

	public NegativeBalanceException(double exceed) {
		super();
		overdraft = exceed;

		String file = "logfile.txt";


		try {
			PrintWriter out = new PrintWriter(file);
			out.println(toString());
			out.close();
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	public String toString() {
		return "Error: Amount exceeds balance by: " + overdraft;
	}

}
