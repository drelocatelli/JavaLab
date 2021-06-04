import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int opcao;
        String nome;
        double check = 999999999;
        double menor;
        

        int total = 15;
        
        String[] nomesCliente = new String[total];
        double[] saldoCliente = new double[total];
        double[] numeroCliente = new double[total];
        
        do{
            for(int i = 0; i<numeroCliente.length ; i++){
                System.out.printf(numeroCliente[i]+" "+nomesCliente[i]+" "+String.format("%,.2f", saldoCliente[i])+"\n" );
            }
            System.out.println("\n\nEscolha a opção desejada\n");
            System.out.println("1. Cadastrar contas");
            System.out.println("2. Visualizar todas as contas de determinado cliente (pesquisar por nome)");
            System.out.println("3. Excluir a conta com menor saldo");
            System.out.println("4. Sair\n");
            System.out.println("Opção : ");
            opcao = a.nextInt();
            
            if(opcao == 1){
                cadastrarNomeCliente(nomesCliente);
                cadastrarNumeroCliente(numeroCliente);
                cadastrarSaldoCliente(saldoCliente, nomesCliente);
                
                
            }else if( opcao == 2 ){
                
                System.out.println("\n\nDigite o nome do cliente : ");
                a.nextLine();
                nome = a.nextLine();
                pesquisaCliente(nomesCliente, nome, saldoCliente, numeroCliente);
                
                
            }else if( opcao == 3){
                menor = checagemSaldos(saldoCliente, check);
                int vrfc = 0;
                int indMenor = 0;
                for(int i = 0; i<numeroCliente.length; i++){
                    if(menor == saldoCliente[i]){
                        vrfc++;
                        indMenor = i;
                    }
                }
                if(vrfc == 1){
                    nomesCliente[indMenor]="null";
                    saldoCliente[indMenor]=0;
                    numeroCliente[indMenor]=0;
                    System.out.println("");
                    System.out.println("");


                }else{
                    System.out.println("Não é possivel deletar");
                }

                
                
            }
            
        }while(opcao != 4);
    }
    
    public static String[] cadastrarNomeCliente (String[] vetor){
        Scanner a = new Scanner(System.in);
        for(int i = 0; i<vetor.length ; i++){
            System.out.print("\nNome do cliente : ");
            vetor[i] = a.nextLine();
        }
        return vetor;
    }
    public static double[] cadastrarNumeroCliente (double[] vetor){
        for(int i = 0; i<vetor.length ; i++){
            double rndNbr = (Math.random() * ((9 - 1) + 1)) + 1;
            vetor[i] = rndNbr;
        }
        return vetor;
    }
    public static double[] cadastrarSaldoCliente (double[] vetor, String[] nomes){
        Scanner a = new Scanner(System.in);

        for(int i = 0; i<vetor.length ; i++){
            System.out.printf("\nSaldo do cliente "+nomes[i]+" : ");
            vetor[i] = a.nextDouble();
        }
        return vetor;
    }
    public static void pesquisaCliente(String[] vetor, String nome, double[] saldo, double[] numero){
        for(int i = 0 ; i < vetor.length ; i++){
            if(nome.equals(vetor[i])){
                System.out.printf("\n"+numero[i]+" "+vetor[i]+" "+saldo[i]+"\n\n");
            }
        }

    }
    public static double checagemSaldos(double[] saldo, double check){
        for(int i = 0; i<saldo.length; i++){
            if(saldo[i]<check){
                check = saldo[i];
            }
        }
        return check;
    }

    
}
