/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui;

import fi.jexniemi.gui.Kayttoliittyma;
import javax.swing.SwingUtilities;

/**
 *
 * @author jexniemi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int leveys = 500;
        int korkeus = 500;

        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(leveys, korkeus);
        SwingUtilities.invokeLater(kayttoliittyma);
    }
}
