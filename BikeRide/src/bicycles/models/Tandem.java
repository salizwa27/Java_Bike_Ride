package bicycles.models;

import bicycles.BicycleBase;

public class Tandem extends BicycleBase {

    public int accelerate(){
        return changeSpeed(+12);
    }

    public int brake(){
        return changeSpeed(-7);
    }

}
