package bicycles;

public interface Bicycle {

//    int speed;

    public void accelerate();

    public void brake();

    public int currentSpeed();

    public void stop();

    BicycleType getBicycleType();

}


