<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 2023/3/22
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="JSP_3.22_2.jsp" %>
<%--静态包含：两个JSP文件合并起来，引入后JSP引擎会将两个JSP页面合并成一个servlet类--%>
<%--想在哪添加就放在哪--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%--引入和被引入编码不能冲突--%>
<html>
<head>
    <title>Title</title>
    <style>
        p{
            color: blue;
            size: 6px;
            text-indent: 2em;
        }
    </style>
</head>
<body>
<p>
    全民制作人大家好，我是练习时长两年半的个人练习生蔡徐坤。喜欢唱、跳、rap、篮球。全民制作人大家好，我是练习时长两年半的个人练习生蔡徐坤。喜欢唱、跳、rap、篮球。全民制作人大家好，我是练习时长两年半的个人练习生蔡徐坤。喜欢唱、跳、rap、篮球。全民制作人大家好，我是练习时长两年半的个人练习生蔡徐坤。喜欢唱、跳、rap、篮球。全民制作人大家好，我是练习时长两年半的个人练习生蔡徐坤。喜欢唱、跳、rap、篮球。全民制作人大家好，我是练习时长两年半的个人练习生蔡徐坤。喜欢唱、跳、rap、篮球。
</p>
<%@ include file="JSP_3.22_2.jsp" %>

<%
    //设置字符编码，避免param的值乱码
    request.setCharacterEncoding("UTF-8");
%>
<%--jsp动作标记--%>
<jsp:include page="JSP_3.22_3.jsp" flush="true">
    <jsp:param name="uname" value="张三"/>
    <jsp:param name="upwd" value="12345678"/>
</jsp:include>
<%--参数传给22_3了--%>
</body>
</html>
