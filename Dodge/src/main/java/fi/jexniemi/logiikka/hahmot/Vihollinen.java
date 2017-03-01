package fi.jexniemi.logiikka.hahmot;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Viholliset ovat pelikentällä ylhäältä alas putoavia olioita, joita pelaajan
 * tulee väistellä.
 *
 * @author jexniemi
 */
public class Vihollinen extends Hahmo {

    /**
     * Konstruktori luo vihollis -olion ja sijoittaa sen pelikentän ylälaidalle.
     * X:n arvo on sattumanvarainen.
     *
     * @param x set X
     * @param y set Y
     * @param pelinLeveys set pelinLeveys
     * @param pelinKorkeus set pelinKorkeus
     */
    public Vihollinen(final int x, final int y, final int pelinLeveys, final int pelinKorkeus) {
        super(x, y, pelinLeveys, pelinKorkeus);
        Random r = new Random();
        this.x = r.nextInt(500);
    }

}
