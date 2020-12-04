import nullobjectpattern.*;
import tools.PrintTool;

public class NullObjectTest {
    public static void main(String[] args) {
        PrintTool.print("下面开始空对象模式测试");
        System.out.println("使用工厂依次创建不同的对象，查看所创建的对象是否是空对象");
        AbstractAnimal animal1 = AnimalFactory.getAnimal("小鲤鱼泡泡");
        AbstractAnimal animal2 = AnimalFactory.getAnimal("水母小美美");
        AbstractAnimal animal3 = AnimalFactory.getAnimal("双面龟");
        AbstractAnimal animal4 = AnimalFactory.getAnimal("癞皮蛇");

        System.out.println("Animals:");
        System.out.println(animal1.getName()+"   "+animal1.isNil());
        System.out.println(animal2.getName()+"   "+animal2.isNil());
        System.out.println(animal3.getName()+"   "+animal3.isNil());
        System.out.println(animal4.getName()+"   "+animal4.isNil());
    }
}
