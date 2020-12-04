import callbackpattern.Cook;
import callbackpattern.Oven;
import tools.PrintTool;

public class CallbackTest {
    public static void main(String[] args) {
        PrintTool.print(
                "Scenario：SpongeBob want to make some krabby patties," +
                        "he put them into oven.After some time, " +
                        "the oven reminds SpongeBob that it's done and then SpongeBob does the follow-up operations");
        Oven krabbyPattyRoaster=new Oven();
        Cook spongeBob=new Cook(krabbyPattyRoaster);
        spongeBob.cookKrabbyPatty(3);
    }
}
