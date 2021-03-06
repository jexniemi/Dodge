package fi.jexniemi.logiikka.hahmot;

import java.awt.Rectangle;

/**
 * Tätä luokkaa käytetään pohjana kaikille pelikentällä liikkuville olioille.
 *
 * @author jexniemi
 */
public abstract class Hahmo {

    double x;
    private double y;
    private final int pelinLeveys;
    private final int pelinKorkeus;
    private double vauhti;

    /**
     * Konstruktori.
     *
     * @param setX asettaa x arvon
     * @param setY asettaa y arvon
     * @param setGameWidth antaa Hahmolle tiedon pelikentän leveydestä
     * @param setGameHeight antaa Hahmolle tiedon pelikentän korkeudesta
     */
    public Hahmo(final double setX, final double setY, final int setGameWidth, final int setGameHeight) {
        this.x = setX;
        this.y = setY;
        this.pelinLeveys = setGameWidth;
        this.pelinKorkeus = setGameHeight;
        this.vauhti = 0;
    }

    public final double getX() {
        return x;
    }

    public final double getY() {
        return y;
    }

    public final void setX(final double setX) {
        this.x = setX;
    }

    public final void setY(final double setY) {
        this.y = setY;
    }

    /**
     * Metodi muuttaa muuttuujaa x arvoa halutun verran.
     *
     * @param amount Muuttujaan x lisättävä arvo
     *
     */
    public final void moveX(final double amount) {
        this.x += amount;
    }

    public final int getPelinLeveys() {
        return this.pelinLeveys;
    }

    public final int getPelinKorkeus() {
        return this.pelinKorkeus;
    }

    public final double getVauhti() {
        return this.vauhti;
    }

    public final void setVauhti(final double amount) {
        this.vauhti = amount;
    }

    /**
     * Lisää pelihahmon vauhtia.
     *
     * @param amount Kertoo kuinka paljon vauhdin arvoa kasvatetaan
     */
    public final void lisaaVauhtia(final double amount) {
        this.vauhti += amount;
    }

    /**
     * Metodi muuttaa Hahmo -luokan ilmentymän x ja y arvoja.
     *
     * @param xmuutos Muuttujaan x lisättävä arvo
     * @param ymuutos Muuttujaan y lisättävä arvo
     */
    public final void siirry(final double xmuutos, final double ymuutos) {
        double hahmonLeveys = 25;

        if (this.x + xmuutos < 0) {
            setX(0);
        } else if (this.x + xmuutos > pelinLeveys - hahmonLeveys) {
            setX(this.pelinLeveys - hahmonLeveys);
        } else {
            if (xmuutos > 0) {
                moveX(xmuutos + getVauhti());
            } else if (xmuutos < 0) {
                moveX(xmuutos - getVauhti());
            }
        }

        lisaaVauhtia(1);

        this.y += ymuutos;
    }

    public Rectangle getBounds() {
        return new Rectangle((int) getX(), (int) getY(), 15, 15);
    }

}
