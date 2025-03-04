package cz.robotdreams.java.lekce14;


import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 * Trida ktera simuluje databazi pro ukazku vyvolani vyjimek SQL exception
 */
public class Databaze implements Closeable {

    public Databaze() throws IOException {
        System.out.println("Databaze otevrena");
    }

    public String executeQuery(String query, Object... args) throws SQLException {

        if (args.length == 1 && args[0] instanceof String)  {
            var parameter = (String)args[0];
            return switch (parameter) {
                case "Josef" -> throw new SQLException("Unable to execute query");
                case "Jan" -> throw new SQLDataException("Jan doesn't exist in database");
                case "Radek" -> throw new RuntimeException("Priklad z lekce");
                case "Petr" -> "Novak";
                default -> throw new SQLException("Wrong parameter");
            };
        }else {
            return "Zadna data";
        }
    }

    public void spocitejVysledovku() throws KontrolovanaVyjimka {
        IOException exception = new IOException("Nenalezen soubor s ucetnictvim");
        throw new KontrolovanaVyjimka("Neni mozne spocitat vysledovku", exception);
    }


    @Override
    public void close() throws IOException {
        System.out.flush();
        System.err.flush();
        System.out.println("Databaze zavrena");
    }
}
