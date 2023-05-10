<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 4/12
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="P1" scope="page" class="com.MCOTF.JavaWeb_Project.JavaBeanClass"/>
<%--property="*":自动匹配--%>
<jsp:setProperty name="P1" property="*"/>
<div>
    <ul>
        <li>姓名：<jsp:getProperty name="P1" property="name"/></li>
        <li>年龄：<jsp:getProperty name="P1" property="age"/></li>
        <li>性别<jsp:getProperty name="P1" property="sex"/></li>
        <li>是否已婚：<jsp:getProperty name="P1" property="married"/></li>
    </ul>
</div>
</body>
</html>
