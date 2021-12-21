package Oca;

public class Tablero {
	static String[] tableroCasillas = new String[69];
	
	public void mPintarTableroInicio() {
		for (int i = 0; i < tableroCasillas.length; i++) {
			tableroCasillas[i] = "Casilla " + i;
		}
		
		for (int i = 0; i < tableroCasillas.length; i++) {
			System.out.println(tableroCasillas[i]);
		}
	}

}
