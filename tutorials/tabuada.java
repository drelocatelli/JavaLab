import java.util.Scanner;

public class tabuada{

    public static void main(String[] args){
        

        for(int i = 2; i <= 9; i++){       
            System.out.println("\nTabuada de " + i); 
            for(int multiplicado = 2; multiplicado <= 9; multiplicado++){
                System.out.printf("%d x %d = %d", i,multiplicado,(i*multiplicado));
                System.out.println();
            }
        }

        
    }
    
}