import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LicuadoraTest {

    private Licuadora licuadora;

    @BeforeEach
    public void setUp() {
        licuadora = new Licuadora();
    }
//------------------------------------------------------------------------------------------------------Test 1
    @Test
    public void testEncender() {
        /*
         * Verificar que la licuadora empieze apagada.
         */
        assertFalse(licuadora.getEncendido());

        /*
        * Enciende la licuadora y mira si inicio correctamente.
        */
        licuadora.encender();
        assertTrue(licuadora.getEncendido());

        /*
         * Intenta encender la licuadora otra vez a ver si no cambia o rompe el programa.
         */
        licuadora.encender();
        assertTrue(licuadora.getEncendido());
    }
//------------------------------------------------------------------------------------------------------Test 2
    @Test
    public void testLlenar() {
        /*
         * Verifica que la licuadora este vacia al inicio.
         */
        assertFalse(licuadora.getlleno());

        /*
         * Verifica que la licuadora se llene correctamente.
         */
        licuadora.llenar();
        assertTrue(licuadora.getlleno());

        /*
         * Intentar llenarla nuevamente y verificar que no cambie su estado
         */
        licuadora.llenar();
        assertTrue(licuadora.getlleno());
    }
//------------------------------------------------------------------------------------------------------Test 3
    @Test
    public void testAumentarVelocidad() {
        /*
         * Enciende y llena la licuadora para despues conformas si se puede aumentar de velocidades.
         */
        licuadora.encender();
        licuadora.llenar();

        /*
         * Aumenta la velocidad y verifica que suba al numero que es.
         */
        licuadora.aumentarVelocidad();
        assertEquals(1, licuadora.getVelocidad());

        /*
        * Aumentar la velocidad nuevamente y verificar el incremento.
        */
        licuadora.aumentarVelocidad();
        assertEquals(2, licuadora.getVelocidad());

        /*
        * Apagar la licuador y verificar que no se pueda aumentar la velocidad.
        */ 
        licuadora.setEncendido(false);
        licuadora.aumentarVelocidad();
        assertEquals(2, licuadora.getVelocidad());

        /*
        * Vaciar la licuadora y verificar que no se pueda aumentar la velocidad.
        */ 
        licuadora.setEncendido(true);
        licuadora.vaciar();
        licuadora.aumentarVelocidad();
        assertEquals(2, licuadora.getVelocidad());
    }
//------------------------------------------------------------------------------------------------------Test 4
    @Test
    public void testVaciar() {
        /*
        * Llenar la licuadora antes de vaciarla.
        */ 
        licuadora.llenar();
        assertTrue(licuadora.getlleno());

        /*
        * Vaciar la licuadora y verificar que su estado cambie.
        */ 
        licuadora.vaciar();
        assertFalse(licuadora.getlleno());

        /*
        * Intentar vaciarla nuevamente y verificar que no cambie su estado.
        */
        licuadora.vaciar();
        assertFalse(licuadora.getlleno());
    }
//------------------------------------------------------------------------------------------------------Test 5
    @Test
    public void testConsultarVelocidad() {
        /*
        * Verificar que la velocidad inicial sea 0
        */ 
        assertEquals(0, licuadora.getVelocidad());

        /*
        * Encender y llenar la licuadora para que se pueda aumentar la velocidad.
        */ 
        licuadora.encender();
        licuadora.llenar();

        /*
        *Aumentar la velocidad y verificar el cambio.
        */ 
        licuadora.aumentarVelocidad();
        assertEquals(1, licuadora.getVelocidad());
    }
}
