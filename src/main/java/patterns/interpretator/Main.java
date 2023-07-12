package main.java.patterns.interpretator;

import main.java.patterns.interpretator.legalStayChecker.*;

public class Main {
    public static void main(String[] args) {
        Context context = new Context("15.07.2023");
        Expression exp = new LegalStayChecker(context);
        System.out.print(exp.interpret("18.07.2023"));
    }
}
