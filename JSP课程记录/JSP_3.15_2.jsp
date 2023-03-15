<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 2023/3/15
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>这是被跳转的页面</title>
</head>
<body>
<h1>这是被跳转的页面，且用作错误跳转</h1>
<%
    //异常接收
    out.print(exception.getMessage());// / by zero
%>
</body>
</html>
