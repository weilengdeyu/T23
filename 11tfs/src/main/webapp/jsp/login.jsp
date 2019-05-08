<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    
		<title>登录</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" />
	</head>

	<body class="beg-login-bg" background="${pageContext.request.contextPath}/images/bg.jpg">
		<div class="beg-login-box">
			<header>
				<h1>教学管理系统</h1>
			</header>
			<div class="beg-login-main">
				<form action="/tfs/login" class="layui-form" method="post">
					<input name="__RequestVerificationToken" type="hidden" value="" />
                <!---->
                <div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
						<select name=""> 
							<option value="0">用户名登录</option>
						</select>
					</div>
                <!---->
                
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
						<input type="text" name="uname" lay-verify="userName" autocomplete="off" placeholder="请输入登录名" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="password" name="upwd" lay-verify="password" autocomplete="off" placeholder="请输入密码" class="layui-input">
					</div>
					<div class="layui-form-item">
						<div class="beg-pull-left beg-login-remember">
							<label>记住帐号？</label>
							<input type="checkbox" name="rememberMe" value="true" lay-skin="switch" checked title="记住帐号">
						</div>
						<div class="beg-pull-right">
							<button class="layui-btn" lay-submit lay-filter="login">
                            登录
                        </button>
						</div>

					</div>
				</form>
			</div>

            
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js"></script>
		<script>
			layui.use(['layer', 'form'], function() {
				var layer = layui.layer,
					$ = layui.jquery,
					form = layui.form();
				form.on('submit(login)',function(data){
					/*location.href='/tfs/login';*/
				});
			});
		</script>
	</body>

</html>