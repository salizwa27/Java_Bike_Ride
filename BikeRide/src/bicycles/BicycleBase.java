package bicycles;

//import bicycles.Bicycle;

public abstract class BicycleBase implements Bicycle{

    private int speed;

    protected int changeSpeed(int changeRate){
        return speed += changeRate;

    }

    public int currentSpeed() {
        return speed;
    }

    public int stop() {
        return speed = 0;
    }


}
