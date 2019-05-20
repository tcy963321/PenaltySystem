package main;

import java.awt.Window;
import main.util.FileUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import main.models.Student;
import main.views.NewStudentScreen;
import main.views.StudentsListScreen;

public class Navigation {
    
    private Navigation() {
    }

    public static ActionListener navigateToNewStudentScreen() {
        return (ActionEvent e) -> {
            NewStudentScreen frame = new NewStudentScreen();

            frame.setSize(1000, 300);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            ImageIcon img = new ImageIcon(FileUtil.LOGO_PATH);
            frame.setIconImage(img.getImage());
            frame.setVisible(true);
        };
    }

    //TODO: Hook this to new student button
    public static void saveStudentAndGoHome(JButton button, Student student) {
            Window currentScreen
                    = SwingUtilities.windowForComponent(button);
            currentScreen.dispose();

            ViewData.getInstance().saveStudent(student);
    }

    public static ActionListener closeWindow() {
        return (ActionEvent e) -> {
            Window currentScreen
                    = SwingUtilities.windowForComponent((JButton) e.getSource());
            currentScreen.dispose();
        };
    }

    public static ActionListener navigateToNewCaseScreen() {
        return (ActionEvent e) -> {
            StudentsListScreen frame = new StudentsListScreen();

            frame.setSize(frame.getPreferredSize());
            frame.setLocationRelativeTo(null);
            ImageIcon img = new ImageIcon(FileUtil.LOGO_PATH);
            frame.setIconImage(img.getImage());
            frame.setVisible(true);
        };
    }
}
