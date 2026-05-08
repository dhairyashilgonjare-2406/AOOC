package Ecommerce;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }

    public double getPrice() {
        return price;
    }
}
