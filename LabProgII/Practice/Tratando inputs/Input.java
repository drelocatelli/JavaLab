import java.util.Scanner;

public class Input {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){

        String nome = "";
            
        while(nome.equals("\n") || nome.equals("")) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();
        }
        
    }
    
}
