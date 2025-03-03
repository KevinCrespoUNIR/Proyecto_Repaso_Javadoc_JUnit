import javabean.Suma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    @BeforeEach → Se ejecuta antes de cada prueba.
    @AfterEach → Se ejecuta después de cada prueba.
    @BeforeAll → Se ejecuta una vez antes de todas las pruebas.
    @AfterAll → Se ejecuta una vez después de todas las pruebas.
 */

class SumaTest {

    @Test
    void sumarDosReales() {
        Suma sumar = new Suma();
        double resultado = sumar.sumarDosReales(10.50, 5.50);
        assertEquals(16, resultado,"La suma de 10,50 + 5,50 debe ser: 16");
    }

    @Test
    void sumarDosEnteros() {
        Suma sumar = new Suma();
        int resultado = sumar.sumarDosEnteros(5,5);
        assertEquals(10, resultado, "La suma de 5 + 5 debe ser 10");
    }

    @Test
    void sumarTresReales() {
        Suma sumar = new Suma();
        double resultado = sumar.sumarTresReales(5.50,5.50,5.50);
        assertEquals(16.50, resultado, "El resultado de 5.50 + 5.50 + 5.50 debe ser: 16.50");
    }
}