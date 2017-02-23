/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui.timertasks;

import fi.jexniemi.logiikka.hahmot.Vihollinen;
import java.awt.Component;
import java.util.ArrayList;
import java.util.TimerTask;

/**
 * Tämä TimerTaskin perivä luokka lisää vihollisia listaan kun ajastin suorittaa
 * tämän.
 *
 * @author jexniemi
 */
public class EnemyGeneratorTask extends TimerTask {

    private ArrayList<Vihollinen> viholliset;

    /**
     * Konstruktori.
     *
     * @param viholliset Lista vihollisista, jotta siihen voidaan lisätä uusia
     */
    public EnemyGeneratorTask(final ArrayList<Vihollinen> viholliset) {
        this.viholliset = viholliset;
    }

    /**
     * Suoritettava tehtävä.
     */
    public void run() {
        this.viholliset.add(new Vihollinen(0, -10, 500, 500));
    }
}
