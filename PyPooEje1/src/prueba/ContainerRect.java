package prueba;

import java.util.Arrays;

// Clase que almacena un conjunto de rectángulos y sus propiedades
public class ContainerRect {
    // Arreglo de rectángulos almacenados en el contenedor
    private Rectangulo[] ArreRectan;
    // Arreglo para almacenar las distancias entre puntos de los rectángulos
    private double[] ArreDistancia;
    // Arreglo para almacenar las áreas de los rectángulos
    private double[] ArreAreas;
    // Número máximo de rectángulos que puede contener
    private int n;
    // Contador para realizar seguimiento del número de rectángulos agregados
    private int contador;

    // Constructor que inicializa los arreglos con un tamaño específico
    public ContainerRect(int n) {
        this.n = n;
        this.ArreRectan = new Rectangulo[n];
        this.ArreDistancia = new double[n];
        this.ArreAreas = new double[n];
        this.contador = 0;
    }

    // Método para agregar un rectángulo al contenedor
    public void addRectangulo(Rectangulo h1) {
        if (contador < n) {
            ArreRectan[contador] = h1;
            // Calcula y almacena la distancia entre los dos puntos del rectángulo
            ArreDistancia[contador] = Coordenada.distancia(h1.getEsquina1(), h1.getEsquina2());
            // Calcula y almacena el área del rectángulo
            ArreAreas[contador] = h1.calculoArea(h1.getEsquina1(), h1.getEsquina2());
            contador++;
        } else {
            System.out.println("No se pueden agregar más rectángulos.");
        }
    }

    // Getter para obtener el valor de n
    public int getN() {
        return n;
    }

    // Setter para modificar el valor de n
    public void setN(int n) {
        this.n = n;
    }

    // Método para representar el contenido del contenedor en una cadena de texto
    @Override
    public String toString() {
        return "ContainerRect [" +
                "ArreRectan=" + Arrays.toString(ArreRectan) +
                ", ArreDistancia=" + Arrays.toString(ArreDistancia) +
                ", ArreAreas=" + Arrays.toString(ArreAreas) +
                ']';
    }
}
