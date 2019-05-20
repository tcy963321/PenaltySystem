package main;

import java.awt.Dimension;
import java.awt.Window;
import main.util.FileUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import main.models.Penalty;
import main.models.Student;
import main.views.DisplayReportScreen;
import main.views.NewCaseForm;
import main.views.NewStudentScreen;
import main.views.RulesScreen;
import main.views.StudentsListScreen;
import main.views.StudentsListView;

public class Navigation {

    public interface PenaltyFormListener {

        void onPenaltyStudentSelected();
    }

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

    public static ActionListener navigateToRulesScreen() {
        return (ActionEvent e) -> {
            RulesScreen frame = new RulesScreen();

            frame.setLocationRelativeTo(null);
            ImageIcon img = new ImageIcon(FileUtil.LOGO_PATH);
            frame.setIconImage(img.getImage());
            frame.setVisible(true);
        };
    }

    //TODO: Hook this to new student button
    public static void saveStudentAndGoHome(JButton button, Student student) {
        closeWindow(button);

        ViewData.getInstance().saveStudent(student);
    }

    public static void closeWindow(JComponent component) {
        Window currentScreen
                = SwingUtilities.windowForComponent(component);
        currentScreen.dispose();
    }

    public static ActionListener navigateToNewCaseScreen() {
        return (ActionEvent e) -> {
            NewCaseForm frame = new NewCaseForm();

            frame.setSize(frame.getPreferredSize());
            frame.setLocationRelativeTo(null);
            ImageIcon img = new ImageIcon(FileUtil.LOGO_PATH);
            frame.setIconImage(img.getImage());
            frame.pack();
            frame.setVisible(true);
        };
    }

    public static ActionListener navigateToStudentListScreen() {
        return (ActionEvent e) -> {
            StudentsListScreen frame = new StudentsListScreen();

            frame.setSize(frame.getPreferredSize());
            frame.setLocationRelativeTo(null);
            ImageIcon img = new ImageIcon(FileUtil.LOGO_PATH);
            frame.setIconImage(img.getImage());
            frame.setVisible(true);
        };
    }

    public static void showSelectStudentDialog(PenaltyFormListener penaltyScreen) {
        JFrame frame = new JFrame("Select a Student:");

        StudentsListView slv = new StudentsListView(penaltyScreen);
        frame.add(slv);
        ImageIcon img = new ImageIcon(FileUtil.LOGO_PATH);
        frame.setSize(new Dimension(480, 800));
        frame.setIconImage(img.getImage());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void navigateToDisplayReport(Penalty data) {
        DisplayReportScreen frame = new DisplayReportScreen(data);

        frame.setSize(frame.getPreferredSize());
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(FileUtil.LOGO_PATH);
        frame.setIconImage(img.getImage());
        frame.setVisible(true);
    }
}
