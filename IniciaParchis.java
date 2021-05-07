package juegos_reunidos;
import java.util.Scanner;

public class IniciaParchis {
    static Scanner woTeclado = new Scanner(System.in);
    static String saNmbJugadores[] = new String[4];
    static String saFichas[] = new String[4];
    static int saPosicionFicha[] = new int[4];
    static int piNumDado;
    static int piGanador;
    static int piTurno = 1; // Inicializado siempre a 1
    static CCasillasParchis woCCasillasParchis = new CCasillasParchis();

    // COLORES PREDEFINIDOS (EN EL ORDEN INDICADO)
    public static void main(String[] args){
        saFichas[0] = "VERDE";
        saFichas[1] = "AMARILLO";
        saFichas[2] = "AZUL";
        saFichas[3] = "ROJO";

        for (int i = 0; i < saNmbJugadores.length; i++){
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
                saNmbJugadores[i] = woTeclado.nextLine();
        }// for (int i = 0; i <= saNmbJugadores.length; i++)
       
        System.out.print("\n");

        for (int i = 0; i < saNmbJugadores.length; i++){
            System.out.print("Jugador " + saFichas[i]);

            if (i >= saNmbJugadores.length){
                System.out.print("Saca ficha de la casa");
                System.out.print("\n");
            }else{
                System.out.println("Sigue esperando");
                System.out.print("\n");
            }
        }// for (int i = 0; i < saNmbJugadores.length; i++)

        while (true){
            for (int i = 0; i < saNmbJugadores.length; i++){
                System.out.println("posicion de "+saNmbJugadores[i] + " = "+saPosicionFicha[i]);
            }
           
            boolean wbTerminar = false;
            for (int i = 0; i < saNmbJugadores.length; i++){
               
                System.out.println("Tira el jugador " + saFichas[i]);
                System.out.println("Resultado del dado: 1 a 6");
                piNumDado = 0;
                piNumDado = woTeclado.nextInt();woTeclado.nextLine();
                saPosicionFicha[i] = saPosicionFicha[i] + piNumDado;


                piTurno++;
               
                for (int ii = 0; ii < saNmbJugadores.length; ii++){
                    if(saPosicionFicha[ii] >= 30){
                        piGanador = saPosicionFicha[ii];
                        woCCasillasParchis.mFinPartida();
                        wbTerminar = true;
                        break;
                    }
                }
                if (wbTerminar) break;
               
                if (piNumDado == 5)
                    System.out.println("Saca ficha de casa jugador " + saFichas[i]);
                else
                    continue;

            }// for (int i = 0; i < saNmbJugadores.length; i++)        
            if (wbTerminar) break;
        }// while (true)
    }// main()
}// class IniciaParchis


class CCasillasParchis extends IniciaParchis{
    Scanner woTeclado = new Scanner(System.in);
       
    void mFinPartida(){
        System.out.println("FIN DE LA PARTIDA");
        System.out.println("Gana " + piGanador);
    }// mFinPartida()
}