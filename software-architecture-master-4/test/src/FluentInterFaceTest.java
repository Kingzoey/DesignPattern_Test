import fluentinterfacepattern.*;
import tools.PrintTool;

public class FluentInterFaceTest {
    public static void main(String[] args) {
        PrintTool.print("SpongeBob starts making a krabby patty layer by layer fluently");
        KrabbyPattyMaker krabbyPattyMaker = new KrabbyPattyMaker(10);
        krabbyPattyMaker
                .addBun("*")
                .addVegetable("&")
                .addSauce("=")
                .addPatty("#")
                .addCheese("-")
                .addPatty("#")
                .addSauce("+")
                .addVegetable("^")
                .addBun("*")
                .showKrabbyPayyt();
        PrintTool.print("it's really a huge krabby patty");
    }
}
