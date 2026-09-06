package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void conservaLaTemperaturaEnCelsius() {
        ConversorTemperatura conversor = new ConversorTemperatura(25.5);

        assertEquals(25.5, conversor.getCelsius(), 0.0001);
    }

    @Test
    void convierteCeroCelsiusAFahrenheitYKelvin() {
        ConversorTemperatura conversor = new ConversorTemperatura(0);

        assertEquals(32, conversor.aFahrenheit(), 0.0001);
        assertEquals(273.15, conversor.aKelvin(), 0.0001);
    }

    @Test
    void convierteCienCelsiusAFahrenheitYKelvin() {
        ConversorTemperatura conversor = new ConversorTemperatura(100);

        assertEquals(212, conversor.aFahrenheit(), 0.0001);
        assertEquals(373.15, conversor.aKelvin(), 0.0001);
    }

    @Test
    void convierteTemperaturasNegativas() {
        ConversorTemperatura conversor = new ConversorTemperatura(-40);

        assertEquals(-40, conversor.aFahrenheit(), 0.0001);
        assertEquals(233.15, conversor.aKelvin(), 0.0001);
    }
}