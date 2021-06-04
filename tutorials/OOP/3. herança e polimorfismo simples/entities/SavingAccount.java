package entities;

public class SavingAccount extends Account {
	
	private double interestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public String toString() {
		return "SavingAccount [number=" + number + ", holder=" + holder + ", balance=" + balance + ", interestRate="
				+ interestRate + "]";
	}
	
	

}
