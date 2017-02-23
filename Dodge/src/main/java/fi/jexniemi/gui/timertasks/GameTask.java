/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui.timertasks;

import fi.jexniemi.logiikka.hahmot.Pelaaja;
import fi.jexniemi.logiikka.hahmot.Vihollinen;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;

/**
 * Tämä TimerTaskin perivä luokka päivittää pelin ruutua, siirtää vihollisia ja
 * havaitsee kun nämä osuvat pelaajaan.
 *
 * @author jexniemi
 */
public class GameTask extends TimerTask {

    private Timer myTimer;
    private ArrayList<Vihollinen> viholliset;
    private Pelaaja pelaaja;
    private Component component;

    /**
     * Konstruktori.
     *
     * @param myTimer Luokka katkaisee ajastimen kun pelaaja törmää
     * @param viholliset Luokka liikuttaa vihollisia
     * @param setComponent Piirtoalusta ruudunpäivitystä varten
     * @param pelaaja Luokka havaitsee kun pelaaja törmää viholliseen
     */
    public GameTask(final Timer myTimer, final ArrayList<Vihollinen> viholliset, final Pelaaja pelaaja, final Component setComponent) {
        this.myTimer = myTimer;
        this.viholliset = viholliset;
        this.pelaaja = pelaaja;
        this.component = setComponent;
    }

    /**
     * Suoritettava tehtävä.
     */
    public void run() {
        for (Vihollinen vihollinen : this.viholliset) {
            vihollinen.siirry(0, 0.15);
            if (pelaaja.getBounds().intersects(vihollinen.getBounds())) {
                this.myTimer.purge();
                this.myTimer.cancel();
                this.component.setBackground(Color.BLUE);
            }
        }

        component.repaint();
    }
}
