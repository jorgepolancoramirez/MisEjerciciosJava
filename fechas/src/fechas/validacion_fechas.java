// Autor: Jorge Polanco Ramirez
package fechas;


public class validacion_fechas {
    public Integer TryparseInt (String fechatexto){
        if (fechatexto != null && !fechatexto.isEmpty())
        {
            if (fechatexto.trim().matches("[0-9]")){
                return Integer.valueOf(fechatexto.trim());
        }
        
    }
    return -1;
    
}

}