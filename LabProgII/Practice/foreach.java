import java.util.Scanner;
public class foreach {
    
    static Scanner input = new Scanner(System.in);
    // static String frutas[] = new String[3];
    static String[] frutas = {"Pêra", "Uva", "Maçã"};

    public static void fruits(){

        //foreach
        for(String fruta : frutas ){
            System.out.println(fruta);
        }
        
    }

    public static void main(String[] args){

        System.out.println();
        System.out.println("Foram cadastradas as frutas:");

        fruits();

        System.out.printf("\nForam cadastradas %d frutas.\n", frutas.length);
        
    }
    
}
