import dataaccessobjectpattern.Passenger;
import dataaccessobjectpattern.PassengerInterface;
import dataaccessobjectpattern.PassengerInterfaceImplement;
import tools.PrintTool;

public class DataAccessObjectTest {
    public static void main(String[] args) {
        PrintTool.print("Data Access Object Pattern" + "\n" +
                "Scenario Introduction:This is used to manage the passengers visiting the carnival." + "\n" +
                "Every passenger will be registered when getting into the carnival." + "\n" +
                "And a passenger list contains all the passengers' information." + "\n" +
                "Staff can only do operations on passenger through the interface instead of interfere passenger directly." + "\n");

        PassengerInterface passengerQuery = new PassengerInterfaceImplement();

//        Check out all the passengers.
        for (Passenger passenger : passengerQuery.getAllPassengers()) {
            PrintTool.print("The passenger's No is " + passenger.getPassengerNo() + '\n' +
                    "The passenger's name is " + passenger.getName());
        }

//        update the changed info of one specified passenger.
        Passenger passengerSpecified = passengerQuery.getAllPassengers().get(1);
        passengerSpecified.setName("wwz");
        passengerQuery.updatePassenger(passengerSpecified);

//        add an passenger into the database
        Passenger passengerAdd = new Passenger("lym", 1654321);
        passengerQuery.addPassenger(passengerAdd);

//        get a specified passenger's info
        Passenger passengerGet = passengerQuery.getPassenger(1853562);
        PrintTool.print("The passenger's info is : Passenger No " + passengerGet.getPassengerNo() + ",name " + passengerGet.getName());

    }
}
