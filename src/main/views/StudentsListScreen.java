package main.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import main.util.GUIUtil;
import main.ViewData;
import main.models.Student;

public class StudentsListScreen extends JFrame {

    public StudentsListScreen() {
        super("List of Students");
        // Get the list from our data binding class
        List<Student> students = ViewData.getInstance().getAllStudents();

        // Display the students scrolling pane
        // And the instruction label
        setLayout(new BorderLayout());

        // Instruction label
        JLabel lInstruction = new JLabel("All students recorded so far:");
        lInstruction.setBorder(GUIUtil.createBorder(GUIUtil.DEFAULT_MARGIN));

        StudentsListView studentsListView = new StudentsListView(null);

        JScrollPane studentsPane = new JScrollPane(studentsListView);
        //studentsPane.setPreferredSize(new Dimension(300, 600));

        add(lInstruction, BorderLayout.PAGE_START);
        add(studentsPane, BorderLayout.CENTER);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(480, 800);
    }
}
