package application;

import entities.Financeira;
import entities.Menu5;

public class Program5 {

	public static void main(String[] args) {
		Financeira vet = new Financeira();
		int op = 0;
		
		while(op!=4) {
			
			op = Menu5.menu();
			switch (op) {
			case 1:
				vet.cadastrar();
				break;
			
			case 2:
				vet.jurosPago();
				break;
				
			case 3:
				vet.alterarJuros();
				break;
				
			case 4:
	
				System.out.printf("\n\nSaindo...");
				break;
			
			default:
				System.out.printf("\n\nOpção Invalida");
				
			}
		}

	}

}
