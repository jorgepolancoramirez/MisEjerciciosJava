/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ADSI-1802853
 */
public class Insumos {
    
    private String CODIGO_INSUMO;
    private String NOMBRE;
    private String CANTIDAD;
    private String  TIPO;
    private String  FECHA_CADUCIDAD;

    public String getCODIGO_INSUMO() {
        return CODIGO_INSUMO;
    }

    public void setCODIGO_INSUMO(String CODIGO_INSUMO) {
        this.CODIGO_INSUMO = CODIGO_INSUMO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(String CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getFECHA_CADUCIDAD() {
        return FECHA_CADUCIDAD;
    }

    public void setFECHA_CADUCIDAD(String FECHA_CADUCIDAD) {
        this.FECHA_CADUCIDAD = FECHA_CADUCIDAD;
    }
    


}
