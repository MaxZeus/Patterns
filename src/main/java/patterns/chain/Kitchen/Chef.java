package main.java.patterns.chain.Kitchen;

public class Chef extends Cook {

    public Chef(int quantityOfPeople) {
        super(quantityOfPeople);
    }

    @Override
    public void cooks() {
        System.out.println("Chef is helping to cook");
    }
}
