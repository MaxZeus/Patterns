package main.java.patterns.facade.Restaurant;

public class RestaurantFacade {
    Open open = new Open();
    Work work = new Work();
    Waiter waiter = new Waiter();

    public void WorkingTime() {
        open.Working();
        work.doWork();
        waiter.Working(open);
    }

}
