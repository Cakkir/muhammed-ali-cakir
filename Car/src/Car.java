public class Car {
    String brand;
    int Year;
    String model;
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year: " + Year);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "BMW";
        myCar.model = "M4 GTS";
        myCar.Year = 2022;

        myCar.displayInfo();
    }
}