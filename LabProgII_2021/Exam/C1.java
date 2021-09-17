package class1;

import java.util.Scanner;

public class Programa {
	
	public static int quantity;
	public static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("Rober Lanches");

			String menu = String.format("1- X-Bacon\n"
					+ "2- X-Salada\n"
					+ "3- X-Picanha\n"
					+ "4- X-Tudo\n"
					+ "0- Sair");
			
			System.out.println(menu);
			
			System.out.println("Digite a quantidade ou 0 para sair: ");
			quantity = input.nextInt();
			
			if(quantity == 0) {
				System.out.println("Você fechou o programa!");
				break;
			}
			
			if(quantity > 4 || quantity < 0) {
				System.out.println("Opção inválida!");
				System.out.println("\nContinuar?");
				input.nextLine();
				input.nextLine();
				continue;
			}

			start();
		}
		
	}
	
	public static void start() {		
		int pedidos[] = new int[quantity];
		
		for(int i = 0; i < quantity; i++) {
			System.out.printf("Lanche Nº%d:\n", i+1);
			pedidos[i] = input.nextInt();
		}
		
		System.out.println("Você fez os seguintes pedidos:");
		
		double valores[] = new double[quantity];
		
		for(int i = 0; i < quantity; i++) {
			switch(pedidos[i]) {
				case 1:
					System.out.println("X-Bacon - R$ 20");
					valores[i] = 20.0;
				break;
				case 2:
					System.out.println("X-Salada - R$ 15");
					valores[i] = 15.0;
				break;
				case 3:
					System.out.println("X-Picanha - R$ 22");
					valores[i] = 22.0;
				break;
				case 4:
					System.out.println("X-Tudo - R$ 30");
					valores[i] = 30.0;
				break;
			}

		}
		
		// mostra valor total
		double total = 0.0;
		
		for(int i = 0; i < quantity; i++) {
			total += valores[i];
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		System.out.println("\nContinuar?");
		input.nextLine();
		input.nextLine();

	}

}
