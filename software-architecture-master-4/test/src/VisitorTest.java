import tools.IfInt;
import tools.PrintTool;
import visitorpattern.element.Employee;
import visitorpattern.element.Manager;
import visitorpattern.element.Worker;
import visitorpattern.visitor.HRDepartment;
import visitorpattern.visitor.financeDepartment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VisitorTest {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        //经理1
        Employee employee1 = new Manager("迟经理", 8, 50000, 10);
        //经理2
        Employee employee2 = new Manager("周经理", 8, 15000, 15);
        //普通员工1
        Employee employee3 = new Worker("小聂", 8, 8000, 8);
        //普通员工2
        Employee employee4 = new Worker("小关", 8, 8500, 12);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        Scanner scan = new Scanner(System.in);
        while(true) {
            PrintTool.print("");
            PrintTool.print("Please enter a command(0 exit, 1 add a manager, "
                    + "2 add a worker, 3 Financial statements, 4 Human resourcesstatements)");
            String str=scan.next();
            if(str.equals("0")) {
                PrintTool.print("close");
                break;
            }
            else if(str.equals("1")) {
                PrintTool.print("Please enter a name：");
                String name = scan.next();
                PrintTool.print("Please enter the workingHours：");
                String workingHoursString=null;
                int workingHours=0;
                while (true) {
                    try {
                        workingHoursString = scan.next();
                        workingHours = Integer.parseInt(workingHoursString);
                        break;
                    } catch (NumberFormatException e) {
                        PrintTool.print("求求你输数字吧");
                        continue;
                    }
                }
                //int workingHours=Integer.parseInt(workingHoursString);
                PrintTool.print("Please enter the salary：");
                int salary=0;
                String salaryString = null;
                while (true) {
                    salaryString = scan.next();
                    try {
                        salary = Integer.parseInt(salaryString);
                        break;
                    } catch (NumberFormatException e) {
                        PrintTool.print("求求你输数字吧");
                        continue;
                    }
                }
                //int salary=Integer.parseInt(salaryString);
                PrintTool.print("Please enter the length of absence：");
                int absence=0;
                String absenceString = null;
                while (true) {
                    absenceString = scan.next();
                    try {
                        workingHours = Integer.parseInt(absenceString);
                        break;
                    } catch (NumberFormatException e) {
                        PrintTool.print("求求你输数字吧");
                        continue;
                    }
                }
                //int absence=Integer.parseInt(absenceString);
                if(IfInt.isNumeric(workingHoursString)||IfInt.isNumeric(salaryString)||IfInt.isNumeric(absenceString)){
                    workingHours=Integer.parseInt(workingHoursString);
                    salary=Integer.parseInt(salaryString);
                    absence=Integer.parseInt(absenceString);
                    Employee empl = new Manager(name, workingHours, salary, absence);
                    employeeList.add(empl);
                }else {
                    PrintTool.print("Please enter the correct info：");
                }

            }
            else if(str.equals("2")) {
                PrintTool.print("Please enter a name：");
                String name = scan.next();
                PrintTool.print("Please enter the workingHours：");
                String workingHoursString=null;
                int workingHours=0;
                while (true) {
                    try {
                        workingHoursString = scan.next();
                        workingHours = Integer.parseInt(workingHoursString);
                        break;
                    } catch (NumberFormatException e) {
                        PrintTool.print("求求你输数字吧");
                        continue;
                    }
                }
                //int workingHours=Integer.parseInt(workingHoursString);
                PrintTool.print("Please enter the salary：");
                int salary=0;
                String salaryString = null;
                while (true) {
                    salaryString = scan.next();
                    try {
                        salary = Integer.parseInt(salaryString);
                        break;
                    } catch (NumberFormatException e) {
                        PrintTool.print("求求你输数字吧");
                        continue;
                    }
                }
                //int salary=Integer.parseInt(salaryString);
                PrintTool.print("Please enter the length of absence：");
                int absence=0;
                String absenceString = null;
                while (true) {
                    absenceString = scan.next();
                    try {
                        workingHours = Integer.parseInt(absenceString);
                        break;
                    } catch (NumberFormatException e) {
                        PrintTool.print("求求你输数字吧");
                        continue;
                    }
                }
                if(IfInt.isNumeric(workingHoursString)||IfInt.isNumeric(salaryString)||IfInt.isNumeric(absenceString)){
                    workingHours=Integer.parseInt(workingHoursString);
                    salary=Integer.parseInt(salaryString);
                    absence=Integer.parseInt(absenceString);
                    Employee empl = new Worker(name, workingHours, salary, absence);
                    employeeList.add(empl);
                }else {
                    PrintTool.print("Please enter the correct info：");
                }
            }
            else if(str.equals("3")){
                financeDepartment fadepartment = new financeDepartment();
                for(Employee employee : employeeList){
                    employee.accept(fadepartment);
                }
            }
            else if(str.equals("4")){
                HRDepartment hrdepartment = new HRDepartment();
                for(Employee employee : employeeList){
                    employee.accept(hrdepartment);
                }
            }
            else {
                PrintTool.print("Input Error");
            }
        }
    }
}
