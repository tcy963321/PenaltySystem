package main.views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import main.GUIUtil;
import main.models.Student;

public class StudentPanel extends JPanel {

    private final JLabel lFullName,
            lMatrixId,
            lIc,
            lRoomNumber;

    public StudentPanel(Student s) {
        setLayout(GUIUtil.create1ColumnGrid(4));
        
        // Add border for each student
        setBorder(GUIUtil.createRaisedBorder(GUIUtil.DEFAULT_MARGIN));

        lFullName = new JLabel("Name: " + s.getFullName());
        lMatrixId = new JLabel("Student id: " + s.getMatrixId());
        lIc = new JLabel("IC / Passport: " + s.getIc());
        lRoomNumber = new JLabel("Room number: " + s.getRoomNumber());

        add(lFullName);
        add(lMatrixId);
        add(lIc);
        add(lRoomNumber);
        
        //TODO: Add click funcitonality
    }
}
