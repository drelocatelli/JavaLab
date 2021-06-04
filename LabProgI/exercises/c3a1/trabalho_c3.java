import java.util.Scanner;
public class trabalho_c3{
    public static void main(String[] args){


        /* Variaveis */
        Scanner input = new Scanner(System.in);
        String condominios[][];
        // imprime colorido os edificios
        String edificios[] = {"\033[38;2;255;255;255m\033[1;105m Rosa \033[0m", "\033[38;2;255;255;255m\033[1;44m Azul \033[0m", "\033[38;2;255;255;255m\033[1;102m Verde \033[0m"};
        String andares[] = {"\033[38;2;255;255;255m\033[1m1 Andar\033[0m", "\033[38;2;255;255;255m\033[1m2 Andar\033[0m", "\033[38;2;255;255;255m\033[1m3 Andar\033[0m"};

        int quantEdificios = edificios.length, quantAndares = andares.length;

        condominios = new String[quantAndares][quantEdificios];
        
        /* Inicio do programa */
        System.out.println("\n\n\033[0;30m\033[1;47mPrograma de vizinhanca\033[0m");
        System.out.println("Para melhor visualização rode o código no terminal!");

        System.out.println("\n\nCadastro de vizinhança");
            
        for(int i = 0; i < andares.length; i++){
            for(int j = 0; j < edificios.length; j++){
                System.out.print("Informe a familia do " + edificios[j] + " no " + andares[i] + ": ");
                condominios[i][j] = input.nextLine();
            }
        }

        System.out.println();

        System.out.println("Vizinhança cadastrada com sucesso!\n\n");

        // Menu de opcoes
        int opcao;
        do{
            System.out.println("\nMENU");
            System.out.println("1 - Pesquisar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Mostrar dados");
            System.out.println("4 - Créditos");
            System.out.println("0 - Sair");
            System.out.print("Selecione a opção: ");
            opcao = input.nextInt();

            int andar, edificio;
            String nova_familia;

            switch(opcao){
                case 1:
                    // procurar
                    System.out.println("\nPesquisar vizinhança");
                    System.out.print("Digite o Andar que deseja buscar: ");
                    andar = input.nextInt();
                    for(int i = 1; i < edificios.length + 1; i++){
                        System.out.printf("%d - %s\n", i, edificios[i-1]);
                    }
                    System.out.print("Digite o edifício que deseja buscar: ");
                    edificio = input.nextInt();

                    System.out.printf("No edificio %s, %s mora a família %s", edificios[edificio-1], andares[andar-1], condominios[andar-1][edificio-1]);

                    System.out.println("\n");
                    break;
                case 2:
                    // alterar
                    System.out.println("\nAlterar vizinhança");
                    System.out.print("Digite o Andar que deseja alterar: ");
                    andar = input.nextInt();
                    for(int i = 1; i < edificios.length + 1; i++){
                        System.out.printf("%d - %s\n", i, edificios[i-1]);
                    }
                    System.out.print("Digite o edifício que deseja alterar: ");
                    edificio = input.nextInt();
                    input.nextLine();
                    System.out.print("Atribua o nome da nova família: ");
                    nova_familia = input.nextLine();

                    System.out.printf("\nA família %s do edificio %s, %s foi alterada para ", condominios[andar-1][edificio-1], edificios[edificio-1], andares[andar-1]);
                    condominios[andar-1][edificio-1] = nova_familia;
                    System.out.println(condominios[andar-1][edificio-1]);
                    
                    break;
                case 3:
                    // mostrar dados
                    // imprime colunas
                    for(int i = 0; i < edificios.length; i++){
                        // ultimo
                        if(i == edificios.length - 1){
                            System.out.printf("%9s\n" , edificios[i]);
                        }// primeiro
                        else if(i == 0){
                            System.out.printf("\t  %9s" , edificios[i]);
                        }else{
                            System.out.printf("%5s" , edificios[i]);
                        }
                    }

        
                    // imprime linhas
                    for(int i = 0; i < andares.length; i++){
                        System.out.printf("%s  " , andares[i]);
                        for(int j = 0; j < edificios.length; j++){
                            System.out.printf("%4s|", condominios[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("\nCréditos\n\nAndressa Lucatelli\nErick Mercado\nVictor Santuzzi\nLuiz Henrique Gilles\n");
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }
            
        }while(opcao != 0);
        
        
        
    }// main
} // class
