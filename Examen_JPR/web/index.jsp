<%-- 
    Document   : index
    Created on : 29/11/2019, 08:36:01 AM
    Author     : ADSI-1802853
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="Css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body background="kk.jpg">
                        <form>
            <tr>
               <center>
                   <font color="white">  <h3>Registro Unidades Productivas</h3> </font>
                   
                   <table >
                       <tr><td><font color="white">CODIGO</font></td><td><input type="number" id="codigo" /></td></tr>
                       <tr><td><font color="white">NOMBRE UNIDAD</font></td><td><input type="text" id="nomunidad"/></td></tr>
                       <tr><td><font color="white">NOMBRE PRODUCTO</font></td><td><input type="text" id="nomproducto"/></td></tr>
                       <tr><td><font color="white">CANTIDAD DE PRODUCCION</font></td><td><input type="number" id="canproduccion"/></td></tr>
                       <tr><td><font color="white">PRECIO</font></td><td><input type="number" id="precio"/></td></tr>
                       <tr><td><font color="white">FECHA</font></td><td><input type="date" id="fecha"/></td></tr>                       
                       <tr><td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Registrar_Unidades_Productivas()">
                                      REGISTRAR</button></td>
                                 <td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Listar_Unidades_Productivas()">
                                             LISTAR</button></td>
                             <td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Listar_Unidades_Productivas_json()">
                                             LISTAR JSON</button></td>
                                 </tr>
                   </table>
                   <div id="respuesta_servidor"></div>
               </center>            
        </form>
    <center>    
        <hr>
        <table border="1" bgcolor="white">
            <caption><font color="white">LISTA DE UNIDADES PRODUCTIVAS REGISTRADAS</font></caption>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>CODIGO</th>
                    <th>NOMBRE UNIDAD</th>
                    <th>NOMBRE PRODUCTO</th>
                    <th>CANTIDAD DE PRODUCCION</th>
                    <th>PRECIO</th>
                    <th>FECHA</th>
                    <th>VALOR PRODUCTO</th>
                    <th>PROMEDIO PRODUCTO</th>
                    <th>ADMIN</th>
                   
                </tr>
            </thead>
            <tbody id="Lista_Unidades_Productivas"> <!-- Cuerpo de la tabla-->
        
        
    
    </table>
    </center>
    
    </body>
    <script src="Js/Js_Examen.js" type="text/javascript"></script>
    <script src="Js/jquery-3.4.1.min.js" type="text/javascript"></script>
    
</html>
