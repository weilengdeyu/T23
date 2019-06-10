<%@ page import="service.HibernateBiz" %>
<%@ page import="entity.Master" %>
<%@ page language="java" pageEncoding="utf-8" isELIgnored="false"  %>
<html>
<body>
<h2>No-Session演示!</h2>
<%
    HibernateBiz biz=new HibernateBiz();
    //01。获取单个员工对象
    Master master = (Master) biz.get(Master.class,"40288fb06af7371d016af7371f580000");
    //获取员工实体中员工姓名
    System.out.println(master.getMname());
%>
</body>
</html>
