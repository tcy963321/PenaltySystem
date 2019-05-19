package main;

import java.util.List;
import main.dataaccess.RootDA;
import main.dataaccess.RulesDA;
import main.dataaccess.StudentsDA;
import main.models.Rule;
import main.models.Student;

public class ViewData {

    private static ViewData instance = null;

    private ViewData() {
        // When creating this class, create directory to save files
        RootDA.createRootDirectory();
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
    
    public List<Student> getAllStudents() {
        StudentsDA.getInstance().studentsDemoData();
        return StudentsDA.getInstance().getStudents();
    }
}
