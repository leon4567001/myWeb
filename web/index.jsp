<%--
  Created by IntelliJ IDEA.
  User: aliu4830
  Date: 2018/06/12
  Time: 8:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登陆界面</title>
  </head>
  <h1>系统登陆界面</h1>
  <hr>
  <body>
  <form name="myForm" action="userLogin" method="post">
    <table>
      <tr>
        <td>用户名:</td>
        <td><input type="text" name="username"></td>
        <td>密码:</td>
        <td><input type="password" name="password"></td>
      </tr>
      <tr>
        <td><input type="submit" value="登录"></td>
      </tr>
    </table>
  </form>
  </body>
</html>
