package u5.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora unit;

    @BeforeEach
    void setUp() throws Exception {
        unit = new Calculadora();
    }

    @Test
    void somar() {
        assertEquals(2, unit.somar(1, 1));
    }

    @Test
    void subtrair() {
        assertEquals(3, unit.subtrair(4, 1));
    }

    @Test
    void multiplicar() {
        assertEquals(6, unit.multiplicar(3, 2));
    }

    @Test
    void dividir() {
        assertEquals(4, unit.dividir(8, 2));
    }

    @Test
    void dividirPorZero() {
        assertEquals(0, unit.dividir(8, 0));
    }
}
