package fi.jexniemi.logiikka.hahmot;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Set;
import java.awt.Rectangle;

/**
 * .
 * Tästä luokasta luodaan pelikentällä liikkuva hahmo, joka on pelaajan
 * ohjattavissa.
 *
 * @author jexniemi
 */
public class Pelaaja extends Hahmo {

    /**
     * Konstruktori.
     *
     * @param x aseta x
     * @param y aseta y
     * @param pelinLeveys aseta pelinLeveys
     * @param pelinKorkeus aseta pelinKorkeus
     */
    public Pelaaja(final double x, final double y, final int pelinLeveys, final int pelinKorkeus) {
        super(x, y, pelinLeveys, pelinKorkeus);
    }

    /**
     * Piirtää pelihahmon haluttuun sijaintiin kentällä.
     *
     * @param graphics piirtämistä varten
     */
    public final void piirra(final Graphics graphics) {
        int width = 15;
        int height = 15;
        graphics.setColor(Color.WHITE);

//        int[] xPoints = {(int) getX() - 7, (int) getX(), (int) getX() + 7};
//        int[] yPoints = {(int) getY(), (int) getY() -15, (int) getY()};
//        graphics.fillPolygon(xPoints, yPoints, 3);
        graphics.fillOval((int) getX(), (int) getY(), width, height);
    }

}
