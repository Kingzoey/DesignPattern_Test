import bridgepattern.*;


public class BridgeTest {

    public static void main(String[] args) {
        Drink drink1 = new Grapejuice();
        Size size1 = new Middle();
        Drink drink2 = new Coke();
        Size size2 = new Big();
        Drink drink3 = new Orangejuice();
        Size size3 = new Small();
        size1.setDrink(drink1);
        size1.ordering();
        size1.setDrink(drink2);
        size1.ordering();
        size2.setDrink(drink3);
        size2.ordering();
        size3.setDrink(drink2);
        size3.ordering();
    }
}
