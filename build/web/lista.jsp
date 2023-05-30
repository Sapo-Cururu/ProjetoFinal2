<%@page import="model.ProdutoDAO" %>
<%@page import="model.Produto" %>
<%@include file="verify.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mercadinho</title>
    </head>
    <body>
        <h1>Lista</h1>
            <table>
                <thead>
                    <th>ID</th>
                    <th>NOME</th>
                    <th>PREÇO</th>
                    <th></th>
                    <th></th>
                </thead>
                <tbody>
            
        <%
                ProdutoDAO produtoDao = new ProdutoDAO();
                
                
                for(Produto item : produtoDao.listProduto()){
                    %>
                  <tr>
                    <td><%= item.getId() %></td>
                    <td><%= item.getName()%></td>
                    <td><%= item.getPrice()%>R$</td>
                  </tr>
               <%
                }
           %>
                </tbody>
           </table>
        <hr>
        <a href="home.jsp" title="Página inicial">Página inicial</a>       
    </body>
</html>