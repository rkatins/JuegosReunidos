package Oca;

import java.util.Scanner;

public class PartidaMain {
	static Scanner sc = new Scanner(System.in);
	static boolean azul = false;
	static boolean rojo = false;
	static boolean verde = false;
	static boolean amarillo = false;
	static Dado dado = new Dado();
	
	public static void main(String[] args) {
		int numJugadores;
		boolean tirarDado = true;
		
		System.out.println("¿Cuantas persona van a jugar?");
		numJugadores = sc.nextInt();sc.nextLine();
		Ficha[] jugadores = new Ficha[numJugadores];
		
		System.out.println("\n");
		
		mCreacionJugadores(numJugadores, jugadores);
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("!!Comienza el juego¡¡");
		
		while (tirarDado) {
			mAvanzaTirarDado(numJugadores, jugadores);
			
			System.out.println("\n");
			
			for (int i = 0; i < numJugadores; i++) {											
				System.out.println("posicion= " + jugadores[i].posicion);
			}
			
			for (int i = 0; i < numJugadores; i++) {
				if (jugadores[i].posicion == 30) {
					jugadores[i].ganador = true;
					tirarDado = false;
				}
				
				if (jugadores[i].ganador = true) {
					System.out.println("Ganador: " + jugadores[i].nombre);
					System.out.println("FIN DEL JUEGO");
				}
			}
			
//			tirarDado = mComprobarGanador(numJugadores, jugadores, tirarDado);
		}
	}
	
	public static void mCreacionJugadores(int numJugadores, Ficha[] jugadores) {
		for (int i = 0; i < numJugadores;i++) {
			String nombre = null;
			String color = null;
			int posicion = 0;
			
			
			System.out.println("Nombre del jugador " + (i+1));
			nombre = sc.nextLine();
			System.out.println("\n");
			color = mElegirColor(numJugadores);
			
			jugadores[i] = new Ficha(nombre, color);
		}		
		
		for (int i = 0; i < numJugadores; i++) {											
			System.out.println(jugadores[i].toString());
		}
		System.out.println("\n----------------\n");
	}
	
	public static String mElegirColor(int numJugadores) {
		int numColor;
		String color = null;
		boolean loopElegirColor = true;
		
		
		while (loopElegirColor) {
			System.out.println("Elige el color de la ficha que usará");
			System.out.println("1. Azul\n2. Rojo\n3. Verde\n4. Amarillo");
			numColor = sc.nextInt();sc.nextLine();
			
			switch (numColor) {
				case 1: {
					if (azul) {
						System.out.println("Color elegido anteriormente, elige otro color\n");
					} else {
						color = "Azul";
						azul = true;
						loopElegirColor = false;
						System.out.println("Color elegido: Azul");
					}
					break;
				}
				case 2: {
					if (rojo) {
						System.out.println("Color elegido anteriormente, elige otro color\n");
					} else {
						color = "Rojo";
						rojo = true;
						loopElegirColor = false;
						System.out.println("Color elegido: Rojo");
					}
					break;
				}
				case 3: {
					if (verde) {
						System.out.println("Color elegido anteriormente, elige otro color\n");
					} else {
						color = "Verde";
						verde = true;
						loopElegirColor = false;
						System.out.println("Color elegido: Verde");
					}
					break;
				}
				case 4: {
					if (amarillo) {
						System.out.println("Color elegido anteriormente, elige otro color\n");
					} else {
						color = "Amarillo";
						amarillo = true;
						loopElegirColor = false;
						System.out.println("Color elegido: Amarillo");
					}
					break;
				}
				default: {
					System.out.println("Color no valido, elige de nuevo");
					break;
				}
			}
		}
		System.out.println("----------------\n");
		return color;
	}	

	public static void mAvanzaTirarDado(int numJugadores, Ficha[] jugadores) {
		for (int i = 0; i < numJugadores; i++) {
			int posicionAvanzada;
			System.out.println(jugadores[i].nombre + " esta tirando el dado...");
			posicionAvanzada = dado.mTirarDado();
			System.out.println(jugadores[i].nombre + " avanza " + posicionAvanzada + " casillas");
			jugadores[i].posicion += posicionAvanzada;
			System.out.println("\n");
		}
		System.out.println("----------------\n");
	}

	public static boolean mComprobarGanador(int numJugadores, Ficha[] jugadores, boolean tirarDado) {
		for (int i = 0; i < numJugadores; i++) {
			if (jugadores[i].posicion == 30) {
				jugadores[i].ganador = true;
				tirarDado = false;
			}
			
			if (jugadores[0].ganador = true) {
				System.out.println("Ganador: " + jugadores[0].nombre);
				System.out.println("FIN DEL JUEGO");
				return tirarDado;
			}
		}
		return tirarDado;
	}
}
