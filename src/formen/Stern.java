package formen;

import java.awt.*;

public class Stern extends Form {
    private int radius;

    public Stern(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void paint(Graphics g) {
        // Diese Implementierung wird vereinfacht und muss für einen korrekten Stern angepasst werden
        int[] xPoints = new int[10];
        int[] yPoints = new int[10];
        for (int i = 0; i < 10; i++) {
            double angle = Math.toRadians((double) i / 10 * 360);
            int r = (i % 2 == 0) ? radius : radius / 2;
            xPoints[i] = (int) (x + r * Math.cos(angle));
            yPoints[i] = (int) (y + r * Math.sin(angle));
        }
        g.drawPolygon(xPoints, yPoints, 10);
    }
}
