package main.views;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import main.FileUtil;

public class MainMenu extends JFrame {

    private static final String LOGO_PATH = FileUtil.IMG_PATH + "logo1.png";
    private static final String PIC1_PATH = FileUtil.IMG_PATH + "Picture1.png";
    private static final String PIC2_PATH = FileUtil.IMG_PATH + "Picture2.png";
    private static final String PIC3_PATH = FileUtil.IMG_PATH + "Picture2.png";
    private static final String PIC4_PATH = FileUtil.IMG_PATH + "Picture4.png";
    private static final String PIC5_PATH = FileUtil.IMG_PATH + "Picture5.png";
    private static final String PIC6_PATH = FileUtil.IMG_PATH + "Picture6.png";

    public MainMenu() {
        super("SISWA UMT PENALTY SYSTEM");
        JButton button0, button1, button2, button3, button4, button5;

        ImageIcon studentIcon = new ImageIcon(PIC1_PATH);
        button0 = new JButton("Add New Student ", studentIcon);

        ImageIcon rulesIcon = new ImageIcon(PIC2_PATH);
        button1 = new JButton("Rules Description", rulesIcon);

        ImageIcon penaltyIcon = new ImageIcon(PIC3_PATH);
        button2 = new JButton("Penalty Form", penaltyIcon);

        ImageIcon reportIcon = new ImageIcon(PIC4_PATH);
        button3 = new JButton("Warning Letter", reportIcon);

        button4 = new JButton("History");

        ImageIcon exit = new ImageIcon(PIC6_PATH);
        button5 = new JButton("Exit", exit);

        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
//                kenny k = new kenny();
//                k.setVisible(true);
//                k.setSize(1000, 300);
//                k.setResizable(false);
//                k.setLocationRelativeTo(null);
//                ImageIcon img = new ImageIcon("./logo1.jpg");
//                k.setIconImage(img.getImage());
            }
        });

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
        setSize(1300, 800);
        setLocationRelativeTo(null);
        ImageIcon logoIcon = new ImageIcon(LOGO_PATH);
        setIconImage(logoIcon.getImage());
        setVisible(true);
    }
}
