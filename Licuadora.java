/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Andrés Ismalej - 24005
 * Harry Mendez - 
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
     * Enciende la licuadora si está apagada.
     * Si ya está encendida, muestra un mensaje indicando su estado.
     */
    @Override
    public void encender() {
        if (encendido == false) {
            encendido = true;
            System.out.println("\nLicuadora encendida.");

        } else {
            System.out.println("\nLa licuadora ya está encendida.");
        }
    }

    /**
     * Llena la licuadora si está vacía.
     * Si ya está llena, muestra un mensaje indicando su estado.
     */
    @Override
    public void llenar() {
        if (lleno == false) {
            lleno = true;
            System.out.println("\nLicuadora llena.");

        } else {
            System.out.println("\nLa licuadora ya está llena.");
        }
    }

    /**
     * Aumenta la velocidad de la licuadora.
     * La velocidad aumenta en ciclos del 1 al 10. 
     * Si la licuadora está apagada o vacía, no permite aumentar la velocidad.
     */
    @Override
    public void aumentarVelocidad() {
        if (encendido == false) {
            System.out.println("\nNo se puede aumentar la velocidad. La licuadora está apagada.");
            return;
        }

        if (lleno == false) {
            System.out.println("\nNo se puede aumentar la velocidad. La licuadora está vacía.");
            return;
        }

        velocidad = (velocidad % 10) + 1;
        System.out.println("\nVelocidad aumentada a: " + velocidad);
    }

     /**
     * Consulta la velocidad actual de la licuadora.
     *
     * @return la velocidad actual de la licuadora.
     */
    @Override
    public int consultarVelocidad() {
        System.out.println("\nLa velocidad actual es: " + velocidad);
        return velocidad;
    }

    /**
     * Consulta si la licuadora está llena.
     *
     * @return true si la licuadora está llena, false si está vacía.
     */
    @Override
    public boolean consultarLlenado() {
        System.out.println(lleno ? "\nLa licuadora está llena." : "\nLa licuadora está vacía.");
        return lleno;
    }

    /**
     * Vacía la licuadora si está llena.
     * Si ya está vacía, muestra un mensaje indicando su estado.
     */
    @Override
    public void vaciar() {
        if (lleno) {
            lleno = false;
            System.out.println("\nLicuadora vaciada.");
        } else {
            System.out.println("\nLa licuadora ya está vacía.");
        }
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
}
