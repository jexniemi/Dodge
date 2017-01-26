/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui;

/**
 *
 * @author jexniemi
 */
import fi.jexniemi.logiikka.*;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Hahmo pelaaja;

    public Kayttoliittyma() {
        this.pelaaja = new Hahmo(250, 400);
    }

    @Override
    public void run() {
        frame = new JFrame("Dodge");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        Piirtoalusta piirtoalusta = new Piirtoalusta(this.pelaaja);
        container.add(piirtoalusta);
        frame.addKeyListener(new NappaimistonKuuntelija(this.pelaaja, piirtoalusta));
    }

    public JFrame getFrame() {
        return frame;
    }
}
