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
import java.util.HashSet;

public class NappaimistonKuuntelija implements KeyListener {

    private Pelaaja pelaaja;
    private Component component;

    public NappaimistonKuuntelija(Pelaaja hahmo, Component component) {
        this.pelaaja = hahmo;
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            pelaaja.siirry(-2, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            pelaaja.siirry(2, 0);
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            pelaaja.setVauhti(0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            pelaaja.setVauhti(0);
        }        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}
