package C1;

import java.util.*;

public class Metodos_Busca_Ordenacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarios[];
		int n=0, iteracoes=0,i=0, j=0;
		System.out.println("Informe a quantidade de funcionários: ");// 10 funcionários
		n=sc.nextInt();
		salarios=new double[n];

		for(i=0;i<n;i++)
		{
			System.out.println("Informe o salário do "+(i+1)+"º funcionário: ");
			salarios[i]=sc.nextDouble();
		}
/*
		//Método da Bolha:	
		double aux = 0;
		for (i=0; i<salarios.length-1; i++){
			for (j=0; j<salarios.length-1-i; j++){
				if (salarios[j]>salarios[j+1]){
					aux = salarios[j];
					salarios[j] = salarios[j+1];
					salarios[j+1] = aux;
					iteracoes++;//Irá contar quantas vezes o algoritmo muda um número de posição até atingir a ordenação completa.
				}
			}
		}		
		for (i=0; i<salarios.length; i++){
			System.out.println(salarios[i]);
		}		
		System.out.println("Iterações: " +iteracoes+ ".");
*/
		
			//Método da Inserção Direta:
			double temp;
			iteracoes = 0;
			for (i = 1; i < salarios.length; i++){
				temp = salarios[i];
				j = i-1;

				while ((j >= 0)&&(salarios[j]>temp)){
					salarios[j+1] = salarios[j--];
					iteracoes++;//Irá contar quantas vezes o algoritmo muda um número de posição até atingir a ordenação completa.		
				}
				salarios[j+1] = temp;
			}
			for (i=0; i<salarios.length; i++){
				System.out.println(salarios[i]);
			}		
			System.out.println("Iterações: " +iteracoes+ ".");

/*
			//Algoritmo de Busca Sequencial	
			i = 0;
			iteracoes = 0;		
			System.out.println("Digite um número:");		
			double valor_busca = sc.nextDouble();	

			while ((i < salarios.length) && (valor_busca != salarios[i])) {
				i++;
				iteracoes++; //Irá contar quantas vezes o algoritmo muda um número de posição até atingir a ordenação completa.	
			}
			if (i == salarios.length) {
				System.out.println("O valor não foi encontrado.");
			} else {
				System.out.println("O valor foi encontrado e está na posição " +(i+1)+ ".");
			}
			System.out.println("Iterações:" +iteracoes+ ".");

*/			//Algoritmo de Busca Binária		
			int inicio = 0, fim = salarios.length-1;
			int meio;
			double x;
			iteracoes=0;
			boolean achou=false;
			System.out.println("Digite um número:");		
			x = sc.nextDouble();	

			while (inicio <= fim) {
				meio = (inicio + fim) / 2;
				if (x == salarios[meio]) {
					System.out.println("Encontrou na posição: " +(meio+1)+ ".");
					achou=true;
					break;
				}
				else if (x < salarios[meio]) {
					fim = meio - 1;
				} else {
					inicio = meio + 1;
				}
				iteracoes++; //Irá contar quantas vezes o algoritmo muda um número de posição até atingir a ordenação completa.	
			}	
			if (!achou) {
				System.out.println("O valor não foi encontrado.");
			} 
			System.out.println("Iterações:" +iteracoes+ ".");

		sc.close();
	}
}
