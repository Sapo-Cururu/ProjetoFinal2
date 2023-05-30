<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.User"%>

<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        
            <div class="div">
            <form action="login_controller" method="post">
                <h1 class="title">Login: </h1> 
                <h2>Username: <input type="text" placeholder="Username" name="user" id="user" required></h2>
                <h2>Password: <input type="password" placeholder="Password" name="password" id="password" required></h2>
                <input type="submit" class="button" >
            </form>
            </div>
       
    </body>
</html>

