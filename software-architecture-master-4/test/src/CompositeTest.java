import compositepattern.*;

public class CompositeTest {
    public static void main(String[] args) {
        Souvenir a0 = new Variety("souvenir");
        Souvenir a1 = new Variety("dolls");
        Souvenir a2 = new Variety("animals");
        Souvenir b1 = new Name("shark_doll");
        Souvenir b2 = new Name("whale_doll");
        Souvenir b3 = new Name("goldfish_doll");
        Souvenir b4 = new Name("shell");
        Souvenir b5 = new Name("starfish");
        Souvenir b6 = new Name("goldfish");
        Souvenir b7 = new Name("artwares");
        a0.addSouvenir(a1);
        a0.addSouvenir(a2);
        a0.addSouvenir(b7);
        a1.addSouvenir(b1);
        a1.addSouvenir(b2);
        a1.addSouvenir(b3);
        a2.addSouvenir(b4);
        a2.addSouvenir(b5);
        a2.addSouvenir(b6);
        a0.display(" ");
    }
}
