package at.fh.swengb.shapes.geometricShapes.threeDim;

import at.fh.swengb.shapes.ThreeDim;

/**
 * Created by Vee on 11.11.2016.
 */
public abstract class RoundThree extends ThreeDim {

    protected int radius;

    public RoundThree(int x, int y,int z, int radius) {
        super(x, y, z);
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

        RoundThree that = (RoundThree) o;

        return radius == that.radius;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + radius;
        return result;
    }
}
