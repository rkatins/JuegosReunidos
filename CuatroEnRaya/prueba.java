package CuatroEnRaya;

import java.util.Scanner;

public class prueba {
	static Scanner sc = new Scanner(System.in);
    static Tablero tablero = new Tablero();
    static char[][] tablero4EnRaya = new char[10][10];
    static Jugador[] jugador = new Jugador[2];
    
    public static void main(String[] args) {
    	jugador[0] = new Jugador("Ruben", 'X');
		jugador[1] = new Jugador("Julien", 'O');
		
		tablero.mTableroEmpezar(tablero4EnRaya);
		CuatroEnRaya.mJugar(jugador, tablero4EnRaya);
	}
}

