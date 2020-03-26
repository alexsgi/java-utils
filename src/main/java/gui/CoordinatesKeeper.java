package gui;

import java.awt.*;
import java.util.ArrayList;

public class CoordinatesKeeper {

    private double[] x, y;

    private CoordinatesKeeper(double[] xCoordinates, double[] yCoordinates) {
        this.x = xCoordinates;
        this.y = yCoordinates;
    }

    public static CoordinatesKeeper pointsToCoordinates(Point[] points) {
        double[] x = new double[points.length];
        double[] y = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            x[i] = points[i].x;
            y[i] = points[i].y;
        }
        return new CoordinatesKeeper(x, y);
    }

    public static CoordinatesKeeper pointsToCoordinates(ArrayList<Point> points) {
        double[] x = new double[points.size()];
        double[] y = new double[points.size()];
        for (int i = 0; i < points.size(); i++) {
            x[i] = points.get(i).x;
            y[i] = points.get(i).y;
        }
        return new CoordinatesKeeper(x, y);
    }

    public double[] getXCoordinates() {
        return x;
    }

    public double[] getYCoordinates() {
        return y;
    }

}
