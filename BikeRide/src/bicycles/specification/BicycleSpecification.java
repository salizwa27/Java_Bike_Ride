package bicycles.specification;

import bicycles.BicycleType;

public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;
    BicycleType bicycleType;
    // add a variable for brakeSpeed

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = - brakeSpeed;
        this.bicycleType = bicycleType;
        // initialize brakeSpeed private variable
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public BicycleType getBicycleType() {
        return bicycleType;
    }
    // add getters for brakeSpeed
}
