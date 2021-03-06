
import facadetry.SceneDisplay;
import tools.PrintTool;

import java.io.PrintStream;

//        One important principle:Least Knowledge Principle
//        Each unit should have only limited knowledge about other units:only units"closely"related to the current unit.

public class FacadeTest {

    public static void main(String[] args) {
        PrintTool.print("Facade Pattern" + "\n" +
                "Scenario Introduction:This is used for the display of videos." + "\n" +
                "Basically,this pattern can simplify the interface through which the user of the system want to operate the facilities." + "\n" +
                "In this case,the user can just create a case of sceneDisplay and start the whole process of play the video." + "\n" +
                "All the facilities will start working and stop after the video finished automatically." + "\n");

        SceneDisplay testDisplay = new SceneDisplay("DVD", "speaker");
        testDisplay.start();
        testDisplay.play();
        testDisplay.end();
    }
}

