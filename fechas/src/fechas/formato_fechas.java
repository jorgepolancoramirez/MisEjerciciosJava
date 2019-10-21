// Autor:Jorge Polanco Ramirez
package fechas;
import java.util.Calendar;
public class formato_fechas {

    public static void main(String[] args) {
        Calendar formatofecha = Calendar.getInstance();
        //jue oct 17 11:34:51 COT 2019
        System.out.printf("%tc\n", formatofecha);
        //2019-10-17
        System.out.printf("%tF\n", formatofecha);
        //10/17/19
        System.out.printf("%tD\n", formatofecha);
        //11:38:19 AM
        System.out.printf("%tr\n", formatofecha);
        //11:38:19
        System.out.printf("%tT\n", formatofecha);
        //jueves, octubre, 2019
        System.out.printf("%1$tA, %1$tB, %1$tY\n ", formatofecha);

    }
    
}
