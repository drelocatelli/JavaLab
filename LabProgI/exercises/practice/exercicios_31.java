import java.util.Scanner;

public class exercicios_31 {
    public static void main(String[] args){
        // Exercicios pagina 31 e 60
        System.out.print("Pagina 31 - ");
        System.out.println("[a,b,c,d,e,f]");
        System.out.print("Selecione a questao: ");
        Scanner questao = new Scanner(System.in);
        String selected_questao = questao.nextLine();
        System.out.println("\n");

		Scanner value = new Scanner(System.in);
		
        // QUESTaO 31-A
        if(selected_questao.equals("a")){
            
            double a,e,b,x,c;

            // input's
            while(true){
                System.out.println("\n\nA) ae + b^(3x)/c^(2)");


                System.out.print("Valor de a: ");
                a = value.nextDouble();

                System.out.print("Valor de e: ");
                e = value.nextDouble();

                System.out.print("Valor de b: ");
                b = value.nextDouble();

                System.out.print("Valor de x: ");
                x = value.nextDouble();

                System.out.print("Valor de c: ");
                c = value.nextDouble();
                
                double resultado = a*e + Math.pow(b,3*x)/Math.pow(c,2);

                System.out.println("\nResultado: "+(resultado) +"\n\n");
                continue;
            }
            
        }

        // Quest�o 31 b
        if(selected_questao.equals("b")){
            String enunciado = "(2*Math.pow(x,2)-Math.pow(3*x,x+1))/2)+(Math.sqrt(x+1)/Math.pow(x,2)";
            System.out.println("B) "+enunciado);

            double x;
            while(true){
                System.out.println("Valor de x:");
                x = value.nextDouble();

                double resultado = ((2*Math.pow(x,2)-Math.pow(3*x,x+1))/2)+(Math.sqrt(x+1)/Math.pow(x,2));

                System.out.println("= "+ resultado+" ~= "+Math.round(resultado));
                System.out.print("\n\n");

                continue;
            }

        }

        // 31 c
        if(selected_questao.equals("c")){
            System.out.print("C) ");


            double h,k,x;
            
            while(true){
                System.out.print("valor de h: ");
                h = value.nextDouble();
                System.out.print("valor de k: ");
                k = value.nextDouble();
                System.out.print("valor de x: ");
                x = value.nextDouble();

                double parenteses = Math.pow((45/3*x)-4*h*(3-h),22*k);
                double resultado = 2*h-parenteses;

                System.out.println("= "+resultado);
                System.out.print("\n\n");
                continue;
            }
        }
        
        // 31 d
        
        if(selected_questao.equals("d")) {
        	double b,a,f;
        	
        	while(true) {
        		System.out.print("\n");
        		System.out.println("D)");
	        	System.out.print("valor de a: ");
	        	a = value.nextDouble();
	        	System.out.print("valor de b: ");
	        	b =  value.nextDouble();
	        	System.out.print("valor de f: ");
	        	f = value.nextDouble();
	        	
	        	while(a > b) {
	        		System.out.println("a nao pode ser maior que b.");
	        		System.out.print("valor de a: ");
		        	a = value.nextDouble();
	        		continue;
	        	}
	        	
	        	double raizquadrada = 2*b-4*Math.pow(a,2);
		        raizquadrada = Math.sqrt(raizquadrada);
		        	
		        double resultado = (raizquadrada+2*Math.pow(f, -3))/(3-2*a);
		        			
		        System.out.println("= "+resultado);
		        continue;
	        	
	        	
	        	
        	}
        	
        }
        
        if(selected_questao.equals("e")) {
        	double x,y;
        	
        	while(true) {
        		System.out.print("\n");
        		System.out.println("E)");
        		
        		System.out.print("valor de x: ");
        		x = value.nextDouble();
        		
        		System.out.print("valor de y: ");
        		y = value.nextDouble();
        		System.out.println("\n");
        		
        		double numerador = Math.pow(-6, x)+Math.pow(2*y, 1/3);
        		double raizquadrada = Math.sqrt(numerador);
        		double denominador = Math.pow(3, 9);
        		
        		System.out.print("("+raizquadrada + "/" + denominador+")");
        		
        		double resultado = (raizquadrada)/(denominador);
        		System.out.println(" = "+ resultado);
        		continue;
        	}
        	
        }
        
        if(selected_questao.equals("f")) {
        	
        	double x,u,a,b,c;
        	          	
        	while(true) {
        		
        		System.out.print("valor de x: ");
            	x = value.nextDouble();
            	
            	System.out.print("valor de u: ");
            	u = value.nextDouble();
            	
            	System.out.print("valor de a: ");
            	a = value.nextDouble();
            	
            	System.out.print("valor de b: ");
            	b = value.nextDouble();
            	
            	System.out.print("valor de c: ");
            	c = value.nextDouble();
            	
            	System.out.println();
        		
        		double numerador = 2*x+Math.pow(u, (2/3));
        		double denominador = a+b*c;
        		double raizquadrada = Math.sqrt(numerador/denominador);
        		
        		System.out.println("= "+raizquadrada);
        		continue;
        	}
        	
        }
        

    } // main
} // class
