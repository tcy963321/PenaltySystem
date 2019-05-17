package main.views;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import main.Const;

/**
 * OK Button (right) and cancel button (left) for most screens
 */
public class TwoButtons extends JPanel {

    private JButton bOk, bCancel;

    public TwoButtons() {

        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        setBorder(Const.DEFAULT_BORDER);
        add(Box.createHorizontalGlue());
        add(bCancel);
        add(Box.createRigidArea(new Dimension(16, 0)));
        add(bOk);

        //TODO: Display sutdent list with boxlayout / gridlayout
    }
}
