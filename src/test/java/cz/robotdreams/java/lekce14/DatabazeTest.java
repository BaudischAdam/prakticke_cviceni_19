package cz.robotdreams.java.lekce14;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DatabazeTest {

    @Test
    void testExecuteQueryReturnsExpectedResult() throws Exception {
        try (Databaze db = new Databaze()) {
            String result = db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Petr");
            assertThat(result).isEqualTo("Novak");
        }
    }

    @Test
    void testExecuteQueryThrowsSQLException() {
        try (Databaze db = new Databaze()) {
            assertThatThrownBy(() -> db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Josef"))
                    .isInstanceOf(SQLException.class)
                    .hasMessageContaining("Unable to execute query");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testExecuteQueryThrowsSQLDataException() {
        try (Databaze db = new Databaze()) {
            assertThatThrownBy(() -> db.executeQuery("Select prijmeni from zamestnanci where jmeno = ?", "Jan"))
                    .isInstanceOf(SQLException.class)
                    .hasMessageContaining("Jan doesn't exist in database");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

