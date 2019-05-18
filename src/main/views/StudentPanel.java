package main.views;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import main.Const;
import main.models.Student;

public class StudentPanel extends JPanel {

    private JLabel lFullName,
            lMatrixId,
            lIc,
            lRoomNumber;
    private Border simpleBorder;

    public StudentPanel(Student s) {
        setLayout(Const.BORDER_LAY_VGAP);
        
        // Add border for each student
        setBorder(Const.BLACK_BORDER);

        lFullName = new JLabel("Name: " + s.getFullName());
        lMatrixId = new JLabel("Student id: " + s.getMatrixId());
        lIc = new JLabel("IC / Passport: " + s.getIc());
        lRoomNumber = new JLabel("Room number: " + s.getRoomNumber());

        //TODO: Fix items stacking on top of one another
        add(lFullName, BorderLayout.CENTER);
        add(lMatrixId, BorderLayout.CENTER);
        add(lIc, BorderLayout.CENTER);
        add(lRoomNumber, BorderLayout.CENTER);
    }
}
