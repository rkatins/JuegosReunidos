package juegos_reunidos;

public class CJuegosReunidos {
    //private IniciaParchis woIniciaParchis = new IniciaParchis();      --> Al estar en el mismo paquete no hace falta hacer un puntero al mismo
    //private IniciaOca woIniciarOca = new IniciaOca();                     //^
                                                                            //|
    public static void main(String[] args){                                 //|
        //IniciaParchis.mainParchis(args);                                  //|
        IniciaOca.mainOca(args);                                            //|
    }
}