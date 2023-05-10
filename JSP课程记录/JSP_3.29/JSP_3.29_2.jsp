<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 3/29
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是被重定向的页面</title>
</head>
<body>
<p>这是被重定向的内容，但地址却是3.29，则表示内容仅在服务器端跳转，浏览器URL地址不变</p>
<%
    //接收<jsp:传来的参数
    //tips:如果输入request.getParameter变红则从项目结构导入tomcat的server-api.jar即可解决
    String username = request.getParameter("username");//也能获取form表单的值
    String password = request.getParameter("password");
    //equals:相等  或:||
    if (username.equals("") || password.equals("")){//username + password == null
%>
<%--URL地址仍保持不变--%>
<jsp:forward page="JSP_3.29_3.jsp"/>
<%
    }else{
        out.print("登录成功！<br>你的用户名是"+username);
        out.print("你的密码是"+password);
    }
%>
</body>
</html>
