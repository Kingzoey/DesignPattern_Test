import multitonpattern.*;

public class MultitonTest {

    public static void main(String[] args) {
        Parkingspot a = Parkingspot.getInstance(0);
        a.display();
        Parkingspot b = Parkingspot.getInstance(1);
        b.display();
        Parkingspot c = Parkingspot.getInstance(2);
        c.display();
    }
}
