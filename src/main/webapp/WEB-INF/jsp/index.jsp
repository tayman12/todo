<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="todo.app.title"/></title>

    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">

    <style>
        body {
            padding-top: 60px;
        }
    </style>
</head>
<body>
<div class="navbar navbar-fixed-top navbar-inverse">
    <div class="navbar-inner">
        <div class="container">
            <a class="brand" href="todo.html"><spring:message code="navbar.get.started"/></a>
            <ul class="nav"></ul>
        </div>
    </div>
</div>
<div class="container">
    <div class="hero-unit">
        <div>
            <h1><spring:message code="index.welcome"/></h1>
            <p><spring:message code="index.getting.started"/></p>
        </div>
        <a class="btn btn-primary" href="todo.html"><spring:message code="button.add.todo"/> </a>
    </div>
</div>
</body>
</html>