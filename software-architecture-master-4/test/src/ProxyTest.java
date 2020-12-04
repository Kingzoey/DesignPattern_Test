import proxytry.*;
import tools.PrintTool;

public class ProxyTest {

    public static void proxy() {
        PrintTool.print("Proxy Pattern" + "\n" +
                "Scenario Introduction:This is used for the tourists who intend to buy tickets in this carnival." + "\n" +
                "Customers can buy specific kinds of entertainment tickets at ticketOfficeProxy." + "\n" +
                "Only if the customer wants to buy the full tickets will create a main ticketOffice case." + "\n" +
                "The full tickets can only bu purchased at the main ticketOffice." + "\n");

        AbstractTicketOffice t1 = new TicketOfficeProxy(21, 3, true);
        AbstractTicketOffice t2 = new TicketOfficeProxy(30, 4, false);
        AbstractTicketOffice t3 = new TicketOfficeProxy(30, 1, true);
        t1.print();
        t2.print();
        t3.print();
    }

    public static void main(String[] args) {
        proxy();
    }
}
