import java.util.Scanner;

public class c1a1{


    static Scanner input = new Scanner(System.in);

    static int quantiaVendedor = 2;
    static String vendedores[];
    static int vendedorId[];
    static int vendedorVendas[];

    public static void main(String[] args){

        
        vendedores = new String[quantiaVendedor];
        vendedorId = new int[quantiaVendedor];
        vendedorVendas = new int[quantiaVendedor];


        System.out.println("Cadastro de vendedores\n----------------------");
        // cadastra os vendedores
        for(int i = 0; i < vendedores.length; i++){
            
            System.out.printf("Digite o nome do vendedor %s: ", i+1);
            vendedores[i] = input.nextLine();
            vendedorId[i] = (int) Math.abs((Math.random() * 2000 + 1));

        }
        System.out.println();
        
        
        menu();

    }

    public static void menu(){

        // cadastra as vendas de cada vendedor
        for(int i = 0; i < vendedores.length; i++){
                    
            System.out.printf("Digite o total de vendas de %s: ", vendedores[i]);
            vendedorVendas[i] = input.nextInt();
        }

        while(true){
            System.out.println("\n\nMENU\n========================\na - alterar o valor de vendas\nb - verificar vendedor com maiores vendas\nc - Listar todos os vendedores");  
            
            System.out.print("Digite a opção desejada: ");
            String opt = input.nextLine();

            while(opt.equals("")){
                opt = input.nextLine();
            }

            
            switch(opt){
                case "a":
                    // altera as vendas de cada vendedor
                    alterar();
                break;
                case "b":
                    // verifica o vendedor com mais vendas
                    conferirVendas();
                break;
                case "c":
                    listarVendedores();
                break;
                default:
                    System.out.println("\nOpção inválida!");
                    System.out.print("\n\nContinuar? ");
                    input.nextLine();
                break;
            }
            continue;
        }

    }

    public static void alterar(){

        System.out.print("Digite o nome do vendedor: ");
        String buscaVendedor = input.nextLine();
        
        // verifica se o vendedor foi encontrado
        boolean achou = false;

        for(int i = 0; i < vendedores.length; i++){

            if(vendedores[i].equalsIgnoreCase(buscaVendedor)) {
                achou = true;

                System.out.printf("Digite o novo valor de vendas para o vendedor %s: ", vendedores[i]);
                vendedorVendas[i] = input.nextInt();

            }
            
        }

        if(!achou) {
            System.out.println("Vendedor não encontrado!");
        }else {
            System.out.printf("O total de vendas do vendedor(a) %s foi alterado!\n", buscaVendedor);            
        }

        System.out.println("Continuar ?");
        input.nextLine();
        
    }


    public static String maiorValor(){
        // retorna o maior valor do array

        int pos = 0;
        double maior = -1.0;
        
        for(int i = 0; i < vendedores.length; i++){
            if(vendedorVendas[i] > maior) {
                maior = vendedorVendas[i];
                pos = i;
            }
        }
        return vendedores[pos];
    }
    

    public static void conferirVendas() {
        System.out.println("\nO Vendedor que vendeu mais foi:");
        for(int i = 0; i < vendedores.length; i++){
            if(vendedores[i].equalsIgnoreCase(maiorValor())) {
                System.out.printf("[%d] %s -> Vendas: %d \n", vendedorId[i], vendedores[i], vendedorVendas[i]);
            }
        }

        System.out.print("\n\nContinuar? ");
        input.nextLine();
    }

    public static void listarVendedores(){
        System.out.println("Vendedores cadastrados:");
        for(int i = 0; i < vendedores.length; i++){
            System.out.printf("[%d] %s -> Vendas: %d \n", vendedorId[i], vendedores[i], vendedorVendas[i]);
        }
        System.out.print("\n\nContinuar? ");
        input.nextLine();
    }

}