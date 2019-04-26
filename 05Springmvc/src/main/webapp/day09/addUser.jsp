<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<html>
<body>
<h2>添加用户</h2>
<form method="post" action="/addPOJO">
    用户名：<input name="uname"/>
    密码： <input name="upwd"/>
    家庭住址1： <input name="listAdresses[0].homeAddress"/>
    家庭住址1： <input name="listAdresses[1].homeAddress"/>
    <input type="submit"/>
</form>
</body>
</html>
