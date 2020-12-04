import flyweightpattern.*;

public class FlyweightTest {

    public static void main(String[] args) {
        DivingdressFactory factory = DivingdressFactory.getInstance();
        Divingdress a1 = factory.getDivingdress("man_M");
        Divingdress a2 = factory.getDivingdress("man_L");
        Divingdress a3 = factory.getDivingdress("man_4Xl");
        Divingdress a4 = factory.getDivingdress("man_M");
        Divingdress a5 = factory.getDivingdress("man_L");
        Divingdress a6 = factory.getDivingdress("woman_L");
        Divingdress a7 = factory.getDivingdress("woman_L");
        a1.display();
        a2.display();
        a3.display();
        a4.display();
        a5.display();
        a6.display();
        a7.display();
    }
}
