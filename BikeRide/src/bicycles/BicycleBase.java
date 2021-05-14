package bicycles;

//import bicycles.Bicycle;

public abstract class BicycleBase implements Bicycle{

    private int speed;

    protected void changeSpeed(int changeRate){
        speed += changeRate;

    }

    @Override
    public int currentSpeed() {
        return speed;
    }
    @Override
    public void stop() {
        speed = 0;
    }


}
