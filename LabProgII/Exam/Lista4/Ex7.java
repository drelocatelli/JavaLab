import java.util.Scanner;

import javax.xml.namespace.QName;

public class Ex7 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();   
        Scanner a = new Scanner(System.in);

       
        String[] nomes = new String[18];
        String[] categoria = new String[18];
        int[] hrsTrabalhadas = new int[18];
        double[] salarioBruto = new double[18];
        int opcao;

        vetorNomes(nomes);
        vetorCategoria(nomes, categoria);
        vetorHrsTrabMes(nomes, categoria, hrsTrabalhadas);
        
        
        do {
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
            
            vetorCalculadoraSalarioBruto(salarioBruto, categoria, hrsTrabalhadas);

            String leftAlignFormat = "| %-2d | %-30s | %-9s | %-24d | R$%-11f |%n";
            
            System.out.format("+-----+--------------------------------+-----------+--------------------------+---------------+%n");
            System.out.format("| Nº | Nomes dos funcionários         | Categoria | Horas trabalhadas no mês | Salário bruto |%n");
            System.out.format("+-----+--------------------------------+-----------+--------------------------+---------------+%n");
            for (int i = 0; i < 18; i++) {
                int n = i+1;
                System.out.format(leftAlignFormat, n, nomes[i], categoria[i].toUpperCase(), hrsTrabalhadas[i], salarioBruto[i]);
                
            }       
            System.out.format("+-----+--------------------------------+-----------+--------------------------+---------------+%n");
            
            System.out.println("Escolha uma opcao digitando seu respectivo número :");
            System.out.println("1 - Alterar horas trabalhadas");
            System.out.println("2 - Sair");
            System.out.print("Opção: ");
            opcao = a.nextInt();

            if(opcao == 1){
                atualizarHoras(hrsTrabalhadas);
            }

        } while (opcao != 2);
        }

    public static String[] vetorNomes(String[] vetor){
        Scanner a = new Scanner(System.in);
        
        
        for(int i = 0; i<18 ; i++){
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            System.out.format("Nome do funcionário\n\n nº "+ (i+1) + ": ");
            vetor[i] = a.nextLine(); 
        }
            
        return vetor;
    }

    public static String[] vetorCategoria(String[] nomes, String[] vetor ){
        Scanner a = new Scanner(System.in);
        String n;
        
        
        for(int i = 0; i<18 ; i++){
            do{
                System.out.print("\033[H\033[2J");  
                System.out.flush();   
                System.out.printf("\n\n Categorias \n O para Operário\n G para Gerente\n\n");
                System.out.printf(nomes[i] +" ");
                n = a.nextLine(); 
                vetor[i] = n;
            }while(vetor[i].intern() != "O"
            && vetor[i].intern() != "G"
            && vetor[i].intern() != "o"
            && vetor[i].intern() != "g");
        }

        return vetor;
    }
    
    public static int[] vetorHrsTrabMes(String[] nomes, String[] cat, int[] vetor){
        Scanner a = new Scanner(System.in);
        
        
        for(int i = 0; i<18 ; i++){
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            System.out.printf(" Digite a quantidade de horas trabalhadas por cada funcionário\n\n");
            System.out.printf(nomes[i] + " ");
            System.out.printf(cat[i].toUpperCase() + " ");
            vetor[i] = a.nextInt(); 
        }        

        return vetor;
    }

    public static double[] vetorCalculadoraSalarioBruto (double[] vetor, String[] categoria, int[] horas){

        for(int i = 0; i<18 ; i++){
            if(categoria[i].equalsIgnoreCase("O")){
               vetor[i] = 112*horas[i] + ((112*horas[i])*10)/100;
            }else{
                vetor[i] = 112*horas[i] + ((112*horas[i])*15)/100;
            }
        }

        return vetor;
    }

    public static int[] atualizarHoras (int[] vetor){
        Scanner a = new Scanner(System.in);
        int i;

        System.out.print("\n\nDigite o número do funcionário que deseja alterar o numero de horas trabalhadas\n\nNº: ");
        i = a.nextInt(); 
        System.out.print("\n\nDigite o número de horas trabalhadas: ");
        vetor[i-1] = a.nextInt();

        return vetor;
    }
}
