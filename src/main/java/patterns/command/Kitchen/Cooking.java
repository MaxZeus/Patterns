package main.java.patterns.command.Kitchen;

public class Cooking implements Command {
    private Kitchen kitchen;

    public Cooking(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.cook();
    }
}
