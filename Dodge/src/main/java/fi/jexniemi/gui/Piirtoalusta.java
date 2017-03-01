/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui;

import fi.jexniemi.logiikka.hahmot.Pelaaja;
import fi.jexniemi.logiikka.hahmot.Vihollinen;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * Piirtoalusta.
 *
 * @author jexniemi
 */
public class Piirtoalusta extends JPanel {

    private Pelaaja pelaaja;
    private ArrayList<Vihollinen> viholliset;

    /**
     *
     * @param pelaaja
     * @param viholliset
     */
    public Piirtoalusta(Pelaaja pelaaja, ArrayList<Vihollinen> viholliset) {
        super.setBackground(Color.BLACK);
        this.pelaaja = pelaaja;
        this.viholliset = viholliset;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        pelaaja.piirra(graphics);

        for (Vihollinen vihollinen : viholliset) {
            vihollinen.piirra(graphics);
        }
    }
}
