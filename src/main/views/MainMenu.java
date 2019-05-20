package main.views;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import main.util.FileUtil;
import main.Navigation;

public class MainMenu extends JFrame {

    public MainMenu() {
        super("SISWA UMT PENALTY SYSTEM");
        JButton bNewStudent, bRules, bNewCase, bWarningLetter, bHistory, bExit;

        ImageIcon studentIcon = new ImageIcon(FileUtil.PIC1_PATH);
        bNewStudent = new JButton("Add New Student ", studentIcon);

        ImageIcon rulesIcon = new ImageIcon(FileUtil.PIC2_PATH);
        bRules = new JButton("Rules Description", rulesIcon);

        ImageIcon newCaseIcon = new ImageIcon(FileUtil.PIC3_PATH);
        bNewCase = new JButton("File a New Case", newCaseIcon);

        ImageIcon reportIcon = new ImageIcon(FileUtil.PIC4_PATH);
        bWarningLetter = new JButton("History", reportIcon);

        bNewStudent.addActionListener(Navigation.navigateToNewStudentScreen());

        bRules.addActionListener(Navigation.navigateToRulesScreen());
        
        bNewCase.addActionListener(Navigation.navigateToNewCaseScreen());

        Font myFont = new Font("Arial", Font.ITALIC | Font.BOLD, 20);
        myFont = myFont.deriveFont(20F);
        bNewStudent.setFont(myFont);
        bRules.setFont(myFont);
        bNewCase.setFont(myFont);
        bWarningLetter.setFont(myFont);

        add(bNewStudent);
        add(bRules);
        add(bNewCase);
        add(bWarningLetter);
        
        setLayout(new GridLayout(2, 2));
        setSize(1000, 800);
        setLocationRelativeTo(null);
        ImageIcon logoIcon = new ImageIcon(FileUtil.LOGO_PATH);
        setIconImage(logoIcon.getImage());
        setVisible(true);
    }
}
