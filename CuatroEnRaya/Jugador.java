package CuatroEnRaya;

import java.util.Scanner;

public class Jugador {
	static Scanner sc = new Scanner(System.in);

	String nombre;
	char ficha;
	boolean ganador;

	public Jugador(String nombre, char ficha) {
		this.nombre = nombre;
		this.ficha = ficha;
		this.ganador = false;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", ficha=" + ficha + "]";
	}
	
	public void mFinPartida(Jugador ganador){
    	System.out.println("FIN DE LA PARTIDA");
        System.out.println("Gana " + ganador);
    }
}
