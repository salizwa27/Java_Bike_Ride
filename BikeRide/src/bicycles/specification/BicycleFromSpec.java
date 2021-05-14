package bicycles.specification;

import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase {

   public BicycleSpecification bicycleSpec;

    public BicycleFromSpec(BicycleSpecification bicycleSpec){

        this.bicycleSpec = bicycleSpec;
    }

    @Override
    public void accelerate() {
        changeSpeed(bicycleSpec.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        changeSpeed(bicycleSpec.getAccelerationSpeed());
    }
}
