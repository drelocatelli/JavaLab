package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
    // constructor -> roda quando a classe é instanciada
         this.name = name;
         this.price = price;
         this.quantity = quantity;
    }
    
    public double totalValueInStock() {
        if(this.quantity == 0) {
            return this.price;
        }else{
            return price * quantity;
        }
    }

    public void addProducts(int quantity) {
    // o this referencia o atributo da classe e não o parâmetro
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        if(quantity >= this.quantity) {
            this.quantity = 0;
        }else{
            this.quantity -= quantity;
        }
    }
    
    // chama o nome do produto apenas chamando a variavel product
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + " x " + quantity + " units, Total: $ " + String.format("%.2f" ,totalValueInStock());
    }
    
}