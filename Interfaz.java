/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen, Andrés Ismalej y Harry Mendez.
 * Creación: 19/01/25
 * Última modificación: 23/01/25
 * @FileName: Interfaz.java
 * Descripción: Clase Interfaz que define métodos para manejar un sistema que incluye encender,
 * llenar, controlar velocidad y consultar el estado del llenado.
 */

public interface Interfaz 
{
    /**
     * Método para encender el sistema.
     */
    void encender();

    /**
     * Método para llenar el sistema.
     */
    void llenar();

    /**
     * Método para aumentar la velocidad.
     */
    void aumentarVelocidad();

    /**
     * Método para consultar la velocidad actual.
     * 
     * @return velocidad actual como un entero.
     */
    int consultarVelocidad();

    /**
     * Método para consultar si el sistema está lleno.
     * 
     * @return true si está lleno, false de lo contrario.
     */
    boolean consultarLlenado();

    /**
     * Método para vaciar el sistema.
     */
    void vaciar();
}