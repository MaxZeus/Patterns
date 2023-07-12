package main.java.patterns.bridge.work;


public class Builder implements Worker {
    @Override
    public void work() {
        System.out.println("Build");
    }
}
