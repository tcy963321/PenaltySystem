package main;

import java.util.List;
import main.dataaccess.RulesDA;
import main.models.Rule;

public class ViewData {

    private static ViewData instance = null;

    private ViewData() {
    }

    public static ViewData getInstance() {
        if (instance == null) {
            instance = new ViewData();
        }
        return instance;
    }

    public List<Rule> getAllRules() {
        return RulesDA.getInstance().getRules();
    }

    public void saveRulesList(List<Rule> rulesToSave) {
        RulesDA.getInstance().saveRules(rulesToSave);
    }
}
