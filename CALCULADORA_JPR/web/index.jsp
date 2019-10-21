<%-- 
    Document   : index
    Created on : 18/10/2019, 03:49:00 PM
    Author     : ADSI-1802853
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
                 <center>
            <h1>CALCULADORA</h1>
         <form>
            <tr>
            <div class="contenedor">

                <table border> 
                    <tr ><td colspan="4" ><input type="text" id="pantalla" /></td></tr>
                    <td><button type="button" class="boton1" onclick="Asignar_uno()" id="uno">1</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_dos()" id="dos">2</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_tres()" id="tres">3</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_sumar()" id="suma">+</button></td>
                   
                    </tr>
                   
                    <tr><td><button type="button" class="boton1" onclick="Asignar_cuatro()" id="cuatro">4</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_cinco()" id="cinco">5</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_seis()" id="seis">6</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_restar()" id="resta">-</button></td>
                   
                    </tr>
                 
                    <tr><td><button type="button" class="boton1" onclick="Asignar_siete()" id="siete">7</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_ocho()" id="ocho">8</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_nueve()" id="nueve">9</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_multiplicar()" id="multiplicacion">*</button></td>
                   
                    </tr>
                    <tr><td><button type="button" class="boton1" onclick="Asignar_cero()" id="cero">0</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_reset()" id="reset">CE</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_Igual()" id="igual">=</button></td>
                    <td><button type="button" class="boton1" onclick="Asignar_division()" id="division">/</button></td>
                   
                    </tr>
                    
                   </table>
                
              </tr>
          </form

    </body>
    <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
    <script>
    
    
    var valor="";
    var dato1="";
    var dato2="";
    var operacion="";
    
        function Asignar_uno(){
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+'1');
        }
        function Asignar_dos(){
        
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+'2');
        }
        function Asignar_tres(){
        
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+'3');
    }
 
       
        function Asignar_cuatro(){
        
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+'4');
        }
        function Asignar_cinco(){
        
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+'5');
        }
        function Asignar_seis(){
        
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+'6');
        }
        function Asignar_siete(){
        
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+7);
        }
        function Asignar_ocho(){
        
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+'8');
        }
        function Asignar_nueve(){
        
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+'9');
        }
        function Asignar_cero(){
        
        valor=$('#pantalla').val();
        $('#pantalla').val(valor+'0');
        }
        function Asignar_sumar(){
    
        dato1= $('#pantalla').val();
        valor="";
        $('#pantalla').val(valor="");
        operacion = "suma";
        
        }
        function Asignar_restar(){
        
        dato1= $('#pantalla').val();
        $('#pantalla').val(valor="");
        operacion = "resta";

        
        }
        function Asignar_multiplicar(){
        
        dato1= $('#pantalla').val();
        $('#pantalla').val(valor="");
        operacion = "multiplicacion";

        
        }
        function Asignar_division(){ 
        dato1= $('#pantalla').val();
        $('#pantalla').val(valor="");
        operacion ="division" ;

        
        }
        
        function Asignar_reset(){
            dato1=0;
            dato2=0;
            $('#pantalla').val("");
        }
       
           

     function Asignar_Igual(){
        
        switch (operacion){
            case "suma":
         dato2=$('#pantalla').val();
     $('#pantalla').val(parseFloat(dato1)+parseFloat(dato2));
     break;
 
        
            case "resta":
            dato2=$('#pantalla').val();
     $('#pantalla').val(parseFloat(dato1)-parseFloat(dato2));
     break;
 
        
    case "multiplicacion":
            dato2=$('#pantalla').val();
     $('#pantalla').val(parseFloat(dato1)*parseFloat(dato2));
     break;
 
        
        case "division":         
            dato2=$('#pantalla').val();
     $('#pantalla').val(parseFloat(dato1)/parseFloat(dato2));
     
 break;
        }
    }
   
        
    </script>

</html>
