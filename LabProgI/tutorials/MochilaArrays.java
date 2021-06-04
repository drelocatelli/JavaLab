package Arrays;
import java.util.Scanner;
public class CriandoVetores {
    public static void main(String[] args) {
        String itens[] = {"Diamante","Tumalinas", "Platina",
                          "Topázio", "Safira", "Ouro",
                          "Rubi", "Ametista", "Bronze",
                          "Paládio", "Ágata", "Esmeralda",
                          "Prata", "Marfim", "Pérola"};
        
        int tamanho;
        Scanner entrada = new Scanner(System.in);
        double valores[];
        
        do{
          System.out.print("Quantas pedras preciosas gostaria de colecionar? ");
          tamanho = entrada.nextInt();
        }while(tamanho >= 15);
        
        valores = new double[tamanho];
        
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Favor incluir o valor do " + itens[i] + ": ");
            valores[i] = entrada.nextDouble();
        }
        
        int indice = 0;
        while(indice < valores.length){
          System.out.println(itens[indice] + " " + valores[indice]);
          indice++;
        }
        
    }
}