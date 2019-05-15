package main.dataaccess;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import main.models.Rule;
import org.apache.commons.io.FileUtils;

// Singleton for data input / output
public class RulesDA {

    private final String RULES_PATH = "rules_ps.json";

    private final Type RULES_SERIALIZATION_TYPE
            = new TypeToken<List<Rule>>() {
            }.getType();

    private static RulesDA instance = null;

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private RulesDA() {
    }

    public static RulesDA getInstance() {
        if (instance == null) {
            instance = new RulesDA();
        }
        return instance;
    }

    /**
     * Save the rules list locally - currently, in a text file
     *
     * @param rules list of rules to save
     */
    public void saveRules(List<Rule> rules) {
        Gson gson = new Gson();

        String rulesJson = gson.toJson(rules);

        saveRulesLocally(rulesJson);
    }

    private void saveRulesLocally(String rulesJson) {
        try {
            FileUtils.writeStringToFile(
                    new File(RULES_PATH), rulesJson, Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println(
                    "GetData: Cannot save rules locally: " + e.getMessage());
        }
    }

    /**
     * Convert the JSON representation of rules to List
     *
     * @return List of Rules
     */
    public List<Rule> getRules() {
        Gson gson = new Gson();

        String rulesJson = loadRulesData();

        if (rulesJson.isEmpty()) {
            return new ArrayList<>();
        }

        return gson.fromJson(rulesJson, RULES_SERIALIZATION_TYPE);
    }

    /**
     * Load JSON representation of rules from a file with already defined path
     *
     * @return List of rules in JSON format
     */
    private String loadRulesData() {
        try {
            return FileUtils.readFileToString(
                    new File(RULES_PATH), Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println("GetData: Cannot load rules: " + e.getMessage());
        }
        return "";
    }

    public void useDemoData() {
        List<Rule> myRules = new ArrayList<>();

        myRules.add(new Rule(50, 0, "Student must wear appropriate clothing", "bla bla bla"));
        myRules.add(new Rule(70, 0, "Car parking must be 1 per slot", "bla bla bla"));
        myRules.add(new Rule(80, 2, "Student must wear appropriate clothing", "bla bla bla"));
        myRules.add(new Rule(90, 0, "Student must wear appropriate clothing", "bla bla bla"));
        myRules.add(new Rule(20, 1, "Student must wear appropriate clothing", "bla bla bla"));

        saveRules(myRules);
    }
}
