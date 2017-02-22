/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui.TimerTasks;

import fi.jexniemi.logiikka.hahmot.Pelaaja;
import fi.jexniemi.logiikka.hahmot.Vihollinen;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.TimerTask;
 import java.awt.Toolkit;
import java.util.Timer;

/**
 *
 * @author jexniemi
 */
public class GameTask extends TimerTask {
    private Timer myTimer;
    private ArrayList<Vihollinen> viholliset;
    private Pelaaja pelaaja;
    private Component component;

    /**
     *
     * @param viholliset
     * @param setComponent
     */
    public GameTask(final Timer myTimer, final ArrayList<Vihollinen> viholliset, final Pelaaja pelaaja, final Component setComponent) {
        this.myTimer = myTimer;
        this.viholliset = viholliset;
        this.pelaaja = pelaaja;
        this.component = setComponent;
    }

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
