<%@page import="entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改学生信息</title>
</head>
<body>
	<form action="StudentAlterServlet" method="get" role="form">
	<table>
	<%
	Student s=(Student)request.getAttribute("students");
	%>
	<tr><td>编号</td>
	<td><input type="text" name="id" value="<%=s.getId() %>"></td></tr>
	<tr><td>学号</td>
	<td><input type="text" name="sno" value="<%=s.getSno() %>"></td></tr>
	<tr><td>姓名</td>
	<td><input type="text" name="name" value="<%=s.getName() %>"></td></tr>
	<tr><td>性别</td>
	<td><input type="text" name="sex" value="<%=s.getSex() %>"></td></tr>
	<tr><td>年龄</td>
	<td><input type="text" name="age" value="<%=s.getAge() %>"></td></tr>
	<tr><td colspan="2">
	<button type="submit">提交</button></td></tr>
	</table>
	</form>
</body>
</html>