package main.views;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import main.ViewData;

public class RulesScreen extends JFrame {

    JTable j;

    public RulesScreen() {

        // Frame Title 
        setTitle("Rules Description");

        // Data to be displayed in the JTable 
        String[][] data = ViewData.getInstance().rulesInTableFormat();

        // Column Names 
        Font myFont = new Font("Arial", Font.ITALIC | Font.BOLD, 10);
        Font newFont = myFont.deriveFont(15F);

        String[] columnNames = {"No", "Rules", "Penalty (RM)"};

        int[] columnsWidth = {35, 1000, 250};

        // Initializing the JTable 
        j = new JTable(data, columnNames);
        j.setRowHeight(20);
        j.setFont(newFont);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j);
        add(sp);
        int i = 0;
        for (int width : columnsWidth) {
            javax.swing.table.TableColumn column = j.getColumnModel().getColumn(i++);
            column.setMinWidth(width);
            column.setMaxWidth(width);
            column.setPreferredWidth(width);
        }

        // Frame Size 
        setSize(1280, 720);
        JTableHeader header = j.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 20));
        header.setPreferredSize(new Dimension(50, 50));
    }

}
