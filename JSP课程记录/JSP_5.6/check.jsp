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
    <title>验证页面</title>
</head>
<body>
<%
    //1.获取表单的内容
    String name = request.getParameter("uname");
    String pwd = request.getParameter("upwd");
    //2.比较获取的用户名和“张三”是否相等
    if (name.equals("张三")&&pwd.equals("123abc")){//equals
//        if (pwd == "123abc"){

        //3.如果比较成功，重定向到success.jsp
//        response.sendRedirect("success.jsp");//跳转到success（string类型）
        //请求转发(forward)：连带张三的name和密码转发到success.jsp
        //tips:请求的服务器的次数是 一 次，会保留request的值，url地址没有发生改变
        //同时写了会导致冲突
        request.getRequestDispatcher("success.jsp").forward(request,response);
        //重定向(sendRedirect)：请求的服务器次数是 两 次，url地址发生改变

    }else{
        out.print("<h1>密码错误，请重新输入</h1>");
    }
%>
</body>
</html>
