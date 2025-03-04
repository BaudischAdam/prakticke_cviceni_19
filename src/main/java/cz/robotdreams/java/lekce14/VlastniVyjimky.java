package cz.robotdreams.java.lekce14;

import java.io.IOException;

public class VlastniVyjimky {

    public static void main(String[] args) throws IOException {
        Databaze db = new Databaze();
        try {
            db.spocitejVysledovku();
        } catch (KontrolovanaVyjimka e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
}