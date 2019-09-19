/*
Autor: Jose Elkin Vargas Alarcon
 */
package condicinales;

import java.util.Scanner;

public class swicth {
   public static void main(String[] args) { 
       
    Scanner entrada = new Scanner(System.in);
    
    int numeroestudiantes=0;
    int numerocalificaciones=0;
    int Estudiante=1;

  
    System.out.println("==Registro de calificaciones===");
    
    System.out.println("Ingrese el numero de estudiantes: ");
    numeroestudiantes= entrada.nextInt();
    
    System.out.println("Ingrese la calificacion: "+ numerocalificaciones);
    numerocalificaciones= entrada.nextInt();
    
    while(numeroestudiantes<=numerocalificaciones){
        
    System.out.println("ingresa las notas: ");
    
     

    switch( numerocalificaciones){
        
        case 10;
        case 9;
            System.out.println("Excelente"); 
           
            break;
   
        case 8;
        case 7;
        case 6;
             System.out.println("Bueno");
             co
             break;
        case 5;
        case 4;
             System.out.println("Regular"); 
             break;        
        case 3;
        case 2;
        case 1;    
             System.out.println("Malo");        
             break;       
          
    }
   
    }
    
   }  
}
