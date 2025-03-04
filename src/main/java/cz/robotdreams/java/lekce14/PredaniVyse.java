package cz.robotdreams.java.lekce14;

import java.io.IOException;
import java.sql.SQLException;

public class PredaniVyse {

    public static void main(String[] args) throws IOException, SQLException {
        //Databaze db = new Databaze();
        Databaze db = otevriDatabazi();
        //String result = db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Petr");

        stahniDataZDatabaze(db);
        //System.out.println(result);
    }

    public static Databaze otevriDatabazi() throws IOException {
        return new Databaze();
    }

    public static void stahniDataZDatabaze(Databaze db) throws SQLException{
        String result = db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Josef");
        System.out.println(result);
    }
}