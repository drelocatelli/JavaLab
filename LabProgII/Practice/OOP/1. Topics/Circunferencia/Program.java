import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("\nCircumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", Calculator.PI);

        input.close();
        
    }

    
}