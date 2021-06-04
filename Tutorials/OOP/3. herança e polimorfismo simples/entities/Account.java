package entities;

public class Account {
	
	protected Integer number;
	protected String holder;
	protected Double balance;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		
		System.out.println(toString());
	}

	
	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}	
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
	
}
