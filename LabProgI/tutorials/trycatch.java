import java.util.Scanner;
public class trycatch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Digite um número: ");
            int x = input.nextInt();

            System.out.println(x);
        }catch(Exception err){
            System.out.println("OOPS! Erro, não é um número! "+(err));
        }
    }
}
