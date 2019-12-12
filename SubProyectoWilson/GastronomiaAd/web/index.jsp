<%-- 
    Document   : index
    Created on : 6/12/2019, 11:02:09 AM
    Author     : FORMACION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <body background="gastro1.jpg">
        <form>
            <tr>
            <center>
                <font color="black" size="6"><h1>FORMULARIO DE REGISTRO DE ADMINISTRADORES</h1></font>
                <table>
                    <tr><td><font color="black" size="4">IDENTIFICACION</font></td> <td><input type="text" id="identificacion"/></td></tr>
                    <tr><td><font color="black" size="4">NOMBRE</font></td> <td><input type="text" id="Nombre"/></td></tr>
                    <tr><td><font color="black" size="4">APELLIDO</font></td> <td><input type="text" id="Apellido"/></td></tr>
                    <tr><td><font color="black" size="4">TELEFONO</font></td> <td><input type="text" id="Telefono"/></td></tr>
                    <tr><td><font color="black" size="4">CORREO</font></td> <td><input type="text" id="Correo"/></td></tr>
                    <tr><td colspan="3" aling="center"> <button type="button" class="boton1" onclick="Registrar_Administradores()">
                                REGISTAR</button></td>
                    <td colspan="3" aling="center"> <button type="button" class="boton1" onclick="Listar_Administradores()">
                                LISTAR</button></td>
                                <td colspan="3" aling="center"> <button type="button" class="boton1" onclick="Listar_Administradores_Json()">
                                LISTAR_JSON</button></td> 
                    </tr>               
                </table>
                <div id="respuesta_servidor"></div>
            </center>
        </form>
        <center>
        <hr>
        <table border="1" bgcolor="white">
            <caption><font color="black" size="4"><h3>LISTA DE ADMINISTRADORES</h3></font></caption>
            <thead color="white">
                <tr>
                    <th>IDENTIFICACION</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>TELEFONO</th>
                    <th>CORREO</th>
                    <th>Admin</th>
                </tr>
            </thead>
            <tbody id="Listar_Administrador"> <!-- cuerpo de la tabla-->
        </table>
    </center>
    </body>
    <script src="js/Administrador.js" type="text/javascript"></script>
    <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
</html>
