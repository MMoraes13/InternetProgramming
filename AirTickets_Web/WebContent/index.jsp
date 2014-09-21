<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<h1>Log in here</h1>
	<form name="input" action="login" method="post">
		User: <input type="text" name="user"> Pass: <input type="text"
			name="pass"> <input type="submit" value="Submit">
	</form>

	<h1>Register here</h1>
	<form name="input2" action="register" method="get">
		User: <input type="text" name="user"> Pass: <input type="text"
			name="pass"> <input type="submit" value="Submit">
	</form>

</body>
</html>