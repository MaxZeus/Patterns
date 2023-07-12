package main.java.patterns.command.Kitchen;

public class Preparing implements Command {
    private Kitchen kitchen;

    public Preparing(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.preparation();
    }
}
