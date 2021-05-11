package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {

//    private int speed;
//
    public int accelerate() {
        return changeSpeed(+5);
    }

    public int brake() {

        return changeSpeed(-3);
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
