package main.views;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JPanel;
import main.Navigation;
import main.Navigation.PenaltyFormListener;
import main.ViewData;
import main.models.Student;
import main.util.GUIUtil;

public class StudentsListView extends JPanel {

    private final PenaltyFormListener listener;

    public StudentsListView(PenaltyFormListener listener) {
        // Get the list from our data binding class
        List<Student> students = ViewData.getInstance().getAllStudents();

        // Initialize the listenr
        this.listener = listener;

        GridLayout glStd = GUIUtil.create1ColumnGrid(students.size());
        setLayout(glStd);

        setBorder(GUIUtil.createBorder(GUIUtil.HALF_DEF_MARGIN));

        students.forEach((student) -> {
            revalidate();

            // Add a new Student Panel and display it
            // below the previous one, for all students
            // in students list
            StudentPanel studentItem = new StudentPanel(student);

            if (listener != null) {
                // Penalty form screen, student selection
                studentItem.addMouseListener(studentItemClicked(
                        StudentsListView.this, student));
            }

            add(studentItem);
        });
    }

    private MouseListener studentItemClicked(JPanel pRoot, Student student) {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Navigation.closeWindow(pRoot);

                ViewData.getInstance().penaltySelectedStudent = student;
                listener.onPenaltyStudentSelected();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
    }
}
