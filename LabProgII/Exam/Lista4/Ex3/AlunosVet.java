package entities;

import java.util.Scanner;

public class AlunosVet {
	Scanner sc = new Scanner(System.in);	
	private Alunos[] vet;
	private Integer count = 0;
	

	public AlunosVet(int n) {
		vet = new Alunos[n];
	}

	public Alunos[] getVet() {
		return vet;
	}

	public void setVet(Alunos[] vet) {
		this.vet = vet;
	}
	
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public void incluir() {
		if(count<500) {
			System.out.printf("\n\nInsira a matrícula do aluno: ");
			int matricula = sc.nextInt();
			System.out.printf("\nInsira o nome do aluno: ");
			sc.nextLine();
			String nome  = sc.nextLine();
			System.out.printf("\nInsira a nota1: ");
			double nota1 = sc.nextDouble();
			System.out.printf("\nInsira a nota2: ");
			double nota2 = sc.nextDouble();
			
			vet[count] = new Alunos(matricula, nome, nota1,nota2);
			count ++;
			System.out.printf("\nAluno Inserido com Sucesso");
		}else {
			System.out.printf("\n\nSistema Cheio, delete um vendedor antes de tentar inserir.");
		}
	}
	
	public void consultar() {
		int count2=0;
		System.out.printf("\n\nConsultar o nome de todos os alunos que possuem nota1 e nota2 abaixo de um valor determinado\nInsira o valor desejado: ");
		double valor = sc.nextDouble();
		System.out.println("\n");
		for(int i = 0; i<count ; i++) {
			if(vet[i].getNota1() < valor && vet[i].getNota2() < valor) {
				System.out.println(vet[i]);
				count2++;
			}
		}
		if(count2 == 0) {
			System.out.println("\n\nNão possuí alunos com a nota1 e nota2 abaixo do valor informado.");
		}
		
	}
	
	public void media() {
		for(int i = 0; i<count ; i++) {
			System.out.print("\n\nNome: " + vet[i].getNome() + "  Media: " + ((vet[i].getNota1()+vet[i].getNota2())/2));
		}
	}

		
		
}
