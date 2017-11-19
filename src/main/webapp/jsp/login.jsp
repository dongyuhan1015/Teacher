<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/9/27
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>教师登录</title>
</head>
<body>
<center>
    <form action="${pageContext.request.contextPath}/user/doLogin" method="post">
        用户名：<input type="text" name="username" placeholder="请输入用户名">
        密码：<input type="password" name="userpwd" placeholder="请输入密码">
        <input type="submit" value="登录">

    </form>
</center>
</body>
</html>
