package entities;

import java.util.Scanner;

public class Locadora {
	Scanner sc = new Scanner(System.in);	
	private Filme[] vet;
	private int count = 0;
	
	
	public Locadora(int tamanho) {
		vet = new Filme[tamanho];
	}


	public Scanner getSc() {
		return sc;
	}


	public void setSc(Scanner sc) {
		this.sc = sc;
	}


	public Filme[] getVet() {
		return vet;
	}


	public void setVet(Filme[] vet) {
		this.vet = vet;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
	public void incluir() {
		if(count<vet.length) {
			System.out.printf("\n\nInsira o código do filme: ");
			int cod = sc.nextInt();
			System.out.printf("\nInsira o título do filme: ");
			sc.nextLine();
			String titulo  = sc.nextLine();
			System.out.printf("\nInsira o gênero do filme (A – ação, T – terror, D – drama): ");
			char genero = sc.next().charAt(0);
			
			vet[count] = new Filme(cod, titulo, genero);
			count ++;
			System.out.printf("\nFilme Inserido com Sucesso");
		}else {
			System.out.printf("\n\nSistema Cheio, delete um Filme antes de tentar inserir.");
		}
	}
	
	public void consulta() {
		System.out.printf("\n\nInsira o gênero do filme (A – ação, T – terror, D – drama): ");
		char genero = sc.next().charAt(0);
		int count2=0;
		for(int i = 0; i<count  ; i++) {
			if(vet[i].getGenero() == genero) {
				count2++;
			}
		}
		System.out.printf("\nTotal de Filmes do genero %c: %d", genero, count2);
	}
	
	public void excluir() {
		System.out.printf("\n\nInsira o título do filme: ");
		sc.nextLine();
		String titulo  = sc.nextLine();
		
		for(int i = 0; i<count  ; i++) {
			if(vet[i].getTitulo().equalsIgnoreCase(titulo)) {
				vet[i]=vet[count-1];
				vet[count-1]= null;
				count--;
				
				System.out.println("\nFilme deletado");
			}
		}
	}

}
