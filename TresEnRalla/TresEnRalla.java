package TresEnRalla;

import java.util.Scanner;

public class TresEnRalla {
    static Scanner sc = new Scanner(System.in);
    static Tablero tablero = new Tablero();
    static char[][] tablero3EnRalla = new char[3][3];
    static Jugador[] jugador = new Jugador[2];
            
    public static void main(String[] args) {
        tablero.mTableroEmpezar(tablero3EnRalla);
        tablero.mVisualizarTablero(tablero3EnRalla);
        
        int opcionJuego;
        boolean loop = true;
        
		while (loop) {
			opcionJuego = mEleccionDeJuego();
			
			switch (opcionJuego) {
				case 1: {
					mCreacionJugador(opcionJuego, jugador);
					loop = false;
					break;
				}
				case 2: {
					mCreacionJugador(opcionJuego, jugador);
					loop = false;			
					break;
				}
				case 3: {
					mCreacionJugador(opcionJuego, jugador);
					loop = false;			
					break;
				}
				case 4: {
					mCreacionJugador(opcionJuego, jugador);
					loop = false;			
					break;
				}
				default: {
					System.out.println("Elige de nuevo");
					break;
				}
			}
		}
		System.out.println("\n");
		mVisualizarJugadore(jugador);
    }
    
        
    public static int mEleccionDeJuego() {
    	int opcionJuego;
    	
    	System.out.println("Opcion de juego\nPD: Tipo de juego con asignacion de fichas: X VS O"
				+ "\n1. Jugador1 VS Jugador2"
				+ "\n2. Jugador2 VS Jugador1"
				+ "\n3. Jugador1 VS Maquina"
				+ "\n4. Maquina VS Jugador");
		opcionJuego = sc.nextInt();sc.nextLine();
			
		return opcionJuego;
	}
    
    public static void mCreacionJugador(int opcionJuego, Jugador[] jugador) {
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
	    		
	    		System.out.println("Nombre del Jugador" + 1);
				nombre = sc.nextLine();
				
				jugador[0] = new Jugador(nombre, 'X');
				jugador[1] = new Jugador("MAQUINA", 'O');
	    		break;
	    	}
	    	case 4: {
	    		String nombre;
	    		
	    		System.out.println("Nombre del Jugador" + 1);
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
    
    public static void mVisualizarJugadore(Jugador[] jugador) {
		for (int i = 0; i < jugador.length; i++) {
			System.out.println(jugador[i]);
		}
	}
}
