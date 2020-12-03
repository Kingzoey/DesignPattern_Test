import modulepattern.GetTicket;
import modulepattern.OnlineTicket;
import modulepattern.PaperTicket;
import tools.PrintTool;

public class ModuleTest {
    public static void Main() {
        PrintTool.print("The visitor buy ticket online:");
        GetTicket visitor = new OnlineTicket();
        visitor.enterPark();
        PrintTool.print("The visitor buy ticket in cash:");
        visitor = new PaperTicket();
        visitor.enterPark();
    }
}
