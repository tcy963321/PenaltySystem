package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 * Class to store constants and utility methods
 */
public class Const {

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

    public static GridLayout create1ColumnGrid(int rows) {
        return new GridLayout(rows, 1, 0, 4);
    }

    private Const() {
    }
}
