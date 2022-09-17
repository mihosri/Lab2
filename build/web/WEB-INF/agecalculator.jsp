<%-- 
    Document   : agecalculator
    Created on : 12-Sep-2022, 12:31:16 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="POST">
            <label> Enter your age: </label><!-- comment -->
            <input type="number" id="age" name="age" value="">
            <br>
            <br>
            <button type="submit"><strong> Age Next Birthday </strong> </button>
        </form>
        <% if (request.getAttribute("age")!= null) { %>
        <p> Your age after next birthday: <%= request.getAttribute("age") %>
        <% } %>
        
        <% if (request.getAttribute("message") != null) { %>
        <p> <%= request.getAttribute("message") %> </p>
        <% } %>
        
        <a href="/lab2/arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
 