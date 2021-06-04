package c2a2;

import java.util.Scanner;
import Entities.*;

public class Program {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){

        while(true){
            menu();
        }

    }

    public static void menu(){
        System.out.print("Digite a quantidade de funcionários: ");    
        int n = input.nextInt();

        Funcionario funcionario = new Funcionario(n);
        funcionario.cadastro();

        System.out.print("Digite a quantidade de gerentes: ");    
        int j = input.nextInt();
    
        Gerente gerente = new Gerente(j);
        gerente.cadastro();
        
        System.out.println("Alterar Salário");
        System.out.println("A - Funcionários\nB - Gerentes\nC - Visualizar tudo");
        System.out.print("Digite a opção: ");
        String opc = input.nextLine();

        opc = opc.toLowerCase();

        switch(opc){
            case "a":
                System.out.println(funcionario);
                System.out.print("Alterar salário? [S|N]");
                opc = input.nextLine();
                if(opc.equalsIgnoreCase("s")){
                    funcionario.atualizaSalario();
                }
            break;
            case "b":
                System.out.println(gerente);
                System.out.print("Alterar salário? [S|N]");
                opc = input.nextLine();
                if(opc.equalsIgnoreCase("s")){
                    gerente.atualizaSalario();
                }
            break;
            default:
            case "c":
            	System.out.println(funcionario);
            	System.out.println(gerente);
            break;

        }
        
        System.out.print("Continuar?");
        input.nextLine();input.nextLine();
        
    }
    
}