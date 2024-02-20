package formen;

import javax.swing.*;
import java.awt.*;

public class FormenPanel extends JPanel {
    private Form[] formen;

    public FormenPanel() {
        formen = new Form[]{
                new Rechteck(10, 10, 100, 50),
                new Quadrat(120, 10, 50),
                new Kreis(200, 35, 25),
                new Trapez(240, 20, 50, 70, 40),
                new Dreieck(340, 10, 50, 50),
                new Sechseck(400, 35, 30),
                new Raute(470, 35, 60, 30),
                new Stern(530, 35, 30),
                new Ellipse(570, 10, 80, 40)
        };
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Form form : formen) {
            if (form != null)
                form.paint(g);
        }
    }
}