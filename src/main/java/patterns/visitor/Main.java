package main.java.patterns.visitor;

import main.java.patterns.visitor.Visitor.*;

public class Main {
    public static void main(String[] args) {
        Car computer = new SportCar();
        computer.accept(new CarVisitor());
    }
}
