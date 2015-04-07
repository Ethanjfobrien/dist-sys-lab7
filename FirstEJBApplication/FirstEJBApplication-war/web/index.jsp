<%-- 
    Document   : index
    Created on : 07-Apr-2015, 11:13:57
    Author     : puser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello BEAN app!</h1>
        <form action="HelloServlet" method="POST">
            <input type="text" name="formName">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
