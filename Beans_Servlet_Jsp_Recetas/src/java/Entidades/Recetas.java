/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class Recetas {
    private String NOMBRE;
    private String INGREDIENTES;
    private String  PREPARACION;
    
    
    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getINGREDIENTES() {
        return INGREDIENTES;
    }

    public void setINGREDIENTES(String INGREDIENTES) {
        this.INGREDIENTES = INGREDIENTES;
    }

    public String getPREPARACION() {
        return PREPARACION;
    }

    public void setPREPARACION(String PREPARACION) {
        this.PREPARACION = PREPARACION;
    }

}
