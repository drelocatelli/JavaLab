import java.util.Scanner;

public class Ex4 {
    
    static Scanner input = new Scanner(System.in);
    
    static int quantBrinquedos = 40;
    static String brinquedos[] = new String[quantBrinquedos];
    static String brinquedoDesc[] = new String[quantBrinquedos];
    static double brinquedoPrecoEstoque[] = new double[quantBrinquedos];
    static double brinquedoPrecoVenda[] = new double[quantBrinquedos];
    static int brinquedoQuantEstoque[] = new int[quantBrinquedos];
    static int brinquedoQuantEstoqueMinimo[] = new int[50];

    static double brinquedoQuantVendas[] = new double[quantBrinquedos];
    static double brinquedoLucroLiquido[] = new double[quantBrinquedos];
    static double brinquedoLucro[] = new double[quantBrinquedos];
    static double receitaEmpresarial;


    public static void main(String[] args){
        clear();
        cadastrarBrinquedos(quantBrinquedos);

        while(true){
            menu();
        }
        
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    public static void title(String title){
        System.out.printf("=========== %s ===========\n", title);
    }

    public static void menu() {
        clear();
        title("Bem vindo ao menu da Loja Toys");
        System.out.printf("A - Adicionar brinquedos\nB - Gerenciar Vendas\nC - Verificar estoque\n");

        System.out.print("Digite a opção: ");
        String option = input.nextLine();

        option = option.toUpperCase();


        switch(option) {
            case "A":
                clear();
                System.out.print("Quantos brinquedos deseja adicionar? ");
                int quantidadeAdcBrinquedos = input.nextInt();
                cadastrarBrinquedos(quantidadeAdcBrinquedos);
            break;

            case "B":
                clear();
                cadastrarVendas();
            break;

            case "C":
                clear();
                verificaEstoque();
            break;

            default:
                System.out.println("\nOpção inválida!\n\n");

        }

        
    }


    public static void cadastrarBrinquedos(int quantidade) {
        clear();
        title("Cadastrar brinquedos");


        for(int i = 0; i < quantidade; i++) {

            int brinquedoNum = i+1;

            System.out.println("\n-> Cadastro brinquedo ID = "+brinquedoNum);

            System.out.printf("título do brinquedo: ");
            brinquedos[i] = input.nextLine();

            System.out.printf("descrição do brinquedo: ");
            brinquedoDesc[i] = input.nextLine();


            System.out.printf("preço em estoque: ");
            brinquedoPrecoEstoque[i] = input.nextDouble();


            System.out.printf("preço em venda: ");
            brinquedoPrecoVenda[i] = input.nextDouble();

            System.out.printf("quantidade em estoque: ");
            brinquedoQuantEstoque[i] = input.nextInt();

            brinquedoQuantEstoqueMinimo[i] = brinquedoQuantEstoqueMinimo.length;


            input.nextLine();
            
        }

        // calcula receita da empresa

        for(int i = 0; i < brinquedos.length; i++) {
            receitaEmpresarial += (brinquedoPrecoVenda[i] * brinquedoQuantEstoque[i]);
        }

        System.out.println();

    }


    public static void cadastrarVendas() {
        title("Gerenciar vendas");

        String allToys = String.join(", ", brinquedos);

        System.out.printf("Atualmente você possui esses brinquedos: %s\n", allToys);

        System.out.print("cadastrar venda de: ");
        String brinquedoVendaOpc = input.nextLine();

        for(int i = 0; i < brinquedos.length; i++) {

            if(brinquedoVendaOpc.equalsIgnoreCase(brinquedos[i])){
                System.out.print("Digite a quantidade de vendas: ");
                brinquedoQuantVendas[i] = input.nextDouble();
                
                brinquedoLucro[i] = (brinquedoPrecoVenda[i] - brinquedoPrecoEstoque[i]) * brinquedoQuantVendas[i];
                System.out.printf("lucro obtido do brinquedo %s = ", brinquedos[i]);
                System.out.printf("%.3f%%", brinquedoLucro[i]);

                System.out.print("\nContinuar ? ");
                input.nextLine();
                input.nextLine();

            }
        }
        
    }

    public static void verificaEstoque() {
        title("Verifica estoque");

        String leftAlignFormat = "| %-2d | %-17s | %-21d | %-24d | %-18.0f | R$ %-10.2f | R$ %-13.2f | R$ %-6.2f |%n";
            
        System.out.format("+----+-------------------+-----------------------+--------------------------+--------------------+---------------+------------------+-----------+%n");
        System.out.format("| ID | Nome do brinquedo | Quantidade em estoque | Estoque Mínimo permitido |   Total de Vendas  |   Preço Est.  |   Preço Unit.    |   Lucro   |%n");
        System.out.format("+----+-------------------+-----------------------+--------------------------+--------------------+---------------+------------------+-----------+%n");


        for(int i = 0; i < brinquedos.length; i++) {
            int n = i+1;
            System.out.format(leftAlignFormat, n, brinquedos[i], brinquedoQuantEstoque[i], brinquedoQuantEstoqueMinimo[i], brinquedoQuantVendas[i], brinquedoPrecoEstoque[i], brinquedoPrecoVenda[i], brinquedoLucro[i]);
        } 
        System.out.format("+----+-------------------+-----------------------+--------------------------+--------------------+---------------+------------------+-----------+%n");
        System.out.print("Continuar ? ");
        input.nextLine();

    }

}