package main.java.patterns.visitor.Visitor;

class Engine implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}