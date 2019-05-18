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
        JButton button0, button1, button2, button3, button4, button5;

        ImageIcon studentIcon = new ImageIcon(FileUtil.PIC1_PATH);
        button0 = new JButton("Add New Student ", studentIcon);

        ImageIcon rulesIcon = new ImageIcon(FileUtil.PIC2_PATH);
        button1 = new JButton("Rules Description", rulesIcon);

        ImageIcon penaltyIcon = new ImageIcon(FileUtil.PIC3_PATH);
        button2 = new JButton("Penalty Form", penaltyIcon);

        ImageIcon reportIcon = new ImageIcon(FileUtil.PIC4_PATH);
        button3 = new JButton("Warning Letter", reportIcon);

        button4 = new JButton("History");

        ImageIcon exit = new ImageIcon(FileUtil.PIC6_PATH);
        button5 = new JButton("Exit", exit);

        button0.addActionListener(Navigation.navigateToNewStudentScreen());

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
//                Rules R = new Rules();

            }
        });

        button3.addActionListener(new ActionListener() {
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

        button5.addActionListener((ActionEvent arg0) -> {
            dispose();
            System.exit(0);
        });

        Font myFont = new Font("Arial", Font.ITALIC | Font.BOLD, 20);
        myFont = myFont.deriveFont(20F);
        button0.setFont(myFont);
        button1.setFont(myFont);
        button2.setFont(myFont);
        button3.setFont(myFont);
        button4.setFont(myFont);
        button5.setFont(myFont);

        add(button0);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        
        setLayout(new GridLayout(2, 3));
        setSize(1280, 800);
        setLocationRelativeTo(null);
        ImageIcon logoIcon = new ImageIcon(FileUtil.LOGO_PATH);
        setIconImage(logoIcon.getImage());
        setVisible(true);
    }
}
