package formen;

import java.awt.*;

public class Kreis extends Form {
    private int radius;

    public Kreis(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}
