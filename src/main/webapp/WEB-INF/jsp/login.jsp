<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <link rel='stylesheet' href='<c:url value="/webjars/bootstrap/5.1.0/css/bootstrap.min.css"/>'>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-4">
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" placeholder="name@example.com">
            </div>
            <div class="mb-3">
                <label for="senha" class="form-label">Senha</label>
                <input type="password" class="form-control" id="senha" placeholder="**********">
            </div>
            <button type="button" class="btn btn-primary">Entrar</button>
        </div>
    </div>
</div>
</body>
</html>
