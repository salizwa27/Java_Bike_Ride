package specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.BikeRide;
import bicycles.rides.*;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTests {

    @Test
    public void shouldBeAbleToUseBikeRideOneWithRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide rBikeOne = new BikeRideOne(roadBike);
        rBikeOne.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),52);
    }

    @Test
    public void shouldBeAbleToUseBikeRideTwoWithRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide rBikeTwo = new BikeRideTwo(roadBike);
        rBikeTwo.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),85);
    }

    @Test
    public void shouldBeAbleToUseBikeRideThreeWithRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide rBikeThree = new BikeRideThree(roadBike);
        rBikeThree.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),98);
    }

    @Test
    public void shouldBeAbleToUseBikeRideOneWithMountainBike() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide rBikeOne = new BikeRideOne(mountainBike);
        rBikeOne.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),26);
    }

    @Test
    public void shouldBeAbleToUseBikeRideTwoWithMountainBike() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide rBikeTwo = new BikeRideTwo(mountainBike);
        rBikeTwo.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),41);
    }

    @Test
    public void shouldBeAbleToUseBikeRideThreeWithMountainBike() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide rBikeThree = new BikeRideThree(mountainBike);
        rBikeThree.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),54);
    }

    @Test
    public void shouldBeAbleToUseBikeRideOneWithTandem() {
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);
        BikeRide rBikeOne = new BikeRideOne(tandem);
        rBikeOne.ride(tandem);
        assertEquals(tandem.currentSpeed(),62);
    }

    @Test
    public void shouldBeAbleToUseBikeRideTwoWithTandem() {
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);
        BikeRide rBikeTwo = new BikeRideTwo(tandem);
        rBikeTwo.ride(tandem);
        assertEquals(tandem.currentSpeed(),98);
    }

    @Test
    public void shouldBeAbleToUseBikeRideThreeWithTandem() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(mountainBikeSpec);
        BikeRide rBikeThree = new BikeRideThree(tandem);
        rBikeThree.ride(tandem);
        assertEquals(tandem.currentSpeed(),128);
    }

}

