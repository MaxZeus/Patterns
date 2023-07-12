package main.java.patterns.composite.worker;

public class Plumber implements Worker {
    @Override
    public void build() {
        System.out.println("Create building water communications");
    }
}
