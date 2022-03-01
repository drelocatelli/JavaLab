package Handle;

import java.util.Arrays;
import java.util.Scanner;

import Entities.Cachorro;

public class CachorroHandle {
	
	public static Cachorro[] myCachorros;
	public static Scanner input = new Scanner(System.in);

	public static void mostrarCachorros() {
		int i = 0;
		while(i < myCachorros.length) {
			System.out.println(myCachorros[i]);
			i++;
		}
	}
	
	public static void adicionarCachorro() {
		System.out.printf("Digite a quantidade de cachorros: ");
		int quantity = input.nextInt();
		int tamanho = myCachorros.length + quantity;
		
		// cria uma copia com nova quantidade
		Cachorro[] myCachorrosCopy = Arrays.copyOf(myCachorros, tamanho);
		
		for(int i = myCachorros.length; i < myCachorrosCopy.length; i++) {
			System.out.println();
			input.nextLine();
			
			System.out.printf("Nome do cachorro %d: ", (i+1));
			String nome = input.nextLine();
			
			
			System.out.printf("Idade do cachorro %d: ", (i+1));
			int idade = input.nextInt();
			
			myCachorrosCopy[i] = new Cachorro(nome, idade);
			i++;
		}
		
		myCachorros = myCachorrosCopy;
		
	}
	
	public static void cadastrarCachorro() {
		System.out.printf("Digite a quantidade de cachorros: ");
		int quantity = input.nextInt();
		
		myCachorros = new Cachorro[quantity];
		
		int i = 0;
		while(i < quantity) {
			System.out.println();
			input.nextLine();
			
			System.out.printf("Nome do cachorro %d: ", (i+1));
			String nome = input.nextLine();
			
			
			System.out.printf("Idade do cachorro %d: ", (i+1));
			int idade = input.nextInt();
			
			myCachorros[i] = new Cachorro(nome, idade);
			i++;
		}
	}

}
