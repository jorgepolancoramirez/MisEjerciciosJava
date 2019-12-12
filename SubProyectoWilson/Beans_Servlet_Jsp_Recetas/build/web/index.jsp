<%-- 
    Document   : index
    Created on : 6/12/2019, 09:16:17 AM
    Author     : ADSI-1802853
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
               <body background="hh.jpg">
                <form>
            <tr>
               <center>
                   <font color="white">  <h3>FORMULARIO DE REGISTROS DE RECETAS</h3> </font>
                   
                   <table >
                       <tr><td><font color="white">NOMBRE</font></td><td><input type="text" id="nombre" /></td></tr>
                       <tr><td><font color="white">INGREDIENTES</font></td><td><input type="text" id="ingredientes"/></td></tr>
                       <tr><td><font color="white">PREPARACION</font></td><td><input type="text" id="preparacion"/></td></tr>
                       <tr><td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Registrar_Recetas()">
                                      REGISTRAR</button></td>
                                 <td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Listar_Recetas()">
                                             LISTAR</button></td>
                             <td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Listar_Recetas_json()">
                                             LISTAR JSON</button></td>
                                 </tr>
                   </table>
                   <div id="respuesta_servidor"></div>
               </center>            
        </form>
    <center>    
        <hr>
        <table border="1" bgcolor="white">
            <caption><font color="white">LISTA DE RECETAS REGISTRADAS</font></caption>
            <thead>
                <tr>
                    <th>COD</th>
                    <th>NOMBRE</th>
                    <th>INGREDIENTES</th>
                    <th>PREPARACION</th>
                    <th>ADMIN</th>
                   
                </tr>
            </thead>
            <tbody id="Lista_Recetas"> <!-- Cuerpo de la tabla-->
        
        
    
    </table>
    </center>
               <script src="Js/Js_Recetas.js" type="text/javascript"></script>
               <script src="Js/jquery-3.4.1.min.js" type="text/javascript"></script>
    </body>
</html>
