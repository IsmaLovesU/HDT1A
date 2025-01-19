public class Licuadora implements Interfaz
{
    private boolean encendido;
    private boolean llenado;
    private int velocidad;
    private static final int MAX_VELOCIDAD = 10;

    public Licuadora()
    {
        this.encendido = false;
        this.llenado = false;
        this.velocidad = 0;
    }

    @Override
    public void encender()
    {
        if (!encendido) 
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
        if (!llenado) 
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
        if (!encendido) 
        {
            System.out.println("No se puede aumentar la velocidad. La licuadora está apagada.");
            return;
        }

        if (!llenado) 
        {
            System.out.println("No se puede aumentar la velocidad. La licuadora está vacía.");
            return;
        }

        if (velocidad < MAX_VELOCIDAD) 
        {
            velocidad++;
            System.out.println("Velocidad aumentada a: " + velocidad);
        } 
        else 
        {
            System.out.println("La licuadora ya está en la velocidad máxima.");
        }
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
    
    
    public void apagar() 
    {
        if (encendido) 
        {
            encendido = false;
            velocidad = 0; // Reiniciar velocidad al apagar
            System.out.println("Licuadora apagada.");
        } else {
            System.out.println("La licuadora ya está apagada.");
        }
    }

    public boolean isEncendido() 
    {
        return encendido;
    }
}
