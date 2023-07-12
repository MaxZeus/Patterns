package main.java.patterns.singleton;

public class Singleton {
    private static Singleton singleton;
    private static String test;

    private Singleton() {}

    public static synchronized Singleton createSingleton() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }

    public void addInfo(String info) {
        test += info + "/n";
    }
    public void readInfo() {
        System.out.println(test);
    }
}
