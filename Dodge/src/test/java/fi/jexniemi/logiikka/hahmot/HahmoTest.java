/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jexniemi.logiikka.hahmot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jexniemi
 */
public class HahmoTest {

    Pelaaja pelaaja;

    public HahmoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pelaaja = new Pelaaja(30, 25, 500, 500);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getXtoimii() {
        assertEquals(30, pelaaja.getX());
    }

    @Test
    public void getYtoimii() {
        assertEquals(25, pelaaja.getY());
    }

    @Test
    public void konstruktoriAsettaaParametritOikein() {
        assertEquals(30, pelaaja.getX());
        assertEquals(25, pelaaja.getY());
        assertEquals(500, pelaaja.getPelinLeveys());
        assertEquals(500, pelaaja.getPelinKorkeus());
    }

    @Test
    public void siirryMetodiToimii() {
        pelaaja.siirry(5, 2);
        assertEquals(35, pelaaja.getX());
        assertEquals(27, pelaaja.getY());
    }

    @Test
    public void siirryMetodiToimiiNegatiivisillaArvoilla() {
        pelaaja.siirry(-2, -5);
        assertEquals(28, pelaaja.getX());
        assertEquals(20, pelaaja.getY());
    }

    @Test
    public void siirryMetodiMuuttaaXMuttaEiY() {
        pelaaja.siirry(5, 0);
        assertEquals(35, pelaaja.getX());
        assertEquals(25, pelaaja.getY());
    }

    @Test
    public void siirryMetodiMuuttaaYMuttaEiX() {
        pelaaja.siirry(0, -2);
        assertEquals(30, pelaaja.getX());
        assertEquals(23, pelaaja.getY());
    }

    @Test
    public void siirryMetodiXEiAlleNolla() {
        pelaaja.siirry(-31, 0);
        assertEquals(0, pelaaja.getX());
    }

    @Test
    public void siirryMetodiXEiYliLeveyden() {
        boolean totta = true;
        pelaaja.siirry(pelaaja.getPelinLeveys(), 0);
        if (pelaaja.getX() > pelaaja.getPelinLeveys()) {
            totta = false;
        }
        assertTrue(totta);
    }

    @Test
    public void yVoiOllaAlleNolla() {
        pelaaja.siirry(0, -26);
        assertEquals(-1, pelaaja.getY());
    }

    @Test
    public void yVoiOllaYliKorkeuden() {
        boolean totta = true;
        pelaaja.siirry(0, pelaaja.getPelinKorkeus());
        if (pelaaja.getY() < pelaaja.getPelinKorkeus()) {
            totta = false;
        }        
        
        assertTrue(totta);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
