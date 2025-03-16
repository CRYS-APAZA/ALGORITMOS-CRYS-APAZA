package prueba;

public class Rectangulo {
    // Atributos que representan las esquinas opuestas del rectángulo
    private Coordenada esquina1;
    private Coordenada esquina2;
    private Rectangulo h1;

    // Constructor que inicializa las esquinas del rectángulo
    public Rectangulo(Coordenada c1, Coordenada c2) {
        setEsquina1(c1);
        setEsquina2(c2);
    }

    // Constructor por defecto
    public Rectangulo() {
        this.h1 = h1;
    }

    // Método para asignar un rectángulo
    void setR(Rectangulo h1) {
        this.h1 = h1;
    }

    // Método para asignar la primera esquina del rectángulo
    public void setEsquina1(Coordenada coo) {
        this.esquina1 = coo;
    }

    // Método para asignar la segunda esquina del rectángulo
    public void setEsquina2(Coordenada coo) {
        this.esquina2 = coo;
    }

    // Método para obtener la primera esquina del rectángulo
    public Coordenada getEsquina1() {
        return esquina1;
    }

    // Método para obtener la segunda esquina del rectángulo
    public Coordenada getEsquina2() {
        return esquina2;
    }

    // Método para calcular el área del rectángulo a partir de sus esquinas
    public double calculoArea(Coordenada c1, Coordenada c2) {
        double area, X, Y;
        X = c1.getX() - c2.getX();
        Y = c1.getY() - c2.getY();
        
        // Se toma el valor absoluto de la diferencia
        if (X < 0) {
            X = X * -1;
        }
        if (Y < 0) {
            Y = Y * -1;
        }
        
        area = X * Y;
        return area;
    }

    // Método para representar el rectángulo en forma de cadena de texto
    @Override
    public String toString() {
        return "(" + this.esquina1 + ";" + this.esquina2 + ")";
    }
}