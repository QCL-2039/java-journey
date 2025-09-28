package OOP.Problem13;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // Add a product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to inventory.");
    }

    // Remove a product by name
    public void removeProduct(String name) {
        products.removeIf(p -> p.getName().equalsIgnoreCase(name));
        System.out.println(name + " removed from inventory.");
    }

    // Check for low inventory
    public void checkLowInventory(int threshold) {
        System.out.println("Products below threshold (" + threshold + "):");
        for (Product p : products) {
            if (p.getQuantity() < threshold) {
                System.out.println(p);
            }
        }
    }

    // Show all products
    public void showInventory() {
        System.out.println("Current Inventory:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("Laptop", 5);
        Product p2 = new Product("Mouse", 2);
        Product p3 = new Product("Keyboard", 10);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.showInventory();

        inventory.checkLowInventory(3);

        inventory.removeProduct("Mouse");
        inventory.showInventory();
    }

}
