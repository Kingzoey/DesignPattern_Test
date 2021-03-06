import converterpattern.*;
import tools.PrintTool;

public class ConverterTest {
    public static void main(String[] args) {
        PrintTool.print("Captain Eugene adds some dishes into the file on his PC first");
        LocalMenuFile local = new LocalMenuFile();
        local.addDish(new LocalDishInfo("krappy patty", 20.0f, "very delicious!"))
                .addDish(new LocalDishInfo("cocacola", 10.0f, "feels really cool!"))
                .addDish(new LocalDishInfo("chips", 15.0f, "so crisp!"));
        local.showDishes();
        PrintTool.print("and he upload the menu file to the electronic menu board, " +
                "of course the information has been converted");
        ElectronicMenuBoard elect=Converter.localInfoToBoardInfo(local);
        elect.showDishes();
        PrintTool.print("Oops,Plankton hacks the board and adds a dish tasting bad");
        elect.addDish(new OnBoardDishInfo("CHUM BUCKET PASTE","$5.0","I'M PLANKTON"));
        elect.showDishes();
        PrintTool.print("Captain Eugene download the file on board and wanna modify it");
        LocalMenuFile newLocal=Converter.boardInfoToLocalInfo(elect);
        newLocal.showDishes();
    }
}
