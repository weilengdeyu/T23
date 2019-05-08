<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
            反馈查看
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
            <div class="x-body">
                <form class="layui-form layui-form-pane">
                    <div class="layui-form-item">
                        <label for="feedperson" class="layui-form-label">
                            反馈人
                        </label>
                        <div class="layui-input-block">
                            <input type="text" id="feedperson" name="feedperson" required lay-verify="feedperson"
                                   autocomplete="off" class="layui-input" value="${feedBack.feedperson}">
                        </div>
                        <label for="feedtitle" class="layui-form-label">
                            反馈标题
                        </label>
                        <div class="layui-input-block">
                            <input type="text" id="feedtitle" name="feedtitle" value="${feedBack.feedtitle}" required lay-verify="feedtitle"
                                   autocomplete="off" class="layui-input">
                        </div>
                        <label for="L_content" class="layui-form-label">
                            反馈内容
                        </label>
                        <div class="layui-input-block">
                            <input type="text" id="L_content" name="feedcontent" required lay-verify="feedcontent"
                                   autocomplete="off" class="layui-textarea" value='${feedBack.feedcontent}'/>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <button class="layui-btn" lay-filter="add" lay-submit>
                            关闭
                        </button>
                    </div>
                </form>
            </div>
            <script src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8">
            </script>
            <script src="${pageContext.request.contextPath}/js/x-layui.js" charset="utf-8">
            </script>
            <script>
                layui.use(['form','layer','layedit'], function(){
                    $ = layui.jquery;
                    var form = layui.form()
                        ,layer = layui.layer
                        ,layedit = layui.layedit;

                    //创建一个编辑器
                    editIndex = layedit.build('L_content');

                    //监听提交
                    form.on('submit(add)', function(data){
                        // 获得frame索引
                        var index = parent.layer.getFrameIndex(window.name);
                        //关闭当前frame
                        parent.layer.close(index);
                        return false;
                    });

                });
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