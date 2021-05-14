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
}
