import entities.*;

public class Program {
	

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Dory", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(2002, "Bob", 0.0, 200.0);
		
		Account acc3 = new SavingAccount(2004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		
	}

}