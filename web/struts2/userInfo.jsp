<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/26
  Time: 2:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册用户信息</title>
</head>
<body>
    <h2>用户注册信息</h2>
    <ul>
        <li>用户名：<s:property value="name"/> </li>
        <li>密码：<s:property value="password"/> </li>
        <li>性别：<s:property value="sex"/></li>
        <li>省份：<s:property value="province"/> </li>
        <li>描述：<s:property value="description"/> </li>
    </ul>
</body>
</html>
