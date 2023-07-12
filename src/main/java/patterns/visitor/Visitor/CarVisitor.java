package main.java.patterns.visitor.Visitor;

public class CarVisitor implements Visitor {
    public void visit(SportCar computer) {
        print("car");
    }
    public void visit(Engine engine) {
        print("engine");
    }
    public void visit(Wheel wheel) {
        print("wheel");
    }
    private void print(String string) {
        System.out.println(string);
    }
}