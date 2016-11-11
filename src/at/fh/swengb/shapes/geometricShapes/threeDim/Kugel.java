package at.fh.swengb.shapes.geometricShapes.threeDim;

/**
 * Created by Vee on 11.11.2016.
 */
public class Kugel extends RoundThree {

    public Kugel(int x, int y, int z, int radius) {
        super(x, y, z, radius);
    }

    @Override
    public double calcVol() {
        return (4/3)*Math.PI*(radius*radius);
    }

    @Override
    public double calcSurface() {
        return 4*radius*Math.PI;
    }
}
