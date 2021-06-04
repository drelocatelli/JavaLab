import java.util.Scanner;
public class matriz_condominios{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String condominios[][];
        String edificios[] = {"\033[38;2;255;255;255m\033[1;105m Rosa \033[0m", "\033[38;2;255;255;255m\033[1;44m Azul \033[0m", "\033[38;2;255;255;255m\033[1;43m Amarelo \033[0m"};
        String andares[] = {"\033[38;2;255;255;255m\033[1m1 Andar\033[0m", "\033[38;2;255;255;255m\033[1m2 Andar\033[0m", "\033[38;2;255;255;255m\033[1m3 Andar\033[0m"};

        int quantEdificios = edificios.length, quantAndares = andares.length;

        condominios = new String[quantAndares][quantEdificios];
        System.out.println("\033[0;30m\033[1;47mPrograma de vizinhanca\033[0m");

        for(int i = 0; i < andares.length; i++){
            for(int j = 0; j < edificios.length; j++){
                System.out.print("Informe a familia do " + edificios[j] + " no " + andares[i] + ": ");
                condominios[i][j] = input.nextLine();
            }
        }

        System.out.println();

        // imprime colunas
        for(int i = 0; i < edificios.length; i++){
            // ultimo
            if(i == edificios.length - 1){
                System.out.printf("%9s\n" , edificios[i]);
            }// primeiro
            else if(i == 0){
                System.out.printf("\t%9s" , edificios[i]);
            }else{
                System.out.printf("%9s" , edificios[i]);
            }
        }

        
        // imprime linhas
        for(int i = 0; i < andares.length; i++){
            System.out.printf("%s" , andares[i]);
            for(int j = 0; j < edificios.length; j++){
                System.out.printf("%5s", condominios[i][j]);
            }
            System.out.println();
        }
        
        
    }// main
} // class
