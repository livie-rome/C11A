//bank account class

public class BankAccount {
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if(amount > this.balance) {
			//throw NegativeBalanceException and pass through negative balance
		} else {
			balance = balance - amount;
		}
		//must have a throws clause, so that the error is propagated back to the caller.
	}
	
	public void quickWithdraw(double amount) {
		if(amount > balance) {
			//throw NegativeBalanceException with no param
		} else {
			balance = balance - amount;
		}
		//also must have a throws clause.
	}
	
}