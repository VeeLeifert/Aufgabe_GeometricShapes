package at.fh.swengb.shapes.geometricShapes.threeDim;

/**
 * Created by Vee on 11.11.2016.
 */
public class Prisma extends EdgedThree {
    protected int a;
    protected int b;
    protected int c;
    protected int h;


    public Prisma(int x, int y, int z, int a, int a1, int b, int c, int h) {
        super(x, y, z, a);
        this.a = a1;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Prisma prisma = (Prisma) o;

        if (a != prisma.a) return false;
        if (b != prisma.b) return false;
        if (c != prisma.c) return false;
        return h == prisma.h;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + a;
        result = 31 * result + b;
        result = 31 * result + c;
        result = 31 * result + h;
        return result;
    }

    @Override
    public double calcVol() {
        return ((a*b)/2)*h;
    }

    @Override
    public double calcSurface() {
        return 2*((a+b+c)*h)+(a*b)/2;
    }
}
