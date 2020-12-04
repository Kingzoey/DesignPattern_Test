import adapterpattern.*;
import tools.PrintTool;

import java.util.Scanner;
import java.util.UUID;

public class AdapterTest {
    public static void main(String[] args) {
        RegularMember regularMember = new RegularMember();
        PrintTool.print("Now we are sign up a regular member for you");
        regularMember.setId(UUID.randomUUID());
        PrintTool.print("Please enter your name:");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.next();
        regularMember.setName(name);
        PrintTool.print("Welcome to undersea world, "
                + regularMember.getName()
                + ". Your id is "
                + regularMember.getId());
        while (true) {
            PrintTool.print("Now you are regular member, do you want to upgrade to senior member?(y/n)");
            Scanner choiceInput = new Scanner(System.in);
            String choice = choiceInput.next();
            if (choice.equals("y")) {
                Adapter adapter = new Adapter(regularMember);
                PrintTool.print("You have upgraded to senior member!");
                PrintTool.print("You can use the fast channel");
                adapter.quickQueue();
                break;
            } else if (choice.equals("n")) {
                PrintTool.print("You can only use the normal channel");
                regularMember.queue();
                break;
            } else {
                PrintTool.print("Wrong command!");
            }
        }
    }
}
