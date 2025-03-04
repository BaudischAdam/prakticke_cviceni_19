package cz.robotdreams.java.lekce14;

public class KontrolovanaVyjimka extends Exception {

    private int chybnaHodnota = 0;

    public KontrolovanaVyjimka(int chybnaHodnota) {
        this.chybnaHodnota = chybnaHodnota;
    }

    public KontrolovanaVyjimka(String message) {
        super(message);
    }

    public KontrolovanaVyjimka(String message, Throwable cause) {
        super(message, cause);
    }

    public int getChybnaHodnota() {
        return chybnaHodnota;
    }
}
