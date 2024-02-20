package formen;

import java.awt.*;

public class Rechteck extends Parallelogramm {
    private int width;
    private int height;

    public Rechteck(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}
