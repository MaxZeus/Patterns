package main.java.patterns.interpretator.legalStayChecker;

public class LegalStayChecker implements Expression {
    final private Context context;
    public LegalStayChecker(Context context) {
        this.context = context;
    }
    @Override
    public boolean interpret(String date) {
        return context.legalStayInCountry(date);
    }
}
