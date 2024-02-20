package formen;

import java.awt.*;

public class Ellipse extends Form {
    private int breite;
    private int hoehe;

    public Ellipse(int x, int y, int breite, int hoehe) {
        super(x, y);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(x, y, breite, hoehe);
    }
}
