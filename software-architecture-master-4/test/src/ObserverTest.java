

import observerattern.*;
import tools.PrintTool;


public class ObserverTest {

    public static void main(String[] args) {


        CrabsKing crabsKing=new CrabsKing();
        PrintTool.print("SpongeBob,Squidward and MrCrab are watching how many customers are in the Crabs King!");

        SpongeBob spongeBob=new SpongeBob(crabsKing);
        Squidward squidward =new Squidward(crabsKing);
        MrCrab mrCrab=new MrCrab(crabsKing);
        PrintTool.print("two customers come in");
        crabsKing.setCustomer(2);
        PrintTool.print("three more customers come in");
        crabsKing.setCustomer(5);
    }
}
