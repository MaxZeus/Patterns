package main.java.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton first = Singleton.createSingleton();
        Singleton second = Singleton.createSingleton();
        Singleton third = Singleton.createSingleton();

        if (first == second) System.out.println(true);
        if (second == third) System.out.println(true);
    }
}
