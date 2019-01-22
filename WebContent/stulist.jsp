<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="entity.Student" %>
<%
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
border: 1px solid gray;
border-collapse: collapse;
width: 100%
}
td{border: 1px solid gray;}
.right{float: right;}
</style>
<%
List<Student> list = (List<Student>)request.getAttribute("students");
%>
</head>
<body>
	<table>
	<tr>
		<td>学号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>年龄</td>
		<td>操作</td>
	</tr>
	<%
	if(list != null){
	for(Student s:list){ %>
	<tr>
		<td><%=s.getSno() %></td>
		<td><%=s.getName() %></td>
		<td><%=s.getSex() %></td>
		<td><%=s.getAge() %></td>
		<td>
		<a href="StudentDelServlet?id=<%=s.getId() %>">删除</a>
		<a href="StudentUpdServlet?id=<%=s.getId() %>">修改</a>
		</td>
	</tr>
	<%}} %>
	</table>
	<a href="addstudent.jsp">添加信息</a>
	<a href="login.jsp" class="right">退出</a>
</body>
</html>