<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register here</title>
</head>
<body>

	<form action="add" method="post">

		<table align="center" style="background-color: buttonshadow;">

			<tr>
				<th colspan="2" style="padding: 20px;">Registration Page</th>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstname" required="required"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastname" required="required"></td>
			</tr>

			<tr>
				<td>PassWord</td>
				<td><input type="password" name="password" required="required"></td>
			</tr>
			<tr>
				<td>
				<td style="padding: 20px;"><input type="submit"
					value="Register"> <input type="reset" name="reset"></td>
			</tr>
		</table>
	</form>

</body>
</html>