package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import main.views.NewStudentScreen;

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
}
