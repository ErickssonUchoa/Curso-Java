package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) { //construtor
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void setName(String name) { // por convenção encapsulamento abaixo de construtores
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double totalValueStock() {
        return quantity * price;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", & "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f",totalValueStock());
    }


}
