package main.dataaccess;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class RootDA {

    public static final String ROOT_PATH = FileUtils.getUserDirectoryPath()
            + File.separator + "Documents" + File.separator + "PenaltySystem"
            + File.separator;
    
    private RootDA() {
    }

    /**
     * Create directory to store the penalty system's data
     */
    public static void createRootDirectory() {
        // if root directory doesn't exist, create it
        File rootDir = new File(ROOT_PATH);

        if (rootDir.exists()) {
            System.out.println(rootDir + " already exists");
        } else if (rootDir.mkdirs()) {
            System.out.println(rootDir + " was created");
        } else {
            System.out.println(rootDir + " was not created");
        }
    }
}
