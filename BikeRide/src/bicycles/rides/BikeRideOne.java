package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideOne implements BikeRide {

    public Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle){
        this.bicycle = bicycle;
    }


//    public static void main(String[] args) {
//
//        Bicycle bicycle = new Bicycle();
//        BikeRide bikeRide = new BikeRide(bicycle);
//        bikeRide.ride();
//
//      System.out.println(bicycle.currentSpeed());
//    }


    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }


}
