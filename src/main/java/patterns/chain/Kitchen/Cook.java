package main.java.patterns.chain.Kitchen;

public abstract class Cook {
    protected int quantityOfPeople;
    protected Cook nextCook;

    public Cook(int quantityOfPeople) {
        this.quantityOfPeople = quantityOfPeople;
    }
    public void setNextCook(Cook nextCook) {
        this.nextCook = nextCook;
    }
    public void whoIsCooking(int quantityOfPeople) {
        if (quantityOfPeople > this.quantityOfPeople) cooks();
        if (nextCook != null) nextCook.whoIsCooking(quantityOfPeople);
    }
    public abstract void cooks();
}
