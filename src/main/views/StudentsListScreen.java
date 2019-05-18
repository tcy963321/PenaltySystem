package main.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.GUIUtil;
import main.ViewData;
import main.models.Student;

public class StudentsListScreen extends JFrame {

    private JPanel studentsListView;

    public StudentsListScreen() {
        // Get the list from our data binding class
        List<Student> students = ViewData.getInstance().getAllStudents();

        // Display the students scrolling pane
        // And the instruction label
        setLayout(new BorderLayout());

        // Instruction label
        JLabel lInstruction = new JLabel("Select a student:");
        lInstruction.setBorder(GUIUtil.createHorzBorder(GUIUtil.DEFAULT_MARGIN));
        lInstruction.setBackground(Color.cyan);
        lInstruction.setOpaque(true);

        // Put all student panels into a scrollable panel
        GridLayout glStd = GUIUtil.create1ColumnGrid(students.size());
        studentsListView = new JPanel(glStd);
        // Add padding
        studentsListView.setBorder(GUIUtil.createBorder(GUIUtil.HALF_DEF_MARGIN));

        students.forEach((student) -> {
            studentsListView.revalidate();

            // Add a new Student Panel and display it
            // below the previous one, for all students
            // in students list
            StudentPanel studentItem = new StudentPanel(student);
            studentsListView.add(studentItem, BorderLayout.CENTER);
        });

        JScrollPane studentsPane = new JScrollPane(studentsListView);
        studentsPane.setPreferredSize(new Dimension(300, 600));

        add(lInstruction, BorderLayout.PAGE_START);
        add(studentsPane, BorderLayout.CENTER);
        //TODO: Add Buttons
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(480, 800);
    }
}
