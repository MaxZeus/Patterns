package main.java.patterns.chain.Kitchen;

public class SousChef extends Cook {

    public SousChef(int quantityOfPeople) {
        super(quantityOfPeople);
    }

    @Override
    public void cooks() {
        System.out.println("Sous-chef is helping to cook");
    }
}
