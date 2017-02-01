/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.logiikka.hahmot;

/**
 *
 * @author jexniemi
 */
public abstract class Hahmo {
    protected int x;
    protected int y;
    protected final int pelinLeveys;
    protected final int pelinKorkeus;

    public Hahmo(int x, int y, int pelinLeveys, int pelinKorkeus) {
        this.x = x;
        this.y = y;
        this.pelinLeveys = pelinLeveys;
        this.pelinKorkeus = pelinKorkeus;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public final int getPelinLeveys() {
        return this.pelinLeveys;
    }
    
    public int getPelinKorkeus() {
        return this.pelinKorkeus;
    }

    public void siirry(int xmuutos, int ymuutos) {
        if (this.x + xmuutos >= 0 && this.x + xmuutos <= pelinLeveys) {
            this.x += xmuutos;
        } else {
            this.x = 0;
        }
        
        this.y += ymuutos;
    }
}
