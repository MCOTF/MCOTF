<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 4/26
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示注册信息的页面</title>
</head>
<body>

<%--1.获取信息传递给name 2.获取密码--%>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("username");
    String pwd = request.getParameter("password");

    //字符串类型的一维数组
    String[] hobbies = request.getParameterValues("hobby");

%>
<%--显示用户名--%>
用户名<%=name%> <br>
<%--显示密码--%>
密码<%=pwd%> <br>
<%--显示兴趣爱好--%>
兴趣爱好<%
    //因为兴趣爱好有多个内容，所以需要遍历显示
    for (int i = 0;i<hobbies.length;i++){
        out.print(hobbies[i]+"&nbsp;");
    }
    //增强for循环:for(类型 变量名：数组名){输出变量名}
    for (String hobby : hobbies) {
        out.print(hobby + "&nbsp;");
    }
%>
</body>
</html>
