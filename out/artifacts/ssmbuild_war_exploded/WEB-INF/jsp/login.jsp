<%--
  Created by IntelliJ IDEA.
  User: aijian
  Date: 2020/3/17
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>登陆页</h1>
<form action="${pageContext.request.contextPath}/book/login" method="post">
    用户名：<input type="text" name="username"><br/>
    密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"><br/>
    <input type="submit" value="登陆"><span style="color: red">${error}</span>
</form>
</body>
</html>
