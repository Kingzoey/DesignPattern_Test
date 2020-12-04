import decoratortry.*;

public class DecoratorTest {
    public static void main(String[] args) {
        String info = "This is a great activity in which you could play with numerous balloons.Enjoy yourselves!";
        AbstractRecreationalActivity a1 = new BalloonCarnival(20, 100, info);
        AbstractRecreationalActivity a2 = new Cloud(a1);
        AbstractRecreationalActivity a3 = new Forest(a2);
        AbstractRecreationalActivity a4 = new Forest(a3);
        a1.show();
        a2.show();
        a3.show();
        a4.show();
    }
}
