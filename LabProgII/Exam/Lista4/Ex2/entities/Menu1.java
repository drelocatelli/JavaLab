package entities;

import java.util.Scanner;

public class Menu1 {
	private static Scanner sc;

	public static int menu() {
		sc = new Scanner(System.in);
		System.out.printf("\n\n1-Incluir Vendedor"
				+ "\n2-Consultar total de Vendedores de um tipo de Mercadoria"
				+ "\n3-Excluir Vendedor"
				+ "\n4-Sair do programa"
				+ "\nDigite a opção desejada: ");
		return sc.nextInt();
	}
}
