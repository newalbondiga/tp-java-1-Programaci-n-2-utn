package coso4;

import java.util.Scanner;

/*
 * Este programa corrige el problema de la doble clase pública,
 * moviendo toda la lógica de las operaciones matemáticas al
 * método main de la clase COSO4.
 */
public class COSO4 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Declarar las variables para los dos números
        int numero1;
        int numero2;
        
        // Declarar variables para los resultados de las operaciones
        int suma;
        int resta;
        int multiplicacion;
        double division; // Usamos 'double' para la división para obtener un resultado con decimales

        // Solicitar y leer el primer número entero
        System.out.print("Por favor, ingresa el primer número entero: ");
        numero1 = scanner.nextInt();

        // Solicitar y leer el segundo número entero
        System.out.print("Por favor, ingresa el segundo número entero: ");
        numero2 = scanner.nextInt();

        // Realizar las operaciones
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        
        // Realizar la división y añadir un control para evitar la división por cero
        if (numero2 != 0) {
            division = (double) numero1 / numero2;
        } else {
            // Asignar un valor especial si la división no es posible
            division = Double.NaN; 
        }

        // Mostrar los resultados en la consola
        System.out.println("\n--- Resultados de las operaciones ---");
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);
        
        // Mostrar el resultado de la división con el control de cero
        if (!Double.isNaN(division)) {
            System.out.println("División: " + numero1 + " / " + numero2 + " = " + String.format("%.2f", division));
        } else {
            System.out.println("División: No se puede dividir por cero.");
        }

        // Cerrar el objeto Scanner para liberar recursos del sistema
        scanner.close();
    }
}
