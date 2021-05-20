package bicycles.specification;

import bicycles.BicycleBase;
import bicycles.BicycleType;

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
        changeSpeed(bicycleSpec.getBrakeSpeed());
    }

    @Override
    public BicycleType getBicycleType() {
        return this.bicycleSpec.getBicycleType();
    }
}
