<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="connect.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head></head><link rel="stylesheet" href="makeUp.css"></head>
<body>

	<h1>Retrieve data from database in jsp</h1>
	<table class="table-style-two">
		<thead>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>age</td>
			<td>loc</td>

		</tr>
		</thead>
		<%
			try {
				connection = DriverManager.getConnection(connectionUrl
						+ database, userid, password);
				statement = connection.createStatement();
				String sql = "select * from subscribertable";
				resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
		%>
		<tbody>
		<tr>
			<td><%=resultSet.getString("id")%></td>
			<td><%=resultSet.getString("name")%></td>
			<td><%=resultSet.getString("age")%></td>
			<td><%=resultSet.getString("loc")%></td>
		</tr>
		</tbody>
		<%
			}
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		%>
	</table>
</body>
</html>