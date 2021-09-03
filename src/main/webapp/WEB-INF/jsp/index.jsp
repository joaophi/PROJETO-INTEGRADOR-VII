<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Projetos</title>
    <link rel='stylesheet' href='<c:url value="/webjars/bootstrap/5.1.0/css/bootstrap.min.css"/>'>
</head>
<body>
<div class="container h-100">
    <div class="row h-100">
        <div class="col-3">
            <nav class="navbar navbar-light bg-light">
                <div class="container-fluid">
                    <span class="navbar-brand mb-0 h1">Projetos</span>
                    <button type="button" class="btn btn-primary">Novo</button>
                </div>
            </nav>
            <div class="list-group">
                <c:forEach var="projeto" items="${projetos}">
                    <a href="#" class="list-group-item list-group-item-action">
                        <div class="d-flex w-100 justify-content-between">
                            <h5 class="mb-1">Projeto x</h5>
                        </div>
                        <p class="mb-1">Descrição do projeto X.</p>
                    </a>
                </c:forEach>
            </div>
        </div>
        <div class="col-9">
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Funcionais</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Não funcionais</a>
                </li>
            </ul>
            <div class="list-group">
                <a href="#" class="list-group-item list-group-item-action">
                    <div class="d-flex w-100 justify-content-between">
                        <h5 class="mb-1">RF001 - Funcionar</h5>
                    </div>
                    <p class="mb-1">O projeto deve funcionar.</p>
                    <button type="button" class="btn btn-primary">Editar</button>
                    <button type="button" class="btn btn-secondary">Excluir</button>
                </a>
                <a href="#" class="list-group-item list-group-item-action">
                    <div class="d-flex w-100 justify-content-between">
                        <h5 class="mb-1">RF002 - Não travar</h5>
                    </div>
                    <p class="mb-1">O projeto não deve travar.</p>
                    <button type="button" class="btn btn-primary">Editar</button>
                    <button type="button" class="btn btn-secondary">Excluir</button>
                </a>
            </div>
            <button type="button" class="btn btn-primary">Novo</button>
            <button type="button" class="btn btn-secondary">Histórico</button>
        </div>
    </div>
</div>
</body>
</html>
