package formen;

import java.awt.*;

public class Sechseck extends Polygon {
    private int seitenlaenge;

    public Sechseck(int x, int y, int seitenlaenge) {
        super(x, y, 6);
        this.seitenlaenge = seitenlaenge;
    }

    @Override
    public void paint(Graphics g) {
        int[] xPoints = new int[6];
        int[] yPoints = new int[6];
        for (int i = 0; i < 6; i++) {
            xPoints[i] = (int) (x + seitenlaenge * Math.cos(i * 2 * Math.PI / 6));
            yPoints[i] = (int) (y + seitenlaenge * Math.sin(i * 2 * Math.PI / 6));
        }
        g.drawPolygon(xPoints, yPoints, 6);
    }
}
