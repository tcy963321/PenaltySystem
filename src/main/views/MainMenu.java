package main.views;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import main.FileUtil;
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
        bWarningLetter = new JButton("Warning Letter", reportIcon);

        bHistory = new JButton("History");

        ImageIcon exit = new ImageIcon(FileUtil.PIC6_PATH);
        bExit = new JButton("Exit", exit);

        bNewStudent.addActionListener(Navigation.navigateToNewStudentScreen());

        bRules.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
//                Rules R = new Rules();

            }
        });
        
        bNewCase.addActionListener(Navigation.navigateToNewCaseScreen());

        bWarningLetter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
//                Report r = new Report();
//                r.setVisible(true);
//                r.setSize(950, 900);
//                r.setResizable(false);
//                r.setLocationRelativeTo(null);
//                ImageIcon img = new ImageIcon("./logo1.jpg");
//                r.setIconImage(img.getImage());

            }
        });

        bExit.addActionListener((ActionEvent arg0) -> {
            dispose();
            System.exit(0);
        });

        Font myFont = new Font("Arial", Font.ITALIC | Font.BOLD, 20);
        myFont = myFont.deriveFont(20F);
        bNewStudent.setFont(myFont);
        bRules.setFont(myFont);
        bNewCase.setFont(myFont);
        bWarningLetter.setFont(myFont);
        bHistory.setFont(myFont);
        bExit.setFont(myFont);

        add(bNewStudent);
        add(bRules);
        add(bNewCase);
        add(bWarningLetter);
        add(bHistory);
        add(bExit);
        
        setLayout(new GridLayout(2, 3));
        setSize(1280, 800);
        setLocationRelativeTo(null);
        ImageIcon logoIcon = new ImageIcon(FileUtil.LOGO_PATH);
        setIconImage(logoIcon.getImage());
        setVisible(true);
    }
}
