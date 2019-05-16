package main.views;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * OK Button (right) and cancel button (left) for most screens
 */
public class TwoButtons extends JPanel {

    private JButton bOk, bCancel;

    public TwoButtons() {

        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        setBorder(BorderFactory.createEmptyBorder(0, 16, 16, 16));
        add(Box.createHorizontalGlue());
        add(bCancel);
        add(Box.createRigidArea(new Dimension(16, 0)));
        add(bOk);
    }
}
