package task_2;

public class Audi extends Car {

    @Override
    public void accelerate (int speed) {
        super.accelerate(speed * 2);
    }

    Audi(String name, int Maxspeed) {
        super(name, Maxspeed);
    }
}

