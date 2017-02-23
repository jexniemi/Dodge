package fi.jexniemi.logiikka.hahmot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Viholliset ovat pelikentällä ylhäältä alas putoavia olioita, joita pelaajan
 * tulee väistellä.
 *
 * @author jexniemi
 */
public class Vihollinen extends Hahmo {

    /**
     * Konstruktori luo vihollis -olion ja sijoittaa sen pelikentä ylälaidalle.
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

    /**
     * Piirtää vihollisen.
     *
     * @param graphics piirtämistä varten
     */
    public final void piirra(final Graphics graphics) {
        int width = 15;
        int height = 15;
        graphics.setColor(Color.RED);
        int[] xPoints = {(int) getX() - 7, (int) getX(), (int) getX() + 7};
        int[] yPoints = {(int) getY(), (int) getY() + 15, (int) getY()};

        graphics.fillOval((int) getX(), (int) getY(), width, height);
    }

}
