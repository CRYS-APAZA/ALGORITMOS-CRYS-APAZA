/*package laboratorio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los valores para el primer rectángulo (A)
        System.out.println("Ingrese las coordenadas de la primera esquina del rectángulo A:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas de la esquina opuesta del rectángulo A:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Crear el rectángulo A con las coordenadas ingresadas
        Rectangulo rectA = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));

        // Solicitar al usuario los valores para el segundo rectángulo (B)
        System.out.println("Ingrese las coordenadas de la primera esquina del rectángulo B:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas de la esquina opuesta del rectángulo B:");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        // Crear el rectángulo B con las coordenadas ingresadas
        Rectangulo rectB = new Rectangulo(new Coordenada(x3, y3), new Coordenada(x4, y4));

        // Mostrar los rectángulos creados
        System.out.println("Rectángulo A: " + rectA);
        System.out.println("Rectángulo B: " + rectB);

        scanner.close();
    }
}*/



/*package laboratorio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los valores para el primer rectángulo (A)
        System.out.println("Ingrese las coordenadas de la primera esquina del rectángulo A:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas de la esquina opuesta del rectángulo A:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Rectangulo rectA = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));

        // Solicitar al usuario los valores para el segundo rectángulo (B)
        System.out.println("Ingrese las coordenadas de la primera esquina del rectángulo B:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas de la esquina opuesta del rectángulo B:");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        Rectangulo rectB = new Rectangulo(new Coordenada(x3, y3), new Coordenada(x4, y4));

        // Mostrar la información de los rectángulos
        System.out.println("\nInformación de los rectángulos:");
        mostrarInformacion(rectA);
        mostrarInformacion(rectB);

        // Verificar la relación entre los rectángulos
        Verificador verificador = new Verificador(rectA, rectB);
        String resultado = verificador.Verific(rectA, rectB);
        System.out.println("\n" + resultado);

        // Calcular y mostrar el área de sobreposición si los rectángulos se superponen
        Rectangulo interseccion = rectanguloSobre(rectA, rectB);
        if (interseccion != null) {
            System.out.println("Área de sobreposición: " + interseccion.calculoArea(null, null));
        }

        scanner.close();
    }

    // Método para mostrar información de un rectángulo
    public static void mostrarInformacion(Rectangulo rect) {
        System.out.println(rect);
    }

    // Método para calcular la intersección de dos rectángulos
    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        // Obtener coordenadas de las esquinas
        double x1 = Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double y1 = Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY());
        double x2 = Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double y2 = Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY());

        double x3 = Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double y3 = Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY());
        double x4 = Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double y4 = Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY());

        // Calcular los límites del rectángulo de intersección
        double xMin = Math.max(x1, x3);
        double yMin = Math.max(y1, y3);
        double xMax = Math.min(x2, x4);
        double yMax = Math.min(y2, y4);

        // Verificar si hay superposición
        if (xMin < xMax && yMin < yMax) {
            return new Rectangulo(new Coordenada(xMin, yMin), new Coordenada(xMax, yMax));
        }

        return null;
    }*/


package laboratorio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los valores para el primer rectángulo (A)
        System.out.println("Ingrese las coordenadas de la primera esquina del rectángulo A:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas de la esquina opuesta del rectángulo A:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Crear el rectángulo A
        Rectangulo rectA = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));

        // Solicitar al usuario los valores para el segundo rectángulo (B)
        System.out.println("Ingrese las coordenadas de la primera esquina del rectángulo B:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas de la esquina opuesta del rectángulo B:");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        // Crear el rectángulo B
        Rectangulo rectB = new Rectangulo(new Coordenada(x3, y3), new Coordenada(x4, y4));

        // Mostrar los rectángulos
        System.out.println("Rectángulo A: " + rectA);
        System.out.println("Área del rectángulo A: " + rectA.calculoArea());

        System.out.println("Rectángulo B: " + rectB);
        System.out.println("Área del rectángulo B: " + rectB.calculoArea());

        // Crear verificador
        Verificador verificador = new Verificador(rectA, rectB);
        String resultado = verificador.Verific(rectA, rectB);

        System.out.println(resultado);

        // Si los rectángulos se sobreponen, calcular el área de intersección
        if (resultado.contains("sobreponen")) {
            Rectangulo areaInterseccion = rectanguloSobre(rectA, rectB);
            System.out.println("Área de sobreposición: " + areaInterseccion.calculoArea());
        }

        scanner.close();
    }

    // Método para calcular la intersección de dos rectángulos
    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        double x1 = Math.max(r1.getEsquina1().getX(), r2.getEsquina1().getX());
        double y1 = Math.min(r1.getEsquina1().getY(), r2.getEsquina1().getY());
        double x2 = Math.min(r1.getEsquina2().getX(), r2.getEsquina2().getX());
        double y2 = Math.max(r1.getEsquina2().getY(), r2.getEsquina2().getY());

        return new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
    }
}





