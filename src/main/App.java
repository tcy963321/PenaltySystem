package main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import main.views.MainMenu;
import main.views.StudentsListScreen;

public class App {

    private static JFrame mainWindow;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            /*
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
                System.out.println("Cannot set look and feel: " + e.getMessage());
            }
             */

            showInitialGUI();
        });
    }

    public static void showInitialGUI() {
        mainWindow = new MainMenu();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainWindow.pack();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }
}
