package main.java.patterns.command.Kitchen;

public class Cleaning implements Command {
    private Kitchen kitchen;

    public Cleaning(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.clean();
    }
}
