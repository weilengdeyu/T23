<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>
            添加反馈
        </title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/x-admin.css" media="all">
    </head>
    <body>
        <div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>新增反馈</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body">
        <form class="layui-form x-center" action="" style="width:500px">
                <div class="layui-form-pane">
                  <div class="layui-form-item">
                    <div class="layui-input-inline" style="width:400px">
                      <input type="text" name="username"  placeholder="搜索内容" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-input-inline" style="width:80px">
                        <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
                    </div>
                  </div>
                </div> 
            </form>
          <xblock>
          <button class="layui-btn" onclick="feedback_add('添加信息','/tfs/jsp/feedback_add.jsp','600','550')"><i class="layui-icon">&#xe608;</i>添加</button>
          <span class="x-right" style="line-height:10px">共有数据：${fn:length(list)} 条</span></xblock>
            <table class="layui-table">
                <thead>
                    <tr>
                        <th>
                            <input type="checkbox" name="" value="">
                        </th>
                        <th>
                            反馈人
                        </th>
                        <th>
                            标题
                        </th>
                        <th>
                            反馈时间
                        </th>
                        <th>
                            反馈状态
                        </th>
                        <th>
                            操作
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${list}" var="item">
                        <tr>
                            <td>
                                <input type="checkbox" value="1" name="">
                            </td>
                            <td>${item.feedperson}</td>
                            <td>
                                    ${item.feedtitle}
                             <%--   <u style="cursor:pointer" onclick="question_show()">

                                </u>--%>
                            </td>
                            <td><fmt:formatDate value="${item.feeddate}" pattern="yyyy-MM-dd- HH:mm:ss" /></td>
                            <td>${item.feedstatus}</td>
                            <td class="td-manage">
                                <a title="查看" href="javascript:;" onclick="feed_look('查看','/tfs/findFeedById?id=${item.feedid}','4','','510')"
                                   class="ml-5" style="text-decoration:none">
                                    <i class="layui-icon"><img src="images/look.png" width="15" height="15"></img></i>
                                </a>
                                <a title="删除" href="javascript:;" onclick="person_del(this,'1')"
                                   style="text-decoration:none">
                                    <i class="layui-icon">&#xe640;</i>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>
            
            <div id="page"></div>
        </div>
        <br /><br /><br />
        <script src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
        <script src="${pageContext.request.contextPath}/js/x-layui.js" charset="utf-8"></script>
        <script>
            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层

              //以上模块根据需要引入
              laypage({
                cont: 'page'
                ,pages: 100
                ,first: 1
                ,last: 100
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
              }); 
              
            });

            //批量删除提交
             function delAll () {
                layer.confirm('确认要删除吗？',function(index){
                    //捉到所有被选中的，发异步进行删除
                    layer.msg('删除成功', {icon: 1});
                });
             }

             function question_show (argument) {
                //layer.msg('假装有数据',{icon:1,time:1000});
             }
             /*添加*/
            function feedback_add(title,url,w,h){
                x_admin_show(title,url,w,h);
            }
            //查看
           function feed_look (title,url,id,w,h) {
                x_admin_show(title,url,w,h); 
            }

            /*删除*/
            function person_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                    //发异步删除数据
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
                });
            }
            </script>
            <script>
        var _hmt = _hmt || [];
        (function() {
          var hm = document.createElement("script");
          var s = document.getElementsByTagName("script")[0]; 
          s.parentNode.insertBefore(hm, s);
        })();
        </script>
            
    </body>
</html>