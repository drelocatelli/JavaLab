package Entities;
import java.util.Scanner;

public class Gerente extends Funcionario{
    static Scanner input = new Scanner(System.in);

    static String setor[];
        
    public Gerente(int tamanho) {
    	super(tamanho);
    	type = "gerente";
        this.tamanho = tamanho;
        
        setor = new String[tamanho];
        
    }
    
    public static void cadastro() {
    	for(int i = 0; i < tamanho; i++) {

            input.nextLine();
            clear();
            System.out.printf("Digite o nome do %s %d: ", type, i+1);
            nome[i] = input.nextLine();

            System.out.printf("Digite a idade do %s %d: ", type, i+1);
            idade[i] = input.nextInt();

            input.nextLine();
            System.out.printf("Digite o cargo do %s %d: ", type, i+1);
            cargo[i] = input.nextLine();

            System.out.printf("Digite o salário do %s %d: ", type, i+1);
            salario[i] = input.nextDouble();
            
            System.out.printf("Digite o setor do %s %d: ",type,i+1);
            setor[i] = input.nextLine();
            
        }
    	input.nextLine();
    }


    @Override
    public String toString() {
        String info = "";
        for(int i = 0; i < tamanho; i++){
            info += "\nMatrícula:"+i+" Nome: "+nome[i]+" Idade: "+idade[i]+" Cargo: "+cargo[i]+" Salario: "+salario[i]+" Setor: "+setor[i];
        }
        return info;
    }

}