public class TestProduct {

    public static void main(String[] args) {

        Product productA = new Product("Laptop", 5, 1200.50);


        System.out.println(productA.toString());


        System.out.println("\n--- Calculations ---");
        double valueA = productA.getItemValue();
        System.out.printf("%s Stock Value: $%.2f\n", productA.getName(), valueA);

        System.out.println("\n--- Setting Values on Product B ---");


        productA.setQuantity(-10);
        productA.setPrice(-50.0);

        System.out.println(productA.toString());
        System.out.println("\nFinal value of idCounter (next ID to be assigned): " + Product.getIdCounter());
    }
}