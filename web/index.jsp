<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/12
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <a href="/test/userAction">请求Struts2</a><br>
    <a href="/test/userAction!add?name=xiaohua">添加用户</a><br/>
    <a href="/test/userAction!update">更新用户</a><br>

    <form action="/greeting" method="post">
      <input type="text" name="username" placeholder="姓名"/>
      <input type="submit" value="提交">
    </form>

    <a href="/testAction">testAction</a><br/>

    <a href="/ognlAction">OGNLAction</a><br/>

  </body>
</html>
