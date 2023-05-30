

<%@page import="model.User" %>
<%
    User u = (User)session.getAttribute("userSession");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bem vindo <%= (u != null) ? u.getLogin() : "Visitante"%></h1>
        <button onclick="window.location.href='cadastro.jsp'">Cadastrar</button>
        <button onclick="window.location.href='lista.jsp'">Listar</button>
    </body>
</html>
