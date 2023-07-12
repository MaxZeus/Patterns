package main.java.patterns.adapter;

public class KitchenStuff {
    public void opening() {
        System.out.println("Opening at 8:00");
    }
    public void hardWork() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Work");
        }
    }
    public void breakTime() {
        System.out.println("Little lunch break");
    }
    public void closing() {
        System.out.println("Closing at 20:00");
    }
}
