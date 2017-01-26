/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui;

import fi.jexniemi.logiikka.Hahmo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author jexniemi
 */
public class Piirtoalusta extends JPanel {

    private Hahmo hahmo;
    
    public Piirtoalusta(Hahmo hahmo) {
        super.setBackground(Color.WHITE);
        this.hahmo = hahmo;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        hahmo.piirra(graphics);
    }
}