package main.java.patterns.proxy;

import main.java.patterns.proxy.Hiring.ProxyHumanResource;

public class Main {
    public static void main(String[] args) {
        String employeeSpecialization = "Wielder";
        ProxyHumanResource proxyHM = new ProxyHumanResource(employeeSpecialization);

        proxyHM.hiring();
    }
}
