/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen, Andrés Ismalej y Harry Mendez.
 * Creación: 23/01/25
 * Última modificación: 23/01/25
 * @FileName: LicuadoraTest.java
 * Descripción: Clase con pruebas unitarias de cada método de Licuadora.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LicuadoraTest {
    private Licuadora licuadora;

    @BeforeEach
    void setUp() {
        licuadora = new Licuadora();
    }

    @Test
    void testEncender() {
        assertFalse(licuadora.getEncendido());
        licuadora.encender();
        assertTrue(licuadora.getEncendido());
    }

    @Test
    void testLlenar() {
        assertFalse(licuadora.getLleno());
        licuadora.llenar();
        assertTrue(licuadora.getLleno());
    }

    @Test
    void testAumentarVelocidad() {
        assertEquals(0, licuadora.getVelocidad());
        licuadora.aumentarVelocidad();
        assertEquals(1, licuadora.getVelocidad());
    }

    @Test
    void testConsultarVelocidad() {
        assertEquals(0, licuadora.consultarVelocidad());
        licuadora.aumentarVelocidad();
        assertEquals(1, licuadora.consultarVelocidad());
    }

    @Test
    void testConsultarLlenado() {
        assertFalse(licuadora.consultarLlenado());
        licuadora.llenar();
        assertTrue(licuadora.consultarLlenado());
    }

    @Test
    void testVaciar() {
        licuadora.llenar();
        assertTrue(licuadora.consultarLlenado());
        licuadora.vaciar();
        assertFalse(licuadora.consultarLlenado());
    }
}
