/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Andrés Ismalej - 24005
 * Harry Mendez - 24089
 * Fecha: 23/01/2025
 * Descripción: Main para mostrar al usuario las opciones de la licuadora segun funcionalidades heredadas de interfaz.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Licuadora licuadora = new Licuadora();
        int opcion;
        do {
            mostrarMenu(); //Muestra el menu de opciones al ususario.
            opcion = scanner.nextInt();
            scanner.nextLine();
            //Switch-case para el manejo de las opciones del menu.
            switch (opcion) {
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
