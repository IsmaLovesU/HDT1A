/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Andrés Ismalej - 24005
 * Harry Mendez - 
 * Fecha: 23/01/2025
 * Descripción: Interfaz que define métodos para manejar un sistema que incluye encender,
 * llenar, controlar velocidad y consultar el estado del llenado.
 */

public class Licuadora implements Interfaz {
    private boolean encendido;
    private boolean lleno;
    private int velocidad;

    public Licuadora() {

        this.encendido = false;
        this.lleno = false;
        this.velocidad = 0;
    }

    @Override
    public void encender() {
        if (encendido == false) {
            encendido = true;
            System.out.println("Licuadora encendida.");

        } else {
            System.out.println("La licuadora ya está encendida.");
        }
    }

    @Override
    public void llenar() {
        if (lleno == false) {
            lleno = true;
        } if (lleno) {
            lleno = true;
            System.out.println("Licuadora llena.");

        } else {
            System.out.println("La licuadora ya está llena.");
        }
    }

    @Override
    public void aumentarVelocidad() 
    {
        if (encendido) 
        {
            System.out.println("No se puede aumentar la velocidad. La licuadora está apagada.");
            return;
        }

        if (lleno) 
        {
            System.out.println("No se puede aumentar la velocidad. La licuadora está vacía.");
            return;
        }

        velocidad = (velocidad % 10) + 1;
        System.out.println("Velocidad aumentada a: " + velocidad);
    }

    @Override
    public int consultarVelocidad() 
    {
        System.out.println("La velocidad actual es: " + velocidad);
        return velocidad;
    }

    @Override
    public boolean consultarLlenado() 
    {
        System.out.println(lleno ? "La licuadora está llena." : "La licuadora está vacía.");
        return lleno;
    }

    @Override
    public void vaciar() 
    {
        if (lleno) 
        {
            lleno = false;
            System.out.println("Licuadora vaciada.");
        } 
        else 
        {
            System.out.println("La licuadora ya está vacía.");
        }
    }

    public boolean getEncendido() 
    {
        return encendido;
    }

    public void setEncendido(boolean encendido) 
    {
        this.encendido = encendido;
    }

    public boolean getlleno() 
    {
        return lleno;
    }

    public void setlleno(boolean lleno) 
    {
        this.lleno = lleno;
    }

    public int getVelocidad() 
    {
        return velocidad;
    }
}
