package entities;

public class BusinessAccount extends Account {
	
	private double loanLimit;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
		super(number, holder, balance); 
		this.loanLimit = loanLimit;   
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

	@Override
	public String toString() {
		return "BusinessAccount [number=" + number + ", holder=" + holder + ", balance=" + balance + ", loanLimit="
				+ loanLimit + "]";
	}

}