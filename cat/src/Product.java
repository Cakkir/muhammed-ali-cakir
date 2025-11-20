public class Product {
    private String name;
    private int quantity;
    private double price;
    private int productId;

    private static int idCounter = 1;

    public Product(String name, int quantity, double price) {
        this.productId = idCounter++;
        this.name = name;
        setQuantity(quantity);
        setPrice(price);
        System.out.println("Product created: ID=" + this.productId + ", Name=" + this.name);
    }

    public Product() {
        this("Unknown", 0, 0.0);
    }

    public double getItemValue() {
        return this.price * this.quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
            System.out.println("Warning: Quantity cannot be negative. Setting quantity to 0 for Product ID " + this.productId);
        } else {
            this.quantity = quantity;
        }
    }

    public void setPrice(double price) {
        if (price < 0.0) {
            this.price = 0.0;
            System.out.println("Warning: Price cannot be negative. Setting price to 0.0 for Product ID " + this.productId);
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Product ID " + this.productId + ": " + this.name +
                " (Quantity: " + this.quantity + ", Price: $" + String.format("%.2f", this.price) + ")";
    }
}