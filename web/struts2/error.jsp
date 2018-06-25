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
    <title>error</title>
</head>
<body>
    <font color="red">error:请输入姓名</font><br/>
    set设置的值：<s:property value="#request.haha" default="没有数据"/><br/>
</body>
</html>
