// Autor: Jorge Polanco Ramirez
package fechas;
import java.util.Scanner;


public class fechas {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);       
        validacion_fechas fechaint = new validacion_fechas;
        String diatexto = "";
        String mestexto = "";
        String anyotexto = "";
        int dia=0;
        int mes=0;
        int anyo=0;
        System.out.println("validacion de fechas");
        System.out.println("por favor ingrese en numeros el dia de nacimiento: ");
        diatexto = input.next();
        System.out.println("por favor ingrese en numeros el mes de nacimiento: ");
        mestexto = input.next();
        System.out.println("por favor ingrese en numeros el año de nacimiento: ");
        anyotexto = input.next(); 
        do{
        dia = fechaint.TryparseInt(diatexto);
        if (dia == -1){
        System.out.println("el dia ingresado es incorrecto. por favor intentalo de nuevo ");
          }
        }
        while (dia ==-1);{
        }
        
}
}
        

