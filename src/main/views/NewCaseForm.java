package main.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NewCaseForm extends JFrame {

    public NewCaseForm() {

        super("Write Warning Report");
        JLabel warning_reason, space, from, To, ouput;

        JTextField namefield, matrixfield, datefield, departmentfield, positionfield, Tname;
        JTextArea warning_reasonfield;

        setLayout(new FlowLayout(FlowLayout.LEFT));

        from = new JLabel("From:                                                                      ", SwingConstants.RIGHT);
        add(from);
        space = new JLabel("                                                                 ");
        add(space);
        space = new JLabel("                                                                 ");
        add(space);

        namefield = new JTextField("Name", 45);
        add(namefield);

        space = new JLabel("        ");
        add(space);
        space = new JLabel("                                                                   ");
        add(space);

        positionfield = new JTextField("Position", 45);
        add(positionfield);

        space = new JLabel("                                                                   ");
        add(space);
        space = new JLabel("  ");
        add(space);

        departmentfield = new JTextField("Deparment", 45);
        add(departmentfield);

        space = new JLabel("                                                                    ");
        add(space);
        space = new JLabel("   ");
        add(space);

        datefield = new JTextField("Date", 45);
        add(datefield);

        space = new JLabel("                                               ");
        add(space);
        space = new JLabel("                                   ");
        add(space);

        To = new JLabel("To:                                                                     ", SwingConstants.RIGHT);
        add(To);

        space = new JLabel("                                                        ");
        add(space);
        space = new JLabel("                                                        ");
        add(space);

        Tname = new JTextField("Student Name", 45);
        add(Tname);

        space = new JLabel("                              ");
        add(space);
        space = new JLabel("                                                  ");
        add(space);

        matrixfield = new JTextField("Student ID", 45);
        add(matrixfield);

        space = new JLabel("                                          ");
        add(space);
        space = new JLabel("                                                  ");
        add(space);

        warning_reason = new JLabel("Waring                                          ", SwingConstants.RIGHT);
        add(warning_reason);
        space = new JLabel("                                                                                     ");
        add(space);
        space = new JLabel("                                                                      ");
        add(space);

        warning_reasonfield = new JTextArea(38, 83);
        String text = "";
        warning_reasonfield.setText("");
        warning_reasonfield.setLineWrap(true);
        warning_reasonfield.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(warning_reasonfield);
        this.add(scrollPane, BorderLayout.CENTER);

        space = new JLabel("                                                  ");
        add(space);
        space = new JLabel("                                                          ");
        add(space);

        JButton bSubmit = new JButton("Submit");
        
        bSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //TODO: Make submit function
            }
        });
        add(bSubmit);

        JButton cancelbut = new JButton("        Cancel        ");
        add(cancelbut);
    }
}
