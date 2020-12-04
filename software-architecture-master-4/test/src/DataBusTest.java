import databuspattern.*;

public class DataBusTest {
    public static void main(String[] args) {
        final DataBus dataBus=DataBus.getDataBus();
        Listener tom=new Customer("tom");
        Listener alice=new Customer("alice");
        Listener bob=new Staff("bob");
        dataBus.addCustomer(tom).addCustomer(alice).addCustomer(bob);
        Message childLost=new ChildLostMessage("child named little lin lost ,anyone has seen him?");
        dataBus.broadcast(childLost);
        Message lostAndFound = new LostAndFoundMessage("who lost a wallet? please come to customer center");
        dataBus.broadcast(lostAndFound);
        Message announce = new AnnouncementMessage("all staff come to customer center now");
        dataBus.broadcast(announce);
    }
}
