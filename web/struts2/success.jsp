<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/21
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    <font color="red">
        <s:property value="username"/>
    </font>
    <br/>
    欢迎来到本站！<br/>

    request范围内的info值：<font color="red"><%= request.getAttribute("name")%></font>
    session范围内的info值：<font color="red"><%= session.getAttribute("name")%></font>
    application范围内的info值：<font color="red"><%= application.getAttribute("name")%></font>
</body>
</html>
