<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post">
		<input type="text" name="username" placeholder="请输入用户名"><br>
		<input type="password" name="password" placeholder="请输入密码"><br>
		<input type="submit" value="登录">${msg }
	</form>   
</body>
</html>