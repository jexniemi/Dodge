/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui;

import fi.jexniemi.logiikka.hahmot.Vihollinen;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.swing.text.StyleConstants.setComponent;

/**
 *
 * @author jexniemi
 */
public class TimeListener implements ActionListener {
    private ArrayList<Vihollinen> viholliset;
    private Component component;
    
    /**
     *
     * @param viholliset
     * @param setComponent
     */
    public TimeListener(final ArrayList<Vihollinen> viholliset, final Component setComponent) {
        this.viholliset = viholliset;
        this.component = setComponent;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.viholliset.add(new Vihollinen(0, -10, 500, 500));
        for (Vihollinen vihollinen : this.viholliset) {
            vihollinen.siirry(0, 10);
        }
        
            }
}
