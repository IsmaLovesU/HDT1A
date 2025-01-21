/**
 * Universidad del Valle de Guatemala
 * Autor: Marcelo Detlefsen - 24554
 * Fecha: 20/01/2025
 * Descripción: Clase que implementa la interfaz Interfaz y define métodos para manejar una licuadora.
 */

public class Licuadora implements Interfaz 
{
    private boolean encendido;
    private boolean llenado;
    private int velocidad;

    public Licuadora() 
    {
        this.encendido = false;
        this.llenado = false;
        this.velocidad = 0;
    }

    @Override
    public void encender() 
    {
        if (encendido) 
        {
            encendido = true;
            System.out.println("Licuadora encendida.");
        } 
        else 
        {
            System.out.println("La licuadora ya está encendida.");
        }
    }

    @Override
    public void llenar() 
    {
        if (llenado) 
        {
            llenado = true;
            System.out.println("Licuadora llena.");
        } 
        else 
        {
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

        if (llenado) 
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
        System.out.println(llenado ? "La licuadora está llena." : "La licuadora está vacía.");
        return llenado;
    }

    @Override
    public void vaciar() 
    {
        if (llenado) 
        {
            llenado = false;
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

    public boolean getLlenado() 
    {
        return llenado;
    }

    public void setLlenado(boolean llenado) 
    {
        this.llenado = llenado;
    }

    public int getVelocidad() 
    {
        return velocidad;
    }
}
