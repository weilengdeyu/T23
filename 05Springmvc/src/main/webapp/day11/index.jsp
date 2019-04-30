<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<html>
<head>
    <title>Ajax</title>
    <script type="text/javascript" src="/js/jQuery1.11.1.js"></script>
    <script type="text/javascript">
       $(function () {
          //他和window.onload???
           //解析：1.html标签加载就会执行  window.onload=等待html标签，css ，js ，img才执行
           //2.    window.onload滞后于 $(function(){})
           //3.    $(function() {} )可以执行n次  ，window。onload 只能执行一次
           //点击按钮，激发Ajax
           //1.锁定按钮
           //ID  class  标签器 CSS3 jquery
           //属性选择 [src]  [src=xxx]  [src^=xxx]
           //过滤选择器 a:hover
           //后代选择器
           // A B  A+B A~B
           $("[type=button]").click(function () {
/*              var vv=123;
              var exe='alert(vv)';*/
              //jquery引擎不认，eval（String） ------>对象

          /*    eval(exe);*/
              $.ajax({
                   url:"/third",  //请求地址
                   type:"POST",//请求方式
                   data:{},//请求的数据变量
                   dataType:"json",  //响应回来数据是json对象格式
                   success:function (data) { //一般情况下
                       /*alert(data);*/
                       //回调函数
                       //data String
                       //js 数据类型:String Number NULL Undefined Object Boolean
                       //json串  ，json对象  .name .age
                       //data String
                       //方案是什么？ 转成对象
                       //data=eval(data);
                       $.each(data,function (i,dom) {
                           alert(dom.name);
                       });
                   }
               });

           });


           //Jquery注册事件方式



           //2.给按钮注册事件
       });
      /* window.onload=function () {
           alert(2);
       };*/
    </script>
</head>
<body>
<input type="button" value="想发送Ajax？,点我不要赔的喔！！！呵呵哒~~~~~~"/>
</body>
</html>
