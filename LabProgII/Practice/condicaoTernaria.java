import java.util.Scanner;
public class condicaoTernaria{

    static Scanner input = new Scanner(System.in);
    static double preco; 
    static double desconto;
    static String tipoDesconto;
    
    public static void main(String[] args){

        // se o preço for menor que 20,0 entao o desconto é preco * 0.1, senão é 0.05
        System.out.print("Digite o preço: ");
        preco = input.nextDouble();
        
        calculaDesconto();
        
    }

    public static void calculaDesconto(){

        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        
        System.out.println("O valor em desconto é: " + desconto);
        
    }
    
}