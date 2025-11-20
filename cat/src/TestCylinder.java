public class TestCylinder {
    public static void main (String [] args){
    Cylinder c1 = new Cylinder(10,20);

        System.out.println("Total number of Cylinder objects created: ");

        System.out.println("--- Calculations for Cylinder 2 (r=2.5, h=10.0) ---");


    double baseArea = c1.calculateBaseArea();
    double volume = c1.calculateVolume();
    double surfaceArea = c1.calculateSurfaceArea();
    double density = 5.0;
    double mass = c1.calculateMass(density);

        System.out.printf("Base Area: %.2f\n", baseArea);
        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("Surface Area: %.2f\n", surfaceArea);
        System.out.printf("Mass (Density=%.1f): %.2f\n", density, mass);
}
}
