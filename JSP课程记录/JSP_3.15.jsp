<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 2023/3/15
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.Date,java.text.SimpleDateFormat" errorPage="JSP_3.15_2.jsp" %>
<%--↑jsp指令标记↑--%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    //声明一个能跳转到_2.jsp的“url”变量
    String url="JSP_3.15_2.jsp";
%>
<a href="JSP_3.15_2.jsp">a标签直接跳转1</a><br>
<a href="<%=url%>">通过jsp变量跳转2</a><br>
<form action="<%=url%>">
    <input type="submit" value="form表单跳转">
</form>
<%
    //JSP显示时间
    Date time = new Date();//实例化
    out.print("Date时间："+time+"<br>");

    //简单时间(格式定义)SimpleDateFormat类
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    //格式化time对象
    sdf.format(time);
    out.print("SimpleDateFormat时间："+sdf.format(time));


%>
<%
    //isErrorPage错误跳转
    out.print("<br>3/2="+3/2);
//    out.print("<br>3/0="+3/0);

%>
<%--表达式输出--%>

</body>
</html>
