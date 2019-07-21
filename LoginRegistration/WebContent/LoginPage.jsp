<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn Page</title>
</head>
<body>
	<form action="Login" method="post">

		<table align="center" style="background-color: buttonface;">

			<tr>
				<th colspan="2" style="padding: 20px;">Login Page</th>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="name" required="required"></td>
			</tr>

			<tr>
			
				<td>PassWord</td>
				<td><input type="password" name="password" required="required"></td>
			</tr>
			<tr>

				<td style="padding: 20px;"><input type="submit" value="Login">
				<td><a href="RegistrationPage.jsp">Registration</a></td>
			</tr>
		</table>
	</form>

</body>
</html>