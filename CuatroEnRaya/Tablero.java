package CuatroEnRaya;

import java.util.Scanner;

public class Tablero {
	
	static Scanner sc = new Scanner(System.in);
	
	public void mTableroEmpezar(char[][] tablero3EnRalla) {
        for (int i = 0; i < tablero3EnRalla.length; i++) {
            for (int j = 0; j < tablero3EnRalla[i].length; j++) {
                tablero3EnRalla[i][j] = '-';
            }
        }
    }
    
    public void mVisualizarTablero(char[][] tablero3EnRalla) {
        System.out.println("     -------- TABLERO --------\n");
        for (int i = 0; i < tablero3EnRalla.length; i++) {
            for (int j = 0; j < tablero3EnRalla[i].length; j++) {
            	System.out.print("  ");
                System.out.print(tablero3EnRalla[i][j] + "   ");
            }
            System.out.println("\n");
        }
        
        for (int i = 0; i < tablero3EnRalla.length; i++) {
			System.out.print("  " + (i+1) + "   ");
		}
        System.out.println("\n");
//        System.out.println("prueba");
    }
    
    public void mJugar(Jugador[] jugador, char[][] tablero4EnRaya) { 
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
					mVisualizarTablero(tablero4EnRaya);
				}
			}	
		}				
	}
}
