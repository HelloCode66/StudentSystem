<%--
  Created by IntelliJ IDEA.
  User: lihao
  Date: 2022/2/24
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body>
<h1>学生信息管理系统--登录</h1>
<hr>
<form action="/stulogin" method="post">
    用户名:<input type="text" name="username">
    密码:<input type="password" name="password">
    <button type="submit">登录</button>
</form>
</body>
</html>
