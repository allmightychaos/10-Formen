package formen;

import java.awt.*;

public class Dreieck extends Polygon {
    private int base;
    private int height;

    public Dreieck(int x, int y, int base, int height) {
        super(x, y, 3);
        this.base = base;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {
        int[] xPoints = {x, x + base / 2, x - base / 2};
        int[] yPoints = {y, y + height, y + height};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
