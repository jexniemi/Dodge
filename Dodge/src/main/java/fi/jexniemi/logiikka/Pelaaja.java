/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.logiikka;

import java.awt.Graphics;

/**
 *
 * @author jexniemi
 */
public class Pelaaja extends Hahmo {
    
    public Pelaaja(int x, int y) {
        super(x, y);
    }
    
    public void piirra(Graphics graphics) {
        graphics.fillOval(x, y, 15, 15);
    }
}