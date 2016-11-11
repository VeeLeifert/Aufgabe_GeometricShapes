package at.fh.swengb.shapes.geometricShapes.twoDim;

/**
 * Created by Vee on 11.11.2016.
 */
public class Rechteck extends EdgedTwo
{
    protected int b;

    public Rechteck(int x, int y, int a, int b) {
        super(x, y, a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rechteck rechteck = (Rechteck) o;

        return b == rechteck.b;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + b;
        return result;
    }

    @Override
    public double calcArea() {
        return a*b;
    }

    @Override
    public double calcPerimeter() {
        return 2*a + 2*b;
    }
}
