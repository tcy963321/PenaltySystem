package main.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.models.Rule;

public class RuleCheckbox extends JPanel {

    private JLabel lRule;
    private JCheckBox cb;
    
    public RuleCheckbox(Rule rule) {
        setLayout(new BorderLayout());
        
        lRule = new JLabel(rule.getDescription());
        lRule.setSize(100, 30);
        
        cb = new JCheckBox();
        
        add(lRule, BorderLayout.LINE_START);
        add(cb, BorderLayout.LINE_END);
    }
    
    public boolean isSelected() {
        return cb.isSelected();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 30);
    }
}
