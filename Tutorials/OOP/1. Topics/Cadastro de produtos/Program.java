import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    static Scanner input = new Scanner(System.in);
    static Product product = new Product();


    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: ");
        product.price = input.nextDouble();
        System.out.print("Quantity In Stock: ");
        product.quantity = input.nextInt();

        System.out.println("Product data: "+product);
        
        menu();
    }

    public static void menu(){
        while(true){
            System.out.println("\n===============================");
            System.out.println("a - increment quantity");
            System.out.println("b - decrement quantity");
            System.out.println("===============================");

            System.out.print("Enter a option: ");
            char option = input.next().charAt(0);

            switch(option){
                case 'a':
                    incrementProducts();
                break;
                case 'b':
                    decrementProducts();
                break;
            }
            
            input.nextLine(); // evita erro de buffer
            System.out.print("\nContinuar? [Enter] ");
            input.nextLine();

        }

    }

    public static void incrementProducts() {
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println("");
        System.out.println("Updated data: "+ product);
        
    }

    public static void decrementProducts() {
        System.out.println();
        System.out.print("Enter the number of products to be remove in stock: ");
        int quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println("");
        System.out.println("Updated data: "+ product);
        
    }

    
}