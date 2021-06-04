package entities;

import java.util.Scanner;

public class Menu3 {
		private Integer op;
		Scanner sc = new Scanner(System.in);
		
		public Menu3() {
			
		}

		public Integer getOp() {
			return op;
		}

		public void setOp(Integer op) {
			this.op = op;
		}
		
		public static void menu(AlunosVet vet) {
			Scanner sc = new Scanner(System.in);
			int op=0;
			while(op !=4) {
				
				System.out.printf("\n\n1-Incluir"
						+ "\n2-Consultar o nome de todos os alunos que possuem nota1 e nota2 abaixo de um valor determinado"
						+ "\n3-Calcular e mostrar a média aritmética e o nome de cada alunos cadastrados"
						+ "\n4-Sair"
						+ "\nDigite a opção desejada: ");
				op = sc.nextInt();
				
				switch (op) {
				case 1:
					vet.incluir();
					break;
				
				case 2:
					vet.consultar();
					break;
					
				case 3:
					vet.media();
					break;
					
				case 4:
					System.out.printf("\n\nSaindo...");
					break;
				
				default:
					System.out.printf("\n\nOpção Inválida");
					
				}
		}
	}	
}
