
class Engine {

    int horsePower;

    // Constructor
    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }


    public void showPower() {
        System.out.println("Engine HorsePower: " + horsePower);
    }
}


class Car {

    Engine engine;
    String model;


    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }


    public void displayInfo() {
        System.out.println("Car Model: " + model);
        engine.showPower();
    }
}

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(300);


        Car car = new Car("BMW M3", engine);


        car.displayInfo();
    }
}
