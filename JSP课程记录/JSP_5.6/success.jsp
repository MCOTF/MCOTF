<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 5/6
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功页面</title>
</head>
<body>
<h1>登录成功:</h1>
<%
    String xianshiname = request.getParameter("uname");//如果只执行到这里，name内容则会为空（null）
    //解决方法：请求转发

    out.print("欢迎!"+xianshiname);
%>
</body>
</html>
