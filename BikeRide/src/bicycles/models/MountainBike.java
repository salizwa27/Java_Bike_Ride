package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {

//    private int speed;
//
    public void accelerate() {
        changeSpeed(+5);
    }

    public void brake() {
        changeSpeed(-3);
    }

//    public int currentSpeed() {
//        return speed;
//    }
//
//    public int stop() {
//        return speed = 0;
//    }


//    public int currentSpeed() {
//        return speed;
//    }

//    public int stop() {
//        return speed = 0;
//    }
}
