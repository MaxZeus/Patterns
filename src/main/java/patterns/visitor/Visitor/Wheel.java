package main.java.patterns.visitor.Visitor;

public class Wheel implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}