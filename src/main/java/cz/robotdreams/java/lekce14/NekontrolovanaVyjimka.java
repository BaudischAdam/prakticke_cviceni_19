package cz.robotdreams.java.lekce14;

public class NekontrolovanaVyjimka extends RuntimeException {

    public NekontrolovanaVyjimka() {
    }

    public NekontrolovanaVyjimka(String message) {
        super(message);
    }

    public NekontrolovanaVyjimka(String message, Throwable cause) {
        super(message, cause);
    }

}
