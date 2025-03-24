package InterfacesClasesGenericas;

import java.util.Scanner;

// Clase principal que contiene el menú y gestiona las operaciones
public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        int opcion; // Variable para almacenar la opción seleccionada por el usuario
        do {
            // Mostrar el menú de operaciones
            System.out.println("\nMenú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma.");
            System.out.println("2. Resta.");
            System.out.println("3. Producto.");
            System.out.println("4. División.");
            System.out.println("5. Potencia.");
            System.out.println("6. Raíz Cuadrada.");
            System.out.println("7. Raíz Cúbica.");
            System.out.println("8. Salir.");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt(); // Leer la opción seleccionada

            // Verificar si la opción es válida
            if (opcion >= 1 && opcion <= 7) {
                System.out.print("Elige el tipo de dato (1 para Integer, 2 para Double): ");
                int tipoDato = scanner.nextInt(); // Leer el tipo de dato

                // Si el tipo de dato es Integer
                if (tipoDato == 1) {
                    OperacionesMat operacionesInt = new OperacionesMat<>();
                    System.out.print("Ingresa el primer número: ");
                    Integer num1 = scanner.nextInt(); // Leer el primer número
                    System.out.print("Ingresa el segundo número: ");
                    Integer num2 = scanner.nextInt(); // Leer el segundo número
                    ejecutarOperacion(operacionesInt, num1, num2, opcion);
                }
                // Si el tipo de dato es Double
                else if (tipoDato == 2) {
                    OperacionesMat operacionesDouble = new OperacionesMat<>();
                    System.out.print("Ingresa el primer número: ");
                    Double num1 = scanner.nextDouble(); // Leer el primer número
                    System.out.print("Ingresa el segundo número: ");
                    Double num2 = scanner.nextDouble(); // Leer el segundo número
                    ejecutarOperacion(operacionesDouble, num1, num2, opcion);
                } else {
                    // Tipo de dato no válido
                    System.out.println("Tipo de dato no válido.");
                }
            } else if (opcion != 8) {
                // Opción no válida
                System.out.println("Opción no válida.");
            }
        } while (opcion != 8); // Repetir hasta que el usuario elija salir

        System.out.println("¡Gracias por usar el programa!"); // Mensaje de despedida
        scanner.close(); // Cerrar el scanner
    }

    // Método genérico para ejecutar las operaciones seleccionadas
    private static <T extends Number> void ejecutarOperacion(OperacionesMat<T> operaciones, T num1, T num2, int opcion) {
        switch (opcion) {
            case 1 -> System.out.println("Resultado de la suma: " + operaciones.suma(num1, num2));
            case 2 -> System.out.println("Resultado de la resta: " + operaciones.resta(num1, num2));
            case 3 -> System.out.println("Resultado del producto: " + operaciones.producto(num1, num2));
            case 4 -> {
                try {
                    // Intentar realizar la división
                    System.out.println("Resultado de la división: " + operaciones.division(num1, num2));
                } catch (ArithmeticException e) {
                    // Mostrar el mensaje de error si ocurre una excepción
                    System.out.println(e.getMessage());
                }
            }
            case 5 -> System.out.println("Resultado de la potencia: " + Math.pow(num1.doubleValue(), num2.doubleValue()));
            case 6 -> System.out.println("Raíz cuadrada del primer número: " + Math.sqrt(num1.doubleValue()));
            case 7 -> System.out.println("Raíz cúbica del primer número: " + Math.cbrt(num1.doubleValue()));
            default -> System.out.println("Opción no válida.");
        }
    }
}
