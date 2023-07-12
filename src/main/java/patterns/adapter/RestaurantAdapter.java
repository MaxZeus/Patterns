package main.java.patterns.adapter;

public class RestaurantAdapter extends KitchenStuff implements Work {
    @Override
    public void comeToWork() {
        opening();
    }

    @Override
    public void work() {
        hardWork();
    }

    @Override
    public void lunch() {
        breakTime();
    }

    @Override
    public void goHome() {
        closing();
    }
}
