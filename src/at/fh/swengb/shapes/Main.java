package at.fh.swengb.shapes;

import at.fh.swengb.shapes.geometricShapes.threeDim.Kugel;
import at.fh.swengb.shapes.geometricShapes.threeDim.Prisma;
import at.fh.swengb.shapes.geometricShapes.threeDim.Würfel;
import at.fh.swengb.shapes.geometricShapes.twoDim.Hexagon;
import at.fh.swengb.shapes.geometricShapes.twoDim.Kreis;
import at.fh.swengb.shapes.geometricShapes.twoDim.Rechteck;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vee on 11.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        Hexagon hexagon = new Hexagon(2,1,3);
        Kreis kreis = new Kreis(2,3,1);
        Rechteck rechteck = new Rechteck(1,2,5,4);

        List<TwoDim> twoDimList = new ArrayList<>();
        twoDimList.add(hexagon);
        twoDimList.add(kreis);
        twoDimList.add(rechteck);


        double allAreas = 0.0;
        double allPerimeter=0.0;

        for (TwoDim twoDim : twoDimList) {
            allAreas = allAreas + twoDim.calcArea();
            allPerimeter = allPerimeter + twoDim.calcPerimeter();

        }


        Kugel kugel = new Kugel(2,1,3,55) ;
        Würfel würfel = new Würfel(1,7,9,22);
        Prisma prisma = new Prisma(5,4,2,43,4,56,2,33);

        List<ThreeDim> threeDimList = new ArrayList<>();
        threeDimList.add(kugel);
        threeDimList.add(würfel);
        threeDimList.add(prisma);



        double allVol=0.0;
        double allSur=0.0;

        for(ThreeDim threeDim : threeDimList){
            allVol += threeDim.calcVol();
            allSur += threeDim.calcSurface();
        }

        System.out.println("Alle Daten"+"\n"+ allAreas+"\n"+ allPerimeter+"\n"+ allSur+"\n"+ allVol);

    }
}
