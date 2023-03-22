<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 2023/3/22
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>当前时间</title>
</head>
<body>
<%
    //接收传递的参数值zhangsan赋给了name变量
    String name = request.getParameter("uname");//3.22的param name="sname"
    String pwd = request.getParameter("upwd");
    out.print("你好！"+name+"<br>"+"你的密码是："+pwd);
%>
<br>
<%
    Date date=new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    out.print("当前时间："+sdf.format(date));
%>
</body>
</html>
