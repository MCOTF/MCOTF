<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 4/12
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--form内容提交到4.12_3--%>
<form action="JSP_4,12_3.jsp" method="post">
    <table>
        <tr>
            <td>姓名：</td>
            <%--name来源：JavaBeanClass--%>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><input type="text" name="sex"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td align="center" colspan="2"><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>

</body>
</html>
