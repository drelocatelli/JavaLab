import java.util.Scanner;
public class qst_41{


    public static void main(String[] args){
        do{
            double valor_parcela, juros, divida, valor_divida;
            int parcela = -1;

            Scanner input = new Scanner(System.in);

            System.out.print("Valor da dívida: ");
            divida = input.nextDouble();

            System.out.println("V. Divida\t\tV. Juros\tQtd. Parcelas\t\tV. Parcela");

            for(int i = 0; i < 3; i++){

                if(parcela < 3){
                    parcela = parcela + 2;
                }else{
                    parcela = parcela + 3;
                }
                
                switch(parcela){
                    case 1:
                    default:
                        juros = 0;
                        valor_parcela = divida;
                        break;
                    case 3:
                        juros = divida * 0.10;
                        valor_parcela = (divida + juros)/parcela;
                        break;
                    case 6:
                        juros = divida * 0.15;
                        valor_parcela = (divida + juros)/parcela;
                        break;
                    case 9:
                        juros = divida * 0.20;
                        valor_parcela = (divida + juros)/parcela;
                        break;
                    case 12:
                        juros = divida * 0.25;
                        valor_parcela = (divida + juros)/parcela;
                        break;                    
                }

                valor_divida = divida + juros;

                System.out.printf("R$ %.2f\t\t%.0f\t\t%d\t\tR$ %.2f\n",valor_divida,juros,parcela,valor_parcela);
                
            }

            System.out.println("\n\n");
        }while(true);    
        
    }


}