package com.alexsgi.system;

/**
 * @author Alexander Sagorski
 * @since 2.0
 */
public class SystemInfo {

    public static Drive[] getAllDrives() {
        javax.swing.filechooser.FileSystemView fsv = javax.swing.filechooser.FileSystemView.getFileSystemView();
        java.io.File[] paths = java.io.File.listRoots();
        Drive[] drives = new Drive[paths.length];
        for (int i = 0; i < paths.length; i++) {
            drives[i] = new Drive(fsv.getSystemDisplayName(paths[i]), paths[i].getAbsolutePath(), fsv.getSystemTypeDescription(paths[i]));
        }
        return drives;
    }

}
