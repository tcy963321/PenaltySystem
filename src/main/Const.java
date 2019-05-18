package main;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Const {

    public static final int OUTER_MARGIN = 20;

    public static final Border DEFAULT_BORDER
            = BorderFactory.createEmptyBorder(OUTER_MARGIN, OUTER_MARGIN, OUTER_MARGIN, OUTER_MARGIN);

    public static final Border BLACK_BORDER =
            BorderFactory.createLineBorder(Color.black);
    
    public static final Border BLACK_SPACED_BORDER
            = BorderFactory.createCompoundBorder(BLACK_BORDER, DEFAULT_BORDER);
    
    public static final BorderLayout BORDER_LAY_VGAP = new BorderLayout(0, 4);

    private Const() {
    }
}
