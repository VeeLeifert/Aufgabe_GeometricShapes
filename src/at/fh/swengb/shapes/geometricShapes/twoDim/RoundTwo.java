package at.fh.swengb.shapes.geometricShapes.twoDim;

import at.fh.swengb.shapes.ThreeDim;
import at.fh.swengb.shapes.TwoDim;

/**
 * Created by Vee on 11.11.2016.
 */
public abstract class RoundTwo extends TwoDim {

    protected int radius;

    public RoundTwo(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RoundTwo roundTwo = (RoundTwo) o;

        return radius == roundTwo.radius;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + radius;
        return result;
    }
}
