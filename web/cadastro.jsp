<%@include file="verify.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mercadinho</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        <h2>Produto</h2>
        <form action="ProdutoController" method="post">
            <input type="text" placeholder="Nome do Produto" name="product_name" maxlength="30" required>
            <input type="number" placeholder="Preço do Produto" name="product_price" max="10000" required>
            <input type="number" placeholder="Id do produto" name="product_id" max="9999" step="1" required>
            <input type="submit" value="Registrar">       
        </form>
        <a href="home.jsp" title="Página inicial">Página inicial</a>
    </body>
</html>
