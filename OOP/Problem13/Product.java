package OOP.Problem13;

class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int amount) {
        quantity += amount;
    }

    public void reduceStock(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("Not enough stock to remove.");
        }
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Quantity: " + quantity;
    }
}
