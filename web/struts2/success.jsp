<%@ page import="java.lang.reflect.Field" %>
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

    <h1>操作普通属性</h1>
    属性name值：<s:property value="name"/><br/>
    士兵id: <s:property value="soldier.id"/><br/>
    士兵姓名：<s:property value="soldier.name"/><br/>
    我想说的话：<s:property value="soldier.say()"/><br/>
    request中的info值：<s:property value="#request.info"/><br/>

    <%--此处字符串一定要有单引号--%>
    <s:set var="username" value="'测试set标签'" scope="request"></s:set>
    set设置的值：<s:property value="#request.username" default="没有数据"/><br/>

    <s:set var="myList" value="{1,2,3,4,5,6,7,8}" scope="request"/>
    set设置的list中的值：<s:property value="#request.myList[0]"/><br/>

</body>
</html>
