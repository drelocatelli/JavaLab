package entities;

import java.util.Scanner;

public class Menu5 {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\n\n1-Cadastrar empréstimo"
				+ "\n2-Valor que cada cliente pagará de juros em um mês"
				+ "\n3-Alterar o juros do cliente que tem o maior valor de empréstimo"
				+ "\n4-Sair"
				+ "\nDigite a opção desejada: ");
		return sc.nextInt();
	}
}
