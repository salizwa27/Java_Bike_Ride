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
}


