<%-- 
    Document   : index
    Created on : 11/10/2019, 11:04:36 AM
    Author     : ADSI-1802853
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calculadora con jsp</title>
    </head>
    <body>
    <center><h1>MI CALCULADORA</h1> </center>
        <form action="calculadora2" method="post">
                    <center> <table>
                            <tr><td>valor 1</td><td><input type="number"name="valor1"/></td></tr>
                            <tr><td>valor 2</td><td><input type="number"name="valor2"/></td></tr>
                            <tr><td><input type="submit"name="operacion"value="sumar"/></td>
                            <tr><td><input type="submit"name="operacion"value="restar"/></td>
                            <tr><td><input type="submit"name="operacion"value="multiplicacion"/></td>
                            <tr><td><input type="submit"name="operacion"value="dividir"/></td>
                            </tr>              
                </table>                  
                    </center>

        </form>
    </body>
</html>
