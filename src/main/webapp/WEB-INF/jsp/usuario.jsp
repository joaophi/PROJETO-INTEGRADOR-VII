<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel='stylesheet' href='<c:url value="/webjars/bootstrap/5.1.0/css/bootstrap.min.css"/>'>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-4">
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email">
            </div>
            <div class="mb-3">
                <label for="senha" class="form-label">Senha</label>
                <input type="password" class="form-control" id="senha">
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
                <label class="form-check-label" for="flexCheckChecked">
                    Administrador
                </label>
            </div>
            <button type="button" class="btn btn-primary">Salvar</button>
        </div>
    </div>
</div>
</body>
</html>
