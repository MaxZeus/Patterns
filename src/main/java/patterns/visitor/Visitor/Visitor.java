package main.java.patterns.visitor.Visitor;

public interface Visitor {
    void visit(SportCar sportCar);
    void visit(Engine engine);
    void visit(Wheel wheel);
}
