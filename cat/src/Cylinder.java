public class Cylinder {

        double r;
        double h;


        static int noOfCylinder = 0;

    public static void incrementCount() {
        noOfCylinder++;
    }

        public Cylinder(double r, double h) {
            this.r = r;
            this.h = h;
            incrementCount();
            System.out.println("Cylinder created: r=" + r + ", h=" + h);
        }

        public Cylinder() {
            this(3.0, 4.0);

        }

        public static int getNoOfCylinder() {
            return noOfCylinder;
        }

        public double calculateBaseArea() {
                       return Math.PI * r * r;
        }

        public double calculateSurfaceArea() {
            return 2 * Math.PI * r * (r + h);
        }

        public double calculateVolume() {
            return calculateBaseArea() * h;
        }

        public double calculateMass(double density) {
            return calculateVolume() * density;
        }
    }

