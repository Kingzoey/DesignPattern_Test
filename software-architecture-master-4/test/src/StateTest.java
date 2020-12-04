
import statepattern.StatePattern;
import statepattern.ui.Square;
import statepattern.ui.UI;
import tools.PrintTool;

import java.util.Scanner;


public class StateTest {

    public static void work() {
        StateTest demo = new StateTest();
        demo.add_scene();
        PrintTool.print("Please enter 0 to exit");
        Scanner scan = new Scanner(System.in);
        while(true){
            String str=scan.next();
            //input.add(str);
            if(str.equals("0")) {
                PrintTool.print("close");
                break;
            }
        }

    }

    public void add_scene() {
        Square square = new Square();
        UI ui = new UI(square);
        ui.init();
    }

    public static void main(String[] args) {
        StateTest t = new StateTest();
        t.work();
    }
}
