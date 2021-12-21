package Oca;

public class Ficha {
	String nombre;
	String color;
	int posicion;

	public Ficha(String nombre, String color, int posicion) {
		this.nombre = nombre;
		this.color = color;
		this.posicion = posicion;
	}
	
	@Override
	public String toString() {
		return "Ficha [nombre=" + nombre + ", color=" + color + ", posicion=" + posicion + "]";
	}
}
