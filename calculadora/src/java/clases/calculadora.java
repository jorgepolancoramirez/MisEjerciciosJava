// autor: jorge polanco ramirez
package clases;

public class calculadora {
    public float valor1;
    public float valor2;
    public float resultado;
    
    public void calcular_Suma(){
        this.resultado=this.valor1+this.valor2;
    }
    public void calcular_Resta(){
        this.resultado=this.valor1-this.valor2;
    }
    public void calcular_Multiplicacion(){
        this.resultado=this.valor1*this.valor2;
    }
   
        public void calcular_Division(){
        this.resultado=this.valor1/this.valor2;
    
    }
}
