package at.fh.swengb.shapes.geometricShapes.twoDim;

/**
 * Created by Vee on 11.11.2016.
 */
    public class Kreis extends RoundTwo{

    public Kreis(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public double calcArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return 2*Math.PI*radius;
    }
}
