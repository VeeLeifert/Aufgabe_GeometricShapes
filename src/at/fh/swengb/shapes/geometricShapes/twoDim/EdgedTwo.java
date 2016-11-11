package at.fh.swengb.shapes.geometricShapes.twoDim;

import at.fh.swengb.shapes.TwoDim;

/**
 * Created by Vee on 11.11.2016.
 */
public abstract class EdgedTwo extends TwoDim {

    protected int a;

    public EdgedTwo(int x, int y, int a) {
        super(x, y);
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

        EdgedTwo edgedTwo = (EdgedTwo) o;

        return a == edgedTwo.a;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + a;
        return result;
    }
}
