import java.util.Scanner;
public class qst_32 {

	// funcao Calculo fatorial
    private static int fatora(int f){

        if(f == 0){
            return 1;    
        }else{
            return f * fatora(f-1);
        }

    }

    public static void main(String[] args){ 
        // variaveis
        Scanner input = new Scanner(System.in);

        System.out.print("Fatorial de: ");
        int x = input.nextInt();

        int fatorial = fatora(x);

        // imprime bonitinho
        System.out.print(x+"! = ");

        while(x >= 1){
            if(x == 1){
                System.out.print(x);
                System.out.print(" = ");
            }else{
                System.out.print(x + " . ");
            }
            x--;        
        }
	// imprime o resultado
        System.out.print(fatorial);
    }
    
    
}
