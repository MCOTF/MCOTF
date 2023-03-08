<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 2023/3/8
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (int i = 0;i<10;i++){
%>
<%--循环体--%>
<h1>欢迎学习jsp</h1>
<%
    }
%>
<%
        int sum = 0;
        for (int a = 1;a<=100;a+=2){
        sum+=a;
        out.print(a+"");
        }
%>
<p>100以内的奇数和为：</p>
<%
        //一个jsp可以插入多个标签，且多个脚本段可以互相访问
        out.print("<h1>总和为"+sum+"</h1>");
%>
<%--直接输出sum，且不需要加分号--%>
<%=sum%>

<%--JSP变量声明--%>
<%!
    //声明一个整型变量:年龄，并赋值20岁
    int age = 20;

    //声明一个方法:显示姓名
    public String myself(){
        return "MCOTF__ST";
    }
%>
<%//这里是脚本标记
    out.print(myself());
%>
</body>
</html>
