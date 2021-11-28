package task_2;


public class Car {
    public static void main(String[] args) {
        Car car = new Audi ("Audi", 250);
        car.accelerate(10);

        Car car1 = new Ferrari("Ferrari", 280);
        car1.accelerate(15);
    }

    String name;
    int maxSpeed;

    Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate (int speed) {
        if (speed <= maxSpeed) {
            System.out.println("Speed increased to " + speed);
        } else {
            System.out.println("Speed is to high!");
        }
    }
}






