<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 4/26
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="show.jsp" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>兴趣爱好：</td>
            <td>
                <input type="checkbox" name="hobby" value="足球">足球
                <input type="checkbox" name="hobby" value="篮球">篮球
                <input type="checkbox" name="hobby" value="羽毛球">羽毛球
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="注册">
            </td>
        </tr>
    </table>
</form>

<%--JSP内置对象（9个）--%>
<%--特点：不需要预先声明即可使用--%>

<%
    out.print("123\n"+"\n"+"<br>");//换行,但\n也不能换行，只能使用br
    out.println("123");
//    register 用户名 密码 兴趣爱好
//    show.jsp 获取注册的用户名密码

//    jsp内置对象
    request.setCharacterEncoding("UTF-8");

//    请求+响应=交互
%>
<%--<jsp:useBean id="zs" scope="page" />--%>
<%--//    生命周期：--%>
<%--//    page只在当前页面有效--%>
<%--//    request设置的属性在一次请求的范围内有效--%>
<%--//    session一次会话范围内有效--%>
<%--//    app范围最大--%>

<%--request getParameterValues通常可以用复选框--%>
</body>
</html>
