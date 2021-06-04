import java.util.Scanner;

public class dowhile{

    public static void main(String[] args){
        
        // variaveis
        Scanner input = new Scanner(System.in);
        int num = 0;
        double num1, num2, resultado;

        do{
            // menu
            System.out.println("1) Somar");
            System.out.println("2) Subtrair");
            System.out.println("3) Sair");

            // entrada da escolha do usuário
            System.out.print("Selecione o menu: ");
            num = input.nextInt();

            // logica do menu
            switch(num){
                // resposta 1
                case 1:
                    System.out.println("\nDigite um valor para cada incognita: ");
                    System.out.print("a: ");
                    num1 = input.nextInt();

                    System.out.print("b: ");
                    num2 = input.nextInt();

                    resultado = num1 + num2;
                    System.out.println(resultado);
                    System.out.println();
                    break;
                // resposta 2
                case 2:
                    System.out.println("\nDigite um valor para cada incognita: ");
                    System.out.print("a: ");
                    num1 = input.nextInt();

                    System.out.print("b: ");
                    num2 = input.nextInt();

                    resultado = num1 - num2;
                    System.out.println(resultado);
                    System.out.println();

            }


        }while(num != 3);

    }
    
}