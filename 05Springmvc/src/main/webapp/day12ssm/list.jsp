<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<center>
 <h2>图书列表</h2>
 <table border="1px">
     <%--抬头 --%>
     <tr>
         <td>图书编号</td>
         <td>图书名称</td>
         <td>图书价格</td>
     </tr>
         <%--jstl标签--%>
     <c:forEach items="${list}" var="item">
         <tr>
             <td>${item.bookid}</td>
             <td>${item.bookname}</td>
             <td>${item.bookprice}</td>
         </tr>
     </c:forEach>
 </table>
</center>
</body>
</html>
