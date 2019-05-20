package main.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Class to store constants and utility methods
 */
public class GUIUtil {

    public static final int DEFAULT_MARGIN = 20;
    public static final int HALF_DEF_MARGIN = DEFAULT_MARGIN / 2;
    public static final int SMALL_MARGIN = 4;
    public static final int TINY_MARGIN = 2;

    public static Border createBorder(int margin) {
        return BorderFactory.createEmptyBorder(margin, margin, margin, margin);
    }

    public static Border createHorzBorder(int margin) {
        return BorderFactory.createEmptyBorder(0, margin, 0, margin);
    }

    public static Border createBlackBorder(int margin) {
        return BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.black),
                createBorder(margin));
    }

    public static Border createRaisedBorder(int margin) {
        return BorderFactory.createCompoundBorder(
                BorderFactory.createRaisedBevelBorder(),
                createBorder(margin));
    }

    public static BorderLayout createBorderLay(int horGap, int verGap) {
        return new BorderLayout(horGap, verGap);
    }
    
    public static BoxLayout simpleVerticalLay(JPanel panel) {
        return new BoxLayout(panel, BoxLayout.Y_AXIS);
    }

    public static GridLayout create1ColumnGrid(int rows) {
        return new GridLayout(rows, 1, 0, 4);
    }
    
    public static GridLayout create2ColumnGrid(int rows) {
        return new GridLayout(rows, 2, 0, 4);
    }
    
    public static JLabel space(int length) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            sb.append(" ");
        }
        return new JLabel(sb.toString());
    }

    private GUIUtil() {
    }
}
