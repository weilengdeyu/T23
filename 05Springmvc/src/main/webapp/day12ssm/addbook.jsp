
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<table ></table>
    <form action="/addBook" method="post">
        图书名称：<input name="bookname"/>
        图书价格：<input name="bookprice"/>
        <input type="submit"/>
    </form>
</body>
</html>
