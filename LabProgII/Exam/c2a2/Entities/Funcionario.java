package Entities;
import java.util.Scanner;

public class Funcionario {
    public static Scanner input = new Scanner(System.in);
    protected static String type = "funcionário";
    
    protected static int tamanho;
	protected static String nome[];
	protected static int idade[];
	protected static String cargo[];
	protected static double salario[];
        
    public Funcionario(int tamanho) {
        this.tamanho = tamanho;
        
        nome = new String[tamanho];
        idade = new int[tamanho];
        cargo = new String[tamanho];
        salario = new double[tamanho];
        

    }
    
    public static void cadastro() {
    	for(int i = 0; i < tamanho; i++) {

            input.nextLine();
            clear();
            System.out.printf("Digite o nome do %s %d: ", type, i+1);
            nome[i] = input.nextLine();

            System.out.printf("Digite a idade do %s %d: ", type, i+1);
            idade[i] = input.nextInt();
//
            input.nextLine();
            System.out.printf("Digite o cargo do %s %d: ", type, i+1);
            cargo[i] = input.nextLine();

            System.out.printf("Digite o salário do %s %d: ", type, i+1);
            salario[i] = input.nextDouble();
            
        }
    	input.nextLine();
    }

    public static void atualizaSalario(){

        System.out.printf("Informe a matrícula do %s: ", type);
        int matricula = input.nextInt();

        for(int i = 0; i < tamanho; i++) {
            if(i == matricula){
                input.nextLine();
                clear();

                input.nextLine();
                System.out.printf("Digite o salário do %s %d: ", type, i);
                salario[i] = input.nextDouble();

            }
        }
        input.nextLine();
    }
    
    
    public String toString() {
        String info = "";
        for(int i = 0; i < tamanho; i++){
            info += "\nMatrícula:"+i+" Nome: "+nome[i]+" Idade: "+idade[i]+" Cargo: "+cargo[i]+" Salario: "+salario[i];
        }
        return info;
    }

    public static void clear() {
        System.out.print("");
    }
}