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
public class Hahmo {
    private int x;
    private int y;

    public Hahmo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void siirry(int xmuutos, int ymuutos) {
        this.x += xmuutos;
        this.y += ymuutos;
    }

    public void piirra(Graphics graphics) {
        graphics.fillOval(x, y, 15, 15);
    }
}