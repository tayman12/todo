<%--
  Created by IntelliJ IDEA.
  User: Tocka Ayman
  Date: 5/5/2018
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            <h3><spring:message code="todo.new.details"/></h3>
            <br/>
            <form:form modelAttribute="todo">
                <div class="control-group">
                    <spring:message code="todo.title"/>
                    <form:input path="title"/>
                </div>

                <div class="control-group">
                    <spring:message code="todo.description"/>
                    <form:input path="description"/>
                </div>

                <div class="control-group">
                    <spring:message code="todo.frequency"/>
                    <form:input path="frequency"/>
                </div>

                <input type="submit" class="btn btn-primary" value="<spring:message code="button.add.todo"/>"/>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
