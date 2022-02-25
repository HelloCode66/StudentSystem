<%--
  Created by IntelliJ IDEA.
  User: lihao
  Date: 2022/2/24
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加学生</title>
</head>
<body>
    <h1>学生信息管理系统--添加学生</h1>
    <hr>
    <form action="/stuadd" method="post">
        姓名：<input type="text" name="username"> <br>
        年龄：<input type="number" name="age"> <br>
        成绩：<input type="number" name="score">   <br>
        <button type="submit">添加</button>
    </form>
</body>
</html>
