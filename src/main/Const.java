package main;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Const {
    
    public static final int OUTER_MARGIN = 20;
    public static final Border DEFAULT_BORDER =
            BorderFactory.createEmptyBorder(OUTER_MARGIN, OUTER_MARGIN, OUTER_MARGIN, OUTER_MARGIN);

    private Const() {
    }
}
