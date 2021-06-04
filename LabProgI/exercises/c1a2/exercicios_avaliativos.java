import java.util.Scanner;
import java.util.Calendar;
public class exercicios_avaliativos {

	public static void main(String[] args) {
		Scanner questao = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Selecione a questao [1, 3, 7, 10]: ");
        String selected_questao = questao.nextLine(); 
        System.out.print("\n\n");

        
        // questao 1
        if(selected_questao.equals("1")){
            double x1, y1;
            double x2, y2;

            while(true){
                System.out.println("Ponto 1:");
                System.out.print("valor de x: ");
                x1 = input.nextDouble();
                System.out.print("valor de y: ");
                y1 = input.nextDouble();
                System.out.printf("(%.0f, %.0f)",x1,y1);

                System.out.println("\n");

                System.out.println("Ponto 2:");
                System.out.print("valor de x: ");
                x2 = input.nextDouble();
                System.out.print("valor de y: ");
                y2 = input.nextDouble();
                System.out.printf("(%.0f, %.0f)\n\n",x2,y2);

                System.out.println();

                double primeiro = ((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
                double calcularaiz = Math.sqrt(primeiro);
                double distancia = calcularaiz;
                
                System.out.printf("raiz de %.0f",primeiro);
            
                if(primeiro < 0){
                    System.out.println("Nao existe raiz quadrada negativa, tente novamente!");
                    continue;
                }else{
                	System.out.println(" = "+(distancia));
                	
                    break;
                }
                
            }
        
        }
        
        // questao 3
        if(selected_questao.equals("3")) {
        	Calendar cal = Calendar.getInstance();
            int day = cal.get(Calendar.DATE);
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
            int anoAtual = year;

            System.out.print("dia do aniversario: ");
            int diaNiver = input.nextInt();

            System.out.print("mes aniversario: ");
            int mesNiver = input.nextInt();

            System.out.print("ano de nascimento: ");
            int anoNasc = input.nextInt();

            if(mesNiver < month){
                int idade = (anoAtual-anoNasc);
                System.out.println("\n"+ (idade)+" anos = "+ (idade*365) +" dias.");
            }else if(mesNiver == month){
                if(diaNiver <= day){
                    int idade = (anoAtual-anoNasc);
                    System.out.println("\n"+ (idade)+" anos = "+(idade*365) +" dias.");
                }else{
                    int idade = (anoAtual-anoNasc-1);
                    System.out.println("\n"+ (idade)+" anos = "+(idade*365) +" dias.");
                }
            }else{
                int idade = (anoAtual-anoNasc-1);
                System.out.println("\n"+ (idade)+" anos = "+(idade*365) +" dias.");
            }

        }
        
        // questao 7
        if(selected_questao.equals("7")) {
        	
        }
        
        // questao 10
        if(selected_questao.equals("10")) {
        	double m,h;
        	
        	System.out.print("Quantia de homens: ");
        	h = input.nextDouble();
        	
        	System.out.print("Quantia de mulheres: ");
        	m = input.nextDouble();
        	
        	double total = h+m;
        	double mper = (m*100)/total;
        	double hper = (h*100)/total;
        	
        	System.out.println();
        	System.out.printf("Ha %.0f pessoas na turma.\n",total);
        	System.out.printf("%.0f%% sao homens.\n",hper);
        	System.out.printf("%.0f%% sao mulheres.",mper);
        	
        }
        

	}

}
