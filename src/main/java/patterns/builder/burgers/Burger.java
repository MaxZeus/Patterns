package main.java.patterns.builder.burgers;

public class Burger {
    private String cheeseName;
    private String meatName;
    private String saladName;
    private double price;

    public void setCheeseName(String cheeseName) {
        this.cheeseName = cheeseName;
    }
    public void setMeatName(String meatName) {
        this.meatName = meatName;
    }
    public void setSaladName(String saladName) {
        this.saladName = saladName;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "cheeseName='" + cheeseName + '\'' +
                ", meatName='" + meatName + '\'' +
                ", saladName='" + saladName + '\'' +
                ", price=" + price +
                '}';
    }
}
