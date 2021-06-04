import java.util.Scanner;
public class array_join {
    
    static Scanner input = new Scanner(System.in);
    // static String frutas[] = new String[3];
    static String[] frutas = {"Pêra", "Uva", "Maçã"};

    public static void main(String[] args){

        String allFruits = String.join(", ", frutas);
        System.out.printf("Foram cadastradas %d frutas: %s. \n", frutas.length, allFruits);
        
    }
    
}
