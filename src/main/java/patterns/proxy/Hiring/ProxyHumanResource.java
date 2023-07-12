package main.java.patterns.proxy.Hiring;

public class ProxyHumanResource implements Hiring {
    private String employeeSpecialization;
    private HumanResource hm;

    public ProxyHumanResource(String employeeSpecialization) {
        this.employeeSpecialization = employeeSpecialization;
    }

    @Override
    public void hiring() {
        if (hm == null) hm = new HumanResource(employeeSpecialization);
        hm.hiring();
    }
}
