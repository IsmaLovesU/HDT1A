public class Licuadora implements Interfaz
{
    private boolean encendido;
    private boolean llenado;
    private int velocidad;

    public Licuadora()
    {
        encendido = false;
        llenado = false;
        velocidad = 0;
    }

    @Override
    public void encender()
    {
        encendido = true;
    }

    @Override
    public void llenar()
    {
        llenado = true;
    }

    @Override
    public void aumentarVelocidad()
    {
        velocidad++;
    }

    @Override
    public int consultarVelocidad()
    {
        return velocidad;
    }

    @Override
    public boolean consultarLlenado()
    {
        return llenado;
    }

    @Override
    public void vaciar()
    {
        llenado = false;
    }   
}
