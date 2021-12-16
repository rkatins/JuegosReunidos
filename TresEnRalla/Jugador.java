package TresEnRalla;

import java.util.Scanner;

public class Jugador {
	static Scanner sc = new Scanner(System.in);

	String nombre;
	char ficha;

	public Jugador(String nombre, char ficha) {
		this.nombre = nombre;
		this.ficha = ficha;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", ficha=" + ficha + "]";
	}
}
