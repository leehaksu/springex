<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<Form action="/springex/user/login" method="post">
		<input type="text" name="email"/>
		<br>
		<input type="password" name="password"/>
		<input type="submit" value="로그인"/>
	</Form>
</body>
</html>