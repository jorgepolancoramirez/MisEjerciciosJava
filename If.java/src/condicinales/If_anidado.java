/*
Autor Jose Elkin Vargas
 */
package condicinales;

import java.util.Scanner;

public class If_anidado {
    
    public static void main(String[] args) {
        
       Scanner input= new Scanner(System.in);
       
       //Para validar contraseña
       
      String UserDB = "Elkin";
      String PassDB = "Vargas2678";
      String UserIng= "";
      String PassIng="";
     
       
     
       
       System.out.println("por favor ingrese su usuario: ");
       
       UserDB=input.nextLine();
     
      
      if(UserIng.equals(UserDB)){
           System.out.println("Por favor ingrese su contraseña: ");
           PassIng= input.nextLine();
           
           if(PassIng.equals(PassDB)){
               System.out.println("Bienvenido");
            }
      }
          else{
          System.out.println("contraseña incorrecta")
             }
           else{
           System.out.println("usuario incorrecto");
       }
       
    
    
    }
}
    

