package entities;

import java.util.Scanner;

public class Menu5 {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\n\n1-Cadastrar empr�stimo"
				+ "\n2-Valor que cada cliente pagar� de juros em um m�s"
				+ "\n3-Alterar o juros do cliente que tem o maior valor de empr�stimo"
				+ "\n4-Sair"
				+ "\nDigite a op��o desejada: ");
		return sc.nextInt();
	}
}
