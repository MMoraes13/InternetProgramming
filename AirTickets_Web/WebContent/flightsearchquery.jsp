<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search for your flight</title>
</head>
<body>
<h3>Details of your travel: </h3>
	<form name="input" action="flightsearch.jsp" method="post">
		<table>
		<tr><td>Source: </td> <td><input type = "textfield" name = "source"></td></tr>
		<tr><td>Destination: </td> <td><input type = "textfield" name = "destination"></td></tr>
		<tr><td>Date: </td><td> <input type = "textfield" name = "date"></td></tr>
		<tr><td>Number of Seats: </td><td> <input type = "textfield" name = "number_of_seats"></td></tr>
		<tr><td>Class:</td><td> <select name = "class">
			<option value="economy">Economy</option>
			<option value="business">Business</option>
			<option value="firstclass">First Class</option>
		</select></td></tr>
		<tr><td><input type = "button" value = "Exit"></td><td><input type="submit" value = "Search"></td></tr>
		</table>
	</form>
</body>
</html>

