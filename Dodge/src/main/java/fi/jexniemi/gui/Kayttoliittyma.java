/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.gui;

/**
 * Kaikki graafiset elementit luodaan tässä luokassa
 *
 * @author jexniemi
 */
import fi.jexniemi.gui.TimerTasks.GameTask;
import fi.jexniemi.gui.TimerTasks.EnemyGeneratorTask;
import fi.jexniemi.logiikka.hahmot.Pelaaja;
import fi.jexniemi.logiikka.hahmot.Vihollinen;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.util.Timer;
import javax.swing.WindowConstants;
import java.util.TimerTask;

/**
 *
 * @author jexniemi
 */
public class Kayttoliittyma extends TimerTask implements Runnable {

    private JFrame frame;
    private Pelaaja pelaaja;
    private int leveys;
    private int korkeus;
    private Timer timer;
    private ArrayList<Vihollinen> viholliset;

    /**
     *
     * @param leveys
     * @param korkeus
     */
    public Kayttoliittyma(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.pelaaja = new Pelaaja(250, 400, leveys, korkeus);
        this.viholliset = new ArrayList();
    }

    @Override
    public final void run() {
        frame = new JFrame("Dodge");
        frame.setPreferredSize(new Dimension(this.leveys, this.korkeus));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void luoKomponentit(Container container) {
        Piirtoalusta piirtoalusta = new Piirtoalusta(this.pelaaja, this.viholliset);
        container.add(piirtoalusta);
        frame.addKeyListener(new NappaimistonKuuntelija(this.pelaaja, piirtoalusta));

        Timer myTimer = new Timer();
        /*
     * Set an initial delay of 1 second, then repeat every half second.
         */
        GameTask myTask = new GameTask(myTimer, this.viholliset, this.pelaaja, piirtoalusta);
        EnemyGeneratorTask enemyGenerator = new EnemyGeneratorTask(this.viholliset, piirtoalusta);
        myTimer.schedule(myTask, 1000, 1);
        myTimer.schedule(enemyGenerator, 1000, 200);
    }

    /**
     *
     * @return
     */
    public JFrame getFrame() {
        return frame;
    }
}
