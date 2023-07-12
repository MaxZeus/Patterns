package main.java.patterns.chain;

import main.java.patterns.chain.Kitchen.*;


public class Main {
    public static void main(String[] args) {
        Cook usualCook = new UsualCook(5);
        Cook sousChef = new SousChef(10);
        Cook chef = new Chef(15);

        usualCook.setNextCook(sousChef);
        sousChef.setNextCook(chef);

        usualCook.whoIsCooking(6);
        System.out.println();
        usualCook.whoIsCooking(12);
        System.out.println();
        usualCook.whoIsCooking(17);

    }
}
