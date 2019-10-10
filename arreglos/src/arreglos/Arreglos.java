//autor: jorge polanco ramirez
package arreglos;
import java.util.Scanner;
public class Arreglos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalnotas=0;
        int [] notas = new int [5];
        for (int estudiantes = 0; estudiantes<=4;estudiantes++){
            System.out.println("ingrese la calificacion del estudiante n°" + (estudiantes + 1) + ": ");
                    notas [estudiantes] = input.nextInt();
                    totalnotas += notas [estudiantes];
        }
        totalnotas = totalnotas / 5;
        for (int estudiantes = 0; estudiantes<=4; estudiantes++ ) {
            System.out.println("estudiante n°" + (estudiantes + 1) + ": " + notas [estudiantes]);
           
        }
     System.out.println("el promedio de las notas es:" + totalnotas);

    }
    
}
