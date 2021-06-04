import java.util.Scanner;

public class cdois_aum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("1");
		System.out.println("2");
		System.out.print("Digite a questao: ");
		int questao = in.nextInt();
		
		do {
			switch(questao){
				// Questão 1
				case 1:
					System.out.print("\n---------------------------------------------\n"+(questao)+") ");
					System.out.println("Digite os valores para cada incógnita:");
					
					System.out.print("a: ");
					double a = in.nextDouble();
		
					System.out.print("b: ");
					double b = in.nextDouble();
					
					System.out.print("c: ");
					double c = in.nextDouble();
				
					System.out.println("a = "+(-b+Math.sqrt(c)/2*a));
					System.out.println("b = "+(-b-Math.sqrt(c)/2*a));
					
					break;
								
				default:
					System.out.println("Nenhuma ocorrencia");
					break;
			}
		}while(questao != 0);

	}

}
