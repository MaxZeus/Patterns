package main.java.patterns.bridge.work;

public class Taxman implements Worker {
    @Override
    public void work() {
        System.out.println("Take people's money");
    }
}
