<%--
  Created by IntelliJ IDEA.
  User: lihao
  Date: 2022/2/24
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入JSTL--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
    <title>学生信息管理系统</title>
</head>
<body>
    <h1>学生信息管理系统--首页</h1>
    <hr>
    <c:if test="${sessionScope.username ne null}">
        <a href="/add.jsp">添加学生信息</a>
        <a href="/stulist">查看学生信息</a>
    </c:if>
    <c:if test="${sessionScope.username eq null}">
        <a href="/login.jsp">请登录</a>
    </c:if>
</body>
</html>
