import java.io.PrintWriter;

public class NegativeBalanceException extends Exception {

	private static final long serialVersionUID = 1L;
	private double negativeBalance;
	
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	public NegativeBalanceException(double negBal) {
		super("Amount exceeds balance by " + negBal);
		negativeBalance = negBal;
		try {
			PrintWriter out = new PrintWriter("logfile.txt");
			out.println("Amount exceeds balance by " + negBal);
			out.close();
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}
	
	
	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
