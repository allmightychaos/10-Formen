package formen;

import java.awt.*;

public class Raute extends Quadrilateral {
    private int diagonaleX;
    private int diagonaleY;

    public Raute(int x, int y, int diagonaleX, int diagonaleY) {
        super(x, y);
        this.diagonaleX = diagonaleX;
        this.diagonaleY = diagonaleY;
    }

    @Override
    public void paint(Graphics g) {
        int[] xPoints = {x, x + diagonaleX / 2, x, x - diagonaleX / 2};
        int[] yPoints = {y - diagonaleY / 2, y, y + diagonaleY / 2, y};
        g.drawPolygon(xPoints, yPoints, 4);
    }
}
