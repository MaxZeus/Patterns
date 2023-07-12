package main.java.patterns.chain.Kitchen;

public class UsualCook extends Cook {

    public UsualCook(int quantityOfPeople) {
        super(quantityOfPeople);
    }

    @Override
    public void cooks() {
        System.out.println("Usual cook is cooking");
    }
}
