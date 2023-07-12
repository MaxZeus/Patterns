package main.java.patterns.command.Kitchen;

public class Serving implements Command {
    private Kitchen kitchen;

    public Serving(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.serve();
    }
}
