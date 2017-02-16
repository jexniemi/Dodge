/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui;

import fi.jexniemi.logiikka.hahmot.Vihollinen;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author jexniemi
 */
public class Timer extends JFrame {

    javax.swing.Timer t;
    ActionListener listener;
    private ArrayList<Vihollinen> viholliset;
    private Component component;
    
    /**
     *
     * @param component
     * @param viholliset
     */
    public Timer(final Component component, final ArrayList<Vihollinen> viholliset) {
        this.viholliset = viholliset;
        
        this.listener = new TimeListener(this.viholliset, this.component);
        t = new javax.swing.Timer(1000, this.listener);
        t.start();
    }
    
}
