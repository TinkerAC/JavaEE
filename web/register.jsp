<%--
  Created by IntelliJ IDEA.
  User: QAQ
  Date: 2024/3/13
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>

<body>
<p>用户注册</p>
<form action="HelloServlet" method="post">
    <p>用户名：<input type="text" name="username"></p>
    <p>密码：<input type="password" name="password"></p>
    <p>信息来源：<input type="text" name="channel">
    <input name="channel" type="checkbox" value="Newspaper">报纸
    <input name="channel" type="checkbox" value="Internet">互联网
    <input name="channel" type="checkbox" value="Friends">朋友</p>
    <p><input type="submit" value="提交"><input type="reset " value="重置"></p>
</form>


</body>
</html>
