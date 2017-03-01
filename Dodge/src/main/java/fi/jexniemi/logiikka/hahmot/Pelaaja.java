package fi.jexniemi.logiikka.hahmot;

import java.awt.Color;
import java.awt.Graphics;

/**
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

}
