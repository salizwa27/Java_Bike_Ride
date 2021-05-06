package bicycles;

public class MountainBike implements Bicycle{

    public int speed;

    public int accelerate() {
        return speed += 5;
    }

    public int brake() {
        return speed -= 3;
    }

    public int currentSpeed() {
        return speed;
    }

    public int stop() {
        return speed = 0;
    }

}
