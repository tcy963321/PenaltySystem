package main.views;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NewStudentScreen extends JFrame {

    JLabel name, matrix, identity, course, faculty, phone, space, studentType;
    JTextField tfName, tfMatrix, tfIC, tfCourse, tfFaculty, tfPhone;
    JRadioButton rbUndergraduate, rbMaster, rbPostgraduate;

    public NewStudentScreen() {
        super("Add New Student");
        
        // Wrap this in a JPanel, then separate JPanel for TwoButtons class
        // Root layout is borderlayout
        setLayout(new FlowLayout(FlowLayout.LEFT));

        name = new JLabel("Name                                                       ", SwingConstants.RIGHT);
        add(name);
        tfName = new JTextField(41);
        add(tfName);

        space = new JLabel("        ");
        add(space);
        space = new JLabel("                                                          ");
        add(space);

        matrix = new JLabel("Matrix No                                                ", SwingConstants.RIGHT);
        add(matrix);
        tfMatrix = new JTextField(41);
        add(tfMatrix);

        space = new JLabel("         ");
        add(space);
        space = new JLabel("                                                                      ");
        add(space);

        identity = new JLabel("Identity Card or Passport Number   ", SwingConstants.RIGHT);
        add(identity);
        tfIC = new JTextField(41);
        add(tfIC);

        space = new JLabel("  ");
        add(space);
        space = new JLabel("                                                                                            ");
        add(space);

        course = new JLabel("Course Name                                        ", SwingConstants.RIGHT);
        add(course);
        tfCourse = new JTextField(41);
        add(tfCourse);

        space = new JLabel("  ");
        add(space);
        space = new JLabel("  ");
        add(space);
        space = new JLabel("                                                                                               ");
        add(space);

        faculty = new JLabel("Faculty                                                     ", SwingConstants.RIGHT);
        add(faculty);
        tfFaculty = new JTextField(41);
        add(tfFaculty);

        space = new JLabel("  ");
        add(space);
        space = new JLabel("                                                                                                   ");
        add(space);

        phone = new JLabel("Phone Number                                      ", SwingConstants.RIGHT);
        add(phone);
        tfPhone = new JTextField(41);
        add(tfPhone);

        space = new JLabel(" ");
        add(space);
        space = new JLabel("                                                                                ");
        add(space);

        studentType = new JLabel("Student Type                                        ", SwingConstants.RIGHT);
        add(studentType);

        rbUndergraduate = new JRadioButton("Udergraduate");
        add(rbUndergraduate);
        space = new JLabel("");
        add(space);
        rbMaster = new JRadioButton("Master");
        add(rbMaster);
        space = new JLabel("");
        add(space);
        rbPostgraduate = new JRadioButton("Postgraduate");
        add(rbPostgraduate);

        space = new JLabel("                                                                               ");
        add(space);
        space = new JLabel("                                                     ");
        add(space);

        JButton okbut = new JButton("           Add           ");
        add(okbut);
        JButton cancelbut = new JButton("        Cancel        ");
        add(cancelbut);
        
        //TODO: Add button functionality
        //TODO: Make undergrad, master, postgrad class

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 400);
    }
}
