/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui.TimerTasks;

import fi.jexniemi.logiikka.hahmot.Vihollinen;
import java.awt.Component;
import java.util.ArrayList;
import java.util.TimerTask;

/**
 *
 * @author jexniemi
 */
public class EnemyGeneratorTask extends TimerTask {

    private ArrayList<Vihollinen> viholliset;
    private Component component;

    /**
     *
     * @param viholliset
     * @param setComponent
     */
    public EnemyGeneratorTask(final ArrayList<Vihollinen> viholliset, final Component setComponent) {
        this.viholliset = viholliset;
        this.component = setComponent;
    }

    public void run() {
        this.viholliset.add(new Vihollinen(0, -10, 500, 500));
    }
}
