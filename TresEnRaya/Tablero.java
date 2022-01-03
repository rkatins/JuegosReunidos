package TresEnRaya;

public class Tablero {

	public void mTableroEmpezar(char[][] tablero3EnRalla) {
        for (int i = 0; i < tablero3EnRalla.length; i++) {
            for (int j = 0; j < tablero3EnRalla[i].length; j++) {
                tablero3EnRalla[i][j] = '-';
            }
        }
    }
    
    public void mVisualizarTablero(char[][] tablero3EnRalla) {
        System.out.println("---- TABLERO ----\n");
        for (int i = 0; i < tablero3EnRalla.length; i++) {
            for (int j = 0; j < tablero3EnRalla[i].length; j++) {
                System.out.print("  ");
                System.out.print(tablero3EnRalla[i][j] + "   ");
            }
            System.out.println("\n");
        }
        System.out.println("------------------\n");
    }
    
    public boolean comprobarGanadorX(char[][] tablero3EnRalla, Jugador[] jugador) {
        for (int i = 0; i < tablero3EnRalla.length; i++) {
            if (tablero3EnRalla[i][0] == 'X' && tablero3EnRalla[i][0] == tablero3EnRalla[i][1] && tablero3EnRalla[i][0] == tablero3EnRalla[i][2]) {
            	jugador[0].ganador = true;
            }
        }
        for (int i = 0; i < tablero3EnRalla.length; i++) {
            if (tablero3EnRalla[0][i] == 'X' && tablero3EnRalla[0][i] == tablero3EnRalla[1][i] && tablero3EnRalla[0][i] == tablero3EnRalla[2][i]) {
            	jugador[0].ganador = true;
            }
        }
        //diagonales
        if (tablero3EnRalla[0][0] == 'X' && tablero3EnRalla[0][0] == tablero3EnRalla[1][1] && tablero3EnRalla[0][0] == tablero3EnRalla[2][2]) {
        	jugador[0].ganador = true;
        } else if (tablero3EnRalla[0][2] == 'X' && tablero3EnRalla[0][2] == tablero3EnRalla[1][1] && tablero3EnRalla[0][2] == tablero3EnRalla[2][0]) {
        	jugador[0].ganador = true;
        }
        return jugador[0].ganador;
    }
    
    public boolean comprobarGanadorO(char[][] tablero3EnRalla, Jugador[] jugador) {
        for (int i = 0; i < tablero3EnRalla.length; i++) {
            if (tablero3EnRalla[i][0] == 'O' && tablero3EnRalla[i][0] == tablero3EnRalla[i][1] && tablero3EnRalla[i][0] == tablero3EnRalla[i][2]) {
            	jugador[1].ganador = true;
            }
        }
        for (int i = 0; i < tablero3EnRalla.length; i++) {
            if (tablero3EnRalla[0][i] == 'O' && tablero3EnRalla[0][i] == tablero3EnRalla[1][i] && tablero3EnRalla[0][i] == tablero3EnRalla[2][i]) {
            	jugador[1].ganador = true;
            }
        }
        //diagonales
        if (tablero3EnRalla[0][0] == 'O' && tablero3EnRalla[0][0] == tablero3EnRalla[1][1] && tablero3EnRalla[0][0] == tablero3EnRalla[2][2]) {
        	jugador[1].ganador = true;
        } else if (tablero3EnRalla[0][2] == 'O' && tablero3EnRalla[0][2] == tablero3EnRalla[1][1] && tablero3EnRalla[0][2] == tablero3EnRalla[2][0]) {
        	jugador[1].ganador = true;
        }
        return jugador[1].ganador;
    }
}

