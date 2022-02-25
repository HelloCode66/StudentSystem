<%@ page import="java.util.ArrayList" %>
<%@ page import="studentSystem.bean.Student" %>
<%--
  Created by IntelliJ IDEA.
  User: lihao
  Date: 2022/2/24
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入JSTL--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
    <title>查看学生</title>
</head>
<body>
    <h1>学生信息管理系统--查看学生</h1>
    <hr>
    <table width="600px" border="1px" align="center">
        <tr>
            <th>姓名</th>
            <th>年龄</th>
            <th>成绩</th>
        </tr>
        <c:forEach items="${students}" var="stu">
            <tr>
                <td>${stu.username}</td>
                <td>${stu.age}</td>
                <td>${stu.score}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
