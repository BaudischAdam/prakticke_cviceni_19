package cz.robotdreams.java.lekce14;

import java.io.IOException;
import java.sql.SQLException;

public class ZabaleniVyjimky {

    public static void main(String[] args) {
        try {
            Databaze db = new Databaze();
            String result = db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Josef");
        } catch (IOException e) {
            throw new RuntimeException("Nastala IO chyba", e);
        } catch (SQLException e) {
            throw new RuntimeException("Nastala databazova chyba", e);
        }
    }


}
