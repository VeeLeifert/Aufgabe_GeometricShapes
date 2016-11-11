package at.fh.swengb.shapes.geometricShapes.twoDim;

/**
 * Created by Vee on 11.11.2016.
 */
public class Hexagon extends EdgedTwo {

    public Hexagon(int x, int y, int a) {
        super(x, y, a);
    }


    @Override
    public double calcArea() {
        return a*a*(3/2)*Math.sqrt(3);
    }

    @Override
    public double calcPerimeter() {
        return 6*a;
    }
}
