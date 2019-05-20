package main.util;

import java.util.List;
import main.models.Rule;

public class CalculationUtil {

    private CalculationUtil() {
    }
    
    public static double calcTotalFine(List<Rule> rulesBroken) {
        double sum = 0.0;
        
        for (Rule rule : rulesBroken) {
            sum += rule.getFine();
        }
        
        return sum;
    }
}
