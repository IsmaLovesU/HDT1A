
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Licuadora licuadora = new Licuadora();
        boolean continuar = true;

        while (continuar = true)
        {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 1:
                    licuadora.encender();
                    break;
                case 2:
                    licuadora.llenar();
                    break;
                case 3:
                    licuadora.aumentarVelocidad();
                    break;
                case 4:
                    licuadora.consultarVelocidad();
                    break;
                case 5:
                    licuadora.consultarLlenado();
                    break;
                case 6:
                    licuadora.vaciar();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public static void mostrarMenu()
    {
        System.out.println("A continuación se muestran las acciones que se pueden realizar:");
        System.out.println("1. Encender la licuadora");
        System.out.println("2. Llenar la licuadora con lo que se desea licuar");
        System.out.println("3. Aumentar la velocidad de la licuadora");
        System.out.println("4. Consultar la velocidad actual de la licuadora");
        System.out.println("5. Consultar si la licuadora está llena");
        System.out.println("6. Vaciar la licuadora");
        System.out.println("7. Salir");
        System.out.println("Por favor, seleccione una opción ingresando el número de la acción a realizar:");
    }

    public static void EncenderLicuadora()
    {

    }

    public static void LlenarLicuadora()
    {

    }   

    public static void AumentarVelocidad()
    {

    }   

    public static void ConsultarVelocidad()
    {

    }   

    public static void ConsultarLlenado()
    {

    }   

    public static void VaciarLicuadora()
    {

    }   
}
