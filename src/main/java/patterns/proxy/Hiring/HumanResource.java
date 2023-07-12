package main.java.patterns.proxy.Hiring;

public class HumanResource implements Hiring {
    private String employeeSpecialization;

    public HumanResource(String employeeSpecialization) {
        this.employeeSpecialization = employeeSpecialization;
        hire();
    }
    private void hire() {
        System.out.println("We are hiring " + employeeSpecialization + " to our company");
    }

    @Override
    public void hiring() {
        System.out.println("New specialist is working now");
    }
}
