package CuatroEnRaya;

import java.util.Iterator;
import java.util.Scanner;

public class CuatroEnRaya {
    static Scanner sc = new Scanner(System.in);
    static Tablero tablero = new Tablero();
    static char[][] tablero4EnRaya = new char[10][10];
    static Jugador[] jugador = new Jugador[2];

	public static void main(String[] args) {		
		tablero.mTableroEmpezar(tablero4EnRaya);

        int opcionJuego;
        boolean loop = true;
        
		while (loop) {
			opcionJuego = mEleccionTipoJuego();
			
			switch (opcionJuego) {
				case 1: {
					mCreacionJugador(opcionJuego, jugador);
					loop = false;
					System.out.println("\n");
					break;
				}
				case 2: {
					mCreacionJugador(opcionJuego, jugador);
					loop = false;
					System.out.println("\n");
					break;
				}
				case 3: {
					System.out.println("No disponible: Jugador1 VS Maquina");
					System.out.println("Elige de nuevo\n");
//					mCreacionJugador(opcionJuego, jugador);
//					loop = false;			
					break;
				}
				case 4: {
					System.out.println("No disponible: Maquina VS Jugador1");
					System.out.println("Elige de nuevo\n");
//					mCreacionJugador(opcionJuego, jugador);
//					loop = false;			
					break;
				}
				default: {
					System.out.println("Elige de nuevo\n");
					break;
				}
			}
		}
		mVisualizarJugadores(jugador);
//		System.out.println("\n");
//		tablero.mVisualizarTablero(tablero4EnRaya);
//		System.out.println("\n");
		
		mJugar(jugador, tablero4EnRaya);
	}

	public static int mEleccionTipoJuego() {
    	int opcionJuego;
    	
    	System.out.println("Opcion de juego\nPD: Tipo de juego con asignacion de fichas: X VS O"
				+ "\n1. Jugador1 VS Jugador2"
				+ "\n2. Jugador2 VS Jugador1"
				+ "\n3. Jugador1 VS Maquina WIP"
				+ "\n4. Maquina VS Jugador1 WIP");
		opcionJuego = sc.nextInt();sc.nextLine();
			
		return opcionJuego;
	}

	public static void mCreacionJugador(int opcionJuego, Jugador[] jugador) {
		System.out.println("\n");
		
    	switch (opcionJuego) {
	    	case 1: {
	    		for (int i = 0; i < jugador.length; i++) {
					String nombre;	
					char ficha;
					
					if (i == 0) {
						ficha = 'X';
					} else {
						ficha = 'O';
					}
					System.out.println("Nombre del Jugador" + (i+1));
					nombre = sc.nextLine();
					
					jugador[i] = new Jugador(nombre, ficha);
				}
	    		break;
	    	}
	    	case 2: {
	    		for (int i = 0; i < jugador.length; i++) {
					String nombre;	
					char ficha;
					
					if (i == 0) {
						ficha = 'O';
					} else {
						ficha = 'X';
					}
					System.out.println("Nombre del Jugador" + (i+1));
					nombre = sc.nextLine();
					
					jugador[i] = new Jugador(nombre, ficha);
				}		
	    		break;
	    	}
	    	case 3: {
	    		String nombre;
	    		
	    		System.out.println("Nombre del Jugador");
				nombre = sc.nextLine();
				
				jugador[0] = new Jugador(nombre, 'X');
				jugador[1] = new Jugador("MAQUINA", 'O');
	    		break;
	    	}
	    	case 4: {
	    		String nombre;
	    		
	    		System.out.println("Nombre del Jugador");
				nombre = sc.nextLine();
				
				jugador[1] = new Jugador(nombre, 'O');
				jugador[0] = new Jugador("MAQUINA", 'X');
	    		break;
	    	}
	    	default: {
	    		System.out.println("Fin del juego, Jugador no insertado");
	    	}
    	}
	}
    
    public static void mVisualizarJugadores(Jugador[] jugador) {
		for (int i = 0; i < jugador.length; i++) {
			System.out.println(jugador[i].toString());
		}
	}
    
    public static void mJugar(Jugador[] jugador, char[][] tablero4EnRaya) { 
    	int casillasTotales = 0;
    	
    	for (int i = 0; i < tablero4EnRaya.length; i++) {
			for (int j = 0; j < tablero4EnRaya[i].length; j++) {
				casillasTotales++;
			}
		}
    	
    	System.out.println("Casillas totales -> " + casillasTotales);
    	
    	for (int i = 0; i < casillasTotales; i++) {
    		int columnaElegida;
//    		boolean turnoFin = false;
//    		boolean fichaColocada = false;
    		
			for (int j = 0; j < jugador.length; j++) {
				boolean fichaColocada = false;
				
				System.out.println(fichaColocada);
				System.out.println("TURNO -> " + (i+1));
				System.out.println("Turno de " + jugador[j].nombre + "\nElige columna:");
				columnaElegida = sc.nextInt();sc.nextLine();
				
				while (!fichaColocada) {
					for (int k = tablero4EnRaya.length-1; k > 0; k--) {
						if (tablero4EnRaya[k][columnaElegida-1] == 'X' || tablero4EnRaya[k][columnaElegida-1] == 'O') {
							tablero4EnRaya[k][columnaElegida-1] = tablero4EnRaya[k][columnaElegida-1];
//							k = 0;
							fichaColocada = true;
						} else {
							tablero4EnRaya[k][columnaElegida-1] = jugador[j].ficha;
							k = 0;
							fichaColocada = true;
						}
					}
//					fichaColocada = true;
					tablero.mVisualizarTablero(tablero4EnRaya);
				}
			}	
		}				
	}
}
