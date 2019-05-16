package main;

import javax.swing.JComponent;
import javax.swing.JFrame;
import main.views.RulesOverview;
import main.views.StudentsListScreen;

public class RunIt {

    private static JFrame mainWindow;

    public static void main(String[] args) {

        mainWindow = new JFrame("Font Radio Button Demo");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent contentPane = new StudentsListScreen(
                ViewData.getInstance().getAllStudents());
        
        contentPane.setOpaque(true);
        mainWindow.setContentPane(contentPane);

        mainWindow.pack();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }
}
