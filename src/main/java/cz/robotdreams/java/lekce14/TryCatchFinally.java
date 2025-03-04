package cz.robotdreams.java.lekce14;

import java.io.IOException;
import java.sql.SQLException;

public class TryCatchFinally {

    public static void main(String[] args) {
        try {
            main2(args);
        }catch (Exception e) {
            //Throwable[] t = e.getSuppressed()
            System.out.println(e);
        }
    }

    public static void main2(String[] args) throws IOException {
        Databaze db = new Databaze();
        try {
            //String data = db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Petr");
            String data = db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Jan");
            System.out.println("databaze vratila : " + data);

        } catch (SQLException e) {
          System.out.println("Chyba pri dotazu do databaze");
          throw new IOException("zabalena vyjimka", e);
        } finally {
            db.close();
            //throw new IOException("vyjimka ve finally sekci");
        }
    }
}
