package entities;

import java.util.Scanner;

public class Menu1 {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\n\n1-Incluir Filme"
				+ "\n2-Consultar total de Filmes de um gênero"
				+ "\n3-Excluir filme"
				+ "\n4-Sair"
				+ "\nDigite a opção desejada: ");
		return sc.nextInt();
	}
}
