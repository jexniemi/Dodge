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
public class VihollinenTest {

    Vihollinen vihollinen;

    public VihollinenTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        vihollinen = new Vihollinen(700, 35, 500, 500);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaParametritOikein() {
        assertEquals(35, vihollinen.getY(), 0);
        assertEquals(500, vihollinen.getPelinLeveys());
        assertEquals(500, vihollinen.getPelinKorkeus());
    }
    
    @Test
    public void xOnAsetettuRandomisti() {
        boolean totta = false;
        if (vihollinen.getX() <= 500) {
            totta = true;
        }
        
        assertTrue(totta);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
