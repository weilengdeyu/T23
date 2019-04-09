
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Post请求测试</title>
</head>
<body>
 <form action="/FirstServlet" method="get">
     用户名:<input name="txtName"/>
     密码:<input name="txtPwd" type="password"/>
     <input type="submit"/>
 </form>
<%
  session.setAttribute("",null);
  out.print("");
  page.toString();
  pageContext.setAttribute("",null);
%>
</body>
</html>
