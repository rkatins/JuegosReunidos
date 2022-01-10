package CuatroEnRaya;

public class Tablero {
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
}
