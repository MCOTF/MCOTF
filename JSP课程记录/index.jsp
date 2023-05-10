<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--jsp指令<%@%>--%>
<%--index是默认位置--%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>
    <%--jsp表达式输出--%>
    <%= "Hello World!" %>
</h1>
<%
    System.out.print("12345");
//    内置对象
    for (int i = 0;i>100;i++){
        out.print(i);

    }
%>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>