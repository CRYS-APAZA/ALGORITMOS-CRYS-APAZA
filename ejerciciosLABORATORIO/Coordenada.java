package prueba;

import prueba.Coordenada;

public class Coordenada {
	//decalaracion de dos atributos privados que representan en el plano cartesiano
	private double x;
	private double y;
	//CONSTRUCTORES
	public Coordenada() { //si no pide valores es 0
		this(0,0); //Por defecto que se inicializa en 0	
	}
	//constructor que recibe dos valores que los asigna a otros atributos
	public Coordenada(double x, double y) {
		this.x = x;
		this.y = y;	
	}
	// contructor copia, que crea una nueva  coordenada a partir de otra
	public Coordenada(Coordenada c) {
		this.x = c.x;
		this.y = c.y;
	}
	//permite obtener el valor de los atributos privados de la clase que en esta caso es X 
	public double getX() {
		return x;
	}
	//nos permitira modificar el valor del atributo X
	public void setX(double x) {
		this.x = x;
	}
	//permite obtener el valor del atributo Y 
	public double getY() {
		return y;
	}
	//nos permitira modificar el valor del atributo Y 
	public void setY(double y) {
		this.y = y;
	}
	//calcula la distancia entre la instancia actual y otra coordenada C
	public double distancia (Coordenada c) {
		return Math.sqrt(Math.pow(this.x - c.x,2) + Math.pow(this.y - c.y,2));
	
	}
	//Calcula la distancia entre dos coordenadas dadas que en esta caso es c1 Y c2
	public static double distancia (Coordenada c1, Coordenada c2) {
		return Math.sqrt(Math.pow(c1.x - c2.x,2) + Math.pow(c1.y - c2.y,2));
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", "+this.y + ")";
	}
}