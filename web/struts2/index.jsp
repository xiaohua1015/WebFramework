<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/26
  Time: 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>struts2 index</title>
</head>
<body>
    <h2>用户注册</h2>
    <s:form action="/test/userAction!register" method="POST">
        <s:textfield name="name" label="用户名" ></s:textfield>
        <s:password name="password" label="密码" required="true" requiredPosition="left"></s:password>
        <s:radio name="sex" list="#{1 : '男', 0 : '女'}" label="性别" required="true" requiredPosition="left"></s:radio>
        <s:select list="{'请选择省份','河北','河南','山东','山西','浙江','江苏','广东'}" name="province" label="省份"></s:select>
        <s:textfield label="描述" name="description" cols="30" rows="5"></s:textfield>
        <s:submit value="注册"></s:submit>
        <s:reset value="重置"></s:reset>
    </s:form>
</body>
</html>
