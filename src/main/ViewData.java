package main;

import java.util.List;
import main.dataaccess.RootDA;
import main.dataaccess.RulesDA;
import main.dataaccess.StudentsDA;
import main.models.Masters;
import main.models.PHD;
import main.models.Rule;
import main.models.Student;
import main.models.Undergraduate;

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

    public String[][] rulesInTableFormat() {
        List<Rule> rulesList = getAllRules();

        // Set the number of rows to the number of rules,
        // and columns to how many attributes a Rule have (currently 2),
        // and numbering
        String[][] rules = new String[rulesList.size()][3];

        for (int i = 0; i < rulesList.size(); i++) {
            rules[i][0] = String.format("%d", (i + 1));
            rules[i][1] = rulesList.get(i).getDescription();
            rules[i][2] = String.format("%.1f", rulesList.get(i).getFine());
        }

        return rules;
    }

    public void saveRulesList(List<Rule> rulesToSave) {
        RulesDA.getInstance().saveRules(rulesToSave);
    }

    public List<Student> getAllStudents() {
        StudentsDA.getInstance().studentsDemoData();
        //RulesDA.getInstance().initialRulesData();
        return StudentsDA.getInstance().getStudents();
    }

    public void saveStudent(Student student) {

        if (student instanceof Undergraduate) {
            StudentsDA.getInstance().saveNewStudent((Undergraduate) student);
        } else if (student instanceof Masters) {
            StudentsDA.getInstance().saveNewStudent((Masters) student);
        } else if (student instanceof PHD) {
            StudentsDA.getInstance().saveNewStudent((PHD) student);
        }
    }
}
