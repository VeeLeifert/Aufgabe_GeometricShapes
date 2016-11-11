package at.fh.swengb.shapes;

/**
 * Created by Vee on 11.11.2016.
 */
public abstract class TwoDim extends GeometricShapes{
    public abstract double calcArea();
    public abstract double calcPerimeter();

    public TwoDim(int x, int y) {
        this.y= y;
        this.x = x;
    }
}
