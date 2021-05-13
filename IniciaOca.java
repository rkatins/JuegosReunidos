package juegos_reunidos;
import java.util.Scanner;

class IniciaOca{
    static Scanner woTeclado = new Scanner(System.in);
    static CCasillasOca woCCasillasOca = new CCasillasOca();
    static CDadoFicha woCDadoFicha = new CDadoFicha();
    static String saNmbJugadores[] = new String[4];
    static int saPosicionFicha[] = new int[4];
    static int piNumDado;
    static int piGanador;
        
    public static void main(String[] args){
        for (int i = 0; i < saNmbJugadores.length; i++){
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
                saNmbJugadores[i] = woTeclado.nextLine();
        }// for (int i = 0; i <= saNmbJugadores.length; i++)
        
        while (true){
            boolean wbTerminar = false;
            woCDadoFicha.mTirarDado();
            woCDadoFicha.mPosicion();
            
            for (int i = 0; i < saNmbJugadores.length; i++){
                if(saPosicionFicha[i] >= 30){
                    piGanador = saPosicionFicha[i];
                    woCCasillasOca.mFinPartida();
                    wbTerminar = true;
                    break;
                }
            }// for (int i = 0; i < saNmbJugadores.length; i++)
            
            for (int i = 0; i < saNmbJugadores.length; i++){
                if(saPosicionFicha[i] == 29)
                    woCCasillasOca.mVueltaAlInicio();
                break;
            }// for (int i = 0; i < saNmbJugadores.length; i++)
            
            for (int i = 0; i < saNmbJugadores.length; i++){
                if(saPosicionFicha[i] == 5 || saPosicionFicha[i] == 10 || saPosicionFicha[i] == 15 || saPosicionFicha[i] == 20 || saPosicionFicha[i] == 25){
                    piGanador = saPosicionFicha[i];
                    woCCasillasOca.mCasillaOca();
                }
                break;
            }// for (int i = 0; i < saNmbJugadores.length; i++)
        }// while (true)
    }// main()
}// class IniciaLaOca
            
class CCasillasOca extends IniciaOca{
    Scanner woTeclado = new Scanner(System.in);
       
    void mFinPartida(){
        System.out.println("FIN DE LA PARTIDA");
        System.out.println("Gana " + piGanador);
    }// mFinPartida()

    void mVueltaAlInicio(){
        System.out.println("Vuelta al inicio jugador " + (piGanador));
            piGanador = 0;
    }// mVueltaAlInicio()
            
    void mCasillaOca(){
        System.out.println("De oca a oca, y tiro por que me toca!!");
            piGanador = piGanador + 5;
        System.out.println("Vuelve a tirar el jugador " + (piGanador));
        System.out.println("Resultado del dado: 1 a 6");
            piNumDado = woTeclado.nextInt();woTeclado.nextLine();
        piGanador = piGanador + piNumDado;
    }// mCasillaOca()
}// class CCasillasOca

class CDadoFicha extends IniciaOca{
    void mTirarDado(){
        for (int i = 0; i < saNmbJugadores.length; i++){
            System.out.println("Tira el jugador " + (i + 1));
            System.out.println("Resultado del dado: 1 a 6");
                piNumDado = woTeclado.nextInt();woTeclado.nextLine();
            saPosicionFicha[i] = saPosicionFicha[i] + piNumDado;
            piNumDado = 0;
        }// for (int i = 0; i < saNmbJugadores.length; i++)
    }// mTirarDado()
    
    void mPosicion(){
        for (int i = 0; i < saNmbJugadores.length; i++)
                System.out.println("La posicion de " + saNmbJugadores[i] + " es la casilla " + saPosicionFicha[i]);
    }// mPosicion
}