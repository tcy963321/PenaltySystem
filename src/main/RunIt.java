package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import main.views.StudentsListScreen;

public class RunIt {

    private static JFrame mainWindow;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
                System.out.println("Cannot set look and feel: " + e.getMessage());
            }
        });

        mainWindow = new StudentsListScreen();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainWindow.pack();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }
}
