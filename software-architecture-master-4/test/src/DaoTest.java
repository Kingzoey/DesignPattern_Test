import daopattern.Tourist;
import daopattern.TouristDao;
import tools.PrintTool;

import java.util.List;
import java.util.Scanner;

public class DaoTest {
    public static void Main(){
        Scanner input = new Scanner(System.in);
        label:
        while(true) {
            PrintTool.print("1.add 2.delete 3.print 4.quit");
            String command=null;
            command=input.nextLine();
            switch (command) {
                case "add": {
                    String Name = null;
                    int Age = -1;
                    String Occupation = null;
                    while (Age <= 0 || Name == null || Occupation == null) {
                        PrintTool.print("Tourist Name:");
                        Name = input.nextLine();
                        if (Name.isEmpty()) {
                            PrintTool.print("Invalid input");
                            continue;
                        }
                        PrintTool.print("Tourist Age:");
                        String AgeString = input.nextLine();
                        try {
                            Age = Integer.parseInt(AgeString);
                        } catch (NumberFormatException e) {
                            PrintTool.print("Please Input Number");
                            continue;
                        }
                        PrintTool.print("Tourist Occupation:");
                        Occupation = input.nextLine();
                        if (Occupation.isEmpty()) {
                            PrintTool.print("Invalid input");
                            continue;
                        }
                    }
                    Tourist Visitor = new Tourist(Name, Age, Occupation);
                    TouristDao TouristInf = TouristDao.GetInstance();
                    TouristInf.AddObject(Visitor);
                    break;
                }
                case "delete": {
                    PrintTool.print("Tourist Name:");
                    String Name = null;
                    Name = input.nextLine();
                    TouristDao TouristInf = TouristDao.GetInstance();
                    List<Integer> SearchList = TouristInf.SearchByName(Name);
                    if (SearchList.isEmpty()) {
                        PrintTool.print("Tourist not found.");
                        continue;
                    }
                    for (int index : SearchList) {
                        TouristInf.DeleteObject(index);
                    }
                    break;
                }
                case "print": {
                    TouristDao TouristInf = TouristDao.GetInstance();
                    List<Tourist> TotalList = TouristInf.GetAllObject();
                    for (Tourist tourist : TotalList) {
                        PrintTool.print(tourist.GetName() + "\n");
                    }
                    break;
                }
                case "quit":
                    break label;
                default:
                    PrintTool.print("Invalid Command\n");
                    break;
            }
        }
    }
}
