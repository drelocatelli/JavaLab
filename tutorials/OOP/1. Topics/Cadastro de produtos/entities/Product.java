package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        // o this referencia o atributo da classe e não o parâmetro
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    
    // chama o nome do produto apenas chamando a variavel product
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + " x " + quantity + " units, Total: $ " + String.format("%.2f" ,totalValueInStock());
    }
    
}