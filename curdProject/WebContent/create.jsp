<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="connect.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/action_page.php">
		Name:<br> <input type="text" name="name"><br> Email:<br>
		<input type="text" name="email"><br> Gender:<br> <input
			type="text" name="gender"><br> Location:<br> <input
			type="text" name="loc"><br>
		<br> <input type="submit" value="Submit">
	</form>

</body>
</html>