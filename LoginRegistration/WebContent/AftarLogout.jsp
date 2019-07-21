<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged out</title>
</head>
<body>
<%
session.invalidate();

%>
	<form action="">
		<table align="center">
			<tr>
				<td><h1>Successfully loggedOut!</h1></td>
			</tr>
			<tr>
				<td>Click here to <a href="LoginPage.jsp">Login</a> again
				</td>
			</tr>
			<tr>
				<br>

				<td>Click here to <a href="RegistrationPage.jsp">Create new
						account</a></td>
			</tr>
		</table>
	</form>

</body>
</html>