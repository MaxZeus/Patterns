package main.java.patterns.flyweight.Cook;

import java.util.HashMap;
import java.util.Map;

public class KitchenStaff {
    private final Map<String, Cook> staff = new HashMap<>();

    public Cook getCookBySpecialization(String specialization) {
        Cook cook = staff.get(specialization);

        if (cook == null) {
            switch(specialization) {
                case "MeatCook" -> { System.out.println("Hiring cook who works with meat"); staff.put(specialization, new MeatCook());}
                case "SaladCook" -> { System.out.println("Hiring cook who works with salad");staff.put(specialization, new SaladCook());}
                case "DessertCook" -> { System.out.println("Hiring cook who works with desserts");staff.put(specialization, new DessertCook());}
            }
        }
        return staff.get(specialization);
    }
}
