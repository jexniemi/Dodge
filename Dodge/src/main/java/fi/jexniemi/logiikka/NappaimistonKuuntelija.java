/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.logiikka;

/**
 *
 * @author jexniemi
 */
import fi.jexniemi.logiikka.hahmot.Pelaaja;
import fi.jexniemi.gui.*;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class NappaimistonKuuntelija implements KeyListener {

    private Pelaaja hahmo;
    private Component component;

    public NappaimistonKuuntelija(Pelaaja hahmo, Component component) {
        this.hahmo = hahmo;
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hahmo.siirry(-8, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hahmo.siirry(8, 0);
        }
        
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}
