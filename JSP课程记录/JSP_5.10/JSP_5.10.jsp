<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 5/10
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>创建cookie对象</title>
</head>
<body>
<%--session内置对象--%>
<%--cookie的四个方法，cookie是一个类--%>
<%--创建一个脚本标记--%>
<%
//    request.setCharacterEncoding("UTF-8");
    //1.创建cookie对象
    Cookie cookie1 = new Cookie("bookname","张三");//cookie类型的对象
    Cookie cookie2 = new Cookie("author","1");
    //2.response.addCookie()；发送给浏览器
    response.addCookie(cookie1);
    response.addCookie(cookie2);
    //3.获取cookie
//    Cookie[] cookies = request.getCookies();//一维数组
//    out.print(cookie1,cookie2);

    response.sendRedirect("temp.jsp");//重定向
%>
</body>
</html>
