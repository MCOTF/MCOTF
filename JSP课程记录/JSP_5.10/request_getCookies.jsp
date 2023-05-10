<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 5/10
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //1.获取Cookie
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {//
        out.print("对象名"+cookie.getName()+"---"+cookie.getValue()+"<br>");
    }

%>
</body>
</html>
