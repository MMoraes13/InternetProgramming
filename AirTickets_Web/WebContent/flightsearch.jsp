<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Search</title>
</head>
<body>
	<h3>Choose your flight</h3>
	<p> Choose your destiny and when you want to go. </p>
	<form name="input" action="reviewandbook.jsp" method="post">
		<input type="radio" name="flight" value="BHZ-LNK-844"> 09/30/14 - Belo Horizonte - Lincoln - 844 - 6:00pm - Lincoln - Belo Horizonte - 845 - 6:00am <br> 
		
		<input type = "button" value="Back to Login Page" onclick="window.location='login.jsp';" > <input type="submit" name="send" value="Choose flight" align="right" >
	</form>
</body>
</html>