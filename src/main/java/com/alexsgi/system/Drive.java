package com.alexsgi.system;

/**
 * @author Alexander Sagorski
 * @since 2.0
 */
public class Drive {

    private String driveName, driveLetter, driveDescription;

    public Drive(String driveName, String driveLetter, String driveDescription) {
        this.driveName = driveName;
        this.driveLetter = driveLetter;
        this.driveDescription = driveDescription;
    }

    public String getDriveName() {
        return driveName;
    }

    public String getDriveLetter() {
        return driveLetter;
    }

    public String getDriveDescription() {
        return driveDescription;
    }

    @Override
    public String toString() {
        return getDriveName();
    }
}
