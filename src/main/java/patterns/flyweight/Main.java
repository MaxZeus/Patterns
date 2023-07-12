package main.java.patterns.flyweight;

import main.java.patterns.flyweight.Cook.Cook;
import main.java.patterns.flyweight.Cook.KitchenStaff;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        KitchenStaff kitchenStaff = new KitchenStaff();
        List<Cook> cooksList = new ArrayList<>();

        cooksList.add(kitchenStaff.getCookBySpecialization("MeatCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("MeatCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("MeatCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("MeatCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("MeatCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("SaladCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("SaladCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("SaladCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("SaladCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("DessertCook"));
        cooksList.add(kitchenStaff.getCookBySpecialization("DessertCook"));

        for (Cook c : cooksList) {
            c.toCook();
        }
    }
}
