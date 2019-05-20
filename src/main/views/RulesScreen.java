package main.views;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class RulesScreen extends JFrame {

    JTable j;

    public RulesScreen() {

        // Frame Title 
        setTitle("Rules Description");

        // Data to be displayed in the JTable 
        String[][] data = {
            {"1", "BILIK KOTOR", "SURAT AMARAN"},
            {"2", "BILIK TIDAK KEMAS DAN BERSELERAK SEMASA PEMERIKSAAN BILIK DIBUAT", "SURAT AMARAN"},
            {"3", "KEHILANGAN KUNCI BILIK", "SURAT AMARAN"},
            {"4", "MENJEMUR/MENYADAI PAKAIAN BASAH DI DALAM BILIK, TINGKAP, BILIK REHAT", "SURAT AMARAN"},
            {"5", "MEMBAWA/MENGABIL/MENGALIH ALAT-ALAT KEMUDAHAN PERABOT TANPA KEBENARAN", "SURAT AMARAN"},
            {"6", "MEMBIARKAN KASUT-KASUT/ SELIPAR BERSEPAH DI LUAR BILIK (SEPASANG)", "SURAT AMARAN"},
            {"7", "MEMBUANG SISA MAKANAN DAN MINUMAN YANG HARAM DI SISI AGAMA ISLAM", "SURAT AMARAN"},
            {"8", "MEMBUANG SAMPAH/ OBJEK DARI TINGKAT ATAS KE TINGKAT BAWAH", "SURAT AMARAN"},
            {"9", "MEMCONTENG PERMUKAAN PREMIS: 1 KAKI PERSEGI", "SURAT AMARAN"},
            {"10", "TIDAK MELAPORKAN KEROSAKAN YANG MENDATANGKAN MUDARAT KE DALAM BILIK KEDIAMAN", "SURAT AMARAN"},
            {"11", "KEROSAKAN TILAM", "50"},
            {"12", "KEROSAKAN SHOWER", "50"},
            {"13", "KEROSAKAN LAMPU", "50"},
            {"14", "KEROSAKAN TOMBOL", "50"},
            {"15", "LELAKI YANG DIDAPATI BERADA DI ASRAMA PEREMPUAN(KECUALI STAF ASRAMA UNIVERSITY)", "50"},
            {"16", "MEMILIKI DAPUR MINYAK, RICE COOKER", "50"},
            {"17", "MEMILIKI HOT PLATE, HEATER COIL", "50"},
            {"18", "MENAMPAL POSTER ATAU INKAN TANPA KEBENARAN", "50"},
            {"19", "MEMASAKAN DALAM BILIK", "50"},
            {"20", "MENYIMPAN MOTOSIKAL/ BASIKAL DI DALAM BIKIL/ BLOK", "50"},
            {"21", "MEMILIKI/ MEMBAWA SENJATA TAJAM", "50"},
            {"22", "MEMBELA HAIWAN", "50"},
            {"23", "MENGUCAPKAN/ MENGELUARKAN KATA-KATA KESAT", "50"},
            {"24", "MEMBUAT SALINAN KUNCI BILIK", "50"},
            {"25", "MEMECAHKAN CERMIN MUKA BILIK MANDI", "50"},
            {"26", "KEROSAKAN LANGSIR", "100"},
            {"27", "KEROSAKAN KATIL, ALMARI, KERUSI DAN MEJA (SETIAP SATU)", "100"},
            {"28", "KEROSAKAN KIPAS", "100"},
            {"29", "MENGHISAP ROROK", "100"},
            {"30", "MEMANJAT TINGKAP BILIK/ PAGAR", "100"},
            {"31", "MEMGGUNAKAN GELANGGAN FUTSAL SELEPAS JAM 12.00 TEHGAH MALAM", "100"},
            {"32", "MEMBAWA DAN MENGGUNAKAN BARANGAN ELEKTRIK YANG TIDAK DIBERNARKAN", "100"},
            {"33", "MEMBUAT GANGGUAN SEPERTI BISING/ LAIN-LAIN", "100"},
            {"34", "TIDAK PAMER PELEKAT KENDERAAN", "100"},
            {"35", "KEROSAKAN PINTU", "300"},};

        // Column Names 
        Font myFont = new Font("Arial", Font.ITALIC | Font.BOLD, 10);
        Font newFont = myFont.deriveFont(15F);

        String[] columnNames = {"No", "Rules", "Penalty (RM)/ Surat Amaran"};

        int[] columnsWidth = {35, 1640, 250};

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
        setSize(1925, 500);
        // Frame Visible = true 
        setVisible(true);
        JTableHeader header = j.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 15));
        header.setPreferredSize(new Dimension(50, 50));
        // setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("./logo1.jfif");
        setIconImage(img.getImage());
    }

}
