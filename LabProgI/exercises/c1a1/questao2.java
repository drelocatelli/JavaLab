import java.util.Scanner;
public class questao2 {

	public static void main(String[] args) {
		double a, b, c, d;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a nota da prova 1: ");
		a = input.nextDouble();
		
		System.out.print("Digite a nota da prova 2: ");
		b = input.nextDouble();
		
		System.out.print("Digite a nota da prova 3: ");
		c = input.nextDouble();
		
		System.out.print("Digite a nota da prova 4: ");
		d = input.nextDouble();
		
		double resultado = (a+b+c+d)/4;
		
		System.out.println("\nSua média é "+resultado);
		
		
		
	}

}
