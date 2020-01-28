package storage;

import java.io.*;
import java.util.Properties;

/**
 * @author Alexander Sagorski
 * @version 1.0
 * @since 1.0
 */
public final class PropertyManager {

    private PropertyManager() {
    }

    public static void storeInFile(Properties property, File file) throws IOException {
        property.store(new FileOutputStream(file), null);
    }

    public static Properties loadFromFile(File file) throws IOException {
        Properties temp = new Properties();
        InputStream inputStream = new FileInputStream(file);
        temp.load(inputStream);
        return temp;
    }

}
