import iteratorpattern.*;

import tools.PrintTool;

public class IteratorTest {
   
    public static void main(String[] args) {
        PrintTool.print("Scenario:Here is a tour bus heading to Underwater World Carnival" +
                "with some tourists and a tour guide on it." +
                "Before they take off,tourists get in the bus one by one," +
                "and the tour guide calls the roll.");
        TourBus bus=new TourBus();
        iIterator it=bus.iterator();

        //adding passengers
        bus.addPassenger(new Tourist("bob"));
        bus.addPassenger(new Tourist("tom"));
        bus.addPassenger(new Tourist("dick"));
        bus.addPassenger(new Tourist("alice"));
        bus.addPassenger(new Tourist("lucy"));

        //iterate
        PrintTool.print("Scenario: the tour guide starts calling the roll");
        while (it.hasNext()){
            Tourist tourist =(Tourist) it.next();
            PrintTool.print("I see "+tourist.getName()+" is on the bus");
        }
        PrintTool.print("all tourists is in the bus ,let's start the trip!");
    }
  
}
