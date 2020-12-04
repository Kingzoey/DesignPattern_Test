import doublecheckedlockingpattern.Maps;
import tools.PrintTool;

public class DoubleCheckedLockingTest {
    public static void doubleCheckedLocking() {
        Maps m1= Maps.getinstance();
        Maps m2= Maps.getinstance();
        PrintTool.print("map1"+m1+"\n"+"map2"+m2+"\n");
        PrintTool.print("Whether the two maps are the same："+(m1==m2));
    }

    public static void main(String[] args) {
        doubleCheckedLocking();
    }
}
