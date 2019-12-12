/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class Examen {
  
    private float CODIGO;
    private String NOMBRE_UNIDAD;
    private String  NOMBRE_PRODUCTO;
    private float  CANTIDAD_DE_PRODUCCION;
    private float  PRECIO;
    private String  FECHA;
    private float   VALOR_PRODUCTO;
    private float   PROMEDIO_PRODUCTO;
    
    
    public float getPROMEDIO_PRODUCTO() {
        return PROMEDIO_PRODUCTO;
    }

    public void setPROMEDIO_PRODUCTO(float PROMEDIO_PRODUCTO) {
        this.PROMEDIO_PRODUCTO = PROMEDIO_PRODUCTO;
    }
 


    public float getVALOR_PRODUCTO() {
        return VALOR_PRODUCTO;
    }

    public void setVALOR_PRODUCTO(float VALOR_PRODUCTO) {
        this.VALOR_PRODUCTO = VALOR_PRODUCTO;
    }
    

    
  

    public float getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(float CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getNOMBRE_UNIDAD() {
        return NOMBRE_UNIDAD;
    }

    public void setNOMBRE_UNIDAD(String NOMBRE_UNIDAD) {
        this.NOMBRE_UNIDAD = NOMBRE_UNIDAD;
    }

    public String getNOMBRE_PRODUCTO() {
        return NOMBRE_PRODUCTO;
    }

    public void setNOMBRE_PRODUCTO(String NOMBRE_PRODUCTO) {
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
    }

    public float getCANTIDAD_DE_PRODUCCION() {
        return CANTIDAD_DE_PRODUCCION;
    }

    public void setCANTIDAD_DE_PRODUCCION(float CANTIDAD_DE_PRODUCCION) {
        this.CANTIDAD_DE_PRODUCCION = CANTIDAD_DE_PRODUCCION;
    }

    public float getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(float PRECIO) {
        this.PRECIO = PRECIO;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public void getCODIGO(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getNOMBRE_UNIDAD(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getNOMBRE_PRODUCTO(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getCANTIDAD_DE_PRODUCCION(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getPRECIO(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getFECHA(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
