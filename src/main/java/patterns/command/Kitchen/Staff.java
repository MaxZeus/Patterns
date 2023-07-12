package main.java.patterns.command.Kitchen;

public class Staff {
    private final Cooking cooking;
    private final Serving serving;
    private final Cleaning cleaning;
    private final Preparing preparing;

    public Staff(Cooking cooking, Serving serving, Cleaning cleaning, Preparing preparing) {
        this.cooking = cooking;
        this.serving = serving;
        this.cleaning = cleaning;
        this.preparing = preparing;
    }

    public void staffCook() {
        cooking.execute();
    }
    public void staffServe() {
        serving.execute();
    }
    public void staffClean() {
        cleaning.execute();
    }
    public void staffPrepare() {
        preparing.execute();
    }
}
