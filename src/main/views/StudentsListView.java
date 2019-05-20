package main.views;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import main.ViewData;
import main.models.Student;
import main.util.GUIUtil;

public class StudentsListView extends JPanel {

    public StudentsListView() {
        // Get the list from our data binding class
        List<Student> students = ViewData.getInstance().getAllStudents();

        GridLayout glStd = GUIUtil.create1ColumnGrid(students.size());
        setLayout(glStd);
        
        setBorder(GUIUtil.createBorder(GUIUtil.HALF_DEF_MARGIN));
        
        students.forEach((student) -> {
            revalidate();

            // Add a new Student Panel and display it
            // below the previous one, for all students
            // in students list
            StudentPanel studentItem = new StudentPanel(student);
            add(studentItem);
        });
    }
}
