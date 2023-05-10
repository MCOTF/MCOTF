<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 3/29
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%--静态指令标记3--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录页面</title>
</head>
<body>

<%--练习：用户成功登录后重定向--%>
<%--此页面用于用户名和登录--%>
<%--_2获取并显示用户名和密码，如果为空，则跳转到_3(error)页面--%>
<%--表单标签，action：提交给_2--%>
<form action="JSP_3.29_2.jsp" method="post">
    用户名<input type="text" name="username" ><br>
    密码<input type="text" name="password" ><br>
    <input type="submit" value="登录">
</form>


<%--用户重定向到页面_2--%>
<%--<jsp:forward page="JSP_3.29_2.jsp">--%>
<%--    <jsp:param name="username" value="张三" />--%>
<%--    <jsp:param name="password" value="12345678" />--%>
<%--</jsp:forward>--%>
<%--不加param为无参--%>

<%--终止当前页面的运行，以下内容不再执行--%>
<%--声明一个全局变量--%>
<%!
    int i = 10;
%>
<%
    i++;
    out.print(i);//测试此内容是否被执行
%>


</body>
</html>
