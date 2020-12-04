
import singletonpattern.*;
import tools.PrintTool;



public class SingletonTest {


    public static void work() {
        PrintTool.print("Singleton Test Demo");
        System.out.println("If you see the same name(海绵宝宝), then singleton was reused " + "\n" +
                "If you see different name(海绵宝宝,派大星), then 2 singletons were created " + "\n\n" +
                "RESULT:" + "\n");
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }


    static class Thread1 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("海绵宝宝");
            System.out.println(singleton.name);
        }
    }


    static class Thread2 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("派大星");
            System.out.println(singleton.name);
        }
    }
    public static void main(String[] args) {
        work();
    }
}
