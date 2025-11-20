public class cat {

        public int x;
        public double direction;
        public String name;


        public cat() {
            this(0, 180.0, "Şakir");
        }


        public cat(int x, double direction, String name) {
            this.x = x;
            this.direction = direction;
            this.name = name;
        }


        public void move() {
            x += 20;
        }


        public void move2(int a) {
            x += a;
        }

        public void turn(double angle) {
            direction += angle;
        }

        public void status() {
            System.out.println("x = " + x + ", direction = " + direction + ", name = " + name);
        }
}
