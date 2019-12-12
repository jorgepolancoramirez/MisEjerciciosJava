<%-- 
    Document   : index
    Created on : 6/12/2019, 08:19:13 AM
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
                   <font color="white">  <h3>FORMULARIO DE REGISTROS DE INSUMOS</h3> </font>
                   
                   <table >
                       <tr><td><font color="white">CODIGO DE INSUMO</font></td><td><input type="text" id="cod_insumo" /></td></tr>
                       <tr><td><font color="white">NOMBRE</font></td><td><input type="text" id="nombre" /></td></tr>
                       <tr><td><font color="white">CANTIDAD</font></td><td><input type="text" id="cantidad"/></td></tr>
                       <tr><td><font color="white">TIPO</font></td><td><input type="text" id="tipo"/></td></tr>
                       <tr><td><font color="white">FECHA CADUCIDAD</font></td><td><input type="date" id="fec_caducidad"/></td></tr>
                       <tr><td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Registrar_Insumos()">
                                      REGISTRAR</button></td>
                                 <td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Listar_Insumos()">
                                             LISTAR</button></td>
                             <td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Listar_Insumos_json()">
                                             LISTAR JSON</button></td>
                                 </tr>
                   </table>
                   <div id="respuesta_servidor"></div>
               </center>            
        </form>
    <center>    
        <hr>
        <table border="1" bgcolor="white">
            <caption><font color="white">LISTA DE INSUMOS REGISTRADOS</font></caption>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>CODIGO DE INSUMO</th>
                    <th>NOMBRE</th>
                    <th>CANTIDAD</th>
                    <th>TIPO</th>
                    <th>FECHA CADUCIDAD</th>
                    <th>ADMIN</th>
                   
                </tr>
            </thead>
            <tbody id="Lista_Insumos"> <!-- Cuerpo de la tabla-->
        
        
    
    </table>
    </center>
    
    </body>
    <script src="Js/Js_Insumos.js" type="text/javascript"></script>
    <script src="Js/jquery-3.4.1.min.js" type="text/javascript"></script>
</html>
