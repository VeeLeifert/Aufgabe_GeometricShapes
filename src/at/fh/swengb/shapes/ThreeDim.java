package at.fh.swengb.shapes;

/**
 * Created by Vee on 11.11.2016.
 */
public abstract class ThreeDim extends GeometricShapes{
    public abstract double calcVol();
    public abstract double calcSurface();

    protected int z;

    public ThreeDim(int x, int y, int z) {
        this.y= y;
        this.x = x;
        this.z = z;

    }





}
