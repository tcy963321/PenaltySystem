package main.views;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import main.Navigation;
import main.models.Masters;
import main.models.PHD;
import main.models.Undergraduate;

public class NewStudentScreen extends JFrame {

    JLabel name, matrix, identity, course, faculty, phone, roomNumber, space, studentType;
    JTextField tfName, tfMatrix, tfIC, tfCourse, tfFaculty, tfPhone,  tfRoomNumber;
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
        
        roomNumber = new JLabel("Room Number                                       ", SwingConstants.RIGHT);
        add(roomNumber);
        tfRoomNumber = new JTextField(41);
        add(tfRoomNumber);

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

        JButton bAdd = new JButton("           Add           ");
        add(bAdd);
        JButton bCancel = new JButton("        Cancel        ");
        add(bCancel);
        
        //TODO: Add button functionality
        bAdd.addActionListener((ActionEvent e) -> {
            if (rbUndergraduate.isSelected()) {
                Navigation.saveStudentAndGoHome(bAdd, new Undergraduate(
                        tfName.getText(),
                        tfMatrix.getText(),
                        tfIC.getText(),
                        tfCourse.getText(),
                        tfFaculty.getText(),
                        tfPhone.getText(),
                        tfRoomNumber.getText(),
                        0
                ));
            } else if (rbMaster.isSelected()) {
                Navigation.saveStudentAndGoHome(bAdd, new Masters(
                        tfName.getText(),
                        tfMatrix.getText(),
                        tfIC.getText(),
                        tfCourse.getText(),
                        tfFaculty.getText(),
                        tfPhone.getText(),
                        tfRoomNumber.getText(),
                        0
                ));
            } else if (rbPostgraduate.isSelected()) {
                Navigation.saveStudentAndGoHome(bAdd, new PHD(
                        tfName.getText(),
                        tfMatrix.getText(),
                        tfIC.getText(),
                        tfCourse.getText(),
                        tfFaculty.getText(),
                        tfPhone.getText(),
                        tfRoomNumber.getText(),
                        0
                ));
            }
        });
        bCancel.addActionListener(Navigation.closeWindow());
    }
}
