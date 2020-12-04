import abstractfactorypattern.Animal;
import abstractfactorypattern.AnimalFactory;
import tools.PrintTool;

public class FactoryTest {
    public static void main(String[] args) {
        PrintTool.print("Factory Pattern Test Demo");

        System.out.println("该工厂模式可创建鱼类，虾类，蟹类对象，并调用各自的方法");

        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("Fish");

        animal1.speak();
        animal1.show();

        Animal animal2 = animalFactory.getAnimal("Crab");

        animal2.speak();
        animal2.show();

        Animal animal3 = animalFactory.getAnimal("Shrimp");

        animal3.speak();
        animal3.show();
    }
}
