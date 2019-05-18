package main.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.Const;
import main.ViewData;

public class StudentsListScreen extends JFrame {

    private JPanel studentsList;

    public StudentsListScreen() {

        // Display the students scrolling pane
        // And the instruction label
        setLayout(Const.BORDER_LAY_VGAP);

        // Instruction label
        JLabel lInstruction = new JLabel("Select a student:");

        // Put all student panels into a scrollable panel
        studentsList = new JPanel(Const.BORDER_LAY_VGAP);

        ViewData.getInstance().getAllStudents().forEach((student) -> {
            // Add a new Student Panel and display it
            // below the previous one, for all students
            // in students list
            StudentPanel studentItem = new StudentPanel(student);
            studentsList.add(studentItem, BorderLayout.CENTER);
            revalidate();
            repaint();
        });

        add(lInstruction, BorderLayout.PAGE_START);
        add(new JScrollPane(studentsList), BorderLayout.CENTER);
        //TODO: Add Buttons
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(480, 800);
    }
}
