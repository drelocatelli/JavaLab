import java.util.Scanner;

import entities.Empresa;
import entities.Menu1;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nInforme a quantidade de Vendedores do sistema: ");
		int tamanho = sc.nextInt();
		Empresa vet = new Empresa(tamanho);
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
				System.out.printf("\n\nOpção Invalida!!!");
				
			}
		}
	}

}
