package task_2;

public class Ferrari extends Car {

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed * 3);
    }

    Ferrari( String name, int maxSpeed){
        super(name, maxSpeed);
    }
}
