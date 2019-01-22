<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style type="text/css">
.classname{position:relative;left:100px;top:20px;width:200px;}
.lo{float:left}
.re{float:right}
</style>
</head>
<body>
	<div class="classname">
		<form method="post" role="form" name="loginForm" action="LoginServlet">
			<p>账号：
				<input type="text" name="username" id="user1" placeholder="请输入用户名" size="19">
			</p>
			<p>密码：
				<input type="password" name="password" id="password1" placeholder="请输入密码" size="19" >
			</p>
			<div class="lo">
				<button type="submit" name="login1" >登录</button>
				
			</div>
			<div class="re">
				<input type="reset" name="login2" value="重置" >
			</div>
			
		</form>
	</div>
</body>
</html>
<script> 
//取出传回来的参数error并与yes比较
  var errori ='<%=request.getParameter("error")%>';
  if(errori=='yes'){
   alert("登录失败!");
  }
</script>