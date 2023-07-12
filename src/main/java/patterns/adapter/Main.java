package main.java.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        Work work = new RestaurantAdapter();

        work.comeToWork();
        work.work();
        work.lunch();
        work.goHome();
    }
}
