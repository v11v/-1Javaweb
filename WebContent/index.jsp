<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	欢迎<%=session.getAttribute("username")%>光临
	<a href="InvalidateServlet">退出</a>
	<br><br>
	<a href="StudentListServlet">查看学生列表</a>
</body>
</html>