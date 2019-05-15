package main.views;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.ViewData;
import main.models.Rule;

public class RulesOverview extends JPanel {

    private JLabel ruleLabel;

    public RulesOverview() {
        ViewData vd = ViewData.getInstance();
        
        setBounds(360, 360, 640, 360);
        setLayout(new BorderLayout());

        List<Rule> rulesList = vd.getAllRules();

        StringBuilder sb = new StringBuilder();
        
        sb.append("<html>");
        for (int i = 0; i < rulesList.size(); i++) {

            sb.append(i)
                    .append(". ")
                    .append(rulesList.get(i).getTitle())
                    .append("<br><br>");
        }
        sb.append("</html>");
        
        ruleLabel = new JLabel(sb.toString());
        
        add(ruleLabel, BorderLayout.CENTER);
    }
}
