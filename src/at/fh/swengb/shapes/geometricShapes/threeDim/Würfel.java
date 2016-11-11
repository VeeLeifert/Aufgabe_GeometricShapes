package at.fh.swengb.shapes.geometricShapes.threeDim;

/**
 * Created by Vee on 11.11.2016.
 */
public class Würfel extends EdgedThree {
    public Würfel(int x, int y, int z, int a) {
        super(x, y, z, a);
    }

    @Override
    public double calcVol() {
        return a*a*a;
    }

    @Override
    public double calcSurface() {
        return 6*(a*a);
    }
}
