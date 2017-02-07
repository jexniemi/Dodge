/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.logiikka.hahmot;

/**
 * Viholliset ovat pelikentällä ylhäältä alas putoavia olioita, joita
 * pelaajan tulee väistellä
 *
 * @author jexniemi
 */
public class Vihollinen extends Hahmo {

    public Vihollinen(final int x, final int y, final int pelinLeveys, final int pelinKorkeus) {
        super(x, y, pelinLeveys, pelinKorkeus);
    }
}
