/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.logiikka.hahmot;

import fi.jexniemi.logiikka.hahmot.Hahmo;
import java.awt.Graphics;

/**
 *
 * @author jexniemi
 */
public class Pelaaja extends Hahmo {

    public Pelaaja(double x, double y, int pelinLeveys, int pelinKorkeus) {
        super(x, y, pelinLeveys, pelinKorkeus);
    }
    

    
    public void piirra(Graphics graphics) {
        int xInt = (int) x;
        int yInt = (int) y;
        graphics.fillOval(xInt, yInt, 15, 15);
    }
}