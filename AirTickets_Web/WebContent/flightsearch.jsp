<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style/bootstrap.css">
<title>Flight Search</title>
</head>
<body>
	<div class="container-fluid">
		<h3 style="display:inline">Choose your flight</h3>
		<img style="display:inline;" align="right" src="style/background-mg.png" alt="Minas" height="80" width="80">
		<p style="disply:block">Choose your destiny and when you want to go.</p>
		<form name="input" action="reviewandbook.jsp" method="post" role="form">
			<div class="radio">
				<label>
					<input type="radio" id="flight" name="flight" value="BHZ-LNK-844"> 
					09/30/14 - Belo Horizonte - Lincoln - 844 - 6:00pm - Lincoln - Belo Horizonte - 845 - 6:00am 
				</label>
			</div> 
				<input type="button" class="btn btn-danger" value="Back to Search page" onclick="window.location='flightsearchquery.jsp';" > 
				<input type="button" class="btn btn-warning" value="See booking history page" onclick="window.location='bookinghistory.jsp';" >
				<input type="submit" class="btn btn-success" name="send" value="Choose flight" align="right" >
			
		</form>
	</div>
</body>
</html>