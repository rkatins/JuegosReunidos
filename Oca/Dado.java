package Oca;

public class Dado {

	public int mTirarDado() {
		int dado;
		
		dado = (int) (Math.random() * 7);
		
		return dado;
	}

}
