package Ecommerce;

public class Order {
    Product product;
    int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void placeOrder() {
        System.out.println("Order Placed Successfully!");
    }

    public double calculateTotal() {
        return product.getPrice() * quantity;
    }
}
