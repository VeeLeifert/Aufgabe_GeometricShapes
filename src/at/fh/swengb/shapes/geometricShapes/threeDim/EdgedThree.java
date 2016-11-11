package at.fh.swengb.shapes.geometricShapes.threeDim;

import at.fh.swengb.shapes.ThreeDim;

/**
 * Created by Vee on 11.11.2016.
 */
public abstract class EdgedThree extends ThreeDim{

    protected int a;

    public EdgedThree(int x, int y, int z, int a) {
        super(x, y, z);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EdgedThree that = (EdgedThree) o;

        return a == that.a;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + a;
        return result;
    }
}
