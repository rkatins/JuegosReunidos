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
        boolean ganador = false;
        
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
		mVisualizarJugadores(jugador);
		
		System.out.println("\n");
		
		mJugar(jugador);
    }
        
    public static int mEleccionDeJuego() {
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
    
    public static void mJugar(Jugador[] jugador) {
    	for (int i = 0; i < 9; i++) {
			
			int fila;
			int columna;
			String visualizar;
			String visualizarMAX;
				
			for (int j = 0; j < jugador.length; j++) {
				System.out.println(jugador[j].nombre + " coloca ficha");
				boolean posicionOK = false;
				
				while (!posicionOK) {
					System.out.println("Elige fila para colocar la ficha");
					fila = sc.nextInt();sc.nextLine();
					System.out.println("Elige columna para colocar la ficha");
					columna = sc.nextInt();sc.nextLine();
					
					if (tablero3EnRalla[fila-1][columna-1] == 'X' || tablero3EnRalla[fila-1][columna-1] == 'O') {
						System.out.println("Posicion ya ocupada, elige otra");
					} else {
						tablero3EnRalla[fila-1][columna-1] = jugador[j].ficha;
						posicionOK = true;
					}
				}
				System.out.println("Deseas ver el tablero? SI/NO");
				visualizar = sc.nextLine();
				visualizarMAX = visualizar.toUpperCase();
				
//				tablero.mComprobarGanador(jugador);
				
				switch (visualizarMAX) {
					case "SI": {
						tablero.mVisualizarTablero(tablero3EnRalla);
					break;
					}
				}
			}
		}
	}
}
