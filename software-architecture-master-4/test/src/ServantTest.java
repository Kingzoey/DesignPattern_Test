import servantpattern.Cook;
import servantpattern.SalmonSushi;
import servantpattern.TunaSushi;
import tools.PrintTool;

public class ServantTest {
    public static void main(String[] args) {
        PrintTool.print("Servant Pattern" + "\n" +
                "Scenario Introduction:This is used for the customers who intend to buy sushi in a ocean theme restaurant." + "\n" +
                "Customers can submit specified kind of sushi order." + "\n" +
                "The cook will use different orders as a parameter." + "\n" +
                "Then the cook will use different service to complete sushi" + "\n");
        Cook chiefCook = new Cook();
        chiefCook.cooking(new SalmonSushi());
        chiefCook.cooking(new TunaSushi());
    }
}
