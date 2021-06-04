import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class Program {
	
	public static Scanner input = new Scanner(System.in);
	
	public static String AccountSavingName[] = new String[1];
	public static String AccountBusinessName[] = new String[1];
	
	public static int TotalAccounts = (AccountSavingName.length+AccountBusinessName.length);
	public static Account AccountListBusiness[] = new Account[TotalAccounts];
	public static Account AccountListSaving[] = new Account[TotalAccounts];
	
	
	public static void main(String[] args) {
		
		while(true) {
			
			String option;
			
			do {
				System.out.println("A - Add Saving Account\nB - Add Business Account\nC - Preview Accounts");
				System.out.print("Select: ");
				option = input.next();
				option = option.toLowerCase();
				System.out.println();
			}while(option.equals(""));
			
			switch(option) {
				case "a":
					addSavingAccount();
				break;
				case "b":
					addBusinessAccount();
				break;
				case "c":
					showAccounts();
					break;
				default:
					System.out.println("Opção inválida!");
			}
			
			input.nextLine();
			System.out.println("Continuar? ");
			input.nextLine();
			
		}
		
	}
	
	public static void showAccounts() {
		
		// list array
		System.out.println("All Accounts:");
		for(int i = 0; i < TotalAccounts; i++) {
			System.out.println(AccountListBusiness[i]);
			System.out.println(AccountListSaving[i]);
		}
		
		System.out.println("\nPrimeira conta criada:");
		System.out.println(AccountListBusiness[0]);
		System.out.println(AccountListSaving[0]);
		
		double sum = 0.0;
		for(Account acc : AccountListBusiness) {
			sum += acc.getBalance();
		}
		
		for(Account acc : AccountListSaving) {
			sum += acc.getBalance();
		}
		
		System.out.printf("\nTotal balance: %.2f\n", sum);
	

	}
	
	public static void addBusinessAccount() {
		System.out.print("Number of records: ");
		int MaxAccountsBusiness = input.nextInt();
		
		AccountBusinessName = new String[MaxAccountsBusiness];
		
		for(int i = 0; i < MaxAccountsBusiness; i++) {
			System.out.printf("Digite o nome do empresário %d: ", i+1);
			AccountBusinessName[i] = input.next();
			AccountListBusiness[i] = (new BusinessAccount(1001, AccountBusinessName[i], 500.0, 0.01));
		}
		
	}
	
	
	public static void addSavingAccount() {
		System.out.print("Number of records: ");
		int MaxAccountsSaving = input.nextInt();
		
		AccountSavingName = new String[MaxAccountsSaving];
		
		for(int i = 0; i < MaxAccountsSaving; i++) {
			System.out.printf("Digite o nome do usuário %d: ", i+1);
			AccountSavingName[i] = input.next();
			AccountListSaving[i] = (new SavingAccount(1001, AccountSavingName[i], 500.0, 0.01));
		}
	
	}

}
