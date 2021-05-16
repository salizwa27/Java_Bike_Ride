package specification;

import bicycles.Bicycle;
import bicycles.BikeRide;
import bicycles.rides.*;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTests {

    @Test
    public void shouldBeAbleToUseBikeRideOneWithRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide rBikeOne = new BikeRideOne(roadBike);
        rBikeOne.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),66);
    }

    @Test
    public void shouldBeAbleToUseBikeRideTwoWithRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide rBikeTwo = new BikeRideTwo(roadBike);
        rBikeTwo.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),99);
    }

    @Test
    public void shouldBeAbleToUseBikeRideThreeWithRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide rBikeThree = new BikeRideThree(roadBike);
        rBikeThree.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),154);
    }

    @Test
    public void shouldBeAbleToUseBikeRideOneWithMountainBike() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide rBikeOne = new BikeRideOne(mountainBike);
        rBikeOne.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),30);
    }

    @Test
    public void shouldBeAbleToUseBikeRideTwoWithMountainBike() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide rBikeTwo = new BikeRideTwo(mountainBike);
        rBikeTwo.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),45);
    }

    @Test
    public void shouldBeAbleToUseBikeRideThreeWithMountainBike() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide rBikeThree = new BikeRideThree(mountainBike);
        rBikeThree.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),70);
    }

    @Test
    public void shouldBeAbleToUseBikeRideOneWithTandem() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(12, 7);
        Bicycle tandem = new BicycleFromSpec(mountainBikeSpec);
        BikeRide rBikeOne = new BikeRideOne(tandem);
        rBikeOne.ride(tandem);
        assertEquals(tandem.currentSpeed(),72);
    }

    @Test
    public void shouldBeAbleToUseBikeRideTwoWithTandem() {
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);
        BikeRide rBikeTwo = new BikeRideTwo(tandem);
        rBikeTwo.ride(tandem);
        assertEquals(tandem.currentSpeed(),108);
    }

    @Test
    public void shouldBeAbleToUseBikeRideThreeWithTandem() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(12, 7);
        Bicycle tandem = new BicycleFromSpec(mountainBikeSpec);
        BikeRide rBikeThree = new BikeRideThree(tandem);
        rBikeThree.ride(tandem);
        assertEquals(tandem.currentSpeed(),168);
    }

}

