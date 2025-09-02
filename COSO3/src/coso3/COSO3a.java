/*
 * Este programa corregido solicita al usuario su nombre y edad
 * y luego los muestra en pantalla dentro de la clase COSO3.
 */
package coso3;

import java.util.Scanner; // Importa la clase Scanner

public class COSO3 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Declarar las variables para el nombre y la edad
        String nombre;
        int edad;

        // Solicitar y leer el nombre del usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        nombre = entrada.nextLine();

        // Solicitar y leer la edad del usuario
        System.out.print("Por favor, ingresa tu edad: ");
        edad = entrada.nextInt();

        // Mostrar los datos en la consola
        System.out.println("\n--- Datos del usuario ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");

        // Cerrar el Scanner para liberar recursos
        entrada.close();
    }
}

        