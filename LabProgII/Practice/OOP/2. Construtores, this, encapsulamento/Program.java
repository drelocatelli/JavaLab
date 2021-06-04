import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    static Scanner input = new Scanner(System.in);
    static String name;
    static double price;
    static int quantity;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Price: ");
        price = input.nextDouble();
        Product product = new Product(name, price, quantity);
        
        System.out.println("Product data: "+ product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println("");
        System.out.println("Updated data: "+ product);
        

        System.out.println();
        System.out.print("Enter the number of products to be remove in stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println("");
        System.out.println("Updated data: "+ product);
        
    }

    
}