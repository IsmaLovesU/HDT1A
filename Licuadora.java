/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Andrés Ismalej - 24005
 * Harry Mendez - 24089
 * Fecha: 23/01/2025
 * Descripción: Clase licuadora que implementa interfaz, 
 * con funcionalidades básicas de una licuadora.
 */

public class Licuadora implements Interfaz {
    private boolean encendido;
    private boolean lleno;
    private int velocidad;

     /**
     * Constructor de la clase Licuadora.
     * Inicializa la licuadora como apagada, vacía y con velocidad en 0.
     */
    public Licuadora() {

        this.encendido = false;
        this.lleno = false;
        this.velocidad = 0;
    }

    /**
     * Obtiene el estado de encendido de la licuadora.
     *
     * @return true si la licuadora está encendida, false si está apagada.
     */
    public boolean getEncendido() {
        return encendido;
    }

     /**
     * Establece el estado de encendido de la licuadora.
     *
     * @param encendido true para encender la licuadora, false para apagarla.
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    /**
     * Obtiene el estado de llenado de la licuadora.
     *
     * @return true si la licuadora está llena, false si está vacía.
     */
    public boolean getlleno() {
        return lleno;
    }

    /**
     * Establece el estado de llenado de la licuadora.
     *
     * @param lleno true para indicar que la licuadora está llena, false si está vacía.
     */
    public void setlleno(boolean lleno) {
        this.lleno = lleno;
    }

    /**
     * Obtiene la velocidad actual de la licuadora.
     *
     * @return la velocidad de la licuadora.
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Enciende la licuadora, cambiando el estado de encendido.
     */
    @Override
    public void encender() {
        this.encendido = true;
    }

    /**
     * Llena la licuadora, cambiando el estado de lleno.
     */
    @Override
    public void llenar() {
        this.lleno = true;
    }

    /**
     * Aumenta la velocidad de la licuadora.
     * La velocidad aumenta en ciclos del 1 al 10. 
     */
    @Override
    public void aumentarVelocidad() {
        this.velocidad = (velocidad % 10) + 1; 
    }

    /**
     * Consulta la velocidad actual de la licuadora.
     *
     * @return la velocidad actual de la licuadora.
     */
    @Override
    public int consultarVelocidad() {
        return velocidad;
    }

    /**
     * Consulta si la licuadora está llena.
     *
     * @return lleno para indicar el estado.
     */
    @Override
    public boolean consultarLlenado() {
        return lleno;
    }

    /**
     * Vacía la licuadora si el estado de la licuadora es verdadero.
     */
    @Override
    public void vaciar() {
        this.lleno = false;
    }

}
