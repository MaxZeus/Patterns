package main.java.patterns.facade.Restaurant;

public class Open {
    private boolean isWorking;
    public boolean isOpen() {
        return isWorking;
    }
    public void Working() {
        System.out.println("Restaurant is opened");
        isWorking = true;
    }
    public void Closed() {
        System.out.println("Restaurant is closed");
        isWorking = false;
    }
}
