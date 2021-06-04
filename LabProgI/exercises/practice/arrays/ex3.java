import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		float notas[] = new float[3], soma = 0;
		
		Scanner ent = new Scanner(System.in);
		
		// entrada de notas
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Informe a "+ (i+1) +"° nota: ");
			notas[i] = ent.nextFloat();
		}
		
		// soma as notas e calcula a media
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		System.out.println();
			
		// mostra as notas
		for(int i = 0; i < notas.length; i++) {
			if(i == notas.length - 1) {
				System.out.print("e "+ notas[i]);
			}else {
				System.out.print(notas[i] + ", ");
			}
		}
	
		System.out.println("\nA média é "+ (soma/notas.length));
		
	}

}
