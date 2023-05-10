<%--
  Created by IntelliJ IDEA.
  User: MCOTF--ST
  Date: 5/6
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录实现</title>
</head>
<body>
<form action="check.jsp" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="uname"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="upwd"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
        </tr>

    </table>
</form>
</body>
</html>
