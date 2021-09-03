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
                <label for="numero" class="form-label">Número</label>
                <input type="text" class="form-control" id="numero" value="RF001" readonly>
            </div>
            <div class="mb-3">
                <label for="resumo" class="form-label">Resumo</label>
                <input type="text" class="form-control" id="resumo">
            </div>
            <div class="mb-3">
                <label for="descricao" class="form-label">Descrição:</label>
                <textarea class="form-control" id="descricao" rows="3"></textarea>
            </div>
            <button type="button" class="btn btn-primary">Salvar</button>
        </div>
    </div>
</div>
</body>
</html>
