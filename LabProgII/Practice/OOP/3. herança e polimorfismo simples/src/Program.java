import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {
	
	public static Scanner input = new Scanner(System.in);
	public static int MaxAccounts = 4;
	public static Account AccountList[] = new Account[MaxAccounts];
	public static String AccountName[] = new String[MaxAccounts];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < AccountList.length; i++) {
			System.out.printf("Digite o nome do usuário %d: ", i+1);
			AccountName[i] = input.nextLine();
			
			AccountList[i] = (new SavingAccount(1001, AccountName[i], 500.0, 0.01));
		}
	
		// list array
		System.out.println("All accounts:");
		for(int i = 0; i < AccountList.length; i++) {
			System.out.println(AccountList[i]);
		}
		
		System.out.println("\nPrimeira conta criada:");
		System.out.println(AccountList[0]);
		
		double sum = 0.0;
		for(Account acc : AccountList) {
			sum += acc.getBalance();
		}
		
		System.out.printf("\nTotal balance: %.2f\n", sum);
		
	}

}