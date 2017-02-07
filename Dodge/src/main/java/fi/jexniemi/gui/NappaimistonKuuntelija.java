package fi.jexniemi.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Kuuntelee näppäimistöä
 *
 * @author jexniemi
 */
import fi.jexniemi.logiikka.hahmot.Pelaaja;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class NappaimistonKuuntelija implements KeyListener {

    private Pelaaja pelaaja;
    private Component component;

    public NappaimistonKuuntelija(final Pelaaja setHahmo, final Component setComponent) {
        this.pelaaja = setHahmo;
        this.component = setComponent;
    }

    @Override
    public final void keyPressed(final KeyEvent e) {
        double left = -2;
        double right = 2;

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            pelaaja.siirry(left, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            pelaaja.siirry(right, 0);
        }
        component.repaint();
    }

    @Override
    public final void keyReleased(final KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            pelaaja.setVauhti(0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            pelaaja.setVauhti(0);
        }
    }

    @Override
    public final void keyTyped(final KeyEvent ke) {
    }
}
