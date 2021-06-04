package entities;

import java.util.Scanner;

public class Financeira {
	private Scanner sc = new Scanner(System.in);	
	private Emprestimo[] vet;
	private Integer count = 0;
	
	public Financeira() {
		vet = new Emprestimo[1500];
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public Emprestimo[] getVet() {
		return vet;
	}

	public void setVet(Emprestimo[] vet) {
		this.vet = vet;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	public void cadastrar() {
		boolean existe = false;
		if(count<vet.length) {
			System.out.printf("\nInsira o nome do Cliente: ");
			String nome = sc.next();
			for(int i = 0; i<count ; i++) {
				if(vet[i].getNome().equalsIgnoreCase(nome)) {
					existe = true;
				}
			}
			if(!existe) {
				System.out.printf("\nInsira o valor: ");
				double valor = sc.nextDouble();
				System.out.printf("\nInsira o juros em porcentagem: ");
				double juros = sc.nextDouble();

				
				
				vet[count] = new Emprestimo(nome, valor, juros);
				count ++;
				System.out.printf("\nEmpréstimo cadastrado com Sucesso");
			}else {
				System.out.printf("\n\nCliente já possuí empréstimo.");
			}
			
		}else {
			System.out.printf("\n\nSistema Cheio, delete um produto antes de tentar inserir.");
		}
	}
	
	public void jurosPago() {
		System.out.printf("\n\nJuros mensal de cada cliente: \n");
		for(int i = 0; i<count ; i++) {
			System.out.println(vet[i].getNome() + " Juros mensal: R$" + (vet[i].getValor()*vet[i].getJuros()/100));
		}
	}
	
	public void alterarJuros() {
		int aux = 0;
		double maior = vet[0].getValor();
		for(int i = 0; i<count ; i++) {
			if(maior<vet[i].getValor()) {
				maior = vet[i].getValor();
				aux = i;
			}
		}
		System.out.println("Cliente com maior valor de empréstimo:");
		System.out.println(vet[aux]);
		System.out.printf("\nInsira o novo valor de Juros: ");
		vet[aux].setJuros(sc.nextDouble());
		System.out.printf("\n\nJuros alterado com sucesso.\n");
		System.out.println(vet[aux]);
		
	}
	
}

