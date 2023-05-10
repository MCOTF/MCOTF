<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 4/12
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%--JavaBean:
    本质是类，属性是私有化（通过get和set方法实现）--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--调用JavaBeanClass--%>
<jsp:useBean id="Person" class="com.MCOTF.JavaWeb_Project.JavaBeanClass" scope="page"/><%--scope:仅在当前页面生效--%>
<%--为id Person设置属性--%>

<%--div>ul>li*5 按住tab即可快速生成--%>
<div>
    <ul>
        <li>姓名：<jsp:getProperty name="Person" property="name"/></li>
        <li>年龄：<jsp:getProperty name="Person" property="age"/></li>
        <li>性别<jsp:getProperty name="Person" property="sex"/></li>
        <li>是否已婚：<jsp:getProperty name="Person" property="married"/></li>
    </ul>
</div>

<%--<jsp:setProperty name="Person" property="name" value="张三"/>--%>
<%--<jsp:setProperty name="Person" property="age" value="18"/>--%>
<%--<jsp:setProperty name="Person" property="sex" value="男"/>--%>
<%--<jsp:setProperty name="Person" property="married" value="false"/>--%>

</body>
</html>