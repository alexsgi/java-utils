package com.alexsgi.io.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author Alexander Sagorski
 * @since 2.2
 */
public class ScreenTools {

    private static final String PNG_SUFFIX = "png";
    private static final String JPEG_SUFFIX = "jpeg";

    public static File takeScreenshot(File file) throws IOException, AWTException {
        return takePNGScreenshot(file);
    }

    public static File takePNGScreenshot(File file) throws IOException, AWTException {
        if (!file.getName().endsWith("." + PNG_SUFFIX)) file = new File(file.getAbsolutePath() + "." + PNG_SUFFIX);
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, PNG_SUFFIX, file);
        return new File(file.getAbsolutePath());
    }

    public static File takeJPEGScreenshot(File file) throws IOException, AWTException {
        if (!file.getName().endsWith("." + JPEG_SUFFIX)) file = new File(file.getAbsolutePath() + "." + JPEG_SUFFIX);
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, JPEG_SUFFIX, file);
        return new File(file.getAbsolutePath());
    }

    public static void takeScreenshots(File path, int amount, int delay) throws Exception {
        for (int i = 0; i < amount; i++) {
            String fileName = String.format("%s%d.png", path.getAbsolutePath() + ((!path.getAbsolutePath().endsWith("\\") ? "\\" : "")), i);
            takeScreenshot(new File(fileName));
            Thread.sleep(delay);
        }
    }

    public static void takeScreenshots(File path, int amount, int delay, boolean inNewThread) throws Exception {
        if (!inNewThread) {
            takeScreenshots(path, amount, delay);
        } else {
            new Thread(() -> {
                try {
                    takeScreenshots(path, amount, delay);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
