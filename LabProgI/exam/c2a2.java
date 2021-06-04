import java.util.Scanner;

public class c2a2{
    public static void main(String[] args){
        // variaveis
        int qst = 0, qst1;
        double a,b,c,resultado;
        double delta;
        int num1;
        Scanner input = new Scanner(System.in);

        inicial:
        do{
            // selecao da questao
            System.out.println("INICIO");
            System.out.println("1 - Questao 1");
            System.out.println("2 - Questao 2");
            System.out.println("3 - Sair");
            System.out.print("Selecione o numero da opcao: ");
            qst = input.nextInt();
            System.out.println();

            switch(qst){
                case 1:
                // letras da questao 1
                    System.out.println("Questao 1.");
                    System.out.println("1 - A");
                    System.out.println("2 - B");
                    System.out.println("3 - Sair");

                    System.out.print("Selecione uma questao: ");
                    qst1 = input.nextInt();
                    System.out.println();

                    switch(qst1){
                        case 1:
                                System.out.print("\na) X1 - ");
                                // selecao dos valores
                                do{
                                    System.out.println("Defina um valor para cada incógnita: ");

                                    System.out.print("a: ");
                                    a = input.nextDouble();

                                    System.out.print("b: ");
                                    b = input.nextDouble();

                                    System.out.print("c: ");
                                    c = input.nextDouble();
                                    
                                    delta = Math.pow(b,2)-4*a*c;
                                    resultado = (-b+Math.sqrt(delta))/(2*a);
                                    
                                    if(delta <= 0){
                                        System.out.println("Não existe raiz negativa!\n");
                                    }else{  
                                        System.out.print("x = ");
                                        System.out.println(resultado);
                                        System.out.println();
                                        continue inicial;
                                    }
                                    
                                    // se dar break o while não irá checar a variavel delta!                                    
                                }while(delta <= 0); // fim case
                        case 2:
                            System.out.print("\nb) X1 - ");
                            // selecao dos valores
                            do{
                                System.out.println("Defina um valor para cada incógnita: ");

                                System.out.print("a: ");
                                a = input.nextDouble();

                                System.out.print("b: ");
                                b = input.nextDouble();

                                System.out.print("c: ");
                                c = input.nextDouble();
                                
                                delta = Math.pow(b,2)-4*a*c;
                                resultado = (-b-Math.sqrt(delta))/(2*a);
                                
                                if(delta <= 0){
                                    System.out.println("Não existe raiz negativa!\n");
                                }else{  
                                    System.out.print("x = ");
                                    System.out.println(resultado);
                                    System.out.println();
                                    break;
                                }
                        // se dar break o while não irá checar a variavel delta!
                        }while(delta <= 0); // fim case

                        case 3:
                        default:
                            continue inicial;
                    }
                case 2:
                    do{
                        // menu
                        System.out.println("Par ou Impar? ");
                        System.out.println("1 - Par");
                        System.out.println("2 - Impar");
                        System.out.println("3 - Sair");
                        System.out.print("selecione o numero: ");
                        num1 = input.nextInt();

                        // checa se é par/impar e imprime
                        switch(num1){
                            case 1:
                                System.out.println("Par!");
                                for(b = 0; b <= 50; b++){
                                    if( (b % 2) == 0){ 
                                        System.out.println(Math.round(b));
                                    }
                                }
                                continue inicial;
                            case 2:
                                System.out.println("Impar!");
                                b = 51;
                                while(b <= 100){ 
                                    if((b % 2)!= 0){
                                        System.out.println(b);
                                    }
                                    b++;
                                }
                                System.out.println();
                            case 3:
                                continue inicial;
                        }

                        System.out.println();

                    }while(num1 != 0);                
                case 3:
                    return;
            }

        }while(qst != 0);


    }
}
