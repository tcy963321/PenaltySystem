package main;

import javax.swing.JComponent;
import javax.swing.JFrame;
import main.views.RulesOverview;

public class RunIt {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Font Radio Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComponent contentPane = new RulesOverview();
        contentPane.setOpaque(true);
        frame.setContentPane(contentPane);
        
        frame.pack();
        frame.setVisible(true);
    }
}
