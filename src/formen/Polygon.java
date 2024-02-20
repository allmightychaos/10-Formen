package formen;

public abstract class Polygon extends Form {
    protected int seiten;

    public Polygon(int x, int y, int seiten) {
        super(x, y);
        this.seiten = seiten;
    }
}
