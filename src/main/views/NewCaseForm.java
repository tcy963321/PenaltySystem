package main.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import main.Navigation;
import main.ViewData;
import main.models.Rule;
import main.models.Student;
import main.util.GUIUtil;

public class NewCaseForm extends JFrame implements Navigation.PenaltyFormListener {

    JLabel lForm, lName, lPosition, lDepartment, lDate, lTo, lStudent, lChosenStudent, lStudentId, lWarning, lRulesTitle;
    JTextField tfName, tfPosition, tfDepartment, tfDate, tfStudentName, tfStudentId;
    JTextArea tfWarning;
    JPanel panel1, ruleRows, rootPanel;
    JButton bChooseStudent;

    public NewCaseForm() {
        setTitle("New Penalty");
        setLayout(GUIUtil.createBorderLay(0, 0));

        rootPanel = new JPanel();
        rootPanel.setLayout(GUIUtil.simpleVerticalLay(rootPanel));

        panel1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panel1.setPreferredSize(new Dimension(250, 500));

        lForm = new JLabel("Create a Penalty Letter");
        lForm.setFont(new Font("Serif", Font.BOLD, 36));
        lForm.setAlignmentX(CENTER_ALIGNMENT);
        lName = new JLabel("Name:");
        lName.setFont(new Font("Serif", Font.BOLD, 14));
        lPosition = new JLabel("Position:");
        lPosition.setFont(new Font("Serif", Font.BOLD, 14));
        lDepartment = new JLabel("Department:");
        lDepartment.setFont(new Font("Serif", Font.BOLD, 14));
        lDate = new JLabel("Date:");
        lDate.setFont(new Font("Serif", Font.BOLD, 14));
        lTo = new JLabel("To:");
        lTo.setFont(new Font("Serif", Font.BOLD, 20));
        lStudent = new JLabel("Student:");
        lStudent.setFont(new Font("Serif", Font.BOLD, 14));
        lChosenStudent = new JLabel("*None");
        lChosenStudent.setFont(new Font("Serif", Font.BOLD, 14));
        lStudentId = new JLabel("Student ID:");
        lStudentId.setFont(new Font("Serif", Font.BOLD, 14));
        lWarning = new JLabel("Warning:");
        lWarning.setFont(new Font("Serif", Font.BOLD, 14));

        tfName = new JTextField(40);
        tfPosition = new JTextField(40);
        tfDepartment = new JTextField(40);
        tfDate = new JTextField(40);
        tfStudentName = new JTextField(40);
        tfStudentId = new JTextField(40);
        tfWarning = new JTextArea(40, 90);
        bChooseStudent = new JButton("Select Student");
        
        // Opens the student list dialog where admin can select a student
        bChooseStudent.addActionListener((ActionEvent e) -> {
            Navigation.showSelectStudentDialog(this);
        });

        panel1.add(lName);
        panel1.add(tfName);
        panel1.add(GUIUtil.space(160));
        panel1.add(lPosition);
        panel1.add(tfPosition);
        panel1.add(GUIUtil.space(160));
        panel1.add(lDepartment);
        panel1.add(tfDepartment);
        panel1.add(GUIUtil.space(150));
        panel1.add(lDate);
        panel1.add(tfDate);
        panel1.add(GUIUtil.space(170));
        panel1.add(lTo);
        //TODO: Make To a droplist
        panel1.add(tfStudentName);
        panel1.add(GUIUtil.space(160));
        panel1.add(lStudent);
        panel1.add(bChooseStudent);
        panel1.add(lChosenStudent);
        panel1.add(GUIUtil.space(250));
        panel1.add(lWarning);
        panel1.add(tfWarning);

        lRulesTitle = new JLabel("Rules Broken:");
        lRulesTitle.setFont(new Font("Serif", Font.BOLD, 20));
        lRulesTitle.setAlignmentX(CENTER_ALIGNMENT);

        List<Rule> rules = ViewData.getInstance().getAllRules();
        RuleRowsPanel pCalculation = new RuleRowsPanel(rules);

        ruleRows = new JPanel(new BorderLayout());
        ruleRows.add(pCalculation, BorderLayout.CENTER);

        rootPanel.add(lForm);
        rootPanel.add(panel1);
        rootPanel.add(lRulesTitle);
        rootPanel.add(ruleRows);

        JScrollPane spRules = new JScrollPane(rootPanel);
        add(spRules, BorderLayout.CENTER);
    }

    @Override
    public Dimension getPreferredSize() {
        //TODO: Fix warning
        return new Dimension(1050, 900);
    }

    @Override
    public void onPenaltyStudentSelected() {
        Student student = ViewData.getInstance().penaltySelectedStudent;
        if (student != null) {
            lChosenStudent.setText(student.getFullName());
        } else {
            lChosenStudent.setText("*None selected");
        }
    }
}
