package cz.robotdreams.java.lekce14;

import java.io.IOException;
import java.sql.SQLException;

public class PlneOsetreni {

    public static void main(String[] args) throws IOException {
        try {

            Databaze db = new Databaze();
            String result = db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Jan");
            System.out.println(result);

        } catch (SQLException e) {

            System.out.println("Chyba pri dotazu do databaze, ukoncuji program");
            System.exit(1);

        } catch (IOException vyjimka) {

            System.out.println("Chyba pri otevirani databaze, ukoncuji program");
            System.exit(1);

        }

//        catch (Exception e) {
//            System.out.println("Nastala chyba");
//            System.exit(1);
//        }

    }
}