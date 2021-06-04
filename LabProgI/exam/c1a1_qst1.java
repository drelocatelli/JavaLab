import java.util.Scanner;
public class c1a1_qst1 {

	public static void main(String[] args) {
		double x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		x = input.nextDouble();

		System.out.print("Digite o valor de y: ");
		y = input.nextDouble();
		
		double antesdasoma = -200*Math.pow((Math.E),-0.2*Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
		double depoisdasoma = 5*(Math.pow(Math.E,(Math.cos(3*x)+Math.sin(3*y))));
		
		double resultado = antesdasoma+depoisdasoma;
		
		System.out.printf("\nf(%.0f,%.0f)\n= ",x,y);
		System.out.println(resultado);

	}

}
