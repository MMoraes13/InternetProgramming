<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/checkPwd.js"></script>

<title>Registration Page</title>
</head>
<body>

	<h3>Register here</h3>
	<form name="registration" action="Registration" method="post">
		User: <input type="text" name="username"> Pass: <input
			type="password" name="password" id="pass1"> Re-pass: <input
			type="password" name="check_password" id="pass2"
			onkeyup="checkPass(); return false;"> <span
			id="confirmMessage" class="confirmMessage"></span> <input
			type="submit" value="Submit">
	</form>

</body>
</html>