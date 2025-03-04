package cz.robotdreams.java.lekce14;

public class TohleNikdy {

    public static void main(String[] args) {
        try {
            Databaze db = new Databaze();
            String data = db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Petr");
            System.out.println("databaze vratila : " + data);
        }catch (Exception e) {
            ;
        }
    }


}
