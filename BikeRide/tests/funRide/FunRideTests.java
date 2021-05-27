package funRide;

import bicycles.BicycleType;
import bicycles.FunRide;
import bicycles.models.*;

import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTests {

    @Test
    public void shouldBeAbleToAcceptARoadBike() {
        FunRide funRide = new FunRide(1);
        BicycleSpecification roadBike = new BicycleSpecification(11, 4, BicycleType.RoadBike);

        BicycleFromSpec roadBike1 = new BicycleFromSpec(roadBike);

        funRide.accept(roadBike1);

        assertEquals(1, funRide.getEnteredCount());
    }

    @Test
    public void shouldBeAbleToAcceptMoreThanOneRoadBike() {
        FunRide funRide = new FunRide(4);
        BicycleSpecification roadBike = new BicycleSpecification(11, 4, BicycleType.RoadBike);

        BicycleFromSpec roadBike1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBike2 = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBike3 = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBike4 = new BicycleFromSpec(roadBike);


        funRide.accept(roadBike1);
        funRide.accept(roadBike2);
        funRide.accept(roadBike3);
        funRide.accept(roadBike4);

        assertEquals(4, funRide.getEnteredCount());
    }

    @Test
    public void shouldBeAbleToAcceptAMountainBike() {
        FunRide funRide = new FunRide(1);
        BicycleSpecification mountainBike = new BicycleSpecification(5, 3, BicycleType.MountainBike);

        BicycleFromSpec mountainBike1 = new BicycleFromSpec(mountainBike);

        funRide.accept(mountainBike1);

        assertEquals(1, funRide.getEnteredCount());
    }

    @Test
    public void shouldBeAbleToAcceptMoreThanOneMountainBike() {
        FunRide funRide = new FunRide(2);
        BicycleSpecification mountainBike = new BicycleSpecification(5, 3, BicycleType.MountainBike);

        BicycleFromSpec mountainBike1 = new BicycleFromSpec(mountainBike);
        BicycleFromSpec mountainBike2 = new BicycleFromSpec(mountainBike);

        funRide.accept(mountainBike1);
        funRide.accept(mountainBike2);

        assertEquals(2, funRide.getEnteredCount());
    }

    @Test
    public void shouldBeAbleToAcceptTandem() {
        FunRide funRide = new FunRide(1);
        BicycleSpecification tandem = new BicycleSpecification(12, 7, BicycleType.Tandem);

        BicycleFromSpec tandem1 = new BicycleFromSpec(tandem);

        funRide.accept(tandem1);

        assertEquals(1, funRide.getEnteredCount());
    }

    @Test
    public void shouldBeAbleToAcceptMoreThanOneTandem() {
        FunRide funRide = new FunRide(6);
        BicycleSpecification tandem = new BicycleSpecification(12, 7, BicycleType.Tandem);

        BicycleFromSpec tandem1 = new BicycleFromSpec(tandem);
        BicycleFromSpec tandem2 = new BicycleFromSpec(tandem);
        BicycleFromSpec tandem3 = new BicycleFromSpec(tandem);
        BicycleFromSpec tandem4 = new BicycleFromSpec(tandem);
        BicycleFromSpec tandem5 = new BicycleFromSpec(tandem);
        BicycleFromSpec tandem6 = new BicycleFromSpec(tandem);

        funRide.accept(tandem1);
        funRide.accept(tandem2);
        funRide.accept(tandem3);
        funRide.accept(tandem4);
        funRide.accept(tandem5);
        funRide.accept(tandem6);


        assertEquals(6, funRide.getEnteredCount());
    }

    @Test
    public void shouldBeAbleToAcceptAllThreeTypesOfBikes() {
        FunRide funRide = new FunRide(3);
        BicycleSpecification roadBike = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        BicycleSpecification tandem = new BicycleSpecification(12, 7, BicycleType.Tandem);


        BicycleFromSpec roadBike1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec mountainBike1 = new BicycleFromSpec(mountainBike);
        BicycleFromSpec tandem1 = new BicycleFromSpec(tandem);


        funRide.accept(roadBike1);
        funRide.accept(mountainBike1);
        funRide.accept(tandem1);


        assertEquals(3, funRide.getEnteredCount());
    }

    @Test
    public void shouldBeAbleToGetCountForMoreThanOneType() {
        FunRide funRide = new FunRide(6);
        BicycleSpecification tandem = new BicycleSpecification(12, 7, BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(11, 4, BicycleType.RoadBike);

        BicycleFromSpec tandem1 = new BicycleFromSpec(tandem);
        BicycleFromSpec tandem2 = new BicycleFromSpec(tandem);
        BicycleFromSpec tandem3 = new BicycleFromSpec(tandem);

        BicycleFromSpec roadBike1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBike2 = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBike3 = new BicycleFromSpec(roadBike);

        funRide.getCountForType(BicycleType.RoadBike);
        funRide.getCountForType(BicycleType.Tandem);

        funRide.accept(tandem1);
        funRide.accept(tandem2);
        funRide.accept(tandem3);

        funRide.accept(roadBike1);
        funRide.accept(roadBike2);
        funRide.accept(roadBike3);

        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 3);
        assertEquals( funRide.getCountForType(BicycleType.Tandem),3);

    }

    @Test
    public void shouldBeAbleToGetCountForType() {
        FunRide funRide = new FunRide(6);
        BicycleSpecification mountainBike = new BicycleSpecification(5, 3, BicycleType.MountainBike);

        BicycleFromSpec mountainBike1 = new BicycleFromSpec(mountainBike);

        funRide.getCountForType(BicycleType.MountainBike);

        funRide.accept(mountainBike1);

        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 1);
    }

    @Test
    public void shouldBeAbleToGetCountForAllThreeTypes() {
        FunRide funRide = new FunRide(6);
        BicycleSpecification tandem = new BicycleSpecification(12, 7, BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(5, 3, BicycleType.MountainBike);

        BicycleFromSpec tandem1 = new BicycleFromSpec(tandem);

        BicycleFromSpec mountainBike1 = new BicycleFromSpec(mountainBike);
        BicycleFromSpec mountainBike2 = new BicycleFromSpec(mountainBike);

        BicycleFromSpec roadBike1 = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBike2 = new BicycleFromSpec(roadBike);
        BicycleFromSpec roadBike3 = new BicycleFromSpec(roadBike);

        funRide.getCountForType(BicycleType.RoadBike);
        funRide.getCountForType(BicycleType.Tandem);
        funRide.getCountForType(BicycleType.MountainBike);

        funRide.accept(tandem1);

        funRide.accept(mountainBike1);
        funRide.accept(mountainBike2);

        funRide.accept(roadBike1);
        funRide.accept(roadBike2);
        funRide.accept(roadBike3);

        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 3);
        assertEquals( funRide.getCountForType(BicycleType.MountainBike),2);
        assertEquals( funRide.getCountForType(BicycleType.Tandem),1);


    }


}
