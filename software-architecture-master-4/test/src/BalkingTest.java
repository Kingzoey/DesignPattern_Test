import balkingpattern.changeThread;
import balkingpattern.Data;
import balkingpattern.saveThread;
import tools.PrintTool;

import java.util.Scanner;

public class BalkingTest {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        PrintTool.print("Please enter a filename");
        String filename=scan.next();
        Data data = new Data(filename, false, " ");

        PrintTool.print("Please enter a command(0 exit，1 start)");
        while(true){
            String str=scan.next();
            //input.add(str);
            if(str.equals("0")) {
                PrintTool.print("close");
                break;
            }
            else if(str.equals("1")){
                PrintTool.print("Please enter operating times:");
                String timesString =scan.next();
                int times=0;
                try {
                    times=Integer.parseInt(timesString );
                } catch (NumberFormatException e) {
                    PrintTool.print("求求你输数字吧");
                    continue;
                }
                if (times==0) {
                    PrintTool.print("请重新输入，times不能为0");
                    continue;
                }
                new changeThread("CHANGE", data,times).start();
                new saveThread("SAVE", data).start();
            }
            else {
                PrintTool.print("Input Error:");
            }
        }

    }
}
