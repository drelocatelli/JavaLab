package application;

import java.util.Scanner;

import entities.Locadora;
import entities.Menu1;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nInforme a quantidade de filmes do sistema: ");
		int tamanho = sc.nextInt();
		Locadora vet = new Locadora(tamanho);
		int op = 0;
		
		while(op!=4) {
			
			op = Menu1.menu();
			switch (op) {
			case 1:
				vet.incluir();
				break;
			
			case 2:
				vet.consulta();
				break;
				
			case 3:
				vet.excluir();
				break;
				
			case 4:
	
				System.out.printf("\n\nSaindo...");
				break;
			
			default:
				System.out.printf("\n\nOp��o Invalida");
				
			}
		}
	}

}
