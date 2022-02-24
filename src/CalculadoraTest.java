import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void suma() {
        int resultado = Calculadora.suma(2,3);
        int esperado = 5;
        assertEquals(esperado,resultado);
    }
}