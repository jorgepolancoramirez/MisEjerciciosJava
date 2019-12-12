<%-- 
    Document   : index
    Created on : 8/11/2019, 03:47:28 PM
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
    <body background="hh.jpg">
                <form>
            <tr>
               <center>
                   <font color="white">  <h3>FORMULARIO DE REGISTROS DE PROVEEDORES</h3> </font>
                   
                   <table >
                       <tr><td><font color="white">NOMBRE</font></td><td><input type="text" id="nombre" /></td></tr>
                       <tr><td><font color="white">CEDULA</font></td><td><input type="text" id="cedula"/></td></tr>
                       <tr><td><font color="white">TELEFONO</font></td><td><input type="text" id="telefono"/></td></tr>
                       <tr><td><font color="white">CIUDAD</font></td><td><input type="text" id="ciudad"/></td></tr>
                       <tr><td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Registrar_proveedores()">
                                      REGISTRAR</button></td>
                                 <td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Listar_proveedores()">
                                             LISTAR</button></td>
                             <td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Listar_Estudiantes_json()">
                                             LISTAR JSON</button></td>
                                 </tr>
                   </table>
                   <div id="respuesta_servidor"></div>
               </center>            
        </form>
    <center>    
        <hr>
        <table border="1" bgcolor="white">
            <caption><font color="white">LISTA DE PROVEEDORES REGISTRADOS</font></caption>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>cedula</th>
                    <th>telefono</th>
                    <th>ciudad</th>
                    <th>Admid</th>
                   
                </tr>
            </thead>
            <tbody id="Lista_proveedores"> <!-- Cuerpo de la tabla-->
        
        
    
    </table>
    </center>
    
    </body>
    <script src="Js/Js_Proveedores.js" type="text/javascript"></script>
    <script src="Js/jquery-3.4.1.min.js" type="text/javascript"></script>
</html>
