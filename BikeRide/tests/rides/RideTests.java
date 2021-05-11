package rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RideTests {

    @Test
    public void shouldBeAbleToUseBikeRideOneWithRoadBike() {
        RoadBike RoadBike = new RoadBike();
        BikeRideOne BikeRideOne = new BikeRideOne(RoadBike);
        BikeRideOne.ride(RoadBike);
        assertEquals(36, BikeRideOne.currentSpeed());
    }

    @Test
    public void shouldBeAbleToUseBikeRideOneWithMountainBike(){
        MountainBike MountainBike = new MountainBike();
        BikeRideOne BikeRideOne = new BikeRideOne(MountainBike);
        BikeRideOne.ride(MountainBike);
        assertEquals(14, BikeRideOne.currentSpeed());
    }

    @Test
    public void ShouldBeAbleToUseBikeRideOneWithTandem(){
        Tandem Tandem = new Tandem();
        BikeRideOne BikeRideOne = new BikeRideOne(Tandem);
        BikeRideOne.ride(Tandem);
        assertEquals(34, BikeRideOne.currentSpeed());
    }

    @Test
    public void shouldBeAbleToUseBikeRideTwoWithRoadBike(){
        RoadBike RoadBike = new RoadBike();
        BikeRideTwo BikeRideTwo = new BikeRideTwo(RoadBike);
        BikeRideTwo.ride(RoadBike);
        assertEquals(69,BikeRideTwo.currentSpeed());
    }

    @Test
    public void shouldBeAbleToUseBikeRideTwoWithMountainBike(){
        MountainBike MountainBike = new MountainBike();
        BikeRideTwo BikeRideTwo = new BikeRideTwo(MountainBike);
        BikeRideTwo.ride(MountainBike);
        assertEquals(29,BikeRideTwo.currentSpeed());
    }

    @Test
    public void shouldBeAbleToUseBikeRideTwoWithTandem(){
        Tandem Tandem = new Tandem();
        BikeRideTwo BikeRideTwo = new BikeRideTwo(Tandem);
        BikeRideTwo.ride(Tandem);
        assertEquals(70,BikeRideTwo.currentSpeed());
    }

    @Test
    public void shouldBeAbleToUseBikeRideThreeWithRoadBike(){
       RoadBike RoadBike = new RoadBike();
        BikeRideThree BikeRideThree = new BikeRideThree(RoadBike);
        BikeRideThree.ride(RoadBike);
        assertEquals(28,BikeRideThree.currentSpeed());
    }

    @Test
    public void shouldBeAbleToUseBikeRideThreeWithMountainBike(){
        MountainBike MountainBike = new MountainBike();
        BikeRideThree BikeRideThree = new BikeRideThree(MountainBike);
        BikeRideThree.ride(MountainBike);
        assertEquals(6,BikeRideThree.currentSpeed());
    }

    @Test
    public void shouldBeAbleToUseBikeRideThreeWithTandem(){
        Tandem Tandem = new Tandem();
        BikeRideThree BikeRideThree = new BikeRideThree(Tandem);
        BikeRideThree.ride(Tandem);
        assertEquals(16,BikeRideThree.currentSpeed());
    }
}
