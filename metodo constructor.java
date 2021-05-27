package Coches;
import java.util.Scanner;
import java.util.ArrayList;

public class CExamen_0302 {
    public  static void main(){
        Scanner woTeclado = new Scanner(System.in);
        ArrayList<CAlumno> wlAlumno = new ArrayList<>();
        
        String wsNombre;
        int wiEdad;
        int wiAltura;
        
        CAlumno poAlumno = new CAlumno(wsNombre, wiEdad, wiAltura);

        System.out.println("Pulsa <INTRO> para dejar de introuducir datos");
        for (int i = 0; i < wlAlumno.size >= i; i++){
            System.out.println("Nombre del alumno: ");
              wsNombre = woTeclado.nextLine();
            System.out.println("Edad del alumno: ");
              wiEdad = woTeclado.nextInt(); woTeclado.nextLine();
            System.out.println("Altura del alumno: ");
              wiAltura = woTeclado.nextInt(); woTeclado.nextLine();

            while (wlAlumno.equals(""))
                poAlumno.mvMostrarDatos();
        } //for (int i = 0; i < wlAlumno; i++)
    } //main()
} //CExamen_0302

class CAlumno{
    String psNombre;
    int piEdad;
    int piAltura;

    public CAlumno(String isNombre, int iiEdad, int iiAltura){
        psNombre = isNombre;  piEdad = iiEdad;  piAltura = iiAltura;
    } //CAlumno()

    void mvMostrarDatos() {
        System.out.println(" \nNombre: " + psNombre + " Edad: " + piEdad+ " Altura: " +piAltura);
    }//mvMostrarDatos
  } //CAlumno{}