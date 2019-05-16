package main.views;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.models.Student;

public class StudentsListScreen extends JPanel {
    
    private List<StudentPanel> studentPanels;

    public StudentsListScreen(List<Student> students) {

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        JScrollPane studentsPane = new JScrollPane();

        students.forEach((student) -> {
            // Add a new Student Panel and display it
            // below the previous one, for all students
            // in students list
            StudentPanel studentItem = new StudentPanel(student);
            add(studentItem, BorderLayout.CENTER);
        });
    }
}
