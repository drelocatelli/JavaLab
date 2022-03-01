import java.util.Scanner;

import Handle.*;

public class Program {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Primeiro cadastre os animais!");
		CachorroHandle.cadastrarCachorro();
		
		menu();
	}

	public static void menu() {
		while(true) {
			System.out.println(
					"\n"+
					"1) ADICIONAR CACHORRO\n"
							+ "2) MOSTRAR CACHORROS\n"
					);
			System.out.printf("Digite a opção:");
			int opc = input.nextInt();

			switch(opc) {
			case 1:
				CachorroHandle.adicionarCachorro();
				break;
			case 2:
				CachorroHandle.mostrarCachorros();
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}
	}

}
