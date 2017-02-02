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

    protected double x;
    protected double y;
    protected final int pelinLeveys;
    protected final int pelinKorkeus;
    protected double vauhti;
    boolean liikkuuOikealle;

    public Hahmo(double x, double y, int pelinLeveys, int pelinKorkeus) {
        this.x = x;
        this.y = y;
        this.pelinLeveys = pelinLeveys;
        this.pelinKorkeus = pelinKorkeus;
        this.vauhti = 0;
        this.liikkuuOikealle = true;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getPelinLeveys() {
        return this.pelinLeveys;
    }

    public int getPelinKorkeus() {
        return this.pelinKorkeus;
    }

    public double getVauhti() {
        return this.vauhti;
    }
    
    public void setVauhti(double paljon) {
        this.vauhti = paljon;
    }

    public void siirry(int xmuutos, int ymuutos) {
        if (this.x + xmuutos < 0) {
            this.x = 0;
        } else if (this.x + xmuutos > pelinLeveys - 25) {
            this.x = pelinLeveys - 25;
        } else {
            if (xmuutos > 0) {
                this.x += xmuutos + vauhti;
            } else if (xmuutos < 0) {
                this.x += xmuutos - vauhti;
            }
        }
        
        vauhti += 1;
        
        this.y += ymuutos;
    }

}
