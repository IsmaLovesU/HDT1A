/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * @author: Marcelo Detlefsen, Andrés Ismalej y Harry Mendez.
 * Creación: 19/01/25
 * Última modificación: 22/01/25
 * @FileName: Main.java
 * Descripción: Clase principal para mostrar al usuario las opciones de la licuadora.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Licuadora licuadora = new Licuadora();
        int opcion = 0;

        do {
            /*
             * Programacion defensiva para el input en el menu de opciones.
             */
            boolean validar = false;
            while (!validar) {
                mostrarMenu(); //Muestra el menu de opciones al ususario.
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    validar = true;
                } catch (InputMismatchException e) {
                    System.out.println("\nEntrada invalida. Por favor, ingrese un numero valido.");
                    scanner.nextLine();
                }
            }

            //Switch-case para el manejo de las opciones del menu.
            switch (opcion) {
                case 1:
                    licuadora.encender();
                    System.out.println("\nLicuadora encendida y lista");
                    break;
                case 2:
                    licuadora.llenar();
                    System.out.println("\nLicuadora llena y lista");
                    break;
                case 3:
                    if (!licuadora.getEncendido()) {
                        System.out.println("\nNo se puede aumentar la velocidad. La licuadora está apagada.");
                    } else if (!licuadora.getLleno()) {
                        System.out.println("\nNo se puede aumentar la velocidad. La licuadora está vacía.");
                    } else {
                        licuadora.aumentarVelocidad();
                        System.out.println("\nVelocidad aumentada a: " + licuadora.getVelocidad());
                    }
                    break;
                case 4:
                    System.out.println("\nLa velocidad actual es: " + licuadora.getVelocidad());
                    break;
                case 5:
                    licuadora.consultarLlenado();
                    System.out.println(licuadora.getLleno()? "\nLa licuadora está llena." : "\nLa licuadora está vacía.");
                    break;
                case 6:
                    if (licuadora.getLleno()) {
                    licuadora.vaciar();
                    System.out.println("\nLa licuadora se vació");
                    } else {
                    System.out.println("\nLa licuadora ya está vacía.");
                    }
                    break;
                case 7:
                    System.out.println("\nGracias por usar la Ninja X3000");
                    break;
                default:
                    System.out.println("\nPor favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 7); //Bucle while que repite el menu hasta que el usuario elija la opcion de salir. 
        scanner.close();
    }
    /**
     * Metodo que muestra las opciones del menu al usuario.
     */
    public static void mostrarMenu() {
        System.out.println();
        System.out.println("------Licuadora Ninja X3000------");
        System.out.println("1. Encender la licuadora");
        System.out.println("2. Llenar la licuadora con lo que se desea licuar");
        System.out.println("3. Aumentar la velocidad de la licuadora");
        System.out.println("4. Consultar la velocidad actual de la licuadora");
        System.out.println("5. Consultar si la licuadora está llena");
        System.out.println("6. Vaciar la licuadora");
        System.out.println("7. Salir");
        System.out.print("Por favor, seleccione alguna opción de las anteriores: ");
    }

}
