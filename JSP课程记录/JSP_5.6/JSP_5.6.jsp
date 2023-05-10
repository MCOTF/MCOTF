<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 5/6
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>刷新时间</title>
</head>
<body>
<h1>当前时间</h1>
<%
    Date dangqianshijian = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//格式化日期数据
    out.print(simpleDateFormat.format(dangqianshijian));
//    内置对象response.setHeader();
    response.setHeader("refresh","1");//一秒刷新一次
%>

<%--实现登录功能，跳转后还能获取姓名--%>
<form action="" method="get">

</form>
</body>
</html>
