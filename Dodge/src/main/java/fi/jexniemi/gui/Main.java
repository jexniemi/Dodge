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
