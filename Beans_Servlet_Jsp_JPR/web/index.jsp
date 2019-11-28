<%-- 
    Document   : index
    Created on : 8/11/2019, 09:09:05 AM
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
    <body background="jorge.jpg">
        
        <form>
            <tr>
               <center>
                   <font color="white"> <h3>FORMULARIO DE REGISTRAR ESTUDIANTES</h3> </font>
                   
                   <table>
                       <tr><td><font color="white">NOMBRE</font></td><td><input type="text" id="Nombre"/></td></tr>
                       <tr><td><font color="white">NOTA 1</font></td><td><input type="text" id="Nota1"/></td></tr>
                       <tr><td><font color="white">NOTA 2</font></td><td><input type="text" id="Nota2"/></td></tr>
                       <tr><td><font color="white">NOTA 3</font></td><td><input type="text" id="Nota3"/></td></tr>
                       <tr><td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Registrar_Estudiantes()">
                                      REGISTRAR</button></td>
                                 <td colspan="3" aling="center">  <button type="button" class="boton3" onclick="Listar_Estudiantes()">
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
            <caption><font color="white">LISTA DE ESTUDIANTES REGISTRADOS</font></caption>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Nota1</th>
                    <th>Nota2</th>
                    <th>Nota3</th>
                    <th>Definitiva</th>
                    <th>Admid</th>
                </tr>
            </thead>
            <tbody id="Listar_Estudiantes"> <!-- Cuerpo de la tabla-->
            </tbody>
        
    
    </table>
    </center>
    </body>
    <script src="Js/Js_Estudiantes.js" type="text/javascript"></script>
    <script src="Js/jquery-3.4.1.min.js" type="text/javascript"></script>
</html>
