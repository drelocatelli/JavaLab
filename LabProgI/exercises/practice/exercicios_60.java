import java.util.Scanner;

public class exercicios_60 {
    public static void main(String[] args){
        // Exercicios pagina 31 e 60
        System.out.println("Selecione a questao: [5,6]");
        Scanner questao = new Scanner(System.in);
        String selected_questao = questao.nextLine();

        Scanner value = new Scanner(System.in);

        if(selected_questao.equals("5")){

            double c;
            
            // inputs
            while(true){
                System.out.println("\n\n5) Celsius para Fahrenheit");
                System.out.print("Valor de c: ");
                c = value.nextDouble();

                double resultado = c*9/5+32;
                System.out.println(Math.round(c)+"C = "+resultado+"F");
                continue;
            }


        }

        if(selected_questao.equals("6")){


            double num;

            while(true){
                System.out.println("\n\n6) num*3 | num/2 | num^3 | num^(2/3)");
                System.out.print("Digite um numero: ");
                num = value.nextDouble();

                System.out.println("num*3 = "+(num*3)+" | num/2 = "+(num/2)+" | num^3 = "+(Math.pow(num,3))+" | num^(2/3) = "+Math.pow(num,2/3));

                continue;
            }

        }
        

    }
}
