<%-- 
    Document   : index
    Created on : 11/10/2019, 01:26:55 PM
    Author     : ADSI-1802853
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center><h1>calcular area triangulo</h1></center>
        <form action="con_triangulo" method="post"> 
        <center> <table>
            <tr><td>base</td><td><input type="number"name="base"/></td></tr>
            <tr><td>altura</td><td><input type="number"name="altura"/></td></tr>
            <tr><td><input type="submit"name="operacion"value="calcular"/></td>
            </table>
        </center>
        </form>
        
    </body>
</html>
