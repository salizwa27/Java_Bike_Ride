package bicycles;

public class BikeRide {

    Bicycle bicycle = new Bicycle();

    public BikeRide (Bicycle bicycle){
        this.bicycle = bicycle;
    }


    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

      System.out.println(bicycle.currentSpeed());
    }


    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }



}
