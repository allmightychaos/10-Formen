package formen;

import java.awt.*;

public class Trapez extends Quadrilateral {
    private int obereBreite;
    private int untereBreite;
    private int hoehe;

    public Trapez(int x, int y, int obereBreite, int untereBreite, int hoehe) {
        super(x, y);
        this.obereBreite = obereBreite;
        this.untereBreite = untereBreite;
        this.hoehe = hoehe;
    }

    @Override
    public void paint(Graphics g) {
        int[] xPoints = {x, x + obereBreite, x + untereBreite, x};
        int[] yPoints = {y, y, y + hoehe, y + hoehe};
        g.drawPolygon(xPoints, yPoints, 4);
    }
}
