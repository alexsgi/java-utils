package system;

import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class SystemInfo {

    public static Drive[] getAllDrives() {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File[] paths = File.listRoots();
        Drive[] drives = new Drive[paths.length];
        for (int i = 0; i < paths.length; i++) {
            drives[i] = new Drive(fsv.getSystemDisplayName(paths[i]), paths[i].getAbsolutePath(), fsv.getSystemTypeDescription(paths[i]));
        }
        return drives;
    }

}
