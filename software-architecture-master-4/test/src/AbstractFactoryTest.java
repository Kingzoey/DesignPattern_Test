import abstractfactorypattern.*;
import tools.PrintTool;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        PrintTool.print("Abstract Factory Demo");
        System.out.println("首先使用工厂生成器生成动物工厂，创建鱼类，螃蟹和虾类对象，每个对象调用自己的方法");

        AbstractFactory animalFactory = FactoryProducer.getFactory("Animal");

        Animal animal1 = animalFactory.getAnimal("Fish");

        animal1.speak();
        animal1.show();

        Animal animal2 = animalFactory.getAnimal("Crab");

        animal2.speak();
        animal2.show();

        Animal animal3 = animalFactory.getAnimal("Shrimp");

        animal3.speak();
        animal3.show();
        System.out.println("然后使用工厂生成器生成员工工厂，创建导游，保安对象，每个对象调用自己的方法");


        AbstractFactory staffFactory = FactoryProducer.getFactory("Staff");

        Staff staff1=staffFactory.getStaff("TourGuide");
        staff1.work();


        Staff staff2=staffFactory.getStaff("Guard");
        staff2.work();
    }
}
