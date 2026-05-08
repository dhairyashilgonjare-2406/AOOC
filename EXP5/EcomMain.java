import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class EcomMain {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);
        Customer c1 = new Customer("Rahul", 201);
        Order o1 = new Order(p1, 2);

        c1.displayCustomer();
        p1.displayProduct();
        o1.placeOrder();

        System.out.println("Total Cost: " + o1.calculateTotal());
    }
}
