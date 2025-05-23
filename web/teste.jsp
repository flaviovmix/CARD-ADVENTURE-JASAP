<%@ page import="br.jasap.core.*"%>
<%@ page import="br.root.app.aula1.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><a href="<%= AppManager.url(Aula1Action.Hello.class) %>">Chama Action</a></h1>
    </body>
</html>