<%-- 
    Document   : arithmeticcalculator
    Created on : 18-Jan-2022, 11:09:27 AM
    Author     : kinza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="ArithmeticCalculatorServlet" method="post">
            
            
            <label for= "first" >Enter first number :</label>
            <input type="text" id="first" name="first">
            <br>
            <label for= "second" >Enter Second number :</label>
            <input type="text" id="second" name="second">
            <br>
           
             <input type="submit" name="operation" value="+">
             <input type="submit" name="operation" value="-">
             <input type="submit" name="operation" value="*">
             <input type="submit" name="operation" value="%">
             
                
                
            
        </form>
             <p>${message}</p>
             <a href="age">Age Calculator</a>
    </body>
</html>
