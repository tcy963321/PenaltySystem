package main.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import main.models.Rule;
import main.util.GUIUtil;

public class RuleRowsPanel extends JPanel {

    private List<RuleCheckbox> rc;
    private JPanel pRulesList;

    public RuleRowsPanel(List<Rule> rules) {
        setLayout(new BorderLayout());

        GridLayout glStd = GUIUtil.create1ColumnGrid(rules.size());
        pRulesList = new JPanel(glStd);
        pRulesList.setBorder(GUIUtil.createBorder(GUIUtil.HALF_DEF_MARGIN));

        int prefHeight = 0;
        for (Rule rule : rules) {
            pRulesList.revalidate();

            RuleCheckbox cbRule = new RuleCheckbox(rule);
            pRulesList.add(cbRule);
            prefHeight += cbRule.getHeight();
        }
        
        add(pRulesList);
    }
}
