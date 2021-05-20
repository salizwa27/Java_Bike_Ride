package bicycles;

import bicycles.BicycleType;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    public int maxNumberOfBikes;

    private final  List<BicycleFromSpec> list = new ArrayList<>();

    public FunRide(int maxNumberOfBikes){
        this.maxNumberOfBikes = maxNumberOfBikes;
    }

 public void accept(BicycleFromSpec bicycle){

        if(list.size() < maxNumberOfBikes && !list.contains(bicycle)){
            list.add(bicycle);
//            System.out.println("Bike added");
        };
 }

 public int getCountForType(BicycleType bicycleType){
        int counter = 0;
     for (BicycleFromSpec bikeType:
          list) {
         if(bikeType.getBicycleType().equals(bicycleType)){
             counter++;
         }

     }

     return counter;

 }

 public int getEnteredCount(){
        return list.size();

 }

//    public static void main(String[] args) {
//        FunRide funRide = new FunRide(3);
//        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -5, BicycleType.RoadBike);
//        BicycleFromSpec roadBike = new BicycleFromSpec(bicycleSpecification);
//        funRide.accept(roadBike);
//
//        System.out.println(funRide.getEnteredCount());
//        System.out.println(funRide.getCountForType(BicycleType.RoadBike));
//    }
}


