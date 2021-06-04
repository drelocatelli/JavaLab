package entities;

import java.util.Scanner;

public class Empresa {
	Scanner sc = new Scanner(System.in);	
	private Vendedor[] vet;
	private int count = 0;
	
	
	public Empresa(int tamanho) {
		vet = new Vendedor[tamanho];
	}


	public Scanner getSc() {
		return sc;
	}


	public void setSc(Scanner sc) {
		this.sc = sc;
	}


	public Vendedor[] getVet() {
		return vet;
	}


	public void setVet(Vendedor[] vet) {
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
			System.out.printf("\n\nInsira o código do Vendedor: ");
			int cod = sc.nextInt();
			System.out.printf("\nInsira o nome do Vendedor: ");
			sc.nextLine();
			String nome  = sc.nextLine();
			System.out.printf("\nInsira o tipo da mercadoria (P - perecível, N - não perecível): ");
			char mercadoria = sc.next().charAt(0);
			
			vet[count] = new Vendedor(cod, nome, mercadoria);
			count ++;
			System.out.printf("\nVendedor Adicionado com Sucesso");
		}else {
			System.out.printf("\n\nSistema Cheio, delete um Filme antes de tentar inserir.");
		}
	}
	
	public void consulta() {
		System.out.printf("\n\nInsira o tipo da mercadoria (P - perecível, N - não perecível): ");
		char mercadoria = sc.next().charAt(0);
		int count2=0;
		for(int i = 0; i<count  ; i++) {
			if(vet[i].getMercadoria() == mercadoria) {
				count2++;
			}
		}
		System.out.printf("\nTotal de Vendedores do tipo da mercadoria %c: %d", mercadoria, count2);
	}
	
	public void excluir() {
		System.out.printf("\n\nInsira o nome do Vendedor: ");
		sc.nextLine();
		String nome  = sc.nextLine();
		
		for(int i = 0; i<count  ; i++) {
			if(vet[i].getNome().equalsIgnoreCase(nome)) {
				vet[i]=vet[count-1];
				vet[count-1]= null;
				count--;
				
				System.out.println("\nVendedor deletado");
			}
		}
	}

}
