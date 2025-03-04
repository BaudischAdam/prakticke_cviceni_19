package cz.robotdreams.java.lekce14;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.IOException;

public class ExceptionHandlingTest {

    @Test
    void testPlneOsetreniThrowsSQLException() {
        assertThatThrownBy(() -> PlneOsetreni.main(new String[]{}))
                .isInstanceOf(Exception.class)
                .hasMessageContaining("Chyba pri dotazu do databaze");
    }

    @Test
    void testPredaniVyseThrowsIOException() {
        assertThatThrownBy(() -> PredaniVyse.main(new String[]{}))
                .isInstanceOf(IOException.class)
                .hasMessageContaining("Databaze otevrena");
    }

    @Test
    void testTryCatchFinallyHandlesException() {
        assertThatThrownBy(() -> TryCatchFinally.main(new String[]{}))
                .isInstanceOf(IOException.class)
                .hasMessageContaining("zabalena vyjimka");
    }
}
