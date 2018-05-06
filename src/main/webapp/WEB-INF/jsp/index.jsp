<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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

        <sec:authorize access="hasRole('USER')">
            <a class="btn btn-primary" href="todo.html"><spring:message code="button.add.todo"/> </a>
        </sec:authorize>

        <sec:authorize access="!isAuthenticated()">
            <a class="btn btn-warning" href="login"><spring:message code="button.login"/> </a>
        </sec:authorize>

        <sec:authorize access="isAuthenticated()">
            <a class="btn btn-warning" href="logout.html"><spring:message code="button.logout"/> </a>
        </sec:authorize>
    </div>
</div>
</body>
</html>