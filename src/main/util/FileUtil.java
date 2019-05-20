package main.util;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import main.dataaccess.RootDA;
import org.apache.commons.io.FileUtils;

public class FileUtil {

    public static final String IMG_PATH = "img" + File.separator;

    public static final String LOGO_PATH = FileUtil.IMG_PATH + "logo1.jpg";
    public static final String PIC1_PATH = FileUtil.IMG_PATH + "Picture1.png";
    public static final String PIC2_PATH = FileUtil.IMG_PATH + "Picture2.png";
    public static final String PIC3_PATH = FileUtil.IMG_PATH + "Picture3.png";
    public static final String PIC4_PATH = FileUtil.IMG_PATH + "Picture4.png";

    public static final String DOC_PATH = "report" + File.separator;

    public static void writeToTxtFile(String fileName, String data) {
        try {
            FileUtils.writeStringToFile(new File(DOC_PATH + fileName + ".txt"), data, RootDA.UTF8);

            JOptionPane.showMessageDialog(null, "Save successful");

        } catch (IOException ex) {
            System.out.println("Cannot write " + fileName + ": " + ex.getMessage());
        }
    }
}
