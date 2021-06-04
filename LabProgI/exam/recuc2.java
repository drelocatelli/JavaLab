import java.util.Scanner;
public class recuc2 {
    public static void main(String[] args){
        // variaveis
        Scanner input = new Scanner(System.in);

        double tweeta[];
        double tweetb[];
        int sizev;

        System.out.print("Tamanho dos vetores: ");
        sizev = input.nextInt();

        // define os tamanhos pelo usuario
        tweeta = new double[sizev];
        tweetb = new double[sizev];

        for(int i = 0; i < sizev; i++){

            System.out.printf("Informe o valor do vetor %d: ", i);
            tweeta[i] = input.nextDouble();
            tweetb[i] = tweeta[i];
        }


        double numerador = 0;

        for(int i = 0; i < sizev; i++){

            numerador += (tweeta[i]*tweetb[i]);

            i++;

        }

        double denominador1 = 0;

        for(int i = 0; i < sizev; i++){
            // raiz quadrada e potencia
            denominador1 += Math.sqrt((Math.pow(tweeta[i],2)));

            i++;

        }

        double denominador2 = 0;

        for(int i = 0; i < sizev; i++){
            // raiz quadrada e potencia
            denominador2 += Math.sqrt((Math.pow(tweetb[i],2)));

            i++;

        }


        double denominador = (denominador1 * denominador2);
        double similaridade = (numerador / denominador);

        System.out.println("A similiaridade é "+ Math.round(similaridade));
        System.out.println("O Tweet 1 é "+ Math.round(similaridade*100) + "% similar ao Tweet 2");
        
    }
}
