package bicycles;

public class RoadBike implements Bicycle{

    public int speed;

    public int accelerate() {
        return speed += 11;
    }

    public int brake() {
        return speed -= 4;
    }

    public int currentSpeed() {
        return speed;
    }

    public int stop() {
        return speed = 0;
    }
}
