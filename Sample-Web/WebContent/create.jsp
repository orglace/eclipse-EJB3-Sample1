<%-- 
    Document   : create
    Created on : Feb 18, 2016, 9:39:58 PM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Customer</title>
    </head>
    <body>
        <a href="index.html">Back to Menu</a>
        <br><br>
        <form action="AccountController" method="POST">
            <input type="text" name="firstName" placeholder="First Name" />
            <input type="text" name="lastName" placeholder="Last Name"/>
            
            <input type="submit" value="Create"/>
        </form>
    </body>
</html>
