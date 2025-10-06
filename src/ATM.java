//one instance variable of type BankAccount
//a constructor that creates the BankAccount with a balance of $500
//an instance method named handleTransactions() which:
//within a try-catch, calls withdraw() with amount $600
//the catch should have two printouts (just to see how this works):
//System.out.println(e);
//System.out.println(e.getMessage());
//within a second try-catch, calls quickWithdraw() with amount $600
//the catch should contain the same printouts:
//System.out.println(e);
//System.out.println(e.getMessage());
//the main() method will simply create an ATM object and call handleTransactions.

public class ATM {
	private BankAccount acc;
	
	public ATM() {
		acc = new BankAccount(500);
	}
	
	public void handleTransactions() {
		try {
			acc.withdraw(600);
		}
		catch (Exception e){ //fill in with own exception
			//System.out.println(e);
			//System.out.println(e.getMessage());
		}
		
		try {
			acc.quickWithdraw(600);
		}
		catch (Exception e){ //fill in with own exception
			//System.out.println(e);
			//System.out.println(e.getMessage());
		}
			
	}
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.handleTransactions();
	}
}

