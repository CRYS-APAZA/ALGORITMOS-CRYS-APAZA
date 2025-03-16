/*package laboratorio01;

public class Rectangulo { 
	// Declaración de dos atributos privados que representan las esquinas opuestas del rectángulo
	private Coordenada esquina1; 
	private Coordenada esquina2;
	private Rectangulo h1; // Variable auxiliar para almacenar un rectángulo
	
	// Constructor que recibe dos coordenadas y las asigna a las esquinas del rectángulo
	public Rectangulo (Coordenada c1, Coordenada c2) {
		setEsquina1(c1);
		setEsquina2(c2);
	}

	// Constructor vacío que no inicializa las esquinas
	public Rectangulo() {
		this.h1 = h1;
	}
	
	// Método para establecer un rectángulo en la variable auxiliar h1
	void setR(Rectangulo h1) {
		this.h1 = h1;
	}
	
	// Método que asigna la primera esquina del rectángulo
	public void setEsquina1(Coordenada coo) {
		this.esquina1 = coo;
	}
	
	// Método que asigna la segunda esquina del rectángulo
	public void setEsquina2 (Coordenada coo) {
		this.esquina2 = coo;
	}
	
	// Método que obtiene la primera esquina del rectángulo
	public Coordenada getEsquina1 () {
		return esquina1;
	}
	
	// Método que obtiene la segunda esquina del rectángulo
	public Coordenada getEsquina2 () {
		return esquina2;
	}
	
	// Método para calcular el área del rectángulo basado en sus esquinas
	public double calculoArea(Coordenada c1, Coordenada c2) {
		double area, X, Y;
		
		// Se obtiene la diferencia entre las coordenadas en X e Y
		X = c1.getX() - c2.getX();
		Y = c1.getY() - c2.getY();
		
		// Se convierten los valores a positivos para asegurar que el área sea positiva
		if (X < 0) {
			X = X * -1;
		}
		if (Y < 0) {
			Y = Y * -1;
		}
		
		// Se calcula el área multiplicando las diferencias en X e Y
		area = X * Y;
		return area;
	}
	
	// Método toString que devuelve la representación del rectángulo en formato (esquina1;esquina2)
	@Override
	public String toString() {
		return "(" + this.esquina1 + ";" + this.esquina2 + ")";
	}
}*/


package laboratorio01;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }

    public double calculoArea() {
        if (esquina1 == null || esquina2 == null) {
            throw new IllegalArgumentException("Las esquinas del rectángulo no están definidas correctamente.");
        }
        double base = Math.abs(esquina1.getX() - esquina2.getX());
        double altura = Math.abs(esquina1.getY() - esquina2.getY());
        return base * altura;
    }

    @Override
    public String toString() {
        return "((" + esquina1.getX() + ", " + esquina1.getY() + ");(" + esquina2.getX() + ", " + esquina2.getY() + "))";
    }
}



