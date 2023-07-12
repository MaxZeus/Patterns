package main.java.patterns.composite.worker;

public class Designer implements Worker {
    @Override
    public void build() {
        System.out.println("Design building facade");
    }
}
