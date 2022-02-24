import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void suma() {
        int resultado = Calculadora.suma(2,3);
        int esperado = 5;
        assertEquals(esperado,resultado);
    }

    @Test
    void resta() {
        int resultado = Calculadora.resta(8,3);
        int esperado = 5;
        assertEquals(esperado,resultado);
    }

    @Test
    void mayor50() {
        boolean resultado = Calculadora.mayor50(5000000);
        assertTrue(resultado);
    }
}