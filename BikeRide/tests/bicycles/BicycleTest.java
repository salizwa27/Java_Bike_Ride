package bicycles;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldAccelerate() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(15, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectlyUsingMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(1, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToStopUsingMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToTakeBikeRideUsingMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        assertEquals(7, bicycle.currentSpeed());

    }

    @Test
    public void shouldAccelerateRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrakeCorrectUsingRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectlyUsingRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(33, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectlyRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(10, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToStopRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToTakeBikeRide() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        assertEquals(18, bicycle.currentSpeed());

    }



}
