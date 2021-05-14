package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

public class RoadBike extends BicycleBase {

//    private int speed;

//    public int accelerate() {
//        return speed += 11;
//    }
//
//    public int brake() {
//        return speed -= 4;
//    }
//
//    public int currentSpeed() {
//        return speed;
//    }
//
//    public int stop() {
//        return speed = 0;
//    }

    public void accelerate() {
        changeSpeed(+11);
    }

    public void brake() {
        changeSpeed(-4);
    }
//    public int stop() {
//        return speed = 0;
//    }
}
