<%-- 
    Document   : index
    Created on : 6/12/2019, 08:45:43 AM
    Author     : FORMACION
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
                <font color="white" size="6"><h1>FORMULARIO DE REGISTRO DE ELEMENTOS</h1></font>
                <table>
                    <tr><td><font color="white" size="4">CODIGO</font></td> <td><input type="text" id="Codigo"/></td></tr>
                    <tr><td><font color="white" size="4">NOMBRE</font></td> <td><input type="text" id="Nombre"/></td></tr>
                    <tr><td><font color="white" size="4">VALOR</font></td> <td><input type="number" id="Valor"/></td></tr>
                    <tr><td><font color="white" size="4">CANTIDAD</font></td> <td><input type="number" id="Cantidad"/></td></tr>
                    <tr><td colspan="3" aling="center"> <button type="button" class="boton1" onclick="Registrar_Elementos()">
                                REGISTAR</button></td>
                    <td colspan="3" aling="center"> <button type="button" class="boton1" onclick="Listar_Elementos()">
                                LISTAR</button></td>
                                <td colspan="3" aling="center"> <button type="button" class="boton1" onclick="Listar_Elementos_Json()">
                                LISTAR_JSON</button></td> 
                    </tr>               
                </table>
                <div id="respuesta_servidor"></div>
            </center>
        </form>
        <center>
        <hr>
        <table border="1" bgcolor="white">
            <caption><font color="white" size="4"><h3>LISTA DE ELEMENTOS</h3></font></caption>
            <thead color="white">
                <tr>
                    <th>ID</th>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Valor</th>
                    <th>Cantidad</th>
                    <th>Admin</th>
                </tr>
            </thead>
            <tbody id="Listar_Elementos"> <!-- cuerpo de la tabla-->
        </table>
    </center>
    </body> 
        <script src="Js/Elementos.js" type="text/javascript"></script>
    <script src="Js/jquery-3.4.1.min.js" type="text/javascript"></script>
</html>
