import java.util.Scanner;
public class qst_15{


    public static void main(String[] args){
        // variaveis
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o n de termos: ");
        int ntermo = input.nextInt();
        
        // iteracao
        for(int i = 0; i < ntermo; i++){
            System.out.print(seq_fibo(i) + "\t");
        }
        
    }

    // funcao fibo
    static long seq_fibo(int n){

        if(n < 2){
            return n;
        }else{
            return seq_fibo(n - 1) + seq_fibo(n - 2);
        }
        
    }


}