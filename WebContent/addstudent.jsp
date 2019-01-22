<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生信息</title>
</head>
<body>
	<h2>学生信息</h2>
	<form action="StudentAddServlet" method="get" role="from">
	<input type="text" name="id" placeholder="编号">
	<input type="text" name="sno" placeholder="学号">
	<input type="text" name="name" placeholder="姓名">
	<input type="text" name="sex" placeholder="性别">
	<input type="text" name="age" placeholder="年龄">
	<button type="submit">提交</button>
	</form>
</body>
</html>