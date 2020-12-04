
import tools.PrintTool;
import strategypattern.*;

public class StrategyTest {
    static int MONDAY = 1;
    static int TUESDAY = 2;
    static int WEDNESDAY = 3;
    static int THURSDAY = 4;
    static int FRIDAY = 5;
    static int SATURDAY = 6;
    static int SUNDAY = 7;

    public static void strategy() {
        PrintTool.print("Strategy Pattern" + "\n" +
                "Scenario Introduction:This is used for the customers when they are trying to order food in the carnival's restaurant." + "\n" +
                "This restaurant is more like a canteen." + "\n" +
                "Everyday's menu is different and changes according to the date." + "\n" +
                "Every day's menu strategy is different." + "\n");

        int times = 3;
        for (int i = 0; i < times; i++) {
            int date = (new StrategyTest()).getDate();

            Strategy choice;

            if (date == MONDAY) {
                choice = new MondayStrategy();
            } else if (date == TUESDAY) {
                choice = new TuesdayStrategy();
            } else if (date == WEDNESDAY) {
                choice = new WednesdayStrategy();
            } else if (date == THURSDAY) {
                choice = new ThursdayStrategy();
            } else if (date == FRIDAY) {
                choice = new FridayStrategy();
            } else if (date == SATURDAY) {
                choice = new SaturdayStrategy();
            } else if (date == SUNDAY) {
                choice = new SundayStrategy();
            } else {
                PrintTool.print("The date is not correct.");
                return;
            }

            choice.setMenuINfo();
            choice.printMenuINfo();
        }
    }

    public int getDate() {
        double d = Math.random();
        return (int) (d * 6) + 1;
    }

    public static void main(String[] args) {
        strategy();
    }
}
